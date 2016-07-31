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
import com.gouhai.baoshan.entity.business.dqgz.tz.Mzdprs;
import com.gouhai.baoshan.service.business.dqgz.tz.MzdprsService;

/**
 * 
 * 民主党派人士 controller entity:Mzdprs.java
 * @author Rui
 * 
 */
@Controller
@RequestMapping(value = "/mzdprs")
public class MzdprsController extends BusinessFormController {

	private MzdprsService mzdprsService;
	
	public MzdprsController() {
		super("Mzdprs");
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
		return "redirect:/mzdprs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(mzdprsService.getMzdprsList(businessForm, current),
				mzdprsService.getMzdprsCount(businessForm), current));
		return "/business/mzdprs/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/mzdprs/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Mzdprs mzdprs, String businessFormId) {
		updateBusinessForm(businessFormId);
		mzdprs.setBusinessForm(new BusinessForm(businessFormId));
		mzdprsService.insert(mzdprs);
		return "redirect:/mzdprs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		mzdprsService.delete(id, businessFormId);
		return "redirect:/mzdprs/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("mzdprs", mzdprsService.findOne(id));
		return "/business/mzdprs/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Mzdprs mzdprs, String businessFormId){
		updateBusinessForm(businessFormId);
		mzdprsService.update(mzdprs, businessFormId);
		return "redirect:/mzdprs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("mzdprs:check")){
			return "/error/unauthority";
		}
		return "redirect:/mzdprs/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("mzdprs:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(mzdprsService.getMzdprsList(businessForm, current),
				mzdprsService.getMzdprsCount(businessForm), current));
		return "/business/mzdprs/check";
	}

	public MzdprsService getMzdprsService() {
		return mzdprsService;
	}

	@Autowired
	public void setMzdprsService(MzdprsService mzdprsService) {
		this.mzdprsService = mzdprsService;
	}

	
}
