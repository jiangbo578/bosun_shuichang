package com.gouhai.baoshan.controller.business.ggfw.agws;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Sqjmjkzwglxz;
import com.gouhai.baoshan.service.business.ggfw.agws.SqjmjkzwglxzService;

/**
 * 社区居民健康自我管理小组统计表 Controller entity： Sqjmjkzwglxz
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/sqjmjkzwglxz")
public class SqjmjkzwglxzController extends BusinessFormController {
	@Autowired
	private SqjmjkzwglxzService sqjmjkzwglxzService;

	public SqjmjkzwglxzController() {
		super("sqjmjkzwglxz");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sqjmjkzwglxz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(sqjmjkzwglxzService.getObjList(
				current, businessForm), sqjmjkzwglxzService
				.getObjCount(businessForm), current));
		return "/business/sqjmjkzwglxz/item/index";
	}

	// // 初始化转换日期
	// @InitBinder
	// public void initBinder(WebDataBinder binder) {
	// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// dateFormat.setLenient(false);
	// binder.registerCustomEditor(Date.class, "gjsj", new CustomDateEditor(
	// dateFormat, true));
	// }

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sqjmjkzwglxz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Sqjmjkzwglxz t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		sqjmjkzwglxzService.insert(t);
		return "redirect:/sqjmjkzwglxz/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("sqjmjkzwglxz", sqjmjkzwglxzService.findOne(id));
		return "/business/sqjmjkzwglxz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sqjmjkzwglxz t, String businessFormId) {
		Sqjmjkzwglxz g = sqjmjkzwglxzService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setXzgs(t.getXzgs());
			g.setXzzy(t.getXzzy());
			g.setXzhdcs(t.getXzhdcs());
			g.setXzcjrc(t.getXzcjrc());
			g.setHdgs(t.getHdgs());
			g.setHdzy(t.getHdzy());
			g.setHdhdcs(t.getHdhdcs());
			g.setHdcjrc(t.getHdcjrc());
			g.setJdgs(t.getJdgs());
			g.setJdrs(t.getJdrs());
			g.setUpdateDate(new Date());
			sqjmjkzwglxzService.update(g);
		}
		return "redirect:/sqjmjkzwglxz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Sqjmjkzwglxz g = sqjmjkzwglxzService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			sqjmjkzwglxzService.delete(id);
		}
		return "redirect:/sqjmjkzwglxz/item/1/" + businessFormId;
	}
}
