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
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingrecord;
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingwork;
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbmhsfc;
import com.gouhai.baoshan.entity.business.dqgz.fd.SxsbmhsfcActivity;
import com.gouhai.baoshan.service.business.dqgz.fd.SxsbmhsfcActivityService;
import com.gouhai.baoshan.service.business.dqgz.fd.SxsbmhsfcService;

/**
 * 
 * 美好家园示范村
 * @author sun 2014-08-19
 * 
 */
@Controller
@RequestMapping(value = "/sxsbmhsfc")
public class SxsbmhsfcController extends BusinessFormController {
	@Autowired
	private SxsbmhsfcService sxsbmhsfcService;
	
	@Autowired
	private SxsbmhsfcActivityService sxsbmhsfcActivityService;
	
	public SxsbmhsfcController() {
		super("sxsbmhsfc");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sxsbmhsfc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "sxsbmhsfc");
		model.addAllAttributes(pageResult(sxsbmhsfcService.getBeanList(businessForm, current),
				sxsbmhsfcService.getBeanCount(businessForm), current));
		return "/business/sxsbsspro/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sxsbmhsfc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Sxsbmhsfc sxsbmhsfc, String businessFormId) {
		updateBusinessForm(businessFormId);
		sxsbmhsfc.setBusinessForm(new BusinessForm(businessFormId));
		sxsbmhsfcService.insert(sxsbmhsfc);
		return "redirect:/sxsbmhsfc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		sxsbmhsfcService.delete(id, businessFormId);
		return "redirect:/sxsbmhsfc/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("sxsbmhsfc", sxsbmhsfcService.findOne(id));
		return "/business/sxsbmhsfc/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sxsbmhsfc sxsbmhsfc, String businessFormId){
		updateBusinessForm(businessFormId);
		sxsbmhsfcService.update(sxsbmhsfc, businessFormId);
		return "redirect:/sxsbmhsfc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("sxsbsspro:check")){
			return "/error/unauthority";
		}
		return "redirect:/sxsbmhsfc/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("sxsbsspro:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		
		model.addAttribute("type", "sxsbmhsfc");
		model.addAllAttributes(pageResult(sxsbmhsfcService.getBeanList(businessForm, current),
				sxsbmhsfcService.getBeanCount(businessForm), current));
		return "/business/sxsbsspro/check";
	}
	/**
	 * 活动情况
	 */
	@RequestMapping(value = "/{sxsbmhsfId}/activity/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() String sxsbmhsfId,@PathVariable() int current) {
		model.addAllAttributes(pageResult(sxsbmhsfcActivityService.getBeanList(sxsbmhsfId, current),
				sxsbmhsfcActivityService.getBeanCount(sxsbmhsfId), current));
		model.addAttribute("sxsbmhsfId", sxsbmhsfId);
		return "/business/sxsbmhsfc/item/activity/index";
	}
	
	@RequestMapping(value = "/{sxsbmhsfcId}/activity/add", method = RequestMethod.GET)
	public String add(Model model,@PathVariable() String sxsbmhsfcId) {
		model.addAttribute("sxsbmhsfcId", sxsbmhsfcId);
		return "/business/sxsbmhsfc/item/activity/add";
	}
	

	@RequestMapping(value = "/{sxsbmhsfcId}/activity/add/1", method = RequestMethod.POST)
	public String add2(Model model,SxsbmhsfcActivity sxsbmhsfcActivity,@PathVariable() String sxsbmhsfcId) {
		
		Sxsbmhsfc sxsbmhsfc = sxsbmhsfcService.findOne(sxsbmhsfcId);
		sxsbmhsfcActivity.setSxsbmhsfc(sxsbmhsfc);
		sxsbmhsfcActivityService.insert(sxsbmhsfcActivity);
		return "redirect:/sxsbmhsfc/"+sxsbmhsfcId+"/activity/1";
	}
	
	@RequestMapping(value = "/{sxsbmhsfcId}/activity/update/{sxsbmhsfcActivityId}/", method = RequestMethod.GET)
	public String findRecord(Model model,@PathVariable() String sxsbmhsfcId,@PathVariable() String sxsbmhsfcActivityId) {
		model.addAttribute("sxsbmhsfcId", sxsbmhsfcId);
		
		SxsbmhsfcActivity activity = sxsbmhsfcActivityService.findOne(sxsbmhsfcActivityId);
		
		model.addAttribute("activity", activity);
		return "/business/sxsbmhsfc/item/activity/update";
	}
	@RequestMapping(value = "/{sxsbmhsfcId}/activity/update/", method = RequestMethod.POST)
	public String updateRecord(Model model,@PathVariable() String sxsbmhsfcId,SxsbmhsfcActivity activity) {
		sxsbmhsfcActivityService.update(activity);
		return "redirect:/sxsbmhsfc/"+sxsbmhsfcId+"/activity/1";
	}
	@RequestMapping(value = "/{sxsbmhsfcId}/delete/{sxsbmhsfcActivityId}/", method = RequestMethod.GET)
	public String deleteRecord(@PathVariable String sxsbmhsfcId, @PathVariable() String sxsbmhsfcActivityId){
		sxsbmhsfcActivityService.delete(sxsbmhsfcActivityId);
		return "redirect:/sxsbmhsfc/"+sxsbmhsfcId+"/activity/1";
	}
	
	
}
