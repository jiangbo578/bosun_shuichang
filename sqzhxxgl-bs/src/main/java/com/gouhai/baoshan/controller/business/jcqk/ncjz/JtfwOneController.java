package com.gouhai.baoshan.controller.business.jcqk.ncjz;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import com.gouhai.baoshan.entity.business.jcqk.ncjz.Jtfwone;
import com.gouhai.baoshan.service.business.jcqk.ncjz.JtfwOneService;

/**
 * 集体房屋、土地经营（出租）情况台帐（表二） Controller Entity:JtfwOne
 * 
 * @author 固定资产台账
 * 
 */
@Controller
@RequestMapping(value = "/jtfwone")
public class JtfwOneController extends BusinessFormController {
	@Autowired
	private JtfwOneService jtfwOneService;
	public JtfwOneController()
	{
		super("jtfwone");
	}

	public void setJtfwOneService(JtfwOneService jtfwOneService) {
		this.jtfwOneService = jtfwOneService;
	}

	// 初始化时间
	@InitBinder
	// JtfwOne
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jtfwone/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jtfwOneService.getLzzList(current,
				businessForm), jtfwOneService.getLzzCount(businessForm),
				current));
		return "/business/jtfwone/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jtfwone/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Jtfwone jtfwOne, String businessFormId) {
		updateBusinessForm(businessFormId);
		jtfwOne.setBusinessForm(new BusinessForm(businessFormId));
		jtfwOneService.insert(jtfwOne);
		return "redirect:/jtfwone/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		jtfwOneService.delete(id);
		return "redirect:/jtfwone/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		
		Jtfwone t=jtfwOneService.findOne(id);
		model.addAttribute("jtfwone", t);
		return "/business/jtfwone/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jtfwone jtfwOne, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jtfwone d = jtfwOneService.findOne(jtfwOne.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setFwwz(jtfwOne.getFwwz());
			d.setMph(jtfwOne.getMph());
			d.setFwzmj(jtfwOne.getFwzmj());
			d.setFwyzmj(jtfwOne.getFwyzmj());
			d.setFwwzmj(jtfwOne.getFwwzmj());
			d.setYczzmj(jtfwOne.getYczzmj());
			d.setYczyzmj(jtfwOne.getYczyzmj());
			d.setYczwzmj(jtfwOne.getYczwzmj());
			d.setTdwz(jtfwOne.getTdwz());
			d.setZdh(jtfwOne.getZdh());
			d.setDkzmj(jtfwOne.getDkzmj());
			d.setDyzmj(jtfwOne.getDyzmj());
			d.setDyzny(jtfwOne.getDyzny());
			d.setDyzfn(jtfwOne.getDyzfn());
			d.setDwzmj(jtfwOne.getDwzmj());
			d.setYyzmj(jtfwOne.getYyzmj());
			d.setYyzny(jtfwOne.getYyzny());
			d.setYyzfn(jtfwOne.getYyzfn());
			d.setYdkzmj(jtfwOne.getYdkzmj());
			d.setYwzmj(jtfwOne.getYwzmj());
			d.setYwzny(jtfwOne.getYwzny());
			d.setYwzfn(jtfwOne.getYwzfn());
			d.setTdczmj(jtfwOne.getTdczmj());
			d.setTdczny(jtfwOne.getTdczny());
			d.setTdczfn(jtfwOne.getTdczfn());
			d.setDjr(jtfwOne.getDjr());
			d.setRq(jtfwOne.getRq());
			
			d.setUpdateDate(new Date());
  			jtfwOneService.update(d);
		}

		return "redirect:/jtfwone/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jtfwone/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jtfwOneService.getLzzList(current,
				businessForm), jtfwOneService.getLzzCount(businessForm),
				current));
		return "/business/jtfwone/check";
	}
}