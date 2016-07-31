package com.gouhai.baoshan.controller.business.ggfw.shjz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.shjz.Fwnd;
import com.gouhai.baoshan.service.business.ggfw.shjz.FwndService;

/**
 * 公益性社区服务劳动参加对象汇总表 Controller Entity:Fwnd
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/fwnd")
public class FwndController extends BusinessFormController {
	@Autowired
	private FwndService fwndService;

	public FwndController() {
		super("fwnd");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/fwnd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(fwndService.getObjList(current,
				businessForm), fwndService.getObjCount(businessForm), current));
		return "/business/fwnd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/fwnd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Fwnd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		fwndService.insert(t);
		return "redirect:/fwnd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		fwndService.delete(id);
		return "redirect:/fwnd/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("fwnd", fwndService.findOne(id));
		return "/business/fwnd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Fwnd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Fwnd d = fwndService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setName(t.getName());
			d.setAddress(t.getAddress());
			d.setPhone(t.getPhone());
			d.setRemark(t.getRemark());
			d.setUpdateDate(new Date());
			fwndService.update(d);
		}

		return "redirect:/fwnd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/fwnd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(fwndService.getObjList(current,
				businessForm), fwndService.getObjCount(businessForm), current));
		return "/business/fwnd/check";
	}

}
