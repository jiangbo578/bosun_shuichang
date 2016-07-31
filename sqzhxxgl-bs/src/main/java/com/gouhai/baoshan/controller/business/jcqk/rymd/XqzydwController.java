package com.gouhai.baoshan.controller.business.jcqk.rymd;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Xqzydw;
import com.gouhai.baoshan.service.business.jcqk.rymd.XqzydwService;

/**
 * 辖区主要单位 Controller Entity:Xqzydw
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/xqzydw")
public class XqzydwController extends BusinessFormController{

	@Autowired
	private XqzydwService xqzydwService;
	public XqzydwController()
	{
		super("xqzydw");
	}

	public void setXqzydwService(XqzydwService xqzydwService) {
		this.xqzydwService = xqzydwService;
	}

	// 初始化时间
	@InitBinder
	// Xqzydw
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/xqzydw/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(xqzydwService.getLzzList(current,
				businessForm), xqzydwService.getLzzCount(businessForm),
				current));
		return "/business/xqzydw/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/xqzydw/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Xqzydw xqzydw, String businessFormId) {
		updateBusinessForm(businessFormId);
		xqzydw.setBusinessForm(new BusinessForm(businessFormId));
		xqzydwService.insert(xqzydw);
		return "redirect:/xqzydw/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		xqzydwService.delete(id);
		return "redirect:/xqzydw/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("xqzydw", xqzydwService.findOne(id));
		return "/business/xqzydw/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Xqzydw xqzydw, String businessFormId) {
		Xqzydw d = xqzydwService.findOne(xqzydw.getId());
		updateBusinessForm(businessFormId);
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setDh(xqzydw.getDh());
			d.setDwmc(xqzydw.getDwmc());
			d.setDz(xqzydw.getDz());
			d.setLxr(xqzydw.getLxr());
			d.setSfgj(xqzydw.getSfgj());
			xqzydwService.update(d);
		}

		return "redirect:/xqzydw/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/xqzydw/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(xqzydwService.getLzzList(current,
				businessForm), xqzydwService.getLzzCount(businessForm),
				current));
		return "/business/xqzydw/check";
	}
}