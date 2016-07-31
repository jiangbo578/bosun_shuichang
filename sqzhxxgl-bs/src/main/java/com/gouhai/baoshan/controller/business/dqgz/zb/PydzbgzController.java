/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.zb;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Pydzbgz;
import com.gouhai.baoshan.service.business.dqgz.zb.PydzbgzService;

/**
 * 
 *党员（群众）评议党支部工作情况
 * @author sun 2014-08-15 
 * 
 */
@Controller
@RequestMapping(value = "/pydzbgz")
public class PydzbgzController extends BusinessFormController {
	@Autowired
	private PydzbgzService pydzbgzService;
	
	public PydzbgzController() {
		super("pydzbgz");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/pydzbgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(pydzbgzService.getBeanList(businessForm, current),
				pydzbgzService.getBeanCount(businessForm), current));
		return "/business/pydzbgz/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/pydzbgz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Pydzbgz pydzbgz, String businessFormId) {
		updateBusinessForm(businessFormId);
		pydzbgz.setBusinessForm(new BusinessForm(businessFormId));
		pydzbgzService.insert(pydzbgz);
		return "redirect:/pydzbgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		pydzbgzService.delete(id, businessFormId);
		return "redirect:/pydzbgz/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("pydzbgz", pydzbgzService.findOne(id));
		return "/business/pydzbgz/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Pydzbgz pydzbgz, String businessFormId){
		updateBusinessForm(businessFormId);
		pydzbgzService.update(pydzbgz, businessFormId);
		return "redirect:/pydzbgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("pydzbgz:check")){
			return "/error/unauthority";
		}
		return "redirect:/pydzbgz/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("pydzbgz:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(pydzbgzService.getBeanList(businessForm, current),
				pydzbgzService.getBeanCount(businessForm), current));
		return "/business/pydzbgz/check";
	}
}
