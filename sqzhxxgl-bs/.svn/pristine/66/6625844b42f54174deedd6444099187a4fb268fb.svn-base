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
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanbscdj;
import com.gouhai.baoshan.service.business.dqgz.fd.WomanbscdjService;

/**
 * 
 * 退休妇女和生活困难妇女参加妇科病及乳腺病筛查登记
 * @author sun 2014-08-18
 * 
 */
@Controller
@RequestMapping(value = "/womanbscdj")
public class WomanbscdjController extends BusinessFormController {
	@Autowired
	private WomanbscdjService  womanbscdjService;
	public WomanbscdjController() {
		super("womanbscdj");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/womanbscdj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(womanbscdjService.getBeanList(businessForm, current),
				womanbscdjService.getBeanCount(businessForm), current));
		return "/business/womanbscdj/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/womanbscdj/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Womanbscdj womanbscdj, String businessFormId) {
		womanbscdj.setBusinessForm(new BusinessForm(businessFormId));
		womanbscdjService.insert(womanbscdj);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/womanbscdj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		womanbscdjService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/womanbscdj/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("womanbscdj", womanbscdjService.findOne(id));
		return "/business/womanbscdj/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Womanbscdj womanbscdj, String businessFormId){
		womanbscdjService.update(womanbscdj, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		
		return "redirect:/womanbscdj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("womanbscdj:check")){
			return "/error/unauthority";
		}
		return "redirect:/womanbscdj/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("womanbscdj:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(womanbscdjService.getBeanList(businessForm, current),
				womanbscdjService.getBeanCount(businessForm), current));
		return "/business/womanbscdj/check";
	}
}
