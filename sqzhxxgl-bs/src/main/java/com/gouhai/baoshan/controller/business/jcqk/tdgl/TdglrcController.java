package com.gouhai.baoshan.controller.business.jcqk.tdgl;

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

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.tdgl.Tdglrc;
import com.gouhai.baoshan.service.business.jcqk.tdgl.TdglrcService;

/**
 * 土地管理日常巡查记录 Controller Entity:Tdglrc
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/tdglrc")
public class TdglrcController extends BusinessFormController{

	@Autowired
	private TdglrcService tdglrcService;
	public TdglrcController()
	{
		super("tdglrc");
	}

	public void setTdglrcService(TdglrcService tdglrcService) {
		this.tdglrcService = tdglrcService;
	}

	// 初始化时间
	@InitBinder
	// Tdglrc
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "slsj", new CustomDateEditor(dateFormat, true));
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/tdglrc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(tdglrcService.getLzzList(current,
				businessForm), tdglrcService.getLzzCount(businessForm),
				current));
		return "/business/tdglrc/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/tdglrc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Tdglrc tdglrc, String businessFormId) {
		updateBusinessForm(businessFormId);
		tdglrc.setBusinessForm(new BusinessForm(businessFormId));
		tdglrcService.insert(tdglrc);
		return "redirect:/tdglrc/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		tdglrcService.delete(id);
		return "redirect:/tdglrc/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("tdglrc", tdglrcService.findOne(id));
		return "/business/tdglrc/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tdglrc tdglrc, String businessFormId) {
		updateBusinessForm(businessFormId);
		Tdglrc d = tdglrcService.findOne(tdglrc.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setCwh(tdglrc.getCwh());
			d.setFxrq(tdglrc.getFxrq());
			d.setJz(tdglrc.getJz());
			d.setKgrq(tdglrc.getKgrq());
			d.setSbrq(tdglrc.getSbrq());
			d.setTdzl(tdglrc.getTdzl());
			d.setWfdsr(tdglrc.getWfdsr());
			d.setWfydlx(tdglrc.getWfydlx());
			d.setXczrr(tdglrc.getXczrr());
			d.setXmmc(tdglrc.getXmmc());
			d.setZdmj(tdglrc.getZdmj());
			d.setZzyq(tdglrc.getZzyq());
			tdglrcService.update(d);
		}

		return "redirect:/tdglrc/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/tdglrc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tdglrcService.getLzzList(current,
				businessForm), tdglrcService.getLzzCount(businessForm),
				current));
		return "/business/tdglrc/check";
	}
}