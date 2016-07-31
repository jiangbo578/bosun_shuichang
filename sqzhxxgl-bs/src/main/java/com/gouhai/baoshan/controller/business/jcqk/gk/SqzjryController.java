package com.gouhai.baoshan.controller.business.jcqk.gk;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
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
import com.gouhai.baoshan.entity.business.jcqk.gk.Sqzjry;
import com.gouhai.baoshan.service.business.jcqk.gk.SqzjryService;

/**
 * 曾获市、区、镇、街道荣誉 Controller entity:Sqzjry
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/sqzjry")
public class SqzjryController extends BusinessFormController {
	@Autowired
	private SqzjryService sqzjryService;

	public SqzjryController() {
		super("sqzjry");
	}

	// 初始化转换日期
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "hjdate", new CustomDateEditor(
				dateFormat, true));
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sqzjry/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(sqzjryService.getLzzList(current,
						businessForm), sqzjryService.getLzzCount(businessForm),
						current));
		return "/business/sqzjry/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sqzjry/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Sqzjry sqzjry, String businessFormId) {
		sqzjry.setBusinessForm(new BusinessForm(businessFormId));
		sqzjryService.insert(sqzjry);
		return "redirect:/sqzjry/item/1/" + businessFormId;

	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		Sqzjry g = sqzjryService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			sqzjryService.delete(id);
		}
		return "redirect:/sqzjry/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("sqzjry", sqzjryService.findOne(id));
		return "/business/sqzjry/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sqzjry sqzjry, String businessFormId) {
		if (!SecurityUtils.getSubject().isPermitted("sqzjry:update")) {
			return "/error/unauthority";
		}
		Sqzjry g = sqzjryService.findOne(sqzjry.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setRyname(sqzjry.getRyname());
			g.setHjdate(sqzjry.getHjdate());
			g.setBjdw(sqzjry.getBjdw());
			g.setHjz(sqzjry.getHjz());
			g.setUpdateDate(new Date());
			g.setRemark(sqzjry.getRemark());
			sqzjryService.update(g);
		}

		return "redirect:/sqzjry/item/1/" + businessFormId;
	}
}
