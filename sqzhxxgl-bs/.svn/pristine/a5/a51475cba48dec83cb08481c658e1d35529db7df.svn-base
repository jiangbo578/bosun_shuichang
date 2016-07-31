package com.gouhai.baoshan.controller.business.shgl.xfgz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xqdc;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xqdcmany;
import com.gouhai.baoshan.service.business.shgl.xfgz.XqdcService;
import com.gouhai.baoshan.service.business.shgl.xfgz.XqdcmanyService;

/**
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/xqdc")
public class XqdcController extends BusinessFormController {
	@Autowired
	private XqdcService xqdcService;
	@Autowired
	private XqdcmanyService xqdcmanyService;

	public XqdcController() {
		super("xqdc");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/xqdc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				xqdcService.getObjList(current, businessForm),
				xqdcService.getObjCount(businessForm), current));
		return "/business/xqdc/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/xqdc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Xqdc t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		xqdcService.insert(t);
		return "redirect:/xqdc/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		xqdcService.delete(id);
		return "redirect:/xqdc/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("xqdc", xqdcService.findOne(id));
		return "/business/xqdc/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Xqdc t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Xqdc d = xqdcService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setXqmc(t.getXqmc());
			d.setDwdz(t.getDwdz());
			d.setLxr(t.getLxr());
			d.setLxfs(t.getLxfs());
			d.setDjnf(t.getDjnf());
			d.setUpdateDate(new Date());
			xqdcService.update(d);
		}

		return "redirect:/xqdc/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/xqdc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				xqdcService.getObjList(current, businessForm),
				xqdcService.getObjCount(businessForm), current));
		return "/business/xqdc/check";
	}

	// 查询基本情况
	@RequestMapping(value = "/item/many/{current}/{flid}", method = RequestMethod.GET)
	public String indexmany(Model model, @PathVariable() int current,
			@PathVariable() String flid) {
		Xqdc xqdc = xqdcService.findOne(flid);
		model.addAttribute("xqdc", xqdc);
		model.addAllAttributes(pageResult(
				xqdcmanyService.getObjList(current, xqdc),
				xqdcmanyService.getObjCount(xqdc), current));
		return "/business/xqdc/item/many/index";
	}

	// 增加基本情况
	@RequestMapping(value = "/item/many/add/{flid}", method = RequestMethod.GET)
	public String toAddmany(@PathVariable() String flid) {
		System.out.println(flid);
		return "/business/xqdc/item/many/add";
	}

	@RequestMapping(value = "/item/many/add", method = RequestMethod.POST)
	public String addmany(Xqdcmany t, String flid) {
		Xqdc x = xqdcService.findOne(flid);
		t.setXqdc(x);
		xqdcmanyService.insert(t);
		return "redirect:/xqdc/item/many/1/" + flid;
	}

	// 修改基本情况
	@RequestMapping(value = "/item/many/update/{id}/{flid}", method = RequestMethod.GET)
	public String toUpdatemany(Model model, @PathVariable String id,
			@PathVariable String flid) {
		model.addAttribute("xqdcmany", xqdcmanyService.findOne(id));
		return "/business/xqdc/item/many/update";
	}

	@RequestMapping(value = "/item/many/update", method = RequestMethod.POST)
	public String updatemany(Xqdcmany t, String flid) {
		Xqdcmany d = xqdcmanyService.findOne(t.getId());
		if (d.getXqdc().getId().equals(flid)) {
			d.setCs(t.getCs());
			d.setMj(t.getMj());
			d.setXz(t.getXz());
			xqdcmanyService.update(d);
		}

		return "redirect:/xqdc/item/many/1/" + flid;
	}

	// 删除基本情况
	@RequestMapping(value = "/item/many/delete/{id}/{flid}", method = RequestMethod.GET)
	public String deletemany(@PathVariable String id,
			@PathVariable() String flid) {
		xqdcmanyService.delete(id);
		return "redirect:/xqdc/item/many/1/" + flid;
	}
}
