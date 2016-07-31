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
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzrypx;
import com.gouhai.baoshan.service.business.ggfw.hszh.HszfwzrypxService;

/**
 * 红十字服务站人员培训名册 Controller Entity:Hszfwzrypx
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/hszfwzrypx")
public class HszfwzrypxController extends BusinessFormController {
	@Autowired
	private HszfwzrypxService hszfwzrypxService;

	public HszfwzrypxController() {
		super("hszfwzrypx");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/hszfwzrypx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(hszfwzrypxService.getObjList(current,
				businessForm), hszfwzrypxService.getObjCount(businessForm),
				current));
		return "/business/hszfwzrypx/item/index";
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
		return "/business/hszfwzrypx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Hszfwzrypx t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		hszfwzrypxService.insert(t);
		return "redirect:/hszfwzrypx/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("hszfwzrypx", hszfwzrypxService.findOne(id));
		return "/business/hszfwzrypx/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Hszfwzrypx t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzrypx g = hszfwzrypxService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setAddress(t.getAddress());
			g.setPhone(t.getPhone());
			g.setBz(t.getBz());
			g.setGzdw(t.getGzdw());
			g.setPxsj(t.getPxsj());
			g.setUpdateDate(new Date());
			hszfwzrypxService.update(g);
		}
		return "redirect:/hszfwzrypx/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzrypx g = hszfwzrypxService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			hszfwzrypxService.delete(id);
		}
		return "redirect:/hszfwzrypx/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/hszfwzrypx/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(hszfwzrypxService.getObjList(current,
				businessForm), hszfwzrypxService.getObjCount(businessForm),
				current));
		return "/business/hszfwzrypx/check";
	}
}
