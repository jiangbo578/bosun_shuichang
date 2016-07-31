package com.gouhai.baoshan.controller.business.dqgz.zb;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Lxfwgzsjwt;
import com.gouhai.baoshan.service.business.dqgz.zb.LxfwgzsjwtService;

/**
 * 联系服务工作收集问题提交单
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/lxfwgzsjwt")
public class LxfwgzsjwtController extends BusinessFormController {
	@Autowired
	private LxfwgzsjwtService lxfwgzsjwtService;

	public LxfwgzsjwtController() {
		super("lxfwgzsjwt");
	}
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/lxfwgzsjwt/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);

		model.addAllAttributes(pageResult(lxfwgzsjwtService.getobjList(current,
				businessForm), lxfwgzsjwtService.getobjCount(businessForm),
				current));
		return "/business/lxfwgzsjwt/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/lxfwgzsjwt/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Lxfwgzsjwt t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		lxfwgzsjwtService.insert(t);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/lxfwgzsjwt/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		lxfwgzsjwtService.delete(id);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/lxfwgzsjwt/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("lxfwgzsjwt", lxfwgzsjwtService.findOne(id));
		return "/business/lxfwgzsjwt/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Lxfwgzsjwt t, String businessFormId) {
		Lxfwgzsjwt d = lxfwgzsjwtService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setJmq(t.getJmq());
			d.setBh(t.getBh());
			d.setSqfyr(t.getSqfyr());
			d.setSszrq(t.getSszrq());
			d.setDz(t.getDz());
			d.setLxfs(t.getLxfs());
			d.setWtjs(t.getWtjs());
			d.setWtgl(t.getWtgl());
			d.setZzkclyj(t.getZzkclyj());
			d.setJjqkfk(t.getJjqkfk());
			d.setLdbzyj(t.getLdbzyj());
			d.setUpdateDate(new Date());
			lxfwgzsjwtService.update(d);
			updateBusinessForm(businessFormId);// 更新业务表
		}

		return "redirect:/lxfwgzsjwt/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/lxfwgzsjwt/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(lxfwgzsjwtService.getobjList(current,
				businessForm), lxfwgzsjwtService.getobjCount(businessForm),
				current));
		return "/business/lxfwgzsjwt/check";
	}

}
