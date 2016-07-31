package com.gouhai.baoshan.controller.business.jcqk.gk;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Pmt;
import com.gouhai.baoshan.service.business.jcqk.gk.PmtService;

/**
 * 平面图 Controller Entity:Pmt
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/pmt")
public class PmtController extends BusinessFormController {
	@Autowired
	private PmtService pmtService;

	public PmtController() {
		super("pmt");
	}

	public void setPmtService(PmtService pmtService) {
		this.pmtService = pmtService;
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/pmt/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				pmtService.getLzzList(current, businessForm),
				pmtService.getLzzCount(businessForm), current));
		return "/business/pmt/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/pmt/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public @ResponseBody
	Pmt add(@RequestBody Pmt pmt, HttpSession session) {
		String jlr = (String) session.getAttribute("userRealName");
		String businessFormId = pmt.getJlr();
		// updateBusinessForm(businessFormId);
		pmt.setBusinessForm(new BusinessForm(businessFormId));
		pmt.setJlr(jlr);
		pmtService.insert(pmt);

		return pmt;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		// updateBusinessForm(businessFormId);
		pmtService.delete(id);
		return "redirect:/pmt/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("pmt", pmtService.findOne(id));
		return "/business/pmt/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public @ResponseBody
	Pmt update(@RequestBody Pmt pmt) {
		String pid = pmt.getMc();
		String businessFormId = pmt.getJlr();
		Pmt d = pmtService.findOne(pid);
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setUpdateDate(new Date());

			d.setBz(pmt.getBz());
			// d.setUrl(pmt.getUrl());
			// d.setJlr(pmt.getJlr());
			// d.setMc(pmt.getMc());
			pmtService.update(d);
		}

		return pmt;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/pmt/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				pmtService.getLzzList(current, businessForm),
				pmtService.getLzzCount(businessForm), current));
		return "/business/pmt/check";
	}

	@RequestMapping(value = "/item/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("hyjl:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("pmt", pmtService.findOne(id));
		return "/business/pmt/item/detail";
	}
	
}
