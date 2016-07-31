/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.tz;

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
import com.gouhai.baoshan.entity.business.dqgz.tz.Tqjrs;
import com.gouhai.baoshan.service.business.dqgz.tz.TqjrsService;

/**
 * 
 * 台侨界人士名单 controller entity:Tqjrs.java
 * @author Rui
 * 
 */
@Controller
@RequestMapping(value = "/tqjrs")
public class TqjrsController extends BusinessFormController {

	private TqjrsService tqjrsService;
	
	public TqjrsController() {
		super("tqjrs");
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
		return "redirect:/tqjrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tqjrsService.getTqjrsList(businessForm, current),
				tqjrsService.getTqjrsCount(businessForm), current));
		return "/business/tqjrs/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/tqjrs/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Tqjrs tqjrs, String businessFormId) {
		updateBusinessForm(businessFormId);
		tqjrs.setBusinessForm(new BusinessForm(businessFormId));
		tqjrsService.insert(tqjrs);
		return "redirect:/tqjrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		tqjrsService.delete(id, businessFormId);
		return "redirect:/tqjrs/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("tqjrs", tqjrsService.findOne(id));
		return "/business/tqjrs/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tqjrs tqjrs, String businessFormId){
		updateBusinessForm(businessFormId);
		tqjrsService.update(tqjrs, businessFormId);
		return "redirect:/tqjrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("tqjrs:check")){
			return "/error/unauthority";
		}
		return "redirect:/tqjrs/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("tqjrs:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tqjrsService.getTqjrsList(businessForm, current),
				tqjrsService.getTqjrsCount(businessForm), current));
		return "/business/tqjrs/check";
	}

	public TqjrsService getTqjrsService() {
		return tqjrsService;
	}

	@Autowired
	public void setTqjrsService(TqjrsService tqjrsService) {
		this.tqjrsService = tqjrsService;
	}


	
}
