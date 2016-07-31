package com.gouhai.baoshan.controller.business.ggfw.cjrgz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Cjrjbqk;
import com.gouhai.baoshan.service.business.ggfw.cjrgz.CjrJbqkService;

/**
 * 残疾人协会基本情况 Controller Entity:Cjrjbqk
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/cjrjbqk")
public class CjrJbqkController extends BusinessFormController {
	@Autowired
	private CjrJbqkService cjrJbqkService;

	public CjrJbqkController() {
		super("cjrjbqk");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cjrjbqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cjrJbqkService.getObjList(current,
				businessForm), cjrJbqkService.getObjCount(businessForm),
				current));
		return "/business/cjrjbqk/item/index";
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
		return "/business/cjrjbqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Cjrjbqk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		cjrJbqkService.insert(t);
		return "redirect:/cjrjbqk/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("cjrjbqk", cjrJbqkService.findOne(id));
		return "/business/cjrjbqk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cjrjbqk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Cjrjbqk g = cjrJbqkService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setXhqc(t.getXhqc());
			g.setBgdz(t.getBgdz());
			g.setPhone(t.getPhone());
			g.setZrs(t.getZrs());
			g.setSl(t.getSl());
			g.setTl(t.getTl());
			g.setWy(t.getWy());
			g.setYy(t.getYy());
			g.setZt(t.getZt());
			g.setJs(t.getJs());
			g.setZcwy(t.getZcwy());
			g.setZl(t.getZl());
			g.setUpdateDate(new Date());
			cjrJbqkService.update(g);
		}
		return "redirect:/cjrjbqk/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Cjrjbqk g = cjrJbqkService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			cjrJbqkService.delete(id);
		}
		return "redirect:/cjrjbqk/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/cjrjbqk/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cjrJbqkService.getObjList(current,
				businessForm), cjrJbqkService.getObjCount(businessForm),
				current));
		return "/business/cjrjbqk/check";
	}
}
