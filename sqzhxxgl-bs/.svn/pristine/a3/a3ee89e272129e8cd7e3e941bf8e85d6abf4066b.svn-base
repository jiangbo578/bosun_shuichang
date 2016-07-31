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
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbsfwomanhzs;
import com.gouhai.baoshan.service.business.dqgz.fd.SxsbsfwomanhzsService;

/**
 * 
 *   女性专业合作社
 * @author sun 2014-08-19
 * 
 */
@Controller
@RequestMapping(value = "/sxsbsfwomanhzs")
public class SxsbsfwomanhzsController extends BusinessFormController {
	@Autowired
	private SxsbsfwomanhzsService sxsbsfwomanhzsService;
	
	public SxsbsfwomanhzsController() {
		super("sxsbsfwomanhzs");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sxsbsfwomanhzs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "sxsbsfwomanhzs");
		model.addAllAttributes(pageResult(sxsbsfwomanhzsService.getBeanList(businessForm, current),
				sxsbsfwomanhzsService.getBeanCount(businessForm), current));
		return "/business/sxsbsspro/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sxsbsfwomanhzs/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Sxsbsfwomanhzs sxsbsfwomanhzs, String businessFormId) {
		updateBusinessForm(businessFormId);
		sxsbsfwomanhzs.setBusinessForm(new BusinessForm(businessFormId));
		sxsbsfwomanhzsService.insert(sxsbsfwomanhzs);
		return "redirect:/sxsbsfwomanhzs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		sxsbsfwomanhzsService.delete(id, businessFormId);
		return "redirect:/sxsbsfwomanhzs/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("sxsbsfwomanhzs", sxsbsfwomanhzsService.findOne(id));
		return "/business/sxsbsfwomanhzs/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sxsbsfwomanhzs sxsbsfwomanhzs, String businessFormId){
		updateBusinessForm(businessFormId);
		sxsbsfwomanhzsService.update(sxsbsfwomanhzs, businessFormId);
		return "redirect:/sxsbsfwomanhzs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("sxsbsspro:check")){
			return "/error/unauthority";
		}
		return "redirect:/sxsbsfwomanhzs/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("sxsbsspro:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "sxsbsfwomanhzs");
		model.addAllAttributes(pageResult(sxsbsfwomanhzsService.getBeanList(businessForm, current),
				sxsbsfwomanhzsService.getBeanCount(businessForm), current));
		return "/business/sxsbsspro/check";
	}
}
