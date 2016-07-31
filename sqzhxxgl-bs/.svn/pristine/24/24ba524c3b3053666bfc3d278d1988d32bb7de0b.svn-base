package com.gouhai.baoshan.controller.business.shgl.mfgz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.mfgz.Sqmfyjx;
import com.gouhai.baoshan.service.business.shgl.mfgz.SqmfyjxService;

/**
 * 社区民防应急箱管理记录
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/sqmfyjx")
public class sqmfyjxController extends BusinessFormController {
	@Autowired
	private SqmfyjxService sqmfyjxService;

	public sqmfyjxController() {
		super("sqmfyjx");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sqmfyjx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(sqmfyjxService.getObjList(current,
				businessForm), sqmfyjxService.getObjCount(businessForm),
				current));
		return "/business/sqmfyjx/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sqmfyjx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Sqmfyjx t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		sqmfyjxService.insert(t);
		return "redirect:/sqmfyjx/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("sqmfyjx", sqmfyjxService.findOne(id));
		return "/business/sqmfyjx/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sqmfyjx t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Sqmfyjx g = sqmfyjxService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setGljl(t.getGljl());
			g.setGlsj(t.getGlsj());
			g.setGlr(t.getGlr());
			g.setRemark(t.getRemark());
			g.setUpdateDate(new Date());
			sqmfyjxService.update(g);
		}
		return "redirect:/sqmfyjx/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Sqmfyjx g = sqmfyjxService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			sqmfyjxService.delete(id);
		}
		return "redirect:/sqmfyjx/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/sqmfyjx/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(sqmfyjxService.getObjList(current,
				businessForm), sqmfyjxService.getObjCount(businessForm),
				current));
		return "/business/sqmfyjx/check";
	}
}
