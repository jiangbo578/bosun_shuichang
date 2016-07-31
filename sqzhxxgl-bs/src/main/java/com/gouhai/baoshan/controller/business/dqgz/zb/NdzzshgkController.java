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
import com.gouhai.baoshan.entity.business.dqgz.zb.Ndzzshgk;
import com.gouhai.baoshan.service.business.dqgz.zb.NdzzshgkService;

/**
 * 
 *年度组织生活情况表
 * @author sun 2014-08-15 
 * 
 */
@Controller
@RequestMapping(value = "/ndzzshgk")
public class NdzzshgkController extends BusinessFormController {
	@Autowired
	private NdzzshgkService ndzzshgkService;
	
	public NdzzshgkController() {
		super("ndzzshgk");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/ndzzshgk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(ndzzshgkService.getBeanList(businessForm, current),
				ndzzshgkService.getBeanCount(businessForm), current));
		return "/business/ndzzshgk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/ndzzshgk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Ndzzshgk ndzzshgk, String businessFormId) {
		updateBusinessForm(businessFormId);
		ndzzshgk.setBusinessForm(new BusinessForm(businessFormId));
		ndzzshgkService.insert(ndzzshgk);
		return "redirect:/ndzzshgk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		ndzzshgkService.delete(id, businessFormId);
		return "redirect:/ndzzshgk/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("ndzzshgk", ndzzshgkService.findOne(id));
		return "/business/ndzzshgk/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Ndzzshgk ndzzshgk, String businessFormId){
		updateBusinessForm(businessFormId);
		ndzzshgkService.update(ndzzshgk, businessFormId);
		return "redirect:/ndzzshgk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("ndzzshgk:check")){
			return "/error/unauthority";
		}
		return "redirect:/ndzzshgk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("ndzzshgk:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(ndzzshgkService.getBeanList(businessForm, current),
				ndzzshgkService.getBeanCount(businessForm), current));
		return "/business/ndzzshgk/check";
	}
}
