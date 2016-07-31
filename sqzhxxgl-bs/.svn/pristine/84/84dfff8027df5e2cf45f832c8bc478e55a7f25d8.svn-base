package com.gouhai.baoshan.controller.business.ggfw.llgz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Djlr;
import com.gouhai.baoshan.service.business.ggfw.llgz.DjlrService;

/**
 * 独居老人名册持久层
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/djlr")
public class DjlrController extends BusinessFormController {
	@Autowired
	private DjlrService djlrService;

	public DjlrController() {
		super("djlr");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/djlr/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(djlrService.getObjList(current,
				businessForm), djlrService.getObjCount(businessForm), current));
		return "/business/djlr/item/index";
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
		return "/business/djlr/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Djlr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		djlrService.insert(t);
		return "redirect:/djlr/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("djlr", djlrService.findOne(id));
		return "/business/djlr/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Djlr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Djlr g = djlrService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setAge(t.getAge());
			g.setSex(t.getSex());
			g.setAddress(t.getAddress());
			g.setLxr(t.getLxr());
			g.setPhone(t.getPhone());
			g.setUpdateDate(new Date());
			djlrService.update(g);
		}
		return "redirect:/djlr/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Djlr g = djlrService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			djlrService.delete(id);
		}
		return "redirect:/djlr/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/djlr/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(djlrService.getObjList(current,
				businessForm), djlrService.getObjCount(businessForm), current));
		return "/business/djlr/check";
	}
}
