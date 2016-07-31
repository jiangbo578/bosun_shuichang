/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.sygz;

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
import com.gouhai.baoshan.entity.business.dqgz.sygz.Twjrhmc;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Zdyfdxhmc;
import com.gouhai.baoshan.service.business.dqgz.sygz.TwjrhmcService;

/**
 * 
 * 重点优抚对象花名册表 controller entity:Tyqndj.java
 * @author sun 2014-08-02
 * 
 */
@Controller
@RequestMapping(value = "/twjrhmc")
public class TwjrhmcController extends BusinessFormController {

	private TwjrhmcService twjrhmcService;
	
	public TwjrhmcController() {
		super("twjrhmc");
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/twjrhmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(twjrhmcService.getBeanList(businessForm, current),
				twjrhmcService.getBeanCount(businessForm), current));
		return "/business/twjrhmc/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/twjrhmc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Twjrhmc twjrhmc, String businessFormId) {
		twjrhmc.setBusinessForm(new BusinessForm(businessFormId));
		twjrhmcService.insert(twjrhmc);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/twjrhmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		twjrhmcService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/twjrhmc/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("twjrhmc", twjrhmcService.findOne(id));
		return "/business/twjrhmc/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Twjrhmc twjrhmc, String businessFormId){
		twjrhmcService.update(twjrhmc, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/twjrhmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("zdyfdxhmc:check")){
			return "/error/unauthority";
		}
		return "redirect:/twjrhmc/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("twjrhmc:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(twjrhmcService.getBeanList(businessForm, current),
				twjrhmcService.getBeanCount(businessForm), current));
		return "/business/twjrhmc/check";
	}
	public TwjrhmcService getTwjrhmcService() {
		return twjrhmcService;
	}

	@Autowired
	public void setTwjrhmcService(TwjrhmcService twjrhmcService) {
		this.twjrhmcService = twjrhmcService;
	}


	
}
