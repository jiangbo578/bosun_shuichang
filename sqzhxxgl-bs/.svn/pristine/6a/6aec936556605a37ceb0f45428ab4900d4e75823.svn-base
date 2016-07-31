/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.sygz;


import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Xyjrjsdj;
import com.gouhai.baoshan.service.business.dqgz.sygz.XyjrjsdjService;

/**
 * 
 * 为退休和生活困难妇女安排妇科病、乳腺病筛查工作统计表
 * @author sun 2014-08-18
 * 
 */
@Controller
@RequestMapping(value = "/xyjrjsdj")
public class XyjrjsdjController extends BusinessFormController {
	@Autowired
	private XyjrjsdjService  xyjrjsdjService;
	public XyjrjsdjController() {
		super("xyjrjsdj");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/xyjrjsdj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(xyjrjsdjService.getBeanList(businessForm, current),
				xyjrjsdjService.getBeanCount(businessForm), current));
		return "/business/xyjrjsdj/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/xyjrjsdj/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Xyjrjsdj xyjrjsdj, String businessFormId) {
		xyjrjsdj.setBusinessForm(new BusinessForm(businessFormId));
		xyjrjsdjService.insert(xyjrjsdj);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/xyjrjsdj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		xyjrjsdjService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/xyjrjsdj/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("xyjrjsdj", xyjrjsdjService.findOne(id));
		return "/business/xyjrjsdj/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Xyjrjsdj xyjrjsdj, String businessFormId){
		xyjrjsdjService.update(xyjrjsdj, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		
		return "redirect:/xyjrjsdj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("xyjrjsdj:check")){
			return "/error/unauthority";
		}
		return "redirect:/xyjrjsdj/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("xyjrjsdj:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(xyjrjsdjService.getBeanList(businessForm, current),
				xyjrjsdjService.getBeanCount(businessForm), current));
		return "/business/xyjrjsdj/check";
	}
}
