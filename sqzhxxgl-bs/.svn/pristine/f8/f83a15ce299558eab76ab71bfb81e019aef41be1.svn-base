package com.gouhai.baoshan.controller.business.ggfw.shjz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.shjz.Zxtjbdwb;
import com.gouhai.baoshan.service.business.ggfw.shjz.Zxtjb_dwbService;

/**
 * 街镇助学结对统计表（单位版）
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/zxtjbdwb")
public class Zxtjb_dwbController extends BusinessFormController {
	@Autowired
	private Zxtjb_dwbService dwbService;

	public Zxtjb_dwbController() {
		super("zxtjbdwb");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/zxtjbdwb/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(dwbService.getObjList(current,
				businessForm), dwbService.getObjCount(businessForm), current));
		return "/business/zxtjbdwb/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/zxtjbdwb/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Zxtjbdwb t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		dwbService.insert(t);
		return "redirect:/zxtjbdwb/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		dwbService.delete(id);
		return "redirect:/zxtjbdwb/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("zxtjbdwb", dwbService.findOne(id));
		return "/business/zxtjbdwb/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Zxtjbdwb t, String businessFormId) {
		Zxtjbdwb d = dwbService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);
			d.setZzdw(t.getZzdw());
			d.setDz(t.getDz());
			d.setLxr(t.getLxr());
			d.setPhone(t.getPhone());
			d.setDwxz(t.getDwxz());
			d.setSsjz(t.getSsjz());
			d.setName(t.getName());
			d.setSex(t.getSex());
			d.setSfz(t.getSfz());
			d.setAddress(t.getAddress());
			d.setCwh(t.getCwh());
			d.setHjxz(t.getHjxz());
			d.setJtxz(t.getJtxz());
			d.setJdxx(t.getJdxx());
			d.setXznx(t.getXznx());
			d.setXxjd(t.getXxjd());
			d.setXxnj(t.getXxnj());
			d.setZzje(t.getZzje());
			d.setLjje(t.getLjje());
			d.setZzqsnx(t.getZzqsnx());
			d.setBz(t.getBz());
			d.setUpdateDate(new Date());
			dwbService.update(d);
		}

		return "redirect:/zxtjbdwb/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/zxtjbdwb/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(dwbService.getObjList(current,
				businessForm), dwbService.getObjCount(businessForm), current));
		return "/business/zxtjbdwb/check";
	}
}
