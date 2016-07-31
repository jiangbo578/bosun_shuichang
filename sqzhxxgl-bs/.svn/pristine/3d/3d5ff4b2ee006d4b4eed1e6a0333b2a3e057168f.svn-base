package com.gouhai.baoshan.controller.business.ggfw.xxxsq;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.xxxsq.Zdsj;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ggfw.xxxsq.ZdsjService;

/**
 * 52、重大事件记载 Controller Entity:Zdsj
 * 
 * @author 徐舟
 * 
 * 
 */
@Controller
@RequestMapping(value = "/zdsj")
public class ZdsjController extends BusinessFormController {
	@Autowired
	private ZdsjService zdsjService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	public ZdsjController() {
		super("zdsj");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/zdsj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(zdsjService.getObjList(current,
				businessForm), zdsjService.getObjCount(businessForm), current));
		return "/business/zdsj/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/zdsj/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Zdsj t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		zdsjService.insert(t);
		return "redirect:/zdsj/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		zdsjService.delete(id);
		return "redirect:/zdsj/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("zdsj", zdsjService.findOne(id));
		return "/business/zdsj/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Zdsj t, String businessFormId) {
		Zdsj d = zdsjService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {

			d.setBndhjqk(t.getBndhjqk());
			d.setBndsg(t.getBndsg());
			d.setUpdateDate(new Date());
			zdsjService.update(d);
		}

		return "redirect:/zdsj/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/zdsj/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(zdsjService.getObjList(current,
				businessForm), zdsjService.getObjCount(businessForm), current));
		return "/business/zdsj/check";
	}
}
