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
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Cjrmd;
import com.gouhai.baoshan.service.business.ggfw.cjrgz.CjrmdService;

/**
 * 残疾人名单
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/cjrmd")
public class CjrmdController extends BusinessFormController {
	@Autowired
	private CjrmdService cjrmdService;

	public CjrmdController() {
		super("cjrmd");
		// TODO Auto-generated constructor stub
	}
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cjrmd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(cjrmdService.getObjList(current,
						businessForm), cjrmdService.getObjCount(businessForm),
						current));
		return "/business/cjrmd/item/index";
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
		return "/business/cjrmd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Cjrmd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		cjrmdService.insert(t);
		return "redirect:/cjrmd/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {
		model.addAttribute("cjrmd", cjrmdService.findOne(id));
		return "/business/cjrmd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cjrmd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Cjrmd g = cjrmdService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setName(t.getName());
			g.setSex(t.getSex());
			g.setBirthday(t.getBirthday());
			g.setAddress(t.getAddress());
			g.setCjlb(t.getCjlb());
			g.setLb(t.getLb());
			g.setRemark(t.getRemark());
			g.setCjzh(t.getCjzh());
			g.setUpdateDate(new Date());
			cjrmdService.update(g);
		}
		return "redirect:/cjrmd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Cjrmd g = cjrmdService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			cjrmdService.delete(id);
		}
		return "redirect:/cjrmd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/cjrmd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cjrmdService.getObjList(current,
						businessForm), cjrmdService.getObjCount(businessForm),
						current));
		return "/business/cjrmd/check";
	}
}
