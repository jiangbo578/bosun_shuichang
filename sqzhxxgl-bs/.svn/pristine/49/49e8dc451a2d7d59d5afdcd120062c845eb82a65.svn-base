package com.gouhai.baoshan.controller.business.shgl.xfgz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xfanwgh;
import com.gouhai.baoshan.service.business.shgl.xfgz.XfanwghService;

@Controller
@RequestMapping(value = "/xfanwgh")
public class XfanwghController extends BusinessFormController {
	@Autowired
	private XfanwghService xfanwghService;

	public XfanwghController() {
		super("xfanwgh");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/xfanwgh/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				xfanwghService.getObjList(current, businessForm),
				xfanwghService.getObjCount(businessForm), current));
		return "/business/xfanwgh/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/xfanwgh/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Xfanwgh t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		xfanwghService.insert(t);
		return "redirect:/xfanwgh/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		xfanwghService.delete(id);
		return "redirect:/xfanwgh/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("xfanwgh", xfanwghService.findOne(id));
		return "/business/xfanwgh/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Xfanwgh t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Xfanwgh d = xfanwghService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setJwhzrxm(t.getJwhzrxm());
			d.setJwhfzrxm(t.getJwhfzrxm());
			d.setWygsjlxm(t.getWygsjlxm());
			d.setWygsmc(t.getWygsmc());
			d.setWyxqmc(t.getWyxqmc());
			d.setLzzxm(t.getLzzxm());
			d.setLzzxqmc(t.getLzzxqmc());
			d.setJml(t.getJml());
			d.setCmxzzxm(t.getCmxzzxm());
			d.setCmxqmc(t.getCmxqmc());
			d.setCmjml(t.getCmjml());
			d.setUpdateDate(new Date());
			xfanwghService.update(d);
		}

		return "redirect:/xfanwgh/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/xfanwgh/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(
				xfanwghService.getObjList(current, businessForm),
				xfanwghService.getObjCount(businessForm), current));
		return "/business/xfanwgh/check";
	}
}
