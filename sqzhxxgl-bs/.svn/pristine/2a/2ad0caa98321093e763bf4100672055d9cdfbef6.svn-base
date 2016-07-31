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
import com.gouhai.baoshan.entity.business.dqgz.zb.Rdjjfz;
import com.gouhai.baoshan.service.business.dqgz.zb.RdjjfzService;

/**
 * 年度发展党员工作情况表 :入党积极分子 Controller entity:Rdjjfz
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/rdjjfz")
public class RdjjfzController extends BusinessFormController {
	@Autowired
	private RdjjfzService rdjjfzService;
	public RdjjfzController() {
		super("rdjjfz");
	}
	// 初始化时间
	@InitBinder
	// zrsj
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "birthday",
				new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(Date.class, "sqrdsj", new CustomDateEditor(
				dateFormat, true));
		binder.registerCustomEditor(Date.class, "jjfzsj", new CustomDateEditor(
				dateFormat, true));

	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/rdjjfz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(rdjjfzService.getLzzList(current,
						businessForm), rdjjfzService.getLzzCount(businessForm),
						current));
		return "/business/rdjjfz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/rdjjfz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Rdjjfz Rdjjfz, String businessFormId) {
		Rdjjfz.setBusinessForm(new BusinessForm(businessFormId));
		rdjjfzService.insert(Rdjjfz);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/rdjjfz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		rdjjfzService.delete(id);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/rdjjfz/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("rdjjfz", rdjjfzService.findOne(id));
		return "/business/rdjjfz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Rdjjfz Rdjjfz, String businessFormId) {
		Rdjjfz d = rdjjfzService.findOne(Rdjjfz.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setName(Rdjjfz.getName());
			d.setSex(Rdjjfz.getSex());
			d.setMz(Rdjjfz.getMz());
			d.setBirthday(Rdjjfz.getBirthday());
			d.setWhcd(Rdjjfz.getWhcd());
			d.setSqrdsj(Rdjjfz.getSqrdsj());
			d.setAddress(Rdjjfz.getAddress());
			d.setRemark(Rdjjfz.getRemark());
			d.setJjfzsj(Rdjjfz.getJjfzsj());
			d.setUpdateDate(new Date());
			rdjjfzService.update(d);
			updateBusinessForm(businessFormId);//更新业务表
		}

		return "redirect:/rdjjfz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/rdjjfz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(rdjjfzService.getLzzList(current,
						businessForm), rdjjfzService.getLzzCount(businessForm),
						current));
		return "/business/rdjjfz/check";
	}
}
