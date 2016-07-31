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
import com.gouhai.baoshan.entity.business.jcqk.ncjz.Jtfwtwo;
import com.gouhai.baoshan.service.business.jcqk.ncjz.JtfwTwoService;

/**
 * 集体房屋、土地经营（出租）情况台帐（表二） Controller Entity:JtfwTwo
 * 
 * @author 固定资产台账
 * 
 */
@Controller
@RequestMapping(value = "/jtfwtwo")
public class JtfwTwoController extends BusinessFormController {
	@Autowired
	private JtfwTwoService jtfwTwoService;
	public JtfwTwoController()
	{
		super("jtfwtwo");
	}

	public void setJtfwTwoService(JtfwTwoService jtfwTwoService) {
		this.jtfwTwoService = jtfwTwoService;
	}

	// 初始化时间
	@InitBinder
	// JtfwTwo
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jtfwtwo/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jtfwTwoService.getLzzList(current,
				businessForm), jtfwTwoService.getLzzCount(businessForm),
				current));
		return "/business/jtfwtwo/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jtfwtwo/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Jtfwtwo jtfwTwo, String businessFormId) {
		updateBusinessForm(businessFormId);
		jtfwTwo.setBusinessForm(new BusinessForm(businessFormId));
		jtfwTwoService.insert(jtfwTwo);
		return "redirect:/jtfwtwo/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		jtfwTwoService.delete(id);
		return "redirect:/jtfwtwo/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		
		Jtfwtwo t=jtfwTwoService.findOne(id);
		model.addAttribute("jtfwtwo", t);
		return "/business/jtfwtwo/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jtfwtwo jtfwTwo, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jtfwtwo d = jtfwTwoService.findOne(jtfwTwo.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setBqwsje(jtfwTwo.getBqwsje());
			d.setBz(jtfwTwo.getBz());
			d.setDjr(jtfwTwo.getDjr());
			d.setHtbh(jtfwTwo.getHtbh());
			d.setHtdw(jtfwTwo.getHtdw());
			d.setHtlxqk(jtfwTwo.getHtlxqk());
			d.setHtqxq(jtfwTwo.getHtqxq());
			d.setHtqxz(jtfwTwo.getHtqxz());
			d.setLjwsje(jtfwTwo.getLjwsje());
			d.setNrzy(jtfwTwo.getNrzy());
			d.setPzh(jtfwTwo.getPzh());
			d.setRq(jtfwTwo.getRq());
			d.setSfztb(jtfwTwo.getSfztb());
			d.setSjhm(jtfwTwo.getSjhm());
			d.setSkje(jtfwTwo.getSkje());
			d.setSkrq(jtfwTwo.getSkrq());
			d.setSkze(jtfwTwo.getSkze());
			d.setYskje(jtfwTwo.getYskje());
			d.setYskrq(jtfwTwo.getYskrq());
			d.setZzrq(jtfwTwo.getZzrq());
			d.setUpdateDate(new Date());
  			jtfwTwoService.update(d);
		}

		return "redirect:/jtfwtwo/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jtfwtwo/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jtfwTwoService.getLzzList(current,
				businessForm), jtfwTwoService.getLzzCount(businessForm),
				current));
		return "/business/jtfwtwo/check";
	}
}