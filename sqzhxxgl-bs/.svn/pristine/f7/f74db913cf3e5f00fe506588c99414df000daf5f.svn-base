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
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Wycjr;
import com.gouhai.baoshan.service.business.ggfw.cjrgz.WycjrService;

/**
 * 无业残疾人名册 Controller Entity:Wycjr
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/wycjr")
public class WycjrController extends BusinessFormController {
	@Autowired
	private WycjrService wycjrService;

	public WycjrController() {
		super("wycjr");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wycjr/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(wycjrService.getObjList(current,
						businessForm), wycjrService.getObjCount(businessForm),
						current));
		return "/business/wycjr/item/index";
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
		return "/business/wycjr/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Wycjr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		wycjrService.insert(t);
		return "redirect:/wycjr/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		model.addAttribute("wycjr", wycjrService.findOne(id));
		return "/business/wycjr/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wycjr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Wycjr g = wycjrService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setAddress(t.getAddress());
			g.setCjlb(t.getCjlb());
			g.setCjzh(t.getCjzh());
			g.setJynl(t.getJynl());
			g.setUpdateDate(new Date());
			wycjrService.update(g);
		}
		return "redirect:/wycjr/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Wycjr g = wycjrService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			wycjrService.delete(id);
		}
		return "redirect:/wycjr/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/wycjr/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(wycjrService.getObjList(current,
						businessForm), wycjrService.getObjCount(businessForm),
						current));
		return "/business/wycjr/check";
	}
}
