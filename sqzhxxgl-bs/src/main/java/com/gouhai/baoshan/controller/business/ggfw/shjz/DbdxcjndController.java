package com.gouhai.baoshan.controller.business.ggfw.shjz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.shjz.Dbdxcjnd;
import com.gouhai.baoshan.entity.business.shgl.spaq.SuperMan;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.ggfw.shjz.DbdxcjndService;
import com.gouhai.baoshan.service.business.shgl.spaq.SuperManService;

/**
 * 低保对象参加公益性社区服务劳动情况季度登记表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/dbdxcjnd")
public class DbdxcjndController extends BusinessFormController {
	@Autowired
	private DbdxcjndService dbdxcjndService;
	@Autowired
	private SuperManService manService;

	public DbdxcjndController() {
		super("dbdxcjnd");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/dbdxcjnd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		SuperMan superMan = manService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new SuperMan();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			manService.insert(superMan);
		}
		model.addAttribute("superman", superMan);
		model.addAllAttributes(pageResult(dbdxcjndService.getObjList(current,
				businessForm), dbdxcjndService.getObjCount(businessForm),
				current));
		return "/business/dbdxcjnd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/dbdxcjnd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Dbdxcjnd t, String businessFormId) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		SuperMan superMan = manService
				.findOne(new BusinessForm(businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		manService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		dbdxcjndService.insert(t);
		return "redirect:/dbdxcjnd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		dbdxcjndService.delete(id);
		return "redirect:/dbdxcjnd/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("dbdxcjnd", dbdxcjndService.findOne(id));
		return "/business/dbdxcjnd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Dbdxcjnd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Dbdxcjnd d = dbdxcjndService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setJzdh(t.getJzdh());
			d.setCjdxxm(t.getCjdxxm());
			d.setLdxm(t.getLdxm());
			d.setRq(t.getRq());
			d.setLdsj(t.getLdsj());
			d.setBrqm(t.getBrqm());
			d.setFzrqm(t.getFzrqm());
			d.setYue(t.getYue());
			d.setUpdateDate(new Date());
			dbdxcjndService.update(d);
		}

		return "redirect:/dbdxcjnd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/dbdxcjnd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("superman", manService.findOne(businessForm));
		model.addAllAttributes(pageResult(dbdxcjndService.getObjList(current,
				businessForm), dbdxcjndService.getObjCount(businessForm),
				current));
		return "/business/dbdxcjnd/check";
	}
	/**
	 * 导出表头及数据
	 */
	@RequestMapping(value = "/export/extend/{businessFormId}", method = RequestMethod.GET)
	public void export(HttpServletRequest request,HttpServletResponse response ,@PathVariable String businessFormId){
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		Map<String,Object> dataMap = constructDataMap(businessForm,moduleName,null);//组装word所需要的map数据
		dataMap = constructDataMap(businessForm,"SuperMan",dataMap);//填充表头数据
		String fileName = businessForm.getName();
		exportWord(moduleName,dataMap,response,handlerEncoding(request,fileName));//导出word
	}
}
