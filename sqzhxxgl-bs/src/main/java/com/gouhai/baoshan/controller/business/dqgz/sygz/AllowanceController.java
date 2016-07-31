/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.sygz;

import java.beans.PropertyEditor;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Allowance;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Jdbhlx;
import com.gouhai.baoshan.service.business.dqgz.sygz.AllowanceService;

import freemarker.core.CustomAttribute;

/**
 * 
 * 结对包户联系登记表
 * @author sun 2014-08-04 
 * 
 */
@Controller
@RequestMapping(value = "/allowance")
public class AllowanceController extends BusinessFormController {

	private AllowanceService allowanceService;
	
	public AllowanceController() {
		super("allowance");
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/allowance/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);

		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(allowanceService.getBeanList(businessForm, current),
				allowanceService.getBeanCount(businessForm), current));
		return "/business/allowance/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/allowance/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Allowance allowance, String businessFormId) {
		allowance.setBusinessForm(new BusinessForm(businessFormId));
		allowanceService.insert(allowance);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/allowance/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		allowanceService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/allowance/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("allowance", allowanceService.findOne(id));
		return "/business/allowance/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Allowance allowance, String businessFormId){
		allowanceService.update(allowance, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/allowance/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("allowance:check")){
			return "/error/unauthority";
		}
		return "redirect:/allowance/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("allowance:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(allowanceService.getBeanList(businessForm, current),
				allowanceService.getBeanCount(businessForm), current));
		return "/business/allowance/check";
	}
	public AllowanceService getAllowanceService() {
		return allowanceService;
	}

	@Autowired
	public void setAllowanceService(AllowanceService allowanceService) {
		this.allowanceService = allowanceService;
	}


	
}
