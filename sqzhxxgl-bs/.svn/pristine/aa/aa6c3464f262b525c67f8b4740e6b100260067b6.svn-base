/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.zb;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Lxfwqzzf;
import com.gouhai.baoshan.entity.business.dqgz.zb.LxfwqzzfZfr;
import com.gouhai.baoshan.service.business.dqgz.zb.LxfwqzzfService;

/**
 * 
 * 
 * @author Rui
 * 
 */
@Controller
@RequestMapping(value = "/lxfwqzzf")
public class LxfwqzzfController extends BusinessFormController {
	@Autowired
	private LxfwqzzfService lxfwqzzfService;

	public LxfwqzzfController() {
		super("Lxfwqzzf");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/lxfwqzzf/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(lxfwqzzfService.getLxfwqzzfList(
				businessForm, current), lxfwqzzfService
				.getLxfwqzzfCount(businessForm), current));
		return "/business/lxfwqzzf/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/lxfwqzzf/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Lxfwqzzf lxfwqzzf, String businessFormId) {
		lxfwqzzf.setBusinessForm(new BusinessForm(businessFormId));
		lxfwqzzfService.insert(lxfwqzzf);
		return "redirect:/lxfwqzzf/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		lxfwqzzfService.delete(id, businessFormId);
		return "redirect:/lxfwqzzf/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("lxfwqzzf", lxfwqzzfService.findOne(id));
		return "/business/lxfwqzzf/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Lxfwqzzf t, String businessFormId) {
		Lxfwqzzf d = lxfwqzzfService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setZrq(t.getZrq());
			d.setZhs(t.getZhs());
			d.setMphh(t.getMphh());
			d.setXm(t.getXm());
			d.setZw(t.getZw());
			d.setLxfs(t.getLxfs());
			d.setBz(t.getBz());
			lxfwqzzfService.update(d);
		}
		return "redirect:/lxfwqzzf/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		if (!SecurityUtils.getSubject().isPermitted("lxfwqzzf:check")) {
			return "/error/unauthority";
		}
		return "redirect:/lxfwqzzf/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		if (!SecurityUtils.getSubject().isPermitted("lxfwqzzf:check")) {
			return "/error/unauthority";
		}

		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(lxfwqzzfService.getLxfwqzzfList(
				businessForm, current), lxfwqzzfService
				.getLxfwqzzfCount(businessForm), current));
		return "/business/lxfwqzzf/check";
	}

//查询走访人
	@RequestMapping(value = "/item/zl/{current}/{flid}", method = RequestMethod.GET)
	public String indexZl(Model model, @PathVariable() int current,@PathVariable() String flid) {
		Lxfwqzzf l = lxfwqzzfService.findOne(flid);
		model.addAttribute("businessForm", l);
		model.addAllAttributes(pageResult(
				lxfwqzzfService.getObjOne(l, current), lxfwqzzfService
						.getObjOneCount(l), current));
		return "/business/lxfwqzzf/item/zl/index";
	}
//增加走访人
	@RequestMapping(value = "/item/zl/add/{flid}", method = RequestMethod.GET)
	public String toAddZl(@PathVariable() String flid) {
		System.out.println(flid);
		return "/business/lxfwqzzf/item/zl/add";
	}

	@RequestMapping(value = "/item/zl/add", method = RequestMethod.POST)
	public String addZl(LxfwqzzfZfr t, String flid) {
		Lxfwqzzf x=lxfwqzzfService.findOne(flid);
		t.setLxfwqzzf(x);
		lxfwqzzfService.insert(t);
		return "redirect:/lxfwqzzf/item/zl/1/" + flid;
	}
//修改走访人
	@RequestMapping(value = "/item/zl/update/{id}/{flid}", method = RequestMethod.GET)
	public String toUpdateZl(Model model, @PathVariable String id,@PathVariable String flid) {
		model.addAttribute("lxfwqzzfr", lxfwqzzfService.findOneZl(id));
		return "/business/lxfwqzzf/item/zl/update";
	}

	@RequestMapping(value = "/item/zl/update", method = RequestMethod.POST)
	public String updatezL(LxfwqzzfZfr t,String flid) {
		   LxfwqzzfZfr d=lxfwqzzfService.findOneZl(t.getId());
		   if(d.getLxfwqzzf().getId().equals(flid)){
			   d.setXm(t.getXm());
			   d.setZw(t.getZw());
			   d.setLxfs(t.getLxfs());
			   d.setBz(t.getBz());
			   lxfwqzzfService.updateZl(d);
		   }
		
		return "redirect:/lxfwqzzf/item/zl/1/" + flid;
	}
	//删除走访人
	@RequestMapping(value = "/item/zl/delete/{id}/{flid}", method = RequestMethod.GET)
	public String deleteZl(@PathVariable String id,
			@PathVariable() String flid) {
		lxfwqzzfService.deleteZl(id);
		return "redirect:/lxfwqzzf/item/zl/1/" + flid;
	}
}
