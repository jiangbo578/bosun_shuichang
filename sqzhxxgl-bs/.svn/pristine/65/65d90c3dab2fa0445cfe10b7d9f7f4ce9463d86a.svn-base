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
import com.gouhai.baoshan.entity.business.ggfw.shjz.Zxtjbgrb;
import com.gouhai.baoshan.service.business.ggfw.shjz.ZxtjbgrbService;

/**
 * 街镇助学结对统计表（个人版）
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/zxtjbgrb")
public class ZxtjbgrbController extends BusinessFormController {
	@Autowired
	private ZxtjbgrbService zxtjbgrbService;

	public ZxtjbgrbController() {
		super("zxtjbgrb");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/zxtjbgrb/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(zxtjbgrbService.getObjList(current,
				businessForm), zxtjbgrbService.getObjCount(businessForm),
				current));
		return "/business/zxtjbgrb/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/zxtjbgrb/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Zxtjbgrb t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		zxtjbgrbService.insert(t);
		return "redirect:/zxtjbgrb/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		zxtjbgrbService.delete(id);
		return "redirect:/zxtjbgrb/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("zxtjbgrb", zxtjbgrbService.findOne(id));
		return "/business/zxtjbgrb/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Zxtjbgrb t, String businessFormId) {
		Zxtjbgrb d = zxtjbgrbService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);
			d.setXm(t.getXm());
			d.setZzmm(t.getZzmm());
			d.setGzdw(t.getGzdw());
			d.setRole(t.getRole());
			d.setSsjz(t.getSsjz());
			d.setPhone(t.getPhone());
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
			zxtjbgrbService.update(d);
		}

		return "redirect:/zxtjbgrb/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/zxtjbgrb/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(zxtjbgrbService.getObjList(current,
				businessForm), zxtjbgrbService.getObjCount(businessForm),
				current));
		return "/business/zxtjbgrb/check";
	}
}
