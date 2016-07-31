/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.fd;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanjc;
import com.gouhai.baoshan.service.business.dqgz.fd.WomanjcService;

/**
 * 
 * 妇女就业创业工作情况
 * @author sun 2014-08-07 
 * 
 */
@Controller
@RequestMapping(value = "/womanjc")
public class WomanjcController extends BusinessFormController {
	@Autowired
	private WomanjcService womanjcService;
	
	public WomanjcController() {
		super("womanjc");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/womanjc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(womanjcService.getBeanList(businessForm, current),
				womanjcService.getBeanCount(businessForm), current));
		return "/business/womanjc/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/womanjc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Womanjc womanjc, String businessFormId) {
		womanjc.setBusinessForm(new BusinessForm(businessFormId));
		womanjcService.insert(womanjc);
		return "redirect:/womanjc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		womanjcService.delete(id, businessFormId);
		return "redirect:/womanjc/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("womanjc", womanjcService.findOne(id));
		return "/business/womanjc/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Womanjc womanjc, String businessFormId){
		womanjcService.update(womanjc, businessFormId);
		return "redirect:/womanjc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("womanjc:check")){
			return "/error/unauthority";
		}
		return "redirect:/womanjc/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("womanjc:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(womanjcService.getBeanList(businessForm, current),
				womanjcService.getBeanCount(businessForm), current));
		return "/business/womanjc/check";
	}
	
}
