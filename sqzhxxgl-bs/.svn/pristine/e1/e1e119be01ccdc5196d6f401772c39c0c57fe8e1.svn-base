package com.gouhai.baoshan.controller.business.ggfw.whtygz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.whtygz.Tyssdj;
import com.gouhai.baoshan.service.business.ggfw.whtygz.TyssdjService;

/**
 * 上海市社区公共体育设施各类人员登记表 Controller Entity：Tyssdj
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/tyssdj")
public class tyssdjController extends BusinessFormController {
	@Autowired
	private TyssdjService tyssdjService;

	public tyssdjController() {
		super("tyssdj");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/tyssdj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(tyssdjService.getObjList(current,
						businessForm), tyssdjService.getObjCount(businessForm),
						current));
		return "/business/tyssdj/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/tyssdj/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Tyssdj t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		tyssdjService.insert(t);
		return "redirect:/tyssdj/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		tyssdjService.delete(id);
		return "redirect:/tyssdj/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("tyssdj", tyssdjService.findOne(id));
		return "/business/tyssdj/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tyssdj t, String businessFormId) {
		Tyssdj d = tyssdjService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);
			d.setRylb(t.getRylb());
			d.setName(t.getName());
			d.setSex(t.getSex());
			d.setRyxz(t.getRyxz());
			d.setTel(t.getTel());
			d.setPhone(t.getPhone());
			d.setUpdateDate(new Date());
			tyssdjService.update(d);
		}

		return "redirect:/tyssdj/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/tyssdj/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tyssdjService.getObjList(current,
						businessForm), tyssdjService.getObjCount(businessForm),
						current));
		return "/business/tyssdj/check";
	}

}
