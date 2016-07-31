package com.gouhai.baoshan.controller.business.ggfw.hszh;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzwz;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ggfw.hszh.HszfwzwzService;

/**
 * 红十字服务站物资 Controller Entity：Hszfwzwz
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/hszfwzwz")
public class HszfwzwzController extends BusinessFormController {
	@Autowired
	private HszfwzwzService hszfwzwzService;
	@Autowired
	private BusinessFormService businessFormService; // 添加表单

	public HszfwzwzController() {
		super("hszfwzwz");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/hszfwzwz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(hszfwzwzService.getObjList(current,
				businessForm), hszfwzwzService.getObjCount(businessForm),
				current));
		return "/business/hszfwzwz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/hszfwzwz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Hszfwzwz t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		hszfwzwzService.insert(t);
		return "redirect:/hszfwzwz/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("hszfwzwz", hszfwzwzService.findOne(id));
		return "/business/hszfwzwz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Hszfwzwz t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzwz g = hszfwzwzService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setWzname(t.getWzname());
			g.setJsdate(t.getJsdate());
			g.setJsname(t.getJsname());
			g.setBfwz(t.getBfwz());
			g.setRemark(t.getRemark());
			g.setUpdateDate(new Date());
			hszfwzwzService.update(g);
		}
		return "redirect:/hszfwzwz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzwz g = hszfwzwzService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			hszfwzwzService.delete(id);
		}
		return "redirect:/hszfwzwz/item/1/" + businessFormId;
	}
}
