package com.gouhai.baoshan.controller.business.jcqk.gk;

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
import com.gouhai.baoshan.entity.business.jcqk.gk.Sqgzzmd;
import com.gouhai.baoshan.service.business.jcqk.gk.SqgzzmdService;

/**
 * 社区工作者名单 Controller Entity:sqgzzmd
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/sqgzzmd")
public class SqgzzmdController extends BusinessFormController {
	@Autowired
	private SqgzzmdService sqgzzmdService;
	public SqgzzmdController()
	{
		super("sqgzzmd");
	}

	public void setsqgzzmdService(SqgzzmdService sqgzzmdService) {
		this.sqgzzmdService = sqgzzmdService;
	}

	// 初始化时间
	@InitBinder
	// sqgzzmd
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sqgzzmd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(sqgzzmdService.getLzzList(current,
				businessForm), sqgzzmdService.getLzzCount(businessForm),
				current));
		return "/business/sqgzzmd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sqgzzmd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Sqgzzmd sqgzzmd, String businessFormId) {
		updateBusinessForm(businessFormId);
		sqgzzmd.setBusinessForm(new BusinessForm(businessFormId));
		sqgzzmdService.insert(sqgzzmd);
		return "redirect:/sqgzzmd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		sqgzzmdService.delete(id);
		return "redirect:/sqgzzmd/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("sqgzzmd", sqgzzmdService.findOne(id));
		return "/business/sqgzzmd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sqgzzmd sqgzzmd, String businessFormId) {
		updateBusinessForm(businessFormId);
		Sqgzzmd d = sqgzzmdService.findOne(sqgzzmd.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setCsny(sqgzzmd.getCsny());
			d.setDh(sqgzzmd.getDh());
			d.setId(sqgzzmd.getId());
			d.setWhcd(sqgzzmd.getWhcd());
			d.setXb(sqgzzmd.getXb());
			d.setXm(sqgzzmd.getXm());
			d.setZz(sqgzzmd.getZz());
			d.setZzmm(sqgzzmd.getZzmm());
			sqgzzmdService.update(d);
		}

		return "redirect:/sqgzzmd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/sqgzzmd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(sqgzzmdService.getLzzList(current,
				businessForm), sqgzzmdService.getLzzCount(businessForm),
				current));
		return "/business/sqgzzmd/check";
	}
}