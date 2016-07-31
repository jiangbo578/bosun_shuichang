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
import com.gouhai.baoshan.entity.business.dqgz.zb.Kzdyzyz;
import com.gouhai.baoshan.service.business.dqgz.zb.KzdyzyzService;

/**
 * 开展党员志愿者服务活动情况 Controller Entity:Kzdyzyz
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/kzdyzyz")
public class KzdyzyzController extends BusinessFormController {
	@Autowired
	private KzdyzyzService kzdyzyzService;

	public KzdyzyzController() {
		super("kzdyzyz");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/kzdyzyz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);

		model.addAllAttributes(pageResult(kzdyzyzService.getobjList(current,
				businessForm), kzdyzyzService.getobjCount(businessForm),
				current));
		return "/business/kzdyzyz/item/index";
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
		return "/business/kzdyzyz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Kzdyzyz t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		kzdyzyzService.insert(t);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/kzdyzyz/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("kzdyzyz", kzdyzyzService.findOne(id));
		return "/business/kzdyzyz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Kzdyzyz t, String businessFormId) {
		Kzdyzyz g = kzdyzyzService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setHdzt(t.getHdzt());
			g.setHdsj(t.getHdsj());
			g.setCjrs(t.getCjrs());
			g.setRemark(t.getRemark());
			g.setUpdateDate(new Date());
			kzdyzyzService.update(g);
			updateBusinessForm(businessFormId);//更新业务表
		}
		return "redirect:/kzdyzyz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Kzdyzyz g = kzdyzyzService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			kzdyzyzService.delete(id);
			updateBusinessForm(businessFormId);//更新业务表
		}
		return "redirect:/kzdyzyz/item/1/" + businessFormId;
	}
}
