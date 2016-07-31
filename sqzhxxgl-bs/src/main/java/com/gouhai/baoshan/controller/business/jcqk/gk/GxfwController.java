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
import com.gouhai.baoshan.entity.business.jcqk.gk.Gxfw;
import com.gouhai.baoshan.service.business.jcqk.gk.GxfwService;

/**
 * 管辖范围 Controller entity:Gxfw
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "gxfw")
public class GxfwController extends BusinessFormController {
	@Autowired
	private GxfwService gxfwService;

	public GxfwController() {
		super("gxfw");
	}

	
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/gxfw/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(gxfwService.getLzzList(current,
				businessForm), gxfwService.getLzzCount(businessForm), current));
		return "/business/gxfw/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/gxfw/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Gxfw gxfw, String businessFormId) {
		gxfw.setBusinessForm(new BusinessForm(businessFormId));
		gxfwService.insert(gxfw);
		return "redirect:/gxfw/item/1/" + businessFormId;

	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		Gxfw g = gxfwService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			gxfwService.delete(id);
		}
		return "redirect:/gxfw/item/1/" + businessFormId;
	}

	//
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("gxfw", gxfwService.findOne(id));
		return "/business/gxfw/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Gxfw gxfw, String businessFormId) {
		Gxfw g = gxfwService.findOne(gxfw.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setLxc(gxfw.getLxc());
			g.setNong(gxfw.getNong());
			g.setHao(gxfw.getHao());
			g.setUpdateDate(new Date());
			gxfwService.update(g);
		}

		return "redirect:/gxfw/item/1/"+businessFormId;
	}
}
