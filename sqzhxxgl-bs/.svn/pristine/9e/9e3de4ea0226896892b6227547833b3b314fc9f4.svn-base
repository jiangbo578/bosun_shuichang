/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.sygz;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Lxgbxxqk;
import com.gouhai.baoshan.service.business.dqgz.sygz.LxgbxxqkService;

/**
 * 
 * 离退休干部学习活动情况表（包括就近发挥作用、受到组织
 * @author sun 2014-08-15 
 * 
 */
@Controller
@RequestMapping(value = "/lxgbxxqk")
public class LxgbxxqkController extends BusinessFormController {
	@Autowired
	private LxgbxxqkService lxgbxxqkService;
	
	public LxgbxxqkController() {
		super("lxgbxxqk");
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/lxgbxxqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("type", "lxgbxxqk");
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(lxgbxxqkService.getBeanList(businessForm, current),
				lxgbxxqkService.getBeanCount(businessForm), current));
		return "/business/lxgbjbqk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/lxgbxxqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Lxgbxxqk lxgbxxqk, String businessFormId) {
		lxgbxxqk.setBusinessForm(new BusinessForm(businessFormId));
		lxgbxxqkService.insert(lxgbxxqk);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbxxqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		lxgbxxqkService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbxxqk/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("lxgbxxqk", lxgbxxqkService.findOne(id));
		return "/business/lxgbxxqk/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Lxgbxxqk lxgbxxqk, String businessFormId){
		lxgbxxqkService.update(lxgbxxqk, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbxxqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("lxgbjbqk:check")){
			return "/error/unauthority";
		}
		return "redirect:/lxgbxxqk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("lxgbjbqk:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "lxgbxxqk");
		model.addAllAttributes(pageResult(lxgbxxqkService.getBeanList(businessForm, current),
				lxgbxxqkService.getBeanCount(businessForm), current));
		return "/business/lxgbjbqk/check";
	}
}
