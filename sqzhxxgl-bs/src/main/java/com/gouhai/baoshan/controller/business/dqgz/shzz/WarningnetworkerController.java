/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.shzz;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.shzz.MessageRecord;
import com.gouhai.baoshan.entity.business.dqgz.shzz.Warningnetworker;
import com.gouhai.baoshan.service.business.dqgz.shzz.MessageRecordService;
import com.gouhai.baoshan.service.business.dqgz.shzz.WarningnetworkerService;

/**
 * 
 * 嘉定区社会组织预警网络信息员登记表Warningnetworker.java
 * 
 * @author sun 2014-08-07
 * 
 */
@Controller
@RequestMapping(value = "/warningnetworker")
public class WarningnetworkerController extends BusinessFormController {
	@Autowired
	private WarningnetworkerService warningnetworkerService;
	@Autowired
	private MessageRecordService messageRecordService;

	public WarningnetworkerController() {
		super("warningnetworker");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/warningnetworker/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);

		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(warningnetworkerService.getBeanList(
				businessForm, current), warningnetworkerService
				.getBeanCount(businessForm), current));
		return "/business/warningnetworker/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/warningnetworker/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Warningnetworker warningnetworker, String businessFormId) {
		warningnetworker.setBusinessForm(new BusinessForm(businessFormId));
		warningnetworkerService.insert(warningnetworker);
		updateBusinessForm(businessFormId);// 更新业务
		return "redirect:/warningnetworker/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		warningnetworkerService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);// 更新业务
		return "redirect:/tyqndj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("warningnetworker", warningnetworkerService
				.findOne(id));
		return "/business/warningnetworker/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Warningnetworker warningnetworker,
			String businessFormId) {
		warningnetworkerService.update(warningnetworker, businessFormId);
		updateBusinessForm(businessFormId);// 更新业务
		return "redirect:/warningnetworker/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		if (!SecurityUtils.getSubject().isPermitted("warningnetworker:check")) {
			return "/error/unauthority";
		}
		return "redirect:/warningnetworker/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		if (!SecurityUtils.getSubject().isPermitted("warningnetworker:check")) {
			return "/error/unauthority";
		}
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(warningnetworkerService.getBeanList(
				businessForm, current), warningnetworkerService
				.getBeanCount(businessForm), current));
		return "/business/warningnetworker/check";
	}

	/**
	 * 报送记录
	 */

	@RequestMapping(value = "/{networkerId}/messageRecord/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() String networkerId,
			@PathVariable() int current) {
		model.addAllAttributes(pageResult(messageRecordService.getBeanList(
				networkerId, current), messageRecordService
				.getBeanCount(networkerId), current));
		model.addAttribute("networkerId", networkerId);
		return "/business/warningnetworker/item/record/index";
	}

	@RequestMapping(value = "/messageRecord/add1/{networkerId}", method = RequestMethod.GET)
	public String add1(Model model, @PathVariable() String networkerId) {
		model.addAttribute("networkerId", networkerId);
		return "/business/warningnetworker/item/record/add";
	}

	@RequestMapping(value = "/{networkerId}/messageRecord/add/1", method = RequestMethod.POST)
	public String add2(Model model, MessageRecord messageRecord,
			@PathVariable() String networkerId) {

		Warningnetworker work = warningnetworkerService.findOne(networkerId);
		messageRecord.setNetworker(work);
		messageRecordService.insert(messageRecord);
		// model.addAttribute("networkerId", networkerId);
		return "redirect:/warningnetworker/" + networkerId + "/messageRecord/1";
	}

	@RequestMapping(value = "/{networkerId}/messageRecord/update/{messageRecordId}/", method = RequestMethod.GET)
	public String findRecord(Model model, @PathVariable() String networkerId,
			@PathVariable() String messageRecordId) {
		// model.addAttribute("networkerId", networkerId);

		MessageRecord record = messageRecordService.findOne(messageRecordId);

		model.addAttribute("messageRecord", record);

		return "/business/warningnetworker/item/record/update";
	}

	@RequestMapping(value = "/{networkerId}/messageRecord/update/", method = RequestMethod.POST)
	public String updateRecord(Model model, @PathVariable() String networkerId,
			MessageRecord messageRecord) {
		// model.addAttribute("networkerId", networkerId);
		messageRecordService.update(messageRecord);
		return "redirect:/warningnetworker/" + networkerId + "/messageRecord/1";
	}

	@RequestMapping(value = "/{networkerId}/delete/{messageRecordId}/", method = RequestMethod.GET)
	public String deleteRecord(@PathVariable String networkerId,
			@PathVariable() String messageRecordId) {
		messageRecordService.delete(messageRecordId);
		return "redirect:/warningnetworker/" + networkerId + "/messageRecord/1";
	}

}
