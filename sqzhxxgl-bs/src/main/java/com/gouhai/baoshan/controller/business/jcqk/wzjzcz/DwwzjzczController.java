package com.gouhai.baoshan.controller.business.jcqk.wzjzcz;

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
import com.gouhai.baoshan.entity.business.jcqk.wzjzcz.Dwwzjzcz;
import com.gouhai.baoshan.service.business.jcqk.wzjzcz.DwwzjzczService;

/**
 * 居民村民代表 Controller Entity:Dwwzjzcz
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/dwwzjzcz")
public class DwwzjzczController extends BusinessFormController{

	@Autowired
	private DwwzjzczService dwwzjzczService;
	public DwwzjzczController()
	{
		super("dwwzjzcz");
	}

	public void setDwwzjzczService(DwwzjzczService DwwzjzczService) {
		this.dwwzjzczService = DwwzjzczService;
	}

	// 初始化时间
	@InitBinder
	// Dwwzjzcz
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "fxrq", new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(Date.class, "sbrq", new CustomDateEditor(dateFormat, true));
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/dwwzjzcz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(dwwzjzczService.getLzzList(current,
				businessForm), dwwzjzczService.getLzzCount(businessForm),
				current));
		return "/business/dwwzjzcz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/dwwzjzcz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Dwwzjzcz dwwzjzcz, String businessFormId) {
		updateBusinessForm(businessFormId);
		dwwzjzcz.setBusinessForm(new BusinessForm(businessFormId));
		dwwzjzczService.insert(dwwzjzcz);
		return "redirect:/dwwzjzcz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		dwwzjzczService.delete(id);
		return "redirect:/dwwzjzcz/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("dwwzjzcz", dwwzjzczService.findOne(id));
		return "/business/dwwzjzcz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Dwwzjzcz dwwzjzcz, String businessFormId) {
		updateBusinessForm(businessFormId);
		Dwwzjzcz d = dwwzjzczService.findOne(dwwzjzcz.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setCwh(dwwzjzcz.getCwh());
			d.setCzdw(dwwzjzcz.getCzdw());
			d.setCzqk(dwwzjzcz.getCzqk());
			d.setDwmc(dwwzjzcz.getDwmc());
			d.setDz(dwwzjzcz.getDz());
			d.setFxrq(dwwzjzcz.getFxrq());
			d.setJz(dwwzjzcz.getJz());
			d.setLy(dwwzjzcz.getLy());
			d.setMj(dwwzjzcz.getMj());
			d.setSbrq(dwwzjzcz.getSbrq());
			d.setYt(dwwzjzcz.getYt());
			d.setBw(dwwzjzcz.getBw());
			dwwzjzczService.update(d);
		}

		return "redirect:/dwwzjzcz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/dwwzjzcz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(dwwzjzczService.getLzzList(current,
				businessForm), dwwzjzczService.getLzzCount(businessForm),
				current));
		return "/business/dwwzjzcz/check";
	}
}