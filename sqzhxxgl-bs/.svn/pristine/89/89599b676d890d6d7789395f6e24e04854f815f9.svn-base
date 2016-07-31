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
import com.gouhai.baoshan.entity.business.dqgz.fd.Educationtrain;
import com.gouhai.baoshan.service.business.dqgz.fd.EducationTrainService;

/**
 * 
 * 妇女教育培训情况
 * @author sun 2014-08-06
 * 
 */
@Controller
@RequestMapping(value = "/educationtrain")
public class EducationTrainController extends BusinessFormController {
	@Autowired
	private EducationTrainService  educationTrainService;
	public EducationTrainController() {
		super("educationtrain");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/educationtrain/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(educationTrainService.getBeanList(businessForm, current),
				educationTrainService.getBeanCount(businessForm), current));
		return "/business/educationtrain/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/educationtrain/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Educationtrain educationtrain, String businessFormId) {
		educationtrain.setBusinessForm(new BusinessForm(businessFormId));
		educationTrainService.insert(educationtrain);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/educationtrain/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		educationTrainService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/educationtrain/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("educationtrain", educationTrainService.findOne(id));
		return "/business/educationtrain/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Educationtrain educationtrain, String businessFormId){
		educationTrainService.update(educationtrain, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		
		return "redirect:/educationtrain/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("educationtrain:check")){
			return "/error/unauthority";
		}
		return "redirect:/educationtrain/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("educationtrain:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(educationTrainService.getBeanList(businessForm, current),
				educationTrainService.getBeanCount(businessForm), current));
		return "/business/educationtrain/check";
	}
}
