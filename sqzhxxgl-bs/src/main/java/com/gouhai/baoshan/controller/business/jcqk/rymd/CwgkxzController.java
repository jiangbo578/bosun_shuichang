package com.gouhai.baoshan.controller.business.jcqk.rymd;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Cwgkxz;
import com.gouhai.baoshan.service.business.jcqk.rymd.CwgkxzService;

/**
 * 村务公开小组Controller Entity:Cwgkxz
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/cwgkxz")
public class CwgkxzController extends BusinessFormController{

	@Autowired
	private CwgkxzService cwgkxzService;
	public CwgkxzController()
	{
		super("cwgkxz");
	}

	public void setCwgkxzService(CwgkxzService cwgkxzService) {
		this.cwgkxzService = cwgkxzService;
	}

	// 初始化时间
	@InitBinder
	// Cwgkxz
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cwgkxz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(cwgkxzService.getLzzList(current,
				businessForm), cwgkxzService.getLzzCount(businessForm),
				current));
		return "/business/cwgkxz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/cwgkxz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Cwgkxz cwgkxz, String businessFormId) {
		updateBusinessForm(businessFormId);
		cwgkxz.setBusinessForm(new BusinessForm(businessFormId));
		cwgkxzService.insert(cwgkxz);
		return "redirect:/cwgkxz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		cwgkxzService.delete(id);
		return "redirect:/cwgkxz/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("cwgkxz", cwgkxzService.findOne(id));
		return "/business/cwgkxz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cwgkxz cwgkxz, String businessFormId) {
		updateBusinessForm(businessFormId);
		Cwgkxz d = cwgkxzService.findOne(cwgkxz.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setUpdateDate(new Date());
			d.setLxdh(cwgkxz.getLxdh());
			d.setNl(cwgkxz.getNl());
			d.setWhcd(cwgkxz.getWhcd());
			d.setXb(cwgkxz.getXb());
			d.setXm(cwgkxz.getXm());
			d.setXrzw(cwgkxz.getXrzw());
			d.setZw(cwgkxz.getZw());
			d.setZzmm(cwgkxz.getZzmm());
			cwgkxzService.update(d);
		}

		return "redirect:/cwgkxz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/cwgkxz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cwgkxzService.getLzzList(current,
				businessForm), cwgkxzService.getLzzCount(businessForm),
				current));
		return "/business/cwgkxz/check";
	}
}