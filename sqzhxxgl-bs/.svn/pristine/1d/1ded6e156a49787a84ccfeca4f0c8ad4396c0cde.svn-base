package com.gouhai.baoshan.controller.business.dqgz.zb;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dyzyzcjhd;
import com.gouhai.baoshan.service.business.dqgz.zb.DyzyzcjhdService;

/**
 * 党员志愿者参与活动情况 Controller Entity:Dyzyzcjhd
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/dyzyzcjhd")
public class DyzyzcjhdController extends BusinessFormController {
	@Autowired
	private DyzyzcjhdService dyzyzcjhdService;

	public DyzyzcjhdController() {
		super("dyzyzcjhd");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/dyzyzcjhd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(dyzyzcjhdService.getobjList(current,
				businessForm), dyzyzcjhdService.getobjCount(businessForm),
				current));
		return "/business/dyzyzcjhd/item/index";
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
		return "/business/dyzyzcjhd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Dyzyzcjhd t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		dyzyzcjhdService.insert(t);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/dyzyzcjhd/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("dyzyzcjhd", dyzyzcjhdService.findOne(id));
		return "/business/dyzyzcjhd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Dyzyzcjhd t, String businessFormId) {
		Dyzyzcjhd g = dyzyzcjhdService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setZc(t.getZc());
			g.setTcqk(t.getTcqk());
			g.setCjhdcs(t.getCjhdcs());
			g.setXjdc(t.getXjdc());
			g.setRemark(t.getRemark());
			g.setUpdateDate(new Date());
			dyzyzcjhdService.update(g);
			updateBusinessForm(businessFormId);//更新业务
		}
		return "redirect:/dyzyzcjhd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Dyzyzcjhd g = dyzyzcjhdService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			dyzyzcjhdService.delete(id);
			updateBusinessForm(businessFormId);//更新业务
		}
		return "redirect:/dyzyzcjhd/item/1/" + businessFormId;
	}
}
