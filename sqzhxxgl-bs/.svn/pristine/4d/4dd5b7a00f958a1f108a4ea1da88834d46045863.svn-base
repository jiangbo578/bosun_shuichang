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
import com.gouhai.baoshan.entity.business.dqgz.zb.Dyzzgxzr;
import com.gouhai.baoshan.service.business.dqgz.zb.DyzzgxzrService;

/**
 * 党员组织关系转入 Controller Entity:Dyzzgxzr
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/dyzzgxzr")
public class DyzzgxzrController extends BusinessFormController {
	@Autowired
	private DyzzgxzrService dyzzgxzrService;

	public DyzzgxzrController() {
		super("dyzzgxzr");

	}

	// 初始化时间
	@InitBinder
	// zrsj
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "zrrq", new CustomDateEditor(
				dateFormat, true));

	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/dyzzgxzr/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);

		model.addAllAttributes(pageResult(dyzzgxzrService.getLzzList(current,
				businessForm), dyzzgxzrService.getLzzCount(businessForm),
				current));
		return "/business/dyzzgxzr/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/dyzzgxzr/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Dyzzgxzr dyzzgxzr, String businessFormId) {
		dyzzgxzr.setBusinessForm(new BusinessForm(businessFormId));
		dyzzgxzrService.insert(dyzzgxzr);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/dyzzgxzr/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		dyzzgxzrService.delete(id);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/dyzzgxzr/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("dyzzgxzr", dyzzgxzrService.findOne(id));
		return "/business/dyzzgxzr/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Dyzzgxzr dyzzgxzr, String businessFormId) {
		Dyzzgxzr d = dyzzgxzrService.findOne(dyzzgxzr.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setName(dyzzgxzr.getName());
			d.setSex(dyzzgxzr.getSex());
			d.setZrrq(dyzzgxzr.getZrrq());
			d.setDwtr(dyzzgxzr.getDwtr());
			d.setSfzsdy(dyzzgxzr.getSfzsdy());
			d.setPhone(dyzzgxzr.getPhone());
			d.setRemark(dyzzgxzr.getRemark());
			d.setUpdateDate(new Date());
			dyzzgxzrService.update(d);
			updateBusinessForm(businessFormId);//更新业务表
		}

		return "redirect:/dyzzgxzr/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/dyzzgxzr/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(dyzzgxzrService.getLzzList(current,
				businessForm), dyzzgxzrService.getLzzCount(businessForm),
				current));
		return "/business/dyzzgxzr/check";
	}

}
