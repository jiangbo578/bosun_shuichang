package com.gouhai.baoshan.controller.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.service.business.BusinessService;
import com.gouhai.baoshan.spring.PageableController;

@Controller
public class BusinessjsController extends PageableController {
	@Autowired
	private BusinessService businessService;

	@RequestMapping(value = "/bslist", method = RequestMethod.GET)
	public String toBsIndex() {

		return "redirect:/bslisti/1";
	}

	@RequestMapping(value = "/bslisti/{current}", method = RequestMethod.GET)
	public String indexBs(Model model, @PathVariable() int current, String code) {
		model.addAllAttributes(pageResult(
				businessService.getBusinessList(current, code),
				businessService.getBusinessCount(code), current));
		return "/publics/bsindex";
	}
}
