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
import com.gouhai.baoshan.entity.business.ggfw.llgz.Fwssyxm;
import com.gouhai.baoshan.service.business.ggfw.llgz.FwssyxmService;

/**
 * 
 * @author 徐舟 Controller Entity:Fwssyxm
 * 
 */
@Controller
@RequestMapping(value = "/fwssyxm")
public class FwssyxmController extends BusinessFormController {
	@Autowired
	private FwssyxmService fwssyxmService;

	public FwssyxmController() {
		super("fwssyxm");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/fwssyxm/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(fwssyxmService.getObjList(current,
				businessForm), fwssyxmService.getObjCount(businessForm),
				current));
		return "/business/fwssyxm/item/index";
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
		return "/business/fwssyxm/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Fwssyxm t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		fwssyxmService.insert(t);
		return "redirect:/fwssyxm/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("fwssyxm", fwssyxmService.findOne(id));
		return "/business/fwssyxm/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Fwssyxm t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Fwssyxm g = fwssyxmService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setSsmc(t.getSsmc());
			g.setGg(t.getGg());
			g.setXmmc(t.getXmmc());
			g.setNr(t.getNr());
			g.setUpdateDate(new Date());
			fwssyxmService.update(g);
		}
		return "redirect:/fwssyxm/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Fwssyxm g = fwssyxmService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			fwssyxmService.delete(id);
		}
		return "redirect:/fwssyxm/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/fwssyxm/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(fwssyxmService.getObjList(current,
				businessForm), fwssyxmService.getObjCount(businessForm),
				current));
		return "/business/fwssyxm/check";
	}
}
