package com.gouhai.baoshan.controller.business.hyjl.hyhd;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Gzjh;
import com.gouhai.baoshan.service.business.hyjl.hyhd.GzjhService;

/**
 * 工作计划
 * 
 * @author 徐舟
 * 
 *         2014-10-13
 */
@Controller
@RequestMapping(value = "/gzjh")
public class GzjhController extends BusinessFormController {
	@Autowired
	private GzjhService gzjhService;

	public GzjhController() {
		super("gzjh");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/gzjh/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				gzjhService.getObjList(current, businessForm),
				gzjhService.getObjCount(businessForm), current));
		return "/business/gzjh/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/gzjh/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Gzjh t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		gzjhService.insert(t);
		return "redirect:/gzjh/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		gzjhService.delete(id);
		return "redirect:/gzjh/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("gzjh", gzjhService.findOne(id));
		return "/business/gzjh/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Gzjh t, String businessFormId) {
		Gzjh d = gzjhService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);
			d.setNr(t.getNr());
			d.setJlr(t.getJlr());
			d.setType(t.getType());
			d.setUpdateDate(new Date());
			gzjhService.update(d);
		}

		return "redirect:/gzjh/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/gzjh/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				gzjhService.getObjList(current, businessForm),
				gzjhService.getObjCount(businessForm), current));
		return "/business/gzjh/check";
	}

	// 查看详情
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {

		model.addAttribute("gzjh", gzjhService.findOne(id));
		return "/business/gzjh/item/detail";
	}
}
