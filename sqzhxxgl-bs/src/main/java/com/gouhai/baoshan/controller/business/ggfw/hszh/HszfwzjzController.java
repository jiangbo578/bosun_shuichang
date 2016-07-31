package com.gouhai.baoshan.controller.business.ggfw.hszh;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzjz;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ggfw.hszh.HszfwzjzService;

/**
 * 红十字服务站救灾联络员名册 Controller Entity:Hszfwzjz
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/hszfwzjz")
public class HszfwzjzController extends BusinessFormController {
	@Autowired
	private HszfwzjzService hszfwzjzService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	public HszfwzjzController() {
		super("hszfwzjz");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/hszfwzjz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(hszfwzjzService.getObjList(current,
				businessForm), hszfwzjzService.getObjCount(businessForm),
				current));
		return "/business/hszfwzjz/item/index";
	}


	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/hszfwzjz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Hszfwzjz t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		hszfwzjzService.insert(t);
		return "redirect:/hszfwzjz/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("hszfwzjz", hszfwzjzService.findOne(id));
		return "/business/hszfwzjz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Hszfwzjz t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzjz g = hszfwzjzService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setAddress(t.getAddress());
			g.setPhone(t.getPhone());
			g.setBz(t.getBz());
			g.setGzdw(t.getGzdw());
			g.setUpdateDate(new Date());
			hszfwzjzService.update(g);
		}
		return "redirect:/hszfwzjz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzjz g = hszfwzjzService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			hszfwzjzService.delete(id);
		}
		return "redirect:/hszfwzjz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/hszfwzjz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(hszfwzjzService.getObjList(current,
				businessForm), hszfwzjzService.getObjCount(businessForm),
				current));
		return "/business/hszfwzjz/check";
	}

}
