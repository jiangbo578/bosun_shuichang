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
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzhy;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.ggfw.hszh.HszfwzhyService;

/**
 * 红十字服务站会员名册 Controller Entity:Hszfwzhy
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/hszfwzhy")
public class HszfwzhyController extends BusinessFormController {
	@Autowired
	private HszfwzhyService hszfwzhyService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	public HszfwzhyController() {
		super("hszfwzhy");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/hszfwzhy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(hszfwzhyService.getObjList(current,
				businessForm), hszfwzhyService.getObjCount(businessForm),
				current));
		return "/business/hszfwzhy/item/index";
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
		return "/business/hszfwzhy/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Hszfwzhy t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		hszfwzhyService.insert(t);
		return "redirect:/hszfwzhy/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("hszfwzhy", hszfwzhyService.findOne(id));
		return "/business/hszfwzhy/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Hszfwzhy t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzhy g = hszfwzhyService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setAddress(t.getAddress());
			g.setGzdw(t.getGzdw());
			g.setPhone(t.getPhone());
			g.setDjsj(t.getDjsj());
			g.setRemark(t.getRemark());
			g.setUpdateDate(new Date());
			hszfwzhyService.update(g);
		}
		return "redirect:/hszfwzhy/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Hszfwzhy g = hszfwzhyService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			hszfwzhyService.delete(id);
		}
		return "redirect:/hszfwzhy/item/1/" + businessFormId;
	}
}
