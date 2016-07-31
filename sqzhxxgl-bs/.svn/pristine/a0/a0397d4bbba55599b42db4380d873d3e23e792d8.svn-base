/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.tz;

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
import com.gouhai.baoshan.entity.business.dqgz.tz.Xshjcrs;
import com.gouhai.baoshan.service.business.dqgz.tz.XshjcrsService;

/**
 * 
 * 新社会阶层人士名单 controller entity:Xshjcrs.java
 * @author Rui
 * 
 */
@Controller
@RequestMapping(value = "/xshjcrs")
public class XshjcrsController extends BusinessFormController {

	private XshjcrsService xshjcrsService;
	
	public XshjcrsController() {
		super("Xshjcrs");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "rdny", new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/xshjcrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = new BusinessForm(businessFormId);
		model.addAllAttributes(pageResult(xshjcrsService.getXshjcrsList(businessForm, current),
				xshjcrsService.getXshjcrsCount(businessForm), current));
		return "/business/xshjcrs/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/xshjcrs/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Xshjcrs xshjcrs, String businessFormId) {
		xshjcrs.setBusinessForm(new BusinessForm(businessFormId));
		xshjcrsService.insert(xshjcrs);
		return "redirect:/xshjcrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		xshjcrsService.delete(id, businessFormId);
		return "redirect:/xshjcrs/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("xshjcrs", xshjcrsService.findOne(id));
		return "/business/xshjcrs/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Xshjcrs xshjcrs, String businessFormId){
		xshjcrsService.update(xshjcrs, businessFormId);
		return "redirect:/xshjcrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("xshjcrs:check")){
			return "/error/unauthority";
		}
		return "redirect:/xshjcrs/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("xshjcrs:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(xshjcrsService.getXshjcrsList(businessForm, current),
				xshjcrsService.getXshjcrsCount(businessForm), current));
		return "/business/xshjcrs/check";
	}

	public XshjcrsService getXshjcrsService() {
		return xshjcrsService;
	}

	@Autowired
	public void setXshjcrsService(XshjcrsService xshjcrsService) {
		this.xshjcrsService = xshjcrsService;
	}

	

	
}
