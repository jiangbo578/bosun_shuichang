/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.BusinessService;
import com.gouhai.baoshan.service.business.ExportService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.ExportDocUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class BusinessFormController extends PageableController {

	protected String moduleName;
	protected String lowerModuleName;
	private static final Log logger = LogFactory.getLog(BusinessFormController.class);
	@Autowired
	private BusinessService businessService;
	@Autowired
	protected BusinessFormService businessFormService;
	@Autowired
	protected ExportService exportService;//公用导出方法
	

	public BusinessFormController(String moduleName) {
		this.moduleName = moduleName;
		lowerModuleName = moduleName.toLowerCase();
		// System.err.println(lowerModuleName);
		
	}
  public BusinessFormController(){
	  
  }
	@InitBinder
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Integer.class, null,
				new CustomNumberEditor(Integer.class, null, true));
		binder.registerCustomEditor(Long.class, null, new CustomNumberEditor(
				Long.class, null, true));
		binder.registerCustomEditor(byte[].class,
				new ByteArrayMultipartFileEditor());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd",
				request.getLocale());
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, null, new CustomDateEditor(
				dateFormat, true));
	}

	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted(lowerModuleName + ":list")) {
			return "/error/unauthority";
		}
		return "redirect:/" + lowerModuleName + "/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if (!SecurityUtils.getSubject().isPermitted(lowerModuleName + ":list")) {
			return "/error/unauthority";
		}

		Business business = businessService.findOneByCode(moduleName);
		User user = SecurityUtil.getUser();
		model.addAllAttributes(pageResult(businessFormService
				.getBusinessFormList(user, business, current),
				businessFormService.getBusinessFormCount(user, business),
				current));
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String userRoleCode = (String) session.getAttribute("userRoleCode");
		model.addAttribute("userRoleCode", userRoleCode);
		return "/business/" + lowerModuleName + "/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if (!SecurityUtils.getSubject().isPermitted(lowerModuleName + ":add")) {
			return "/error/unauthority";
		}
		String url = "/business/" + lowerModuleName + "/add";
		return url;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Model model, String name) {
		if (!SecurityUtils.getSubject().isPermitted(lowerModuleName + ":add")) {
			return "/error/unauthority";
		}
		Business business = businessService.findOneByCode(moduleName);
		if (business == null) {
			model.addAttribute("message", "无此业务");
			return "/business/" + lowerModuleName + "/add";
		}

		User user = SecurityUtil.getUser();

		// 无提醒，直接保存
		if (!business.isRemind()) {
			BusinessForm businessForm = new BusinessForm();
			businessForm.setName(name);
			businessForm.setBusiness(business);
			businessForm.setUser(user);
			businessFormService.insert(businessForm);
			businessService.updateDateByCode(moduleName);
			return "redirect:/" + lowerModuleName + "/list/1";
		}

		// 有提醒
		Date beforeRemindDate = DateTimeUtil.getYMDDate(businessService
				.findBeforeRemindDate(business));
		// System.out.println(DateTimeUtil.getDateToString(beforeRemindDate,
		// DateTimeUtil.PATTERN_LONG));

		Date afterRemindDate = businessService.findAfterRemindDate(business);
		
		if (afterRemindDate == null) {
			
			model.addAttribute("message", "您不需要填写");
			return "/business/" + lowerModuleName + "/add";
		}
		afterRemindDate = DateTimeUtil.getYMDDate(afterRemindDate);
		// System.out.println(DateTimeUtil.getDateToString(afterRemindDate,
		// DateTimeUtil.PATTERN_LONG));
		if (businessFormService.hasFormItem(user, business, beforeRemindDate,
				afterRemindDate)) {
			model.addAttribute("message", "已经添加过了");
			return "/business/" + lowerModuleName + "/add";
		} else {
			BusinessForm businessForm = new BusinessForm();
			businessForm.setName(name);
			businessForm.setBusiness(business);
			businessForm.setUser(user);
			businessFormService.insert(businessForm);
			businessService.updateDateByCode(moduleName);
			return "redirect:/" + lowerModuleName + "/list/1";
		}

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if (!SecurityUtils.getSubject()
				.isPermitted(lowerModuleName + ":delete")) {
			return "/error/unauthority";
		}

		BusinessForm businessForm = businessFormService.findOne(id,
				SecurityUtil.getUser());

		if (businessForm == null) {
			return "/error/unauthority";
		}

		businessFormService.delete(businessForm);
		businessService.updateDateByCode(moduleName);
		return "redirect:/" + lowerModuleName + "/list/1";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject()
				.isPermitted(lowerModuleName + ":update")) {
			return "/error/unauthority";
		}
		model.addAttribute("businessForm", businessFormService.findOne(id,
				SecurityUtil.getUser()));
		
		return "/business/" + lowerModuleName + "/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Model model, BusinessForm businessForm) {
		if (!SecurityUtils.getSubject()
				.isPermitted(lowerModuleName + ":update")) {
			return "/error/unauthority";
		}

		User user = SecurityUtil.getUser();

		Business business = businessService.findOneByCode(moduleName);
		if (business == null) {
			model.addAttribute("message", "无此业务");
			model.addAttribute("businessForm", businessFormService.findOne(
					businessForm.getId(), user));
			return "/business/" + lowerModuleName + "/update";
		}

		BusinessForm findBusinessForm = businessFormService.findOne(
				businessForm.getId(), user);

		if (findBusinessForm == null) {
			return "/error/unauthority";
		}

		findBusinessForm.setName(businessForm.getName());
		findBusinessForm.setUpdateDate(new Date());
		findBusinessForm.setSysCreate(false);
		businessFormService.update(findBusinessForm);
		String url = "redirect:/" + lowerModuleName + "/list/1";
		// System.out.println(url);
		businessService.updateDateByCode(moduleName);
		return url;
	}

	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String toCheck(Model model, String businessFormId, int type,
			String remark) {
		if (!SecurityUtils.getSubject().isPermitted(lowerModuleName + ":check")) {
			return "/error/unauthority";
		}

		BusinessForm businessForm = businessFormService.findOne(businessFormId);

		if (businessForm == null) {
			return "/error/unauthority";
		}

		businessForm.setRemark(remark);
		businessFormService.mergeCheck(businessForm, type);
		businessService.updateDateByCode(moduleName);
		return "redirect:/centent";
	}

	@RequestMapping(value = "/submit/{businessFormId}", method = RequestMethod.GET)
	public String submit(Model model, @PathVariable() String businessFormId) {
		if (!SecurityUtils.getSubject()
				.isPermitted(lowerModuleName + ":submit")) {
			return "/error/unauthority";
		}

		BusinessForm findBusinessForm = businessFormService.findOne(
				businessFormId, SecurityUtil.getUser());

		if (findBusinessForm == null) {
			return "/error/unauthority";
		}

		businessFormService.mergeCheck(findBusinessForm);
		return "redirect:/" + lowerModuleName + "/list/1";
	}
	/**
	 * 导出公用方法
	 * @author 徐舟
	 * @param response
	 * @param businessFormId
	 */
	@RequestMapping(value = "/export/{businessFormId}", method = RequestMethod.GET)
	public void export(HttpServletRequest request,HttpServletResponse response ,@PathVariable String businessFormId){
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		Map<String,Object> dataMap = constructDataMap(businessForm,moduleName,null);//组装word所需要的map数据
	//	System.out.println(System.getProperty("java.library.path"));
		String fileName = businessForm.getName();
//		if(fileName.contains("(")){
//			try {
//				fileName = URLEncoder.encode(fileName.substring(0, fileName.indexOf("(")), "UTF-8")+fileName.substring(fileName.indexOf("("));
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			}
//		}
		exportWord(moduleName,dataMap,response,handlerEncoding(request,fileName));//导出word
	}
	
	/**
	 * 用于导出word所需要的数据
	 * @param businessForm(业务表单)，entityName（要查询的Entity 字符串）,dataMap(封装的数据)
	 * @author sun 2014-08-20
	 * @return
	 */
	protected Map<String,Object> constructDataMap(BusinessForm businessForm,String entityName,Map<String,Object> dataMap){
		if(null == dataMap)
			dataMap = new HashMap<String,Object>();
		
		// moduleName 就是子类继承父类super传过来过来的编码，把首字母转换为大写就是实体类名
		String y= ((String) entityName.subSequence(0,1)).toUpperCase();
		String s = (String) entityName.subSequence(1, entityName.length());
	    String	code=y+s;
		//这里的泛型用的是所有类的父类。
		List<BaseEntity> list = exportService.getObjList(businessForm, code,null);
		for(int i = 1,j = list.size();i <= j;i++){
			list.get(i-1).setId(i+"");
			//System.out.println(list.get(i).getId());
		}
		dataMap.put(entityName.toLowerCase(), list);
		dataMap.put("businessForm", businessForm);
		return dataMap;
	}
	/**
	 * 导出word文档
	 * @author sun 2014-08-20
	 * @param ftlOfSuffixName(flt模版文件的前缀名称：如：a.flt文件的a)
	 * @param dataMap
	 * @param response
	 * @param fileName
	 */
	protected void exportWord(String ftlOfSuffixName,Map<String,Object> dataMap,HttpServletResponse response,String fileName){
		//这里拼接的就是每个实体类对应的FTL文件
		new ExportDocUtil(ftlOfSuffixName.toLowerCase()+".ftl").setDataList(dataMap).exportDocument(response, fileName);
	}
	/**
	 * 
	 * @param businessFormId
	 */
	protected String handlerEncoding(HttpServletRequest request,String fileName){
		 String userAgent = request.getHeader("USER-AGENT");
		   try{
			if(StringUtils.contains(userAgent, "MSIE")){//IE浏览器
				   fileName = URLEncoder.encode(fileName,"UTF-8");
			   }else if(StringUtils.contains(userAgent, "Mozilla")){//google,火狐浏览器
				   fileName = new String(fileName.getBytes(), "ISO-8859-1");
			   }else{
				   fileName = URLEncoder.encode(fileName,"UTF8");//其他浏览器
			   }
		} catch (UnsupportedEncodingException e){
			logger.error("不支持的编码：", e);
		}
		return fileName;
	}
	
	/*
	 * 此方法更新填报周期的状态
	 */
	public void updateBusinessForm(String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		businessForm.setProcessStatus(null);
		businessForm.setRemark(null);
		businessFormService.update(businessForm);
	}
	

}
