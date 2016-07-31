/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.sygz;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Ggwgz;
import com.gouhai.baoshan.service.business.dqgz.sygz.GgwgzService;

/**
 * 
 * 关工委工作  页面控制层
 * @author sun 2014-08-15 
 * 
 */
@Controller
@RequestMapping(value = "/ggwgz")
public class GgwgzController extends BusinessFormController {
	@Autowired
	private GgwgzService ggwgzService;
	
	public GgwgzController() {
		super("ggwgz");
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/ggwgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("type", "ggwgz");
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(ggwgzService.getBeanList(businessForm, current),
				ggwgzService.getBeanCount(businessForm), current));
		return "/business/ggwgz/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/ggwgz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Ggwgz ggwgz, String businessFormId) {
		ggwgz.setBusinessForm(new BusinessForm(businessFormId));
		ggwgzService.insert(ggwgz);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/ggwgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		ggwgzService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/ggwgz/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("ggwgz", ggwgzService.findOne(id));
		return "/business/ggwgz/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Ggwgz ggwgz, String businessFormId){
		ggwgzService.update(ggwgz, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/ggwgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("ggwgz:check")){
			return "/error/unauthority";
		}
		return "redirect:/ggwgz/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("ggwgz:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "ggwgz");
		model.addAllAttributes(pageResult(ggwgzService.getBeanList(businessForm, current),
				ggwgzService.getBeanCount(businessForm), current));
		return "/business/ggwgz/check";
	}

}