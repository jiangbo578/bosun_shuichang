/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessRemind;
import com.gouhai.baoshan.service.business.BusinessRemindService;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 业务提醒
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/business/remind")
public class BusinessRemindController extends PageableController {

	@Autowired
	private BusinessRemindService businessRemindService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("MM月dd日");
		timeFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(timeFormat, true));
	}

	@RequestMapping(value = "/{businessId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessId) {
		return "redirect:/business/remind/1/" + businessId;
	}

	@RequestMapping(value = "/{current}/{businessId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessId) {
		Business business = new Business(businessId);
		model.addAllAttributes(pageResult(businessRemindService.getBusinessRemindList(business, current),
				businessRemindService.getBusinessRemindCount(business), current));
		return "/business/remind/index";
	}

	@RequestMapping(value = "/add/{businessId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessId) {
		return "/business/remind/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Date[] remindDate, Date[] greenStart, Date[] yellowStart, Date[] redStart, String businessId) {
		for (int i = 0, len = remindDate.length; i < len; i++) {
			Date remind = remindDate[i];
			
			if (remind == null) {
				continue;
			}
			BusinessRemind businessRemind = new BusinessRemind();
			businessRemind.setRemindDate(remind);
			if (greenStart[i] != null) {
				businessRemind.setGreenStart(greenStart[i]);
			}

			if (yellowStart[i] != null) {
				businessRemind.setYellowStart(yellowStart[i]);
			}
			if (redStart[i] != null) {
				businessRemind.setRedStart(redStart[i]);
			}
			businessRemind.setBusiness(new Business(businessId));
			businessRemindService.insert(businessRemind);
		}
		return "redirect:/business/remind/1/" + businessId;
	}
	
	@RequestMapping(value = "/delete/{id}/{businessId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessId){
		businessRemindService.delete(id, businessId);
		return "redirect:/business/remind/1/" + businessId;
	}

}
