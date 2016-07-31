/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.jcqk.rymd;

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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Tdmc;
import com.gouhai.baoshan.service.business.jcqk.rymd.TdmcService;

/**
 * 
 * 团队名册 controller entity:Tdmc.java
 * @author cgw
 * 
 */
@Controller
@RequestMapping(value = "/tdmc")
public class TdmcController extends BusinessFormController {

	private TdmcService tdmcService;
	
	public TdmcController() {
		super("tdmc");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "clny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/tdmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(tdmcService.getTdmcList(businessForm, current),
				tdmcService.getTdmcCount(businessForm), current));
		return "/business/tdmc/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/tdmc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Tdmc tdmc, String businessFormId) {
		updateBusinessForm(businessFormId);
		tdmc.setBusinessForm(new BusinessForm(businessFormId));
		tdmcService.insert(tdmc);
		return "redirect:/tdmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		tdmcService.delete(id, businessFormId);
		return "redirect:/tdmc/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("tdmc", tdmcService.findOne(id));
		return "/business/tdmc/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tdmc tdmc, String businessFormId){
		updateBusinessForm(businessFormId);
		tdmcService.update(tdmc, businessFormId);
		return "redirect:/tdmc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("tdmc:check")){
			return "/error/unauthority";
		}
		return "redirect:/tdmc/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("tdmc:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tdmcService.getTdmcList(businessForm, current),
				tdmcService.getTdmcCount(businessForm), current));
		return "/business/tdmc/check";
	}

	public TdmcService getTdmcService() {
		return tdmcService;
	}

	@Autowired
	public void setTdmcService(TdmcService tdmcService) {
		this.tdmcService = tdmcService;
	}


	
}
