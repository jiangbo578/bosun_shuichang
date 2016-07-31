/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.BusinessService;
import com.gouhai.baoshan.service.business.ZcdygkService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/zcdygk1")
public class ZcdygkController extends PageableController {

	@Autowired
	private BusinessService businessService;
	@Autowired
	private BusinessFormService businessFormService;
	@Autowired
	private ZcdygkService zcdygkService;
    
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String toIndex() {
		return "redirect:/zcdygk/1";
	}

	@RequestMapping(value = "/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		Business business = businessService.findOneByCode("Zcdygk");
		User user = SecurityUtil.getUser();
		
		model.addAllAttributes(pageResult(businessFormService.getBusinessFormList(user, business, current),
				businessFormService.getBusinessFormCount(user, business), current));
		return "/business/zcdygk/index";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		return "/business/zcdygk/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Model model, String name) {
		Business business = businessService.findOneByCode("Zcdygk");
		if (business == null) {
			model.addAttribute("message", "无此业务");
			return "/business/zcdygk/add";
		}

		User user = SecurityUtil.getUser();
		
		//无提醒，直接保存
		if (!business.isRemind()) {
			BusinessForm businessForm = new BusinessForm();
			businessForm.setName(name);
			businessForm.setBusiness(business);
			businessForm.setUser(user);
			businessFormService.insert(businessForm);
			return "redirect:/zcdygk/1";
		}
		
		//有提醒
		Date beforeRemindDate = DateTimeUtil.getYMDDate(businessService.findBeforeRemindDate(business));
    	System.out.println(DateTimeUtil.getDateToString(beforeRemindDate, DateTimeUtil.PATTERN_LONG));
    	
		Date afterRemindDate = businessService.findAfterRemindDate(business);
		if (afterRemindDate == null) {
			model.addAttribute("message", "您不需要填写");
			return "/business/zcdygk/add";
		}
		afterRemindDate = DateTimeUtil.getYMDDate(afterRemindDate);
    	System.out.println(DateTimeUtil.getDateToString(afterRemindDate, DateTimeUtil.PATTERN_LONG));
    	
		if(businessFormService.hasFormItem(user, business, beforeRemindDate, afterRemindDate)){
			model.addAttribute("message", "已经添加过了");
			return "/business/zcdygk/add";
		}else{
			BusinessForm businessForm = new BusinessForm();
			businessForm.setName(name);
			businessForm.setBusiness(business);
			businessForm.setUser(user);
			businessFormService.insert(businessForm);
			return "redirect:/zcdygk/1";
		}
		
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id){
		BusinessForm businessForm = businessFormService.findOne(id, SecurityUtil.getUser());
		
		if (businessForm == null) {
			return "/error/unauthority";
		}
		
		businessFormService.delete(businessForm);
		return "redirect:/zcdygk/1";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id){
		model.addAttribute("businessForm", businessFormService.findOne(id, SecurityUtil.getUser()));
		return "/business/zcdygk/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Model model, BusinessForm businessForm){
		User user = SecurityUtil.getUser();
		
		Business business = businessService.findOneByCode("Zcdygk");
		if (business == null) {
			model.addAttribute("message", "无此业务");
			model.addAttribute("businessForm", businessFormService.findOne(businessForm.getId(), user));
			return "/business/zcdygk/update";
		}

		BusinessForm findBusinessForm = businessFormService.findOne(businessForm.getId(), user);

		if (findBusinessForm == null) {
			return "/error/unauthority";
		}
		
		findBusinessForm.setName(businessForm.getName());
		findBusinessForm.setUpdateDate(new Date());
		findBusinessForm.setSysCreate(false);
		businessFormService.update(findBusinessForm);
		return "redirect:/zcdygk/1";
	}
	
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		return "redirect:/zcdygk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(zcdygkService.getZcdygkList(businessForm, current),
				zcdygkService.getZcdygkCount(businessForm), current));
		return "/business/zcdygk/check";
	}

	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String toCheck(Model model, String businessFormId, int type, String remark){
		BusinessForm businessForm = businessFormService.findOne(businessFormId);

		if (businessForm == null) {
			return "/error/unauthority";
		}
		
		businessForm.setRemark(remark);
		businessFormService.mergeCheck(businessForm, type);
		return "redirect:/index";
	}
	
	@RequestMapping(value = "/submit/{businessFormId}", method = RequestMethod.GET)
	public String submit(Model model, @PathVariable() String businessFormId) {
		BusinessForm findBusinessForm = businessFormService.findOne(businessFormId, SecurityUtil.getUser());

		if (findBusinessForm == null) {
			return "/error/unauthority";
		}

		businessFormService.mergeCheck(findBusinessForm);
		return "redirect:/zcdygk/1";
	}
	
}
