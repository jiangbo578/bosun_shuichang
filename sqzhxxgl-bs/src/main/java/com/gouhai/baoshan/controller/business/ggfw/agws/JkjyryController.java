package com.gouhai.baoshan.controller.business.ggfw.agws;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Jkjyry;
import com.gouhai.baoshan.service.business.ggfw.agws.JkjyryService;

/**
 * 生干部、健康教育专兼职人员 Controller Entity：Jkjyry
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/jkjyry")
public class JkjyryController extends BusinessFormController {
	@Autowired
	private JkjyryService jkjyryService;

	public JkjyryController() {
		super("jkjyry");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jkjyry/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jkjyryService.getObjList(current,
						businessForm), jkjyryService.getObjCount(businessForm),
						current));
		return "/business/jkjyry/item/index";
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
		return "/business/jkjyry/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Jkjyry t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		jkjyryService.insert(t);
		return "redirect:/jkjyry/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jkjyry", jkjyryService.findOne(id));
		return "/business/jkjyry/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jkjyry t, String businessFormId) {
		Jkjyry g = jkjyryService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setAge(t.getAge());
			g.setXl(t.getXl());
			g.setDw(t.getDw());
			g.setUpdateDate(new Date());
			jkjyryService.update(g);
		}
		return "redirect:/jkjyry/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Jkjyry g = jkjyryService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			jkjyryService.delete(id);
		}
		return "redirect:/jkjyry/item/1/" + businessFormId;
	}
}
