package com.gouhai.baoshan.controller.business.jcqk.rymd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Cmdb;
import com.gouhai.baoshan.service.business.jcqk.rymd.CmdbService;

/**
 * 村民代表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/cmdb")
public class CmdbController extends BusinessFormController {
	@Autowired
	private CmdbService cmdbService;

	public CmdbController() {
		super("cmdb");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cmdb/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				cmdbService.getLzzList(current, businessForm),
				cmdbService.getLzzCount(businessForm), current));
		return "/business/cmdb/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/cmdb/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Cmdb cmdb, String businessFormId) {
		updateBusinessForm(businessFormId);
		cmdb.setBusinessForm(new BusinessForm(businessFormId));
		cmdbService.insert(cmdb);
		return "redirect:/cmdb/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		cmdbService.delete(id);
		return "redirect:/cmdb/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("cmdb", cmdbService.findOne(id));
		return "/business/cmdb/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cmdb cmdb, String businessFormId) {
		updateBusinessForm(businessFormId);
		Cmdb d = cmdbService.findOne(cmdb.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setDh(cmdb.getDh());
			d.setDw(cmdb.getDw());
			d.setJtzz(cmdb.getJtzz());
			d.setNl(cmdb.getNl());
			d.setWhcd(cmdb.getWhcd());
			d.setXb(cmdb.getXb());
			d.setXm(cmdb.getXm());
			d.setZw(cmdb.getZw());
			d.setZzmm(cmdb.getZzmm());
			cmdbService.update(d);
		}

		return "redirect:/cmdb/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/cmdb/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				cmdbService.getLzzList(current, businessForm),
				cmdbService.getLzzCount(businessForm), current));
		return "/business/cmdb/check";
	}
}
