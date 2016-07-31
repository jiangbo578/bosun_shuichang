/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.hyjl.hyhd;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Hyjl;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.hyjl.hyhd.HyjlService;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/hyjl")
public class HyjlController extends BusinessFormController {

	@Autowired
	private HyjlService hyjlService;
	private User user;
	public HyjlController() {
		super("hyjl");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sjDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		sjDateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "sj", new CustomDateEditor(
				sjDateFormat, true));

		SimpleDateFormat insertDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		insertDateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "insertDate",
				new CustomDateEditor(insertDateFormat, true));
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/hyjl/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				hyjlService.getHyjlList(current, businessForm),
				hyjlService.getHyjlCount(businessForm), current));
		return "/business/hyjl/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/hyjl/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Hyjl t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		hyjlService.insert(t);
		return "redirect:/hyjl/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		hyjlService.delete(id);
		return "redirect:/hyjl/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("hyjl", hyjlService.findOne(id));
		return "/business/hyjl/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Hyjl t, String businessFormId) {
		Hyjl d = hyjlService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setNr(t.getNr());
			d.setUpdateDate(new Date());
			hyjlService.update(d);
		}

		return "redirect:/hyjl/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/hyjl/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				hyjlService.getHyjlList(current, businessForm),
				hyjlService.getHyjlCount(businessForm), current));
		return "/business/hyjl/check";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {

		model.addAttribute("hyjl", hyjlService.findOne(id));
		return "/business/hyjl/item/detail";
	}

	// private static final Log logger =
	// LogFactory.getLog(HyjlController.class);
	//
	// @RequestMapping(value = "/item/export")
	// public void export(HttpServletRequest request, HttpServletResponse
	// response) {
	// user = SecurityUtil.getUser();
	// List<Hyjl> xfqcwhs = hyjlService.getHyjlList(user);
	// Map<String, Object> dataMap = new HashMap<String, Object>();
	// for (int i = 1, j = xfqcwhs.size(); i <= j; i++) {
	// // 如果有HTML标签，替换成空格
	// xfqcwhs.get(i - 1).setNr(
	// xfqcwhs.get(i - 1).getNr()
	// .replaceAll("\\&[a-zA-Z]{0,9};", ""));
	// xfqcwhs.get(i - 1).setId(i + "");
	// }
	//
	// dataMap.put("hyjl", xfqcwhs);
	// String fileName = "会议记录";
	//
	// String userAgent = request.getHeader("USER-AGENT");
	// try {
	// if (StringUtils.contains(userAgent, "MSIE")) {// IE浏览器
	// fileName = URLEncoder.encode(fileName, "UTF-8");
	// } else if (StringUtils.contains(userAgent, "Mozilla")) {// google,火狐浏览器
	// fileName = new String(fileName.getBytes(), "ISO8859-1");
	// } else {
	// fileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
	// }
	// // fileName = URLEncoder.encode(fileName.substring(0,
	// // fileName.indexOf("(")),
	// // "UTF-8")+fileName.substring(fileName.indexOf("("));
	// } catch (UnsupportedEncodingException e) {
	// logger.error("不支持的编码：", e);
	// }
	//
	// new ExportDocUtil("hyjl.ftl").setDataList(dataMap).exportDocument(
	// response, fileName);
	// }

}
