package com.gouhai.baoshan.controller.business.jcqk.gk;

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
import com.gouhai.baoshan.entity.business.jcqk.gk.Cwhqk;
import com.gouhai.baoshan.service.business.jcqk.gk.CwhqkService;

/**
 * 村委会情况 Controller Entity:Cwhqk
 * 
 * @author 村委会情况
 * 
 */
@Controller
@RequestMapping(value = "/cwhqk")
public class CwhqkController extends BusinessFormController {
	@Autowired
	private CwhqkService cwhqkService;
	public CwhqkController()
	{
		super("cwhqk");
	}

	public void setCwhqkService(CwhqkService cwhqkService) {
		this.cwhqkService = cwhqkService;
	}

	// 初始化时间
	@InitBinder
	// cwhqk
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cwhqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(cwhqkService.getLzzList(current,
				businessForm), cwhqkService.getLzzCount(businessForm),
				current));
		return "/business/cwhqk/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/cwhqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Cwhqk cwhqk, String businessFormId) {
		updateBusinessForm(businessFormId);
		cwhqk.setBusinessForm(new BusinessForm(businessFormId));
		cwhqkService.insert(cwhqk);
		return "redirect:/cwhqk/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		cwhqkService.delete(id);
		return "redirect:/cwhqk/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("cwhqk", cwhqkService.findOne(id));
		return "/business/cwhqk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cwhqk cwhqk, String businessFormId) {
		updateBusinessForm(businessFormId);
		Cwhqk d = cwhqkService.findOne(cwhqk.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setBgdz(cwhqk.getBgdz());
			d.setClrq(cwhqk.getClrq());
			d.setCwhrs(cwhqk.getCwhrs());
			d.setCwhwy(cwhqk.getCwhwy());
			d.setDh(cwhqk.getDh());
			d.setDzbclrq(cwhqk.getDzbclrq());
			d.setDzbcys(cwhqk.getDzbcys());
			d.setFsj(cwhqk.getFsj());
			d.setFzr(cwhqk.getFzr());
			d.setId(cwhqk.getId());
			d.setQc(cwhqk.getQc());
			d.setSj(cwhqk.getSj());
			d.setSscz(cwhqk.getSscz());
			d.setYb(cwhqk.getYb());
			d.setYx(cwhqk.getYx());
			d.setZr(cwhqk.getZr());
			cwhqkService.update(d);
		}

		return "redirect:/cwhqk/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/cwhqk/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cwhqkService.getLzzList(current,
				businessForm), cwhqkService.getLzzCount(businessForm),
				current));
		return "/business/cwhqk/check";
	}
}