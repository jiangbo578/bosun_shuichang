/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.zb;

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
import com.gouhai.baoshan.entity.business.dqgz.zb.Dfszsyqk;
import com.gouhai.baoshan.service.business.dqgz.zb.DfszsyqkService;

/**
 * 
 * 党费收支，使用情况 controller entity:Dfszsyqk.java
 * @author Rui
 * 
 */
@Controller
@RequestMapping(value = "/dfszsyqk")
public class DfszsyqkController extends BusinessFormController {

	private DfszsyqkService dfszsyqkService;
	
	public DfszsyqkController() {
		super("Dfszsyqk");
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
		return "redirect:/dfszsyqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);

		model.addAllAttributes(pageResult(dfszsyqkService.getDfszsyqkList(businessForm, current),
				dfszsyqkService.getDfszsyqkCount(businessForm), current));
		return "/business/dfszsyqk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/dfszsyqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Dfszsyqk dfszsyqk, String businessFormId) {
		dfszsyqk.setBusinessForm(new BusinessForm(businessFormId));
		dfszsyqkService.insert(dfszsyqk);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/dfszsyqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		dfszsyqkService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/dfszsyqk/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("dfszsyqk", dfszsyqkService.findOne(id));
		return "/business/dfszsyqk/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Dfszsyqk dfszsyqk, String businessFormId){
		dfszsyqkService.update(dfszsyqk, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/dfszsyqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("dfszsyqk:check")){
			return "/error/unauthority";
		}
		return "redirect:/dfszsyqk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("dfszsyqk:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(dfszsyqkService.getDfszsyqkList(businessForm, current),
				dfszsyqkService.getDfszsyqkCount(businessForm), current));
		return "/business/dfszsyqk/check";
	}

	public DfszsyqkService getDfszsyqkService() {
		return dfszsyqkService;
	}

	@Autowired
	public void setDfszsyqkService(DfszsyqkService dfszsyqkService) {
		this.dfszsyqkService = dfszsyqkService;
	}

	
}
