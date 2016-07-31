/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.log;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gouhai.baoshan.service.log.UserLoginLogService;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun
 * 
 */
@Controller
@RequestMapping(value = "/log")
public class UserLoginLogController extends PageableController {
	//
	// private final Logger log = Logger.getLogger(PersonUpdateController.class
	// .getName());

	@Autowired
	private UserLoginLogService userLoginLogService;
	private final static String modelName = "log";

	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":list")) {
			return "/error/unauthority";
		}
		return "redirect:/log/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, String name) {
		if (!SecurityUtils.getSubject().isPermitted(modelName + ":list")) {
			return "/error/unauthority";
		}
		model.addAllAttributes(pageResult(
				userLoginLogService.getBeanList(current, name),
				userLoginLogService.getBeanCount(name), current));
		model.addAttribute("name", name);
		return "/user/log/index";
	}

}
