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
import com.gouhai.baoshan.entity.business.ggfw.xxxsq.Jdkhqk;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ggfw.xxxsq.JdkhqkService;

/**
 * 季度考核情况 Conreoller Entity:Jdkhqk
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/jdkhqk")
public class JdkhqkController extends BusinessFormController {
	@Autowired
	private JdkhqkService jdkhqkService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	public JdkhqkController() {
		super("jdkhqk");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jdkhqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jdkhqkService.getObjList(current,
						businessForm), jdkhqkService.getObjCount(businessForm),
						current));
		return "/business/jdkhqk/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jdkhqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Jdkhqk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		jdkhqkService.insert(t);
		return "redirect:/jdkhqk/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		jdkhqkService.delete(id);
		return "redirect:/jdkhqk/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jdkhqk", jdkhqkService.findOne(id));
		return "/business/jdkhqk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jdkhqk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jdkhqk d = jdkhqkService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setJd(t.getJd());
			d.setNr(t.getNr());
			d.setTbr(t.getTbr());
			d.setRq(t.getRq());
			d.setUpdateDate(new Date());
			jdkhqkService.update(d);
		}

		return "redirect:/jdkhqk/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jdkhqk/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jdkhqkService.getObjList(current,
						businessForm), jdkhqkService.getObjCount(businessForm),
						current));
		return "/business/jdkhqk/check";
	}

	
}
