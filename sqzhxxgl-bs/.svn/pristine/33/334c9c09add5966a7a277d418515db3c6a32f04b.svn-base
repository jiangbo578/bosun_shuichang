package com.gouhai.baoshan.controller.business.jcqk.rymd;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Syfwxx;
import com.gouhai.baoshan.service.business.jcqk.rymd.SyfwxxService;

/**
 * 居民村民代表 Controller Entity:Syfwxx
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/syfwxx")
public class SyfwxxController extends BusinessFormController{

	@Autowired
	private SyfwxxService syfwxxService;
	public SyfwxxController()
	{
		super("syfwxx");
	}

	public void setSyfwxxService(SyfwxxService syfwxxService) {
		this.syfwxxService = syfwxxService;
	}

	// 初始化时间
	@InitBinder
	// Syfwxx
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/syfwxx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(syfwxxService.getLzzList(current,
				businessForm), syfwxxService.getLzzCount(businessForm),
				current));
		return "/business/syfwxx/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/syfwxx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Syfwxx syfwxx, String businessFormId) {
		updateBusinessForm(businessFormId);
		syfwxx.setBusinessForm(new BusinessForm(businessFormId));
		syfwxxService.insert(syfwxx);
		return "redirect:/syfwxx/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		syfwxxService.delete(id);
		return "redirect:/syfwxx/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("syfwxx", syfwxxService.findOne(id));
		return "/business/syfwxx/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Syfwxx syfwxx, String businessFormId) {
		updateBusinessForm(businessFormId);
		Syfwxx d = syfwxxService.findOne(syfwxx.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setJgfjs(syfwxx.getJgfjs());
			d.setQzjs(syfwxx.getQzjs());
			d.setSfczjs(syfwxx.getSfczjs());
			d.setSfczmj(syfwxx.getSfczmj());
			d.setSsjz(syfwxx.getSsjz());
			d.setWzczjs(syfwxx.getWzczjs());
			d.setWzczmj(syfwxx.getWzczmj());
			d.setYzczmj(syfwxx.getYzczmj());
			d.setYzczjs(syfwxx.getYzczjs());
			d.setZhs(syfwxx.getZhs());
			d.setZjs(syfwxx.getZjs());
			d.setZmj(syfwxx.getZmj());
			syfwxxService.update(d);
		}

		return "redirect:/syfwxx/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/syfwxx/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(syfwxxService.getLzzList(current,
				businessForm), syfwxxService.getLzzCount(businessForm),
				current));
		return "/business/syfwxx/check";
	}
}