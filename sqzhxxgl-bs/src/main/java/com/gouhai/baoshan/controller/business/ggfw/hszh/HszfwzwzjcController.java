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
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzwzjc;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ggfw.hszh.HszfwzwzjcService;

/**
 * 红十字服务站物资出借明细 Controller Entity:Hszfwzwzjc
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/hszfwzwzjc")
public class HszfwzwzjcController extends BusinessFormController {
	@Autowired
	private HszfwzwzjcService hszfwzwzjcService;
	@Autowired
	private BusinessFormService businessFormService; // 添加表单
	public HszfwzwzjcController() {
		super("hszfwzwzjc");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/hszfwzwzjc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(hszfwzwzjcService.getObjList(current,
				businessForm), hszfwzwzjcService.getObjCount(businessForm),
				current));
		return "/business/hszfwzwzjc/item/index";
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
		return "/business/hszfwzwzjc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Hszfwzwzjc t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		hszfwzwzjcService.insert(t);
		return "redirect:/hszfwzwzjc/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("hszfwzwzjc", hszfwzwzjcService.findOne(id));
		return "/business/hszfwzwzjc/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Hszfwzwzjc t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzwzjc g = hszfwzwzjcService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setWzmc(t.getWzmc());
			g.setCjrq(t.getCjrq());
			g.setQm(t.getQm());
			g.setPhone(t.getPhone());
			g.setGhrq(t.getGhrq());
			g.setBz(t.getBz());
			g.setUpdateDate(new Date());
			hszfwzwzjcService.update(g);
		}
		return "redirect:/hszfwzwzjc/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzwzjc g = hszfwzwzjcService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			hszfwzwzjcService.delete(id);
		}
		return "redirect:/hszfwzwzjc/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/hszfwzwzjc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(hszfwzwzjcService.getObjList(current,
				businessForm), hszfwzwzjcService.getObjCount(businessForm),
				current));
		return "/business/hszfwzwzjc/check";
	}

}
