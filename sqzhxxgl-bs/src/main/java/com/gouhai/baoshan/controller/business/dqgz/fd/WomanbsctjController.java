/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.fd;


import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanbsctj;
import com.gouhai.baoshan.service.business.dqgz.fd.WomanbsctjService;

/**
 * 
 * 为退休和生活困难妇女安排妇科病、乳腺病筛查工作统计表
 * @author sun 2014-08-18
 * 
 */
@Controller
@RequestMapping(value = "/womanbsctj")
public class WomanbsctjController extends BusinessFormController {
	@Autowired
	private WomanbsctjService  womanbsctjService;
	public WomanbsctjController() {
		super("womanbsctj");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/womanbsctj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(womanbsctjService.getBeanList(businessForm, current),
				womanbsctjService.getBeanCount(businessForm), current));
		return "/business/womanbsctj/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/womanbsctj/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Womanbsctj womanbsctj, String businessFormId) {
		womanbsctj.setBusinessForm(new BusinessForm(businessFormId));
		womanbsctjService.insert(womanbsctj);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/womanbsctj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		womanbsctjService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/womanbsctj/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("womanbsctj", womanbsctjService.findOne(id));
		return "/business/womanbsctj/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Womanbsctj womanbsctj, String businessFormId){
		womanbsctjService.update(womanbsctj, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		
		return "redirect:/womanbsctj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("womanbsctj:check")){
			return "/error/unauthority";
		}
		return "redirect:/womanbsctj/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("womanbsctj:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(womanbsctjService.getBeanList(businessForm, current),
				womanbsctjService.getBeanCount(businessForm), current));
		return "/business/womanbsctj/check";
	}
}
