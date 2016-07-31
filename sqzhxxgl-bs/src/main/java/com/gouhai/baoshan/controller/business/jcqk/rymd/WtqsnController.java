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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Wtqsn;
import com.gouhai.baoshan.service.business.jcqk.rymd.WtqsnService;

/**
 * 问题青少年 Controller Entity:Wtqsn
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/wtqsn")
public class WtqsnController extends BusinessFormController{

	@Autowired
	private WtqsnService wtqsnService;
	public WtqsnController()
	{
		super("wtqsn");
	}

	public void setWtqsnService(WtqsnService wtqsnService) {
		this.wtqsnService = wtqsnService;
	}

	// 初始化时间
	@InitBinder
	// Wtqsn
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wtqsn/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(wtqsnService.getLzzList(current,
				businessForm), wtqsnService.getLzzCount(businessForm),
				current));
		return "/business/wtqsn/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/wtqsn/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Wtqsn wtqsn, String businessFormId) {
		updateBusinessForm(businessFormId);
		wtqsn.setBusinessForm(new BusinessForm(businessFormId));
		wtqsnService.insert(wtqsn);
		return "redirect:/wtqsn/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		wtqsnService.delete(id);
		return "redirect:/wtqsn/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("wtqsn", wtqsnService.findOne(id));
		return "/business/wtqsn/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wtqsn wtqsn, String businessFormId) {
		updateBusinessForm(businessFormId);
		Wtqsn d = wtqsnService.findOne(wtqsn.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setAhj(wtqsn.getAhj());
			d.setAfhj(wtqsn.getAfhj());
			d.setAbz(wtqsn.getAbz());
			d.setBhj(wtqsn.getBhj());
			d.setBfhj(wtqsn.getBfhj());
			d.setBbz(wtqsn.getBbz());
			d.setChj(wtqsn.getChj());
			d.setCfhj(wtqsn.getCfhj());
			d.setCbz(wtqsn.getCbz());
			d.setDhj(wtqsn.getDhj());
			d.setDfhj(wtqsn.getDfhj());
			d.setDbz(wtqsn.getDbz());
			d.setEhj(wtqsn.getEhj());
			d.setEfhj(wtqsn.getEfhj());
			d.setEbz(wtqsn.getEbz());
			d.setUpdateDate(new Date());
			wtqsnService.update(d);
		}

		return "redirect:/wtqsn/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/wtqsn/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(wtqsnService.getLzzList(current,
				businessForm), wtqsnService.getLzzCount(businessForm),
				current));
		return "/business/wtqsn/check";
	}
}