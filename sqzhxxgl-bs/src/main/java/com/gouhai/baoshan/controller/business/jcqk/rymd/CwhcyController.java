package com.gouhai.baoshan.controller.business.jcqk.rymd;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Cwhcy;
import com.gouhai.baoshan.service.business.jcqk.rymd.CwhcyService;

/**
 * 村委会成员名单 Controller entity:Jwhcy
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/cwhcy")
public class CwhcyController extends BusinessFormController {
	@Autowired
	private CwhcyService cwhcyService;

	public CwhcyController() {
		super("cwhcy");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jwhcy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cwhcyService.getLzzList(current,
						businessForm), cwhcyService.getLzzCount(businessForm),
						current));
		return "/business/cwhcy/item/index";
	}

	// 初始化转换日期
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "birthday",
				new CustomDateEditor(dateFormat, true));
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/cwhcy/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Cwhcy cwhcy, String businessFormId) {
		cwhcy.setBusinessForm(new BusinessForm(businessFormId));
		cwhcyService.insert(cwhcy);
		return "redirect:/cwhcy/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("cwhcy", cwhcyService.findOne(id));
		return "/business/cwhcy/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cwhcy cwhcy, String businessFormId) {
		Cwhcy j = cwhcyService.findOne(cwhcy.getId());
		if (j.getBusinessForm().getId().equals(businessFormId)) {
			j.setAddress(cwhcy.getAddress());
			j.setBirthday(cwhcy.getBirthday());
			j.setDegree(cwhcy.getDegree());
			j.setName(cwhcy.getName());
			j.setPhone(cwhcy.getPhone());
			j.setRemark(cwhcy.getRemark());
			j.setRole(cwhcy.getRole());
			j.setSex(cwhcy.getSex());
			j.setStatus(cwhcy.getStatus());
			j.setUpdateDate(new Date());
			cwhcyService.update(j);
		}
		return "redirect:/cwhcy/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Cwhcy j = cwhcyService.findOne(id);
		if (j.getBusinessForm().getId().equals(businessFormId)) {
			cwhcyService.delete(id);
		}
		return "redirect:/cwhcy/item/1/" + businessFormId;
	}
}
