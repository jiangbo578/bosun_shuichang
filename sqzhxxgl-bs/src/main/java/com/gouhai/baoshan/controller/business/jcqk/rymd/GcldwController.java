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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Gcldw;
import com.gouhai.baoshan.service.business.jcqk.rymd.GclService;

/**
 * 共建、创建、联建 Controller entity:GcldwC
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/gcldw")
public class GcldwController extends BusinessFormController {
	@Autowired
	private GclService gclService;

	public GcldwController() {
		super("gcldw");
		// TODO Auto-generated constructor stub
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/gcldw/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(
				gclService.getLzzList(current, businessForm),
				gclService.getLzzCount(businessForm), current));
		return "/business/gcldw/item/index";
	}

	// 初始化转换日期
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "gjsj", new CustomDateEditor(
				dateFormat, true));
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/gcldw/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Gcldw gcldw, String businessFormId) {
		gcldw.setBusinessForm(new BusinessForm(businessFormId));
		gclService.insert(gcldw);
		return "redirect:/gcldw/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("gcldw", gclService.findOne(id));
		return "/business/gcldw/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Gcldw gcldw, String businessFormId) {
		Gcldw g = gclService.findOne(gcldw.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setAddress(gcldw.getAddress());
			g.setPhone(gcldw.getPhone());
			g.setUpdateDate(new Date());
			g.setDwname(gcldw.getDwname());
			g.setDwxz(gcldw.getDwxz());
			g.setLxr(gcldw.getLxr());
			g.setGjsj(gcldw.getGjsj());
			g.setType(gcldw.getType());
			gclService.update(g);
		}
		return "redirect:/gcldw/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		Gcldw g = gclService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			gclService.delete(id);
		}
		return "redirect:/gcldw/item/1/" + businessFormId;
	}
}