/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.jcqk.gk;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Peoplesummary;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.jcqk.gk.PeoplesummaryService;

/**
 * 
 * 人口情况表(
 * @author sun 2014-08-27
 * 
 */
@Controller
@RequestMapping(value = "/peoplesummary")
public class PeoplesummaryController extends BusinessFormController {
	@Autowired
	private PeoplesummaryService peoplesummaryService;
	
	public PeoplesummaryController() {
		super("peoplesummary");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/peoplesummary/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(peoplesummaryService.getBeanList(businessForm, current),
				peoplesummaryService.getBeanCount(businessForm), current));
		return "/business/peoplesummary/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/peoplesummary/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Peoplesummary peoplesummary, String businessFormId,HttpServletRequest request) {
		peoplesummary.setBusinessForm(new BusinessForm(businessFormId));
		Organization organization = (Organization) request.getSession().getAttribute("userOrgan");
		peoplesummary.setOrganization(organization);
		peoplesummaryService.insert(peoplesummary);
		updateBusinessForm(businessFormId);
		return "redirect:/peoplesummary/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		peoplesummaryService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);
		return "redirect:/peoplesummary/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("peoplesummary", peoplesummaryService.findOne(id));
		return "/business/peoplesummary/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Peoplesummary peoplesummary, String businessFormId,HttpServletRequest request){
		Organization organization = (Organization) request.getSession().getAttribute("userOrgan");
		peoplesummary.setOrganization(organization);
		peoplesummaryService.update(peoplesummary, businessFormId);
		updateBusinessForm(businessFormId);
		
		return "redirect:/peoplesummary/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("peoplesummary:check")){
			return "/error/unauthority";
		}
		return "redirect:/peoplesummary/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("peoplesummary:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(peoplesummaryService.getBeanList(businessForm, current),
				peoplesummaryService.getBeanCount(businessForm), current));
		return "/business/peoplesummary/check";
	}
	
}
