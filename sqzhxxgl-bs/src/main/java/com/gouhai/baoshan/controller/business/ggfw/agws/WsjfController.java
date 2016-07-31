package com.gouhai.baoshan.controller.business.ggfw.agws;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Wsjf;
import com.gouhai.baoshan.service.business.ggfw.agws.WsjfService;

/**
 * 卫生经费使用情况 Controller Entity:Wsjf
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/wsjf")
public class WsjfController extends BusinessFormController {
	@Autowired
	private WsjfService wsjfService;

	public WsjfController() {
		super("wsjf");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wsjf/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("sum", wsjfService.getSum(businessForm));
		model.addAllAttributes(pageResult(wsjfService.getObjList(current,
				businessForm), wsjfService.getObjCount(businessForm), current));
		return "/business/wsjf/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/wsjf/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Wsjf t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		wsjfService.insert(t);
		return "redirect:/wsjf/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("wsjf", wsjfService.findOne(id));
		return "/business/wsjf/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wsjf t, String businessFormId) {
		Wsjf g = wsjfService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);
			g.setSyrq(t.getSyrq());
			g.setYt(t.getYt());
			g.setPrice(t.getPrice());
			g.setUpdateDate(new Date());
			wsjfService.update(g);
		}
		return "redirect:/wsjf/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Wsjf g = wsjfService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);
			wsjfService.delete(id);
		}
		return "redirect:/wsjf/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/wsjf/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(wsjfService.getObjList(current,
				businessForm), wsjfService.getObjCount(businessForm), current));
		return "/business/wsjf/check";
	}
}
