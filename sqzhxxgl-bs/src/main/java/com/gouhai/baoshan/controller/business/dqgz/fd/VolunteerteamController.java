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
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteerteam;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.dqgz.fd.VolunteerteamService;
import com.gouhai.baoshan.service.business.dqgz.fd.WomanRepresentService;

/**
 * 
 * 家庭志愿者队伍名册
 * @author sun 2014-08-04 
 * 
 */
@Controller
@RequestMapping(value = "/volunteerteam")
public class VolunteerteamController extends BusinessFormController {
	@Autowired
	private BusinessFormService businessFormService; //添加表单

	private VolunteerteamService  volunteerteamService;
	public VolunteerteamController() {
		super("volunteerteam");
	}
	
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/volunteerteam/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);

		model.addAttribute("businessForm",businessForm);

		model.addAllAttributes(pageResult(volunteerteamService.getBeanList(businessForm, current),
				volunteerteamService.getBeanCount(businessForm), current));
		return "/business/volunteerteam/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/volunteerteam/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Volunteerteam volunteerteam, String businessFormId) {
		volunteerteam.setBusinessForm(new BusinessForm(businessFormId));
		volunteerteamService.insert(volunteerteam);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/volunteerteam/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		volunteerteamService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/volunteerteam/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("volunteerteam", volunteerteamService.findOne(id));
		return "/business/volunteerteam/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Volunteerteam volunteerteam, String businessFormId){
		volunteerteamService.update(volunteerteam, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/volunteerteam/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("volunteerteam:check")){
			return "/error/unauthority";
		}
		return "redirect:/volunteerteam/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("volunteerteam:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(volunteerteamService.getBeanList(businessForm, current),
				volunteerteamService.getBeanCount(businessForm), current));
		return "/business/volunteerteam/check";
	}
	public VolunteerteamService getVolunteerteamService()
	{
		return volunteerteamService;
	}
	@Autowired
	public void setVolunteerteamService(VolunteerteamService volunteerteamService)
	{
		this.volunteerteamService = volunteerteamService;
	}
	

	
}
