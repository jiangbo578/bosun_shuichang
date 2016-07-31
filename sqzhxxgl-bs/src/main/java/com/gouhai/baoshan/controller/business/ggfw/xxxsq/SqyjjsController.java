package com.gouhai.baoshan.controller.business.ggfw.xxxsq;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.xxxsq.Sqyjjs;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ggfw.xxxsq.SqyjjsService;

/**
 * 学习型社区硬件建设 Cntroller Entity：Sqyjjs
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/sqyjjs")
public class SqyjjsController extends BusinessFormController {
	@Autowired
	private SqyjjsService sqyjjsService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	public SqyjjsController() {
		super("sqyjjs");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sqyjjs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(sqyjjsService.getObjList(current,
						businessForm), sqyjjsService.getObjCount(businessForm),
						current));
		return "/business/sqyjjs/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sqyjjs/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Sqyjjs t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		sqyjjsService.insert(t);
		return "redirect:/sqyjjs/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		sqyjjsService.delete(id);
		return "redirect:/sqyjjs/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("sqyjjs", sqyjjsService.findOne(id));
		return "/business/sqyjjs/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sqyjjs t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Sqyjjs d = sqyjjsService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setGlxcgj(t.getGlxcgj());
			d.setKjwthdzd(t.getKjwthdzd());
			d.setXqxxbxd(t.getXqxxbxd());
			d.setHjjs(t.getHjjs());
			d.setUpdateDate(new Date());
			sqyjjsService.update(d);
		}

		return "redirect:/sqyjjs/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/sqyjjs/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model
				.addAllAttributes(pageResult(sqyjjsService.getObjList(current,
						businessForm), sqyjjsService.getObjCount(businessForm),
						current));
		return "/business/sqyjjs/check";
	}

}
