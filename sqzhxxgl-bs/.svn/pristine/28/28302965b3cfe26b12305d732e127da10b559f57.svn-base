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
import com.gouhai.baoshan.entity.business.dqgz.tz.Qjrs;
import com.gouhai.baoshan.service.business.dqgz.tz.QjrsService;

/**
 * 
 * 侨眷人士名单 controller entity:Qjrs.java
 * @author Rui
 * 
 */
@Controller
@RequestMapping(value = "/qjrs")
public class QjrsController extends BusinessFormController {

	private QjrsService qjrsService;
	
	public QjrsController() {
		super("qjrs");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/qjrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(qjrsService.getBeanList(businessForm, current),
				qjrsService.getBeanCount(businessForm), current));
		return "/business/qjrs/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/qjrs/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Qjrs tqjrs, String businessFormId) {
		updateBusinessForm(businessFormId);
		tqjrs.setBusinessForm(new BusinessForm(businessFormId));
		qjrsService.insert(tqjrs);
		return "redirect:/qjrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		qjrsService.delete(id, businessFormId);
		return "redirect:/qjrs/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("qjrs", qjrsService.findOne(id));
		return "/business/qjrs/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Qjrs tqjrs, String businessFormId){
		updateBusinessForm(businessFormId);
		qjrsService.update(tqjrs, businessFormId);
		return "redirect:/qjrs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("qjrs:check")){
			return "/error/unauthority";
		}
		return "redirect:/qjrs/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("qjrs:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(qjrsService.getBeanList(businessForm, current),
				qjrsService.getBeanCount(businessForm), current));
		return "/business/qjrs/check";
	}

	public QjrsService getQjrsService()
	{
		return qjrsService;
	}
	@Autowired
	public void setQjrsService(QjrsService qjrsService)
	{
		this.qjrsService = qjrsService;
	}

	


	
}
