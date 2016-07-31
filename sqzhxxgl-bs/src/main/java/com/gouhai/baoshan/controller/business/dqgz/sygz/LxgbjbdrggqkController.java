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
import com.gouhai.baoshan.entity.business.dqgz.sygz.Lxgbjbdrggqk;
import com.gouhai.baoshan.service.business.dqgz.sygz.LxgbjbdrggqkService;

/**
 * 
 * 离退休干部担任村（居）骨干情况表  控制层
 * @author sun 2014-08-15
 * 
 */
@Controller
@RequestMapping(value = "/lxgbjbdrggqk")
public class LxgbjbdrggqkController extends BusinessFormController {
	@Autowired
	private LxgbjbdrggqkService lxgbjbdrggqkService;
	
	public LxgbjbdrggqkController() {
		super("lxgbjbdrggqk");
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/lxgbjbdrggqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("type", "lxgbjbdrggqk");
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(lxgbjbdrggqkService.getBeanList(businessForm, current),
				lxgbjbdrggqkService.getBeanCount(businessForm), current));
		return "/business/lxgbjbqk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/lxgbjbdrggqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Lxgbjbdrggqk lxgbjbdrggqk, String businessFormId) {
		lxgbjbdrggqk.setBusinessForm(new BusinessForm(businessFormId));
		lxgbjbdrggqkService.insert(lxgbjbdrggqk);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbjbdrggqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		lxgbjbdrggqkService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbjbdrggqk/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("lxgbjbdrggqk", lxgbjbdrggqkService.findOne(id));
		return "/business/lxgbjbdrggqk/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Lxgbjbdrggqk lxgbjbdrggqk, String businessFormId){
		lxgbjbdrggqkService.update(lxgbjbdrggqk, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbjbdrggqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("ggwgz:check")){
			return "/error/unauthority";
		}
		return "redirect:/lxgbjbdrggqk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("lxgbjbqk:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "lxgbjbdrggqk");
		model.addAllAttributes(pageResult(lxgbjbdrggqkService.getBeanList(businessForm, current),
				lxgbjbdrggqkService.getBeanCount(businessForm), current));
		return "/business/lxgbjbqk/check";
	}
}
