package com.gouhai.baoshan.controller.business.jcqk.rymd;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Jwcwjd;
import com.gouhai.baoshan.service.business.jcqk.rymd.JwcwjdService;

/**
 * 居务村务监督委员 Controller Entity:jwcwjd
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/jwcwjd")
public class JwcwjdController extends BusinessFormController{

	@Autowired
	private JwcwjdService jwcwjdService;
	public JwcwjdController()
	{
		super("jwcwjd");
	}

	public void setjwcwjdService(JwcwjdService jwcwjdService) {
		this.jwcwjdService = jwcwjdService;
	}

	// 初始化时间
	@InitBinder
	// jwcwjd
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jwcwjd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jwcwjdService.getLzzList(current,
				businessForm), jwcwjdService.getLzzCount(businessForm),
				current));
		return "/business/jwcwjd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jwcwjd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Jwcwjd jwcwjd, String businessFormId) {
		updateBusinessForm(businessFormId);
		jwcwjd.setBusinessForm(new BusinessForm(businessFormId));
		jwcwjdService.insert(jwcwjd);
		return "redirect:/jwcwjd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		jwcwjdService.delete(id);
		return "redirect:/jwcwjd/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jwcwjd", jwcwjdService.findOne(id));
		return "/business/jwcwjd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jwcwjd jwcwjd, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jwcwjd d = jwcwjdService.findOne(jwcwjd.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setCsny(jwcwjd.getCsny());
			d.setDh(jwcwjd.getDh());
			d.setWhcd(jwcwjd.getWhcd());
			d.setXb(jwcwjd.getXb());
			d.setXm(jwcwjd.getXm());
			d.setXrzw(jwcwjd.getXrzw());
			d.setZw(jwcwjd.getZw());
			d.setZzmm(jwcwjd.getZzmm());
			jwcwjdService.update(d);
		}

		return "redirect:/jwcwjd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jwcwjd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jwcwjdService.getLzzList(current,
				businessForm), jwcwjdService.getLzzCount(businessForm),
				current));
		return "/business/jwcwjd/check";
	}
}