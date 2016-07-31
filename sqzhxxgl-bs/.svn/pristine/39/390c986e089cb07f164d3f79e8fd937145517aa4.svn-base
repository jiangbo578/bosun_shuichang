/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.fd;

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
import com.gouhai.baoshan.entity.business.dqgz.fd.Fudaiwy;
import com.gouhai.baoshan.service.business.dqgz.fd.FuDaiWYService;

/**
 * 
 * 妇代会委员名单
 * @author sun 2014-08-04 
 * 
 */
@Controller
@RequestMapping(value = "/fudaiwy")
public class FuDaiWYController extends BusinessFormController {

	private FuDaiWYService fuDaiWYService;
	
	public FuDaiWYController() {
		super("fudaiwy");
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "rzsj", new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/fudaiwy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(fuDaiWYService.getBeanList(businessForm, current),
				fuDaiWYService.getBeanCount(businessForm), current));
		return "/business/fudaiwy/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/fudaiwy/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Fudaiwy fudaiwy, String businessFormId) {
		updateBusinessForm(businessFormId);
		fudaiwy.setBusinessForm(new BusinessForm(businessFormId));
		fuDaiWYService.insert(fudaiwy);
		return "redirect:/fudaiwy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		fuDaiWYService.delete(id, businessFormId);
		return "redirect:/fudaiwy/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("fudaiwy", fuDaiWYService.findOne(id));
		return "/business/fudaiwy/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Fudaiwy fudaiwy, String businessFormId){
		updateBusinessForm(businessFormId);
		fuDaiWYService.update(fudaiwy, businessFormId);
		return "redirect:/fudaiwy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("fudaiwy:check")){
			return "/error/unauthority";
		}
		return "redirect:/fudaiwy/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("fudaiwy:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(fuDaiWYService.getBeanList(businessForm, current),
				fuDaiWYService.getBeanCount(businessForm), current));
		return "/business/fudaiwy/check";
	}

	public FuDaiWYService getFuDaiWYService()
	{
		return fuDaiWYService;
	}
	@Autowired
	public void setFuDaiWYService(FuDaiWYService fuDaiWYService)
	{
		this.fuDaiWYService = fuDaiWYService;
	}
	

	
}
