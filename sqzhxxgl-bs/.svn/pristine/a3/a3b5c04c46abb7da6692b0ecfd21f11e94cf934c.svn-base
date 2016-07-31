package com.gouhai.baoshan.controller.business.dqgz.zb;

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
import com.gouhai.baoshan.entity.business.dqgz.zb.Dyzzgxzc;
import com.gouhai.baoshan.service.business.dqgz.zb.DyzzgxzcService;

/**
 * 党员组织关系转出 Controller Entity:Dyzzgxzc
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/dyzzgxzc")
public class DyzzgxzcController extends BusinessFormController {
	@Autowired
	private DyzzgxzcService dyzzgxzcService;

	public DyzzgxzcController() {
		super("dyzzgxzc");
	}

	// 初始化时间
	@InitBinder
	// zrsj
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "zcrq", new CustomDateEditor(
				dateFormat, true));

	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/dyzzgxzc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(dyzzgxzcService.getLzzList(current,
				businessForm), dyzzgxzcService.getLzzCount(businessForm),
				current));
		return "/business/dyzzgxzc/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/dyzzgxzc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Dyzzgxzc Dyzzgxzc, String businessFormId) {
		Dyzzgxzc.setBusinessForm(new BusinessForm(businessFormId));
		dyzzgxzcService.insert(Dyzzgxzc);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/dyzzgxzc/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		dyzzgxzcService.delete(id);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/dyzzgxzc/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("dyzzgxzc", dyzzgxzcService.findOne(id));
		return "/business/dyzzgxzc/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Dyzzgxzc Dyzzgxzc, String businessFormId) {
		Dyzzgxzc d = dyzzgxzcService.findOne(Dyzzgxzc.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setName(Dyzzgxzc.getName());
			d.setSex(Dyzzgxzc.getSex());
			d.setZcrq(Dyzzgxzc.getZcrq());
			d.setDwzc(Dyzzgxzc.getDwzc());
			d.setSfzsdy(Dyzzgxzc.getSfzsdy());
			d.setPhone(Dyzzgxzc.getPhone());
			d.setRemark(Dyzzgxzc.getRemark());
			d.setUpdateDate(new Date());
			dyzzgxzcService.update(d);
			updateBusinessForm(businessFormId);//更新业务表
		}

		return "redirect:/dyzzgxzc/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/dyzzgxzc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(dyzzgxzcService.getLzzList(current,
				businessForm), dyzzgxzcService.getLzzCount(businessForm),
				current));
		return "/business/dyzzgxzc/check";
	}

}
