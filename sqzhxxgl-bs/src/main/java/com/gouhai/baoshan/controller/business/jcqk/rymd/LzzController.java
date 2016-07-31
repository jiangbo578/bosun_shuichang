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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Lzz;
import com.gouhai.baoshan.service.business.jcqk.rymd.LzzService;

/**
 * 楼组长 Controller entity:Lzz
 * 
 * @author xuzhou
 * 
 */
@Controller
@RequestMapping(value = "/lzz")
public class LzzController extends BusinessFormController {
	@Autowired
	private LzzService lzzservice;

	public LzzController() {
		super("lzz");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/lzz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(
				lzzservice.getLzzList(current, businessForm),
				lzzservice.getLzzCount(businessForm), current));
		return "/business/lzz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/lzz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Lzz lzz, String businessFormId) {
		lzz.setBusinessForm(new BusinessForm(businessFormId));
		lzzservice.insert(lzz);
		return "redirect:/lzz/item/1/" + businessFormId;

	}

	// @RequestMapping(value = "/{current}", method = RequestMethod.GET)
	// public String index(Model model, @PathVariable() int current) {
	// List<Lzz> list = lzzservice.getLzzList(current);
	// model.addAllAttributes(pageResult(list, lzzservice.getLzzCount(),
	// current));
	// return "/business/lzz/index";
	// }
	//
	// @RequestMapping(value = "/add", method = RequestMethod.GET)
	// public String toAdd() {
	// return "/business/lzz/add";
	// }
	//
	// 初始化转换日期
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "birthday",
				new CustomDateEditor(dateFormat, true));
	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("lzz", lzzservice.findOne(id));
		return "/business/lzz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Lzz lzz, String businessFormId) {
		Lzz l = lzzservice.findOne(lzz.getId());
		if (l.getBusinessForm().getId().equals(businessFormId)) {
			l.setLh(lzz.getLh());
			l.setHl(lzz.getHl());
			l.setUpdateDate(new Date());
			l.setZzname(lzz.getZzname());
			l.setAddress(lzz.getAddress());
			l.setPhone(lzz.getPhone());
			l.setStatus(lzz.getStatus());
			l.setJwfggb(lzz.getJwfggb());
			l.setBirthday(lzz.getBirthday());
			l.setSex(lzz.getSex());
			lzzservice.update(l);
		}
		return "redirect:/lzz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		Lzz l = lzzservice.findOne(id);
		if (l.getBusinessForm().getId().equals(businessFormId)) {
			lzzservice.delete(id);
		}
		return "redirect:/lzz/item/1/" + businessFormId;
	}
}
