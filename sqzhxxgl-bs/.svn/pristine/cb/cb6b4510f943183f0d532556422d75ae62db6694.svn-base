/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.tw;

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
import com.gouhai.baoshan.entity.business.dqgz.tw.tzbgk;
import com.gouhai.baoshan.service.business.dqgz.tw.TzbgkService;

/**
 * 
 * 小区团支部概况及班子成员名单 controller entity:tzbgk.java
 * @author cgw
 * 
 */
@Controller
@RequestMapping(value = "/tzbgk1")
public class TzbgkController extends BusinessFormController {

	private TzbgkService tzbgkService;
	
	public TzbgkController() {
		super("tzbgk1");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "rdny", new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/tzbgk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = new BusinessForm(businessFormId);
		model.addAllAttributes(pageResult(tzbgkService.getTqjrsList(businessForm, current),
				tzbgkService.getTqjrsCount(businessForm), current));
		return "/business/tzbgk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/tzbgk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(tzbgk tzbgk, String businessFormId) {
		tzbgk.setBusinessForm(new BusinessForm(businessFormId));
		tzbgkService.insert(tzbgk);
		return "redirect:/tzbgk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		tzbgkService.delete(id, businessFormId);
		return "redirect:/tzbgk/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("tzbgk", tzbgkService.findOne(id));
		return "/business/tzbgk/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(tzbgk tzbgk, String businessFormId){
		tzbgkService.update(tzbgk, businessFormId);
		return "redirect:/tzbgk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("tzbgk:check")){
			return "/error/unauthority";
		}
		return "redirect:/tzbgk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("tzbgk:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tzbgkService.getTqjrsList(businessForm, current),
				tzbgkService.getTqjrsCount(businessForm), current));
		return "/business/tzbgk/check";
	}

	public TzbgkService getTqjrsService() {
		return tzbgkService;
	}

	@Autowired
	public void setTqjrsService(TzbgkService tzbgkService) {
		this.tzbgkService = tzbgkService;
	}


	
}
