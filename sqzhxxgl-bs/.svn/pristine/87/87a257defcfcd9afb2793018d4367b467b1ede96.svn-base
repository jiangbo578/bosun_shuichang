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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Jmcmdb;
import com.gouhai.baoshan.service.business.jcqk.rymd.JmcmdbService;

/**
 * 居民村民代表 Controller Entity:jmcmdb
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/jmcmdb")
public class JmcmdbController extends BusinessFormController {

	@Autowired
	private JmcmdbService jmcmdbService;

	public JmcmdbController() {
		super("jmcmdb");
	}

	public void setjmcmdbService(JmcmdbService jmcmdbService) {
		this.jmcmdbService = jmcmdbService;
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
		return "redirect:/jmcmdb/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				jmcmdbService.getLzzList(current, businessForm),
				jmcmdbService.getLzzCount(businessForm), current));
		return "/business/jmcmdb/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jmcmdb/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Jmcmdb jmcmdb, String businessFormId) {
		updateBusinessForm(businessFormId);
		jmcmdb.setBusinessForm(new BusinessForm(businessFormId));
		jmcmdbService.insert(jmcmdb);
		return "redirect:/jmcmdb/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		jmcmdbService.delete(id);
		return "redirect:/jmcmdb/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jmcmdb", jmcmdbService.findOne(id));
		return "/business/jmcmdb/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jmcmdb jmcmdb, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jmcmdb d = jmcmdbService.findOne(jmcmdb.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setDh(jmcmdb.getDh());
			d.setDw(jmcmdb.getDw());
			d.setJtzz(jmcmdb.getJtzz());
			d.setNl(jmcmdb.getNl());
			d.setWhcd(jmcmdb.getWhcd());
			d.setXb(jmcmdb.getXb());
			d.setXm(jmcmdb.getXm());
			d.setZw(jmcmdb.getZw());
			d.setZzmm(jmcmdb.getZzmm());
			jmcmdbService.update(d);
		}

		return "redirect:/jmcmdb/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jmcmdb/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				jmcmdbService.getLzzList(current, businessForm),
				jmcmdbService.getLzzCount(businessForm), current));
		return "/business/jmcmdb/check";
	}
}