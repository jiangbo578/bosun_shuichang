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
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteeractivity;
import com.gouhai.baoshan.service.business.dqgz.fd.VolunteerActivityService;

/**
 * 
 * 志愿者活动情况
 * @author sun 2014-08-07
 * 
 */
@Controller
@RequestMapping(value = "/volunteeractivity")
public class VolunteerActivityController extends BusinessFormController {
	@Autowired
	private VolunteerActivityService  volunteeractivityService;
	public VolunteerActivityController() {
		super("volunteeractivity");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/volunteeractivity/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(volunteeractivityService.getBeanList(businessForm, current),
				volunteeractivityService.getBeanCount(businessForm), current));
		return "/business/volunteeractivity/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/volunteeractivity/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Volunteeractivity volunteeractivity, String businessFormId) {
		volunteeractivity.setBusinessForm(new BusinessForm(businessFormId));
		volunteeractivityService.insert(volunteeractivity);
		return "redirect:/volunteeractivity/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		volunteeractivityService.delete(id, businessFormId);
		return "redirect:/volunteeractivity/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("volunteeractivity", volunteeractivityService.findOne(id));
		return "/business/volunteeractivity/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Volunteeractivity volunteeractivity, String businessFormId){
		volunteeractivityService.update(volunteeractivity, businessFormId);
		return "redirect:/volunteeractivity/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("volunteeractivity:check")){
			return "/error/unauthority";
		}
		return "redirect:/volunteeractivity/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("volunteeractivity:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(volunteeractivityService.getBeanList(businessForm, current),
				volunteeractivityService.getBeanCount(businessForm), current));
		return "/business/volunteeractivity/check";
	}
}
