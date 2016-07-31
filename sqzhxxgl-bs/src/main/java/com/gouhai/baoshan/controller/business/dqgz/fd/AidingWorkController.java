/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.fd;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingrecord;
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingwork;
import com.gouhai.baoshan.service.business.dqgz.fd.AidingRecordService;
import com.gouhai.baoshan.service.business.dqgz.fd.AidingWorkService;

/**
 * 
 * 妇女儿童帮困工作情况
 * @author sun 2014-08-07 
 * 
 */
@Controller
@RequestMapping(value = "/aidingwork")
public class AidingWorkController extends BusinessFormController {

	private AidingWorkService aidingWorkService;
	@Autowired
	private AidingRecordService aidingRecordService;
	
	public AidingWorkController() {
		super("aidingwork");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/aidingwork/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);

		model.addAllAttributes(pageResult(aidingWorkService.getBeanList(businessForm, current),
				aidingWorkService.getBeanCount(businessForm), current));
		return "/business/aidingwork/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/aidingwork/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Aidingwork aidingwork, String businessFormId) {
		aidingwork.setBusinessForm(new BusinessForm(businessFormId));
		aidingWorkService.insert(aidingwork);
		return "redirect:/aidingwork/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		aidingWorkService.delete(id, businessFormId);
		return "redirect:/aidingwork/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("aidingwork", aidingWorkService.findOne(id));
		return "/business/aidingwork/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Aidingwork aidingwork, String businessFormId){
		aidingWorkService.update(aidingwork, businessFormId);
		return "redirect:/aidingwork/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("aidingwork:check")){
			return "/error/unauthority";
		}
		return "redirect:/aidingwork/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("aidingwork:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(aidingWorkService.getBeanList(businessForm, current),
				aidingWorkService.getBeanCount(businessForm), current));
		return "/business/aidingwork/check";
	}
	
	@RequestMapping(value = "/{aidingworkId}/aidingrecord/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() String aidingworkId,@PathVariable() int current) {
		model.addAllAttributes(pageResult(aidingRecordService.getBeanList(aidingworkId, current),
				aidingRecordService.getBeanCount(aidingworkId), current));
		model.addAttribute("aidingworkId", aidingworkId);
		return "/business/aidingwork/item/record/index";
	}
	
	@RequestMapping(value = "/{aidingworkId}/aidingrecord/add", method = RequestMethod.GET)
	public String add1(Model model,@PathVariable() String aidingworkId) {
		model.addAttribute("aidingworkId", aidingworkId);
		return "/business/aidingwork/item/record/add";
	}
	

	@RequestMapping(value = "/{aidingworkId}/aidingrecord/add/1", method = RequestMethod.POST)
	public String add2(Model model,Aidingrecord aidingrecord,@PathVariable() String aidingworkId) {
		
		Aidingwork work = aidingWorkService.findOne(aidingworkId);
		aidingrecord.setAidingwork(work);
		aidingRecordService.insert(aidingrecord);
		model.addAttribute("aidingworkId", aidingworkId);
		return "redirect:/aidingwork/"+aidingworkId+"/aidingrecord/1";
	}
	
	@RequestMapping(value = "/{aidingworkId}/aidingrecord/update/{aidingrecordId}/", method = RequestMethod.GET)
	public String findRecord(Model model,@PathVariable() String aidingworkId,@PathVariable() String aidingrecordId) {
		model.addAttribute("aidingworkId", aidingworkId);
		
		Aidingrecord record = aidingRecordService.findOne(aidingrecordId);
		
		model.addAttribute("aidingrecord", record);
		
		return "/business/aidingwork/item/record/update";
	}
	@RequestMapping(value = "/{aidingworkId}/aidingrecord/update/", method = RequestMethod.POST)
	public String updateRecord(Model model,@PathVariable() String aidingworkId,Aidingrecord record) {
		model.addAttribute("aidingworkId", aidingworkId);
		aidingRecordService.update(record);
		return "redirect:/aidingwork/"+aidingworkId+"/aidingrecord/1";
	}
	@RequestMapping(value = "/{aidingworkId}/delete/{aidingrecordId}/", method = RequestMethod.GET)
	public String deleteRecord(@PathVariable String aidingworkId, @PathVariable() String aidingrecordId){
		aidingRecordService.delete(aidingrecordId);
		return "redirect:/aidingwork/"+aidingworkId+"/aidingrecord/1";
	}
	
	
	public AidingWorkService getAidingWorkService()
	{
		return aidingWorkService;
	}
	@Resource(name="aidingWorkService")
	public void setAidingWorkService(AidingWorkService aidingWorkService)
	{
		this.aidingWorkService = aidingWorkService;
	}
	
}
