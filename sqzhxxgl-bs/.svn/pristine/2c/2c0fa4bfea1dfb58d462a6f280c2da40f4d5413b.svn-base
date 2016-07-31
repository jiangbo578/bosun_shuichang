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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Jmcmxzz;
import com.gouhai.baoshan.service.business.jcqk.rymd.JmcmxzzService;

/**
 * 居民村民代表 Controller Entity:jmcmdb
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/jmcmxzz")
public class JmcmxzzController extends BusinessFormController{

	@Autowired
	private JmcmxzzService jmcmxzzService;
	public JmcmxzzController()
	{
		super("jmcmxzz");
	}


	// 初始化时间
	@InitBinder
	// jmcmdb
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jmcmxzz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jmcmxzzService.getLzzList(current,
				businessForm), jmcmxzzService.getLzzCount(businessForm),
				current));
		return "/business/jmcmxzz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jmcmxzz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Jmcmxzz jmcmxzz, String businessFormId) {
		updateBusinessForm(businessFormId);
		jmcmxzz.setBusinessForm(new BusinessForm(businessFormId));
		jmcmxzzService.insert(jmcmxzz);
		return "redirect:/jmcmxzz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		jmcmxzzService.delete(id);
		return "redirect:/jmcmxzz/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jmcmxzz", jmcmxzzService.findOne(id));
		return "/business/jmcmxzz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jmcmxzz jmcmxzz, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jmcmxzz d = jmcmxzzService.findOne(jmcmxzz.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setDh(jmcmxzz.getDh());
			d.setJtzz(jmcmxzz.getJtzz());
			d.setNl(jmcmxzz.getNl());
			d.setWhcd(jmcmxzz.getWhcd());
			d.setXb(jmcmxzz.getXb());
			d.setXm(jmcmxzz.getXm());
			d.setXzmc(jmcmxzz.getXzmc());
			d.setZzmm(jmcmxzz.getZzmm());
			jmcmxzzService.update(d);
		}

		return "redirect:/jmcmxzz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jmcmxzz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jmcmxzzService.getLzzList(current,
				businessForm), jmcmxzzService.getLzzCount(businessForm),
				current));
		return "/business/jmcmxzz/check";
	}
}