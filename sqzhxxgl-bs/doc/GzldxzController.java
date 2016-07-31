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
@RequestMapping(value = "/gzldxz")
public class GzldxzController extends PageableController {

	@Autowired
	private BusinessService businessService;
	@Autowired
	private BusinessFormService businessFormService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String toIndex() {
		return "redirect:/gzldxz/1";
	}

	@RequestMapping(value = "/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		Business business = businessService.findOneByCode("Gzldxz");
		User user = SecurityUtil.getUser();
		
		model.addAllAttributes(pageResult(businessFormService.getBusinessFormList(user, business, current),
				businessFormService.getBusinessFormCount(user, business), current));
		return "/business/gzldxz/index";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		return "/business/gzldxz/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Model model, String name) {
		Business business = businessService.findOneByCode("Gzldxz");
		if (business == null) {
			model.addAttribute("message", "无此业务");
			return "/business/gzldxz/add";
		}

		User user = SecurityUtil.getUser();
		
		//无提醒，直接保存
		if (!business.isRemind()) {
			BusinessForm businessForm = new BusinessForm();
			businessForm.setName(name);
			businessForm.setBusiness(business);
			businessForm.setUser(user);
			businessFormService.insert(businessForm);
			return "redirect:/gzldxz/1";
		}
		
		//有提醒
		Date beforeRemindDate = DateTimeUtil.getYMDDate(businessService.findBeforeRemindDate(business));
    	System.out.println(DateTimeUtil.getDateToString(beforeRemindDate, DateTimeUtil.PATTERN_LONG));
    	
		Date afterRemindDate = businessService.findAfterRemindDate(business);
		if (afterRemindDate == null) {
			model.addAttribute("message", "还没设置提醒日");
			return "/business/gzldxz/add";
		}
		afterRemindDate = DateTimeUtil.getYMDDate(afterRemindDate);
    	System.out.println(DateTimeUtil.getDateToString(afterRemindDate, DateTimeUtil.PATTERN_LONG));
    	
		if(businessFormService.hasFormItem(user, business, beforeRemindDate, afterRemindDate)){
			model.addAttribute("message", "已经添加过了");
			return "/business/gzldxz/add";
		}else{
			BusinessForm businessForm = new BusinessForm();
			businessForm.setName(name);
			businessForm.setBusiness(business);
			businessForm.setUser(user);
			businessFormService.insert(businessForm);
			return "redirect:/gzldxz/1";
		}
		
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id){
		BusinessForm businessForm = businessFormService.findOne(id, SecurityUtil.getUser());
		
		if (businessForm == null) {
			return "/error/unauthority";
		}
		
		businessFormService.delete(businessForm);
		return "redirect:/gzldxz/1";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id){
		model.addAttribute("businessForm", businessFormService.findOne(id, SecurityUtil.getUser()));
		return "/business/gzldxz/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Model model, BusinessForm businessForm){
		User user = SecurityUtil.getUser();

		Business business = businessService.findOneByCode("Zcdygk");
		if (business == null) {
			model.addAttribute("message", "无此业务");
			model.addAttribute("businessForm", businessFormService.findOne(businessForm.getId(), user));
			return "/business/gzldxz/update";
		}

		BusinessForm findBusinessForm = businessFormService.findOne(businessForm.getId(), user);

		if (findBusinessForm == null) {
			return "/error/unauthority";
		}
		
		findBusinessForm.setName(businessForm.getName());
		findBusinessForm.setUpdateDate(new Date());
		findBusinessForm.setSysCreate(false);
		businessFormService.update(findBusinessForm);
		return "redirect:/gzldxz/1";
	}
	
}
