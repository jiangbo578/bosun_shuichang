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
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzbk;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ggfw.hszh.HszfwzbkService;

/**
 * 红十字服务站帮困救助情况记录 Controller Entity:Hszfwzbk
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/hszfwzbk")
public class HszfwzbkController extends BusinessFormController {
	@Autowired
	private HszfwzbkService hszfwzbkService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	public HszfwzbkController() {
		super("hszfwzbk");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/hszfwzbk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(hszfwzbkService.getObjList(current,
				businessForm), hszfwzbkService.getObjCount(businessForm),
				current));
		return "/business/hszfwzbk/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/hszfwzbk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Hszfwzbk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		hszfwzbkService.insert(t);
		return "redirect:/hszfwzbk/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("hszfwzbk", hszfwzbkService.findOne(id));
		return "/business/hszfwzbk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Hszfwzbk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzbk g = hszfwzbkService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setAddress(t.getAddress());
			g.setPhone(t.getPhone());
			g.setKnqk(t.getKnqk());
			g.setBkjr(t.getBkjr());
			g.setBz(t.getBz());
			g.setUpdateDate(new Date());
			hszfwzbkService.update(g);
		}
		return "redirect:/hszfwzbk/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzbk g = hszfwzbkService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			hszfwzbkService.delete(id);
		}
		return "redirect:/hszfwzbk/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/hszfwzbk/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(hszfwzbkService.getObjList(current,
				businessForm), hszfwzbkService.getObjCount(businessForm),
				current));
		return "/business/hszfwzbk/check";
	}
}
