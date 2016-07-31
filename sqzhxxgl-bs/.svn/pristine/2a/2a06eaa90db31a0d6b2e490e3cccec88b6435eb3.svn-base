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
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Cjrhd;
import com.gouhai.baoshan.service.business.ggfw.cjrgz.CjrhdService;

/**
 * 参加残疾人睦邻点活动人员名册 Controller Entity:Cjrhd
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/cjrhd")
public class CjrhdController extends BusinessFormController {
	@Autowired
	private CjrhdService cjrhdService;

	public CjrhdController() {
		super("cjrhd");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cjrhd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAllAttributes(pageResult(cjrhdService.getObjList(current,
						businessForm), cjrhdService.getObjCount(businessForm),
						current));
		return "/business/cjrhd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/cjrhd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Cjrhd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		cjrhdService.insert(t);
		return "redirect:/cjrhd/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("cjrhd", cjrhdService.findOne(id));
		return "/business/cjrhd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cjrhd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Cjrhd g = cjrhdService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setAddress(t.getAddress());
			g.setCjlb(t.getCjlb());
			g.setCjzh(t.getCjzh());
			g.setRemark(t.getRemark());
			g.setUpdateDate(new Date());
			cjrhdService.update(g);
		}
		return "redirect:/cjrhd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Cjrhd g = cjrhdService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			cjrhdService.delete(id);
		}
		return "redirect:/cjrhd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/cjrhd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model
				.addAllAttributes(pageResult(cjrhdService.getObjList(current,
						businessForm), cjrhdService.getObjCount(businessForm),
						current));
		return "/business/cjrhd/check";
	}
}
