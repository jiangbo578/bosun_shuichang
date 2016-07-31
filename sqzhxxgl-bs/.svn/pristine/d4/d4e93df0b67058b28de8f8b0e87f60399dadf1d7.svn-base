/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.log;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.service.log.LoggerService;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/person/update")
public class LoggerController extends PageableController {
	//
	// private final Logger log = Logger.getLogger(PersonUpdateController.class
	// .getName());

	@Autowired
	private LoggerService loggerService;

	@RequestMapping(value = "/view/add")
	public String viewAdd(Model model) {

		return "/person//add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		loggerService.mergeUser();
		return "/add";
	}

}
