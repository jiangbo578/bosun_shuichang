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
import com.gouhai.baoshan.entity.business.dqgz.fd.Wmjianshe;
import com.gouhai.baoshan.service.business.dqgz.fd.WmjiansheService;

/**
 * 
 * 妇女教育培训情况
 * @author sun 2014-08-07
 * 
 */
@Controller
@RequestMapping(value = "/wmjianshe")
public class WmjiansheController extends BusinessFormController {
	@Autowired
	private WmjiansheService  wmjiansheService;
	public WmjiansheController() {
		super("wmjianshe");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wmjianshe/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(wmjiansheService.getBeanList(businessForm, current),
				wmjiansheService.getBeanCount(businessForm), current));
		return "/business/wmjianshe/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/wmjianshe/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Wmjianshe wmjianshe, String businessFormId) {
		wmjianshe.setBusinessForm(new BusinessForm(businessFormId));
		wmjiansheService.insert(wmjianshe);
		return "redirect:/wmjianshe/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		wmjiansheService.delete(id, businessFormId);
		return "redirect:/wmjianshe/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("wmjianshe", wmjiansheService.findOne(id));
		return "/business/wmjianshe/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wmjianshe wmjianshe, String businessFormId){
		wmjiansheService.update(wmjianshe, businessFormId);
		return "redirect:/wmjianshe/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("wmjianshe:check")){
			return "/error/unauthority";
		}
		return "redirect:/wmjianshe/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("wmjianshe:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(wmjiansheService.getBeanList(businessForm, current),
				wmjiansheService.getBeanCount(businessForm), current));
		return "/business/wmjianshe/check";
	}
}
