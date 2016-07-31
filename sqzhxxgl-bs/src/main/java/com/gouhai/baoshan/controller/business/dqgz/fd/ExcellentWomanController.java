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
import com.gouhai.baoshan.entity.business.dqgz.fd.Excellentwoman;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteerteam;
import com.gouhai.baoshan.service.business.dqgz.fd.ExcellentWomanService;

/**
 * 
 * 社区优秀女性名册
 * @author sun 2014-08-06
 * 
 */
@Controller
@RequestMapping(value = "/excellentwoman")
public class ExcellentWomanController extends BusinessFormController {
	@Autowired
	private ExcellentWomanService  excellentWomanService;
	public ExcellentWomanController() {
		super("excellentwoman");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/excellentwoman/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);

		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(excellentWomanService.getBeanList(businessForm, current),
				excellentWomanService.getBeanCount(businessForm), current));
		return "/business/excellentwoman/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/excellentwoman/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Excellentwoman excellentwoman, String businessFormId) {
		excellentwoman.setBusinessForm(new BusinessForm(businessFormId));
		excellentWomanService.insert(excellentwoman);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/excellentwoman/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		excellentWomanService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/excellentwoman/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("excellentwoman", excellentWomanService.findOne(id));
		return "/business/excellentwoman/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Excellentwoman excellentwoman, String businessFormId){
		excellentWomanService.update(excellentwoman, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/excellentwoman/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("excellentwoman:check")){
			return "/error/unauthority";
		}
		return "redirect:/excellentwoman/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("excellentwoman:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(excellentWomanService.getBeanList(businessForm, current),
				excellentWomanService.getBeanCount(businessForm), current));
		return "/business/excellentwoman/check";
	}
}
