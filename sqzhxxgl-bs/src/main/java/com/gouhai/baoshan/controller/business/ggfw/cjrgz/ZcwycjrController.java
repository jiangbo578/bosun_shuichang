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
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Zcwycjr;
import com.gouhai.baoshan.service.business.ggfw.cjrgz.ZcwycjrService;

/**
 * 重残无业残疾人名册
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/zcwycjr")
public class ZcwycjrController extends BusinessFormController {
	@Autowired
	private ZcwycjrService zcwycjrService;

	public ZcwycjrController() {
		super("zcwycjr");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/zcwycjr/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businiessForm", businessForm);
		model.addAllAttributes(pageResult(zcwycjrService.getObjList(current,
				businessForm), zcwycjrService.getObjCount(businessForm),
				current));
		return "/business/zcwycjr/item/index";
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
		return "/business/zcwycjr/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Zcwycjr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		zcwycjrService.insert(t);
		return "redirect:/zcwycjr/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("zcwycjr", zcwycjrService.findOne(id));
		return "/business/zcwycjr/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Zcwycjr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Zcwycjr g = zcwycjrService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setAddress(t.getAddress());
			g.setCjlb(t.getCjlb());
			g.setCjzh(t.getCjzh());
			g.setZyqk(t.getZyqk());
			g.setUpdateDate(new Date());
			zcwycjrService.update(g);
		}
		return "redirect:/zcwycjr/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Zcwycjr g = zcwycjrService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			zcwycjrService.delete(id);
		}
		return "redirect:/zcwycjr/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/zcwycjr/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(zcwycjrService.getObjList(current,
				businessForm), zcwycjrService.getObjCount(businessForm),
				current));
		return "/business/zcwycjr/check";
	}
}
