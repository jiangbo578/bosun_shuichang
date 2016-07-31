package com.gouhai.baoshan.controller.business.jcqk.gk;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Cwhtsgz;
import com.gouhai.baoshan.service.business.jcqk.gk.CwhtsgzService;

/**
 * 村委会特色工作
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/cwhtsgz")
public class CwhtsgzController extends BusinessFormController {
	@Autowired
	private CwhtsgzService cwhtsgzService;

	public CwhtsgzController() {
		super("cwhtsgz");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cwhtsgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cwhtsgzService.getLzzList(current,
				businessForm), cwhtsgzService.getLzzCount(businessForm),
				current));
		return "/business/cwhtsgz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/cwhtsgz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Cwhtsgz cwhtsgz, String businessFormId) {
		cwhtsgz.setBusinessForm(new BusinessForm(businessFormId));
		cwhtsgzService.insert(cwhtsgz);
		return "redirect:/cwhtsgz/item/1/" + businessFormId;

	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Cwhtsgz g = cwhtsgzService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			cwhtsgzService.delete(id);
		}
		return "redirect:/cwhtsgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("cwhtsgz", cwhtsgzService.findOne(id));
		return "/business/cwhtsgz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cwhtsgz cwhtsgz, String businessFormId) {
		Cwhtsgz g = cwhtsgzService.findOne(cwhtsgz.getId());
		// System.err.println(g.getBusinessForm().getId().equals(businessFormId));
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setDwname(cwhtsgz.getDwname());
			g.setJlr(cwhtsgz.getJlr());
			g.setNr(cwhtsgz.getNr());
			g.setTsname(cwhtsgz.getTsname());
			g.setUpdateDate(new Date());
			cwhtsgzService.update(g);
		}
		return "redirect:/cwhtsgz/item/1/" + businessFormId;
	}

	// 记录详情

	@RequestMapping(value = "/item/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		model.addAttribute("cwhtsgz", cwhtsgzService.findOne(id));
		return "/business/cwhtsgz/item/detail";
	}

}
