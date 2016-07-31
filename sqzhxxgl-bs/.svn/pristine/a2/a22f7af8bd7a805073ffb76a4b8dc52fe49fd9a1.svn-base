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
import com.gouhai.baoshan.entity.business.dqgz.sygz.Zdyfdxhmc;
import com.gouhai.baoshan.entity.business.dqgz.tw.Tyqndj;
import com.gouhai.baoshan.service.business.dqgz.sygz.ZdyfdxhmcService;

/**
 * 
 * 重点优抚对象花名册表 controller entity:Tyqndj.java
 * @author sun 2014-08-02
 * 
 */
@Controller
@RequestMapping(value = "/zdyfdxhmc")
public class ZdyfdxhmcController extends BusinessFormController {

	private ZdyfdxhmcService zdyfdxhmcService;
	
	public ZdyfdxhmcController() {
		super("zdyfdxhmc");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		//binder.registerCustomEditor(Date.class, "rdny", new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/zdyfdxhmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(zdyfdxhmcService.getZdyfdxhmcList(businessForm, current),
				zdyfdxhmcService.getZdyfdxhmcCount(businessForm), current));
		return "/business/zdyfdxhmc/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/zdyfdxhmc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Zdyfdxhmc zdyfdxhmc, String businessFormId) {
		zdyfdxhmc.setBusinessForm(new BusinessForm(businessFormId));
		zdyfdxhmcService.insert(zdyfdxhmc);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/zdyfdxhmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		zdyfdxhmcService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/tyqndj/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("zdyfdxhmc", zdyfdxhmcService.findOne(id));
		return "/business/zdyfdxhmc/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Zdyfdxhmc zdyfdxhmc, String businessFormId){
		zdyfdxhmcService.update(zdyfdxhmc, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/zdyfdxhmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("zdyfdxhmc:check")){
			return "/error/unauthority";
		}
		return "redirect:/zdyfdxhmc/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("zdyfdxhmc:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(zdyfdxhmcService.getZdyfdxhmcList(businessForm, current),
				zdyfdxhmcService.getZdyfdxhmcCount(businessForm), current));
		return "/business/zdyfdxhmc/check";
	}
	public ZdyfdxhmcService getZdyfdxhmcService() {
		return zdyfdxhmcService;
	}

	@Autowired
	public void setZdyfdxhmcService(ZdyfdxhmcService zdyfdxhmcService) {
		this.zdyfdxhmcService = zdyfdxhmcService;
	}
}
