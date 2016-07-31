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
import com.gouhai.baoshan.entity.business.dqgz.sygz.Jdbhlx;
import com.gouhai.baoshan.service.business.dqgz.sygz.JdbhlxService;

/**
 * 
 * 结对包户联系登记表
 * @author sun 2014-08-04 
 * 
 */
@Controller
@RequestMapping(value = "/jdbhlx")
public class JdbhlxController extends BusinessFormController {

	private JdbhlxService jdbhlxService;
	
	public JdbhlxController() {
		super("jdbhlx");
	}
	
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jdbhlx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jdbhlxService.getBeanList(businessForm, current),
				jdbhlxService.getBeanCount(businessForm), current));
		return "/business/jdbhlx/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jdbhlx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Jdbhlx jdbhlx, String businessFormId) {
		jdbhlx.setBusinessForm(new BusinessForm(businessFormId));
		jdbhlxService.insert(jdbhlx);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/jdbhlx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		jdbhlxService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/jdbhlx/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("jdbhlx", jdbhlxService.findOne(id));
		return "/business/jdbhlx/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jdbhlx jdbhlx, String businessFormId){
		jdbhlxService.update(jdbhlx, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/jdbhlx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("jdbhlx:check")){
			return "/error/unauthority";
		}
		return "redirect:/jdbhlx/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("jdbhlx:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jdbhlxService.getBeanList(businessForm, current),
				jdbhlxService.getBeanCount(businessForm), current));
		return "/business/jdbhlx/check";
	}
	public JdbhlxService getJdbhlxService() {
		return jdbhlxService;
	}

	@Autowired
	public void setJdbhlxService(JdbhlxService jdbhlxService) {
		this.jdbhlxService = jdbhlxService;
	}


	
}
