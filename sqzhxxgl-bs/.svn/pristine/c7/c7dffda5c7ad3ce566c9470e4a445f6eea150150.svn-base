package com.gouhai.baoshan.controller.business.jcqk.rymd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Cwjd;
import com.gouhai.baoshan.service.business.jcqk.rymd.CwjdService;

/**
 * 村务监督委员会成员名单
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/cwjd")
public class CwjdController extends BusinessFormController {
	@Autowired
	private CwjdService cwjdService;

	public CwjdController() {
		super("cwjd");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cwjd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cwjdService.getLzzList(current,
				businessForm), cwjdService.getLzzCount(businessForm), current));
		return "/business/cwjd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/cwjd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Cwjd cwjd, String businessFormId) {
		updateBusinessForm(businessFormId);
		cwjd.setBusinessForm(new BusinessForm(businessFormId));
		cwjdService.insert(cwjd);
		return "redirect:/cwjd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		cwjdService.delete(id);
		return "redirect:/cwjd/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("cwjd", cwjdService.findOne(id));
		return "/business/cwjd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cwjd cwjd, String businessFormId) {
		updateBusinessForm(businessFormId);
		Cwjd d = cwjdService.findOne(cwjd.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setCsny(cwjd.getCsny());
			d.setDh(cwjd.getDh());
			d.setWhcd(cwjd.getWhcd());
			d.setXb(cwjd.getXb());
			d.setXm(cwjd.getXm());
			d.setXrzw(cwjd.getXrzw());
			d.setZw(cwjd.getZw());
			d.setZzmm(cwjd.getZzmm());
			cwjdService.update(d);
		}

		return "redirect:/cwjd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/cwjd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cwjdService.getLzzList(current,
				businessForm), cwjdService.getLzzCount(businessForm), current));
		return "/business/cwjd/check";
	}
}
