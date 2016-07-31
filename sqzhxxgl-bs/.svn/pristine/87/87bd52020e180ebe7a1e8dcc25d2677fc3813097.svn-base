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
import com.gouhai.baoshan.entity.business.ggfw.llgz.Tklr;
import com.gouhai.baoshan.service.business.ggfw.llgz.TklrService;

/**
 * 特困老人名册 Controller Entity:Tklr
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/tklr")
public class TklrController extends BusinessFormController {
	@Autowired
	private TklrService tklrService;

	public TklrController() {
		super("tklr");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/tklr/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tklrService.getObjList(current,
				businessForm), tklrService.getObjCount(businessForm), current));
		return "/business/tklr/item/index";
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
		return "/business/tklr/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Tklr t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		tklrService.insert(t);
		return "redirect:/tklr/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("tklr", tklrService.findOne(id));
		return "/business/tklr/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tklr t, String businessFormId) {
		Tklr g = tklrService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setAge(t.getAge());
			g.setKnqk(t.getKnqk());
			g.setRemark(t.getRemark());
			g.setUpdateDate(new Date());
			tklrService.update(g);
		}
		return "redirect:/tklr/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Tklr g = tklrService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			tklrService.delete(id);
		}
		return "redirect:/tklr/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/tklr/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(tklrService.getObjList(current,
				businessForm), tklrService.getObjCount(businessForm), current));
		return "/business/tklr/check";
	}
}
