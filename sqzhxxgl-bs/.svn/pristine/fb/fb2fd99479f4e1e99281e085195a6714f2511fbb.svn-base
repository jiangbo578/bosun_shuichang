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
import com.gouhai.baoshan.entity.business.dqgz.tz.Flowpeople;
import com.gouhai.baoshan.service.business.dqgz.tz.FlowPeopleService;

/**
 * 
 * 小区留学生名单 controller entity:AbroadStudent.java
 * @author sun
 * 
 */
@Controller
@RequestMapping(value = "/flowpeople")
public class FlowPeopleController extends BusinessFormController {

	private FlowPeopleService flowPeopleService;
	
	public FlowPeopleController() {
		super("flowPeople");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/flowpeople/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(flowPeopleService.getBeanList(businessForm, current),
				flowPeopleService.getBeanCount(businessForm), current));
		return "/business/flowpeople/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/flowpeople/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Flowpeople tflowpeople, String businessFormId) {
		updateBusinessForm(businessFormId);
		tflowpeople.setBusinessForm(new BusinessForm(businessFormId));
		flowPeopleService.insert(tflowpeople);
		return "redirect:/flowpeople/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		flowPeopleService.delete(id, businessFormId);
		return "redirect:/flowpeople/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("flowpeople", flowPeopleService.findOne(id));
		return "/business/flowpeople/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Flowpeople tflowpeople, String businessFormId){
		updateBusinessForm(businessFormId);
		flowPeopleService.update(tflowpeople, businessFormId);
		return "redirect:/flowpeople/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("flowpeople:check")){
			return "/error/unauthority";
		}
		return "redirect:/flowpeople/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("flowpeople:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(flowPeopleService.getBeanList(businessForm, current),
				flowPeopleService.getBeanCount(businessForm), current));
		return "/business/flowpeople/check";
	}

	public FlowPeopleService getFlowPeopleService()
	{
		return flowPeopleService;
	}
	@Autowired
	public void setFlowPeopleService(FlowPeopleService flowPeopleService)
	{
		this.flowPeopleService = flowPeopleService;
	}

	
}
