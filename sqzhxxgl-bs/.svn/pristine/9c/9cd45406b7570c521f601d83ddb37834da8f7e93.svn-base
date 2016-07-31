/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.zb;

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
import com.gouhai.baoshan.entity.business.dqgz.zb.Kndyqk;
import com.gouhai.baoshan.service.business.dqgz.zb.KndyqkService;

/**
 * 
 * 
 * @author Rui
 * 
 */
@Controller
@RequestMapping(value = "/kndyqk")
public class KndygkController extends BusinessFormController {

	private KndyqkService kndyqkService;
	
	public KndygkController() {
		super("Kndyqk");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "jdsj", new CustomDateEditor(dateFormat, true)); 
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/kndyqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(kndyqkService.getKndyqkList(businessForm, current),
				kndyqkService.getKndyqkCount(businessForm), current));
		return "/business/kndyqk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/kndyqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Kndyqk kndyqk, String businessFormId) {
		kndyqk.setBusinessForm(new BusinessForm(businessFormId));
		kndyqkService.insert(kndyqk);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/kndyqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		kndyqkService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/kndyqk/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("kndyqk", kndyqkService.findOne(id));
		return "/business/kndyqk/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Kndyqk kndyqk, String businessFormId){
		kndyqkService.update(kndyqk, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/kndyqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("kndyqk:check")){
			return "/error/unauthority";
		}
		return "redirect:/kndyqk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("kndyqk:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(kndyqkService.getKndyqkList(businessForm, current),
				kndyqkService.getKndyqkCount(businessForm), current));
		return "/business/kndyqk/check";
	}

	public KndyqkService getKndyqkService() {
		return kndyqkService;
	}

	@Autowired
	public void setKndyqkService(KndyqkService kndyqkService) {
		this.kndyqkService = kndyqkService;
	}
}
