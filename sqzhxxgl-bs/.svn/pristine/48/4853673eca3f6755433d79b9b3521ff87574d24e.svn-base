/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.shgl.xfgz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
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
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xfqcwh;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.shgl.xfgz.XfqcwhService;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/xfqcwh")
public class XfqcwhController extends BusinessFormController {

	@Autowired
	private XfqcwhService xfqcwhService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	public XfqcwhController() {
		super("xfqcwh");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "jc", new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(Date.class, "rq", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/xfqcwh/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(xfqcwhService.getXfqcwhList(businessForm, current),
				xfqcwhService.getXfqcwhCount(businessForm), current));
		return "/business/xfqcwh/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/xfqcwh/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Xfqcwh xfqcwh, String businessFormId) {
		updateBusinessForm(businessFormId);
		xfqcwh.setBusinessForm(new BusinessForm(businessFormId));
		xfqcwhService.insert(xfqcwh);
		return "redirect:/xfqcwh/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		xfqcwhService.delete(id, businessFormId);
		return "redirect:/xfqcwh/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("xfqcwh", xfqcwhService.findOne(id));
		return "/business/xfqcwh/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Xfqcwh xfqcwh, String businessFormId){
		updateBusinessForm(businessFormId);
		xfqcwhService.update(xfqcwh, businessFormId);
		return "redirect:/xfqcwh/item/1/" + businessFormId;
	}
	

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("xfqcwh:check")){
			return "/error/unauthority";
		}
		return "redirect:/xfqcwh/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("xfqcwh:check")){
			return "/error/unauthority";
		}
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(xfqcwhService.getXfqcwhList(businessForm, current),
				xfqcwhService.getXfqcwhCount(businessForm), current));
		return "/business/xfqcwh/check";
	}

}
