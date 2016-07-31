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
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbsfbase;
import com.gouhai.baoshan.service.business.dqgz.fd.SxsbsfbaseService;

/**
 * 
 * 示范基地
 * @author sun 2014-08-18 
 * 
 */
@Controller
@RequestMapping(value = "/sxsbsfbase")
public class SxsbsfbaseController extends BusinessFormController {
	@Autowired
	private SxsbsfbaseService sxsbsfbaseService;
	
	public SxsbsfbaseController() {
		super("sxsbsfbase");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sxsbsfbase/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "sxsbsfbase");
		model.addAllAttributes(pageResult(sxsbsfbaseService.getBeanList(businessForm, current),
				sxsbsfbaseService.getBeanCount(businessForm), current));
		return "/business/sxsbsspro/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sxsbsfbase/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Sxsbsfbase sxsbsfbase, String businessFormId) {
		updateBusinessForm(businessFormId);
		sxsbsfbase.setBusinessForm(new BusinessForm(businessFormId));
		sxsbsfbaseService.insert(sxsbsfbase);
		return "redirect:/sxsbsfbase/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		sxsbsfbaseService.delete(id, businessFormId);
		return "redirect:/sxsbsfbase/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("sxsbsfbase", sxsbsfbaseService.findOne(id));
		return "/business/sxsbsfbase/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sxsbsfbase sxsbsfbase, String businessFormId){
		updateBusinessForm(businessFormId);
		sxsbsfbaseService.update(sxsbsfbase, businessFormId);
		return "redirect:/sxsbsfbase/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("sxsbsspro:check")){
			return "/error/unauthority";
		}
		return "redirect:/sxsbsfbase/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("sxsbsspro:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "sxsbsfbase");
		model.addAllAttributes(pageResult(sxsbsfbaseService.getBeanList(businessForm, current),
				sxsbsfbaseService.getBeanCount(businessForm), current));
		return "/business/sxsbsspro/check";
	}

}
