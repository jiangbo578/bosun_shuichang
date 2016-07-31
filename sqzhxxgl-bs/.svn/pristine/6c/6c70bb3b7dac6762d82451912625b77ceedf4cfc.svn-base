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
import com.gouhai.baoshan.entity.business.shgl.xfgz.Dwdc;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Dwdcmany;
import com.gouhai.baoshan.service.business.shgl.xfgz.DwdcService;
import com.gouhai.baoshan.service.business.shgl.xfgz.DwdcmanyService;

/**
 * 村委社会单位（场所）底册
 * 
 * @author 徐舟
 * 
 *         2014-9-17
 */
@Controller
@RequestMapping(value = "/dwdc")
public class DwdcController extends BusinessFormController {
	@Autowired
	private DwdcService dwdcService;
	@Autowired
	private DwdcmanyService dwdcmanyService;

	public DwdcController() {
		super("dwdc");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/dwdc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				dwdcService.getObjList(current, businessForm),
				dwdcService.getObjCount(businessForm), current));
		return "/business/dwdc/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/dwdc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Dwdc t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		dwdcService.insert(t);
		return "redirect:/dwdc/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		dwdcService.delete(id);
		return "redirect:/dwdc/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("dwdc", dwdcService.findOne(id));
		return "/business/dwdc/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Dwdc t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Dwdc d = dwdcService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setXqmc(t.getXqmc());
			d.setDwdz(t.getDwdz());
			d.setLxr(t.getLxr());
			d.setLxfs(t.getLxfs());
			d.setDjnf(t.getDjnf());
			d.setUpdateDate(new Date());
			dwdcService.update(d);
		}

		return "redirect:/dwdc/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/dwdc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				dwdcService.getObjList(current, businessForm),
				dwdcService.getObjCount(businessForm), current));
		return "/business/dwdc/check";
	}

	// 查询基本情况
	@RequestMapping(value = "/item/many/{current}/{flid}", method = RequestMethod.GET)
	public String indexmany(Model model, @PathVariable() int current,
			@PathVariable() String flid) {
		Dwdc dwdc = dwdcService.findOne(flid);
		model.addAttribute("dwdc", dwdc);
		model.addAllAttributes(pageResult(
				dwdcmanyService.getObjList(current, dwdc),
				dwdcmanyService.getObjCount(dwdc), current));
		return "/business/dwdc/item/many/index";
	}

	// 增加基本情况
	@RequestMapping(value = "/item/many/add/{flid}", method = RequestMethod.GET)
	public String toAddmany(@PathVariable() String flid) {
		System.out.println(flid);
		return "/business/dwdc/item/many/add";
	}

	@RequestMapping(value = "/item/many/add", method = RequestMethod.POST)
	public String addmany(Dwdcmany t, String flid) {
		Dwdc x = dwdcService.findOne(flid);
		t.setDwdc(x);
		dwdcmanyService.insert(t);
		return "redirect:/dwdc/item/many/1/" + flid;
	}

	// 修改基本情况
	@RequestMapping(value = "/item/many/update/{id}/{flid}", method = RequestMethod.GET)
	public String toUpdatemany(Model model, @PathVariable String id,
			@PathVariable String flid) {
		model.addAttribute("dwdcmany", dwdcmanyService.findOne(id));
		return "/business/dwdc/item/many/update";
	}

	@RequestMapping(value = "/item/many/update", method = RequestMethod.POST)
	public String updatemany(Dwdcmany t, String flid) {
		Dwdcmany d = dwdcmanyService.findOne(t.getId());
		if (d.getDwdc().getId().equals(flid)) {
			d.setCs(t.getCs());
			d.setMj(t.getMj());
			d.setXz(t.getXz());
			dwdcmanyService.update(d);
		}

		return "redirect:/dwdc/item/many/1/" + flid;
	}

	// 删除基本情况
	@RequestMapping(value = "/item/many/delete/{id}/{flid}", method = RequestMethod.GET)
	public String deletemany(@PathVariable String id,
			@PathVariable() String flid) {
		dwdcmanyService.delete(id);
		return "redirect:/dwdc/item/many/1/" + flid;
	}
}
