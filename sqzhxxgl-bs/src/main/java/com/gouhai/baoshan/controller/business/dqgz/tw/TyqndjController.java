/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.tw;

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
import com.gouhai.baoshan.entity.business.dqgz.tw.Tyqndj;
import com.gouhai.baoshan.service.business.dqgz.tw.TyqndjService;

/**
 * 
 * 小区团员青年登记表 controller entity:Tyqndj.java
 * @author cgw
 * 
 */
@Controller
@RequestMapping(value = "/tyqndj")
public class TyqndjController extends BusinessFormController {

	private TyqndjService tyqndjService;
	
	public TyqndjController() {
		super("tyqndj");
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
		return "redirect:/tyqndj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(tyqndjService.getTyqndjList(businessForm, current),
				tyqndjService.getTyqndjCount(businessForm), current));
		return "/business/tyqndj/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/tyqndj/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Tyqndj tyqndj, String businessFormId) {
		updateBusinessForm(businessFormId);
		tyqndj.setBusinessForm(new BusinessForm(businessFormId));
		tyqndjService.insert(tyqndj);
		return "redirect:/tyqndj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		tyqndjService.delete(id, businessFormId);
		return "redirect:/tyqndj/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("tyqndj", tyqndjService.findOne(id));
		return "/business/tyqndj/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tyqndj tyqndj, String businessFormId){
		updateBusinessForm(businessFormId);
		tyqndjService.update(tyqndj, businessFormId);
		return "redirect:/tyqndj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("tyqndj:check")){
			return "/error/unauthority";
		}
		return "redirect:/tyqndj/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("tyqndj:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tyqndjService.getTyqndjList(businessForm, current),
				tyqndjService.getTyqndjCount(businessForm), current));
		return "/business/tyqndj/check";
	}

	public TyqndjService getTyqndjService() {
		return tyqndjService;
	}

	@Autowired
	public void setTyqndjService(TyqndjService tyqndjService) {
		this.tyqndjService = tyqndjService;
	}


	
}
