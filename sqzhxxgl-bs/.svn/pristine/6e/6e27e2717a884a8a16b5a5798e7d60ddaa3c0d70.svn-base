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
import com.gouhai.baoshan.entity.business.jcqk.gk.Jwhtsgz;
import com.gouhai.baoshan.service.business.jcqk.gk.JhwtsgzService;

/**
 * 居委特色工作 Controller Entity:Jwhtsgz
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/jwhtsgz")
public class JwhtsgzController extends BusinessFormController {
	@Autowired
	private JhwtsgzService jhwtsgzService;

	public JwhtsgzController() {
		super("jwhtsgz");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jwhtsgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jhwtsgzService.getLzzList(current,
				businessForm), jhwtsgzService.getLzzCount(businessForm),current));
		return "/business/jwhtsgz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jwhtsgz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Jwhtsgz jwhtsgz, String businessFormId) {
		jwhtsgz.setBusinessForm(new BusinessForm(businessFormId));
		jhwtsgzService.insert(jwhtsgz);
		return "redirect:/jwhtsgz/item/1/" + businessFormId;

	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		Jwhtsgz g = jhwtsgzService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			jhwtsgzService.delete(id);
		}
		return "redirect:/jwhtsgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("jwhtsgz", jhwtsgzService.findOne(id));
		return "/business/jwhtsgz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jwhtsgz jwhtsgz, String businessFormId) {
		Jwhtsgz g = jhwtsgzService.findOne(jwhtsgz.getId());
		// System.err.println(g.getBusinessForm().getId().equals(businessFormId));
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setDwname(jwhtsgz.getDwname());
			g.setJlr(jwhtsgz.getJlr());
			g.setNr(jwhtsgz.getNr());
			g.setTsname(jwhtsgz.getTsname());
			g.setUpdateDate(new Date());
			jhwtsgzService.update(g);
		}
		return "redirect:/jwhtsgz/item/1/" + businessFormId;
	}

	// 记录详情

	@RequestMapping(value = "/item/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		model.addAttribute("jwhtsgz", jhwtsgzService.findOne(id));
		return "/business/jwhtsgz/item/detail";
	}

}
