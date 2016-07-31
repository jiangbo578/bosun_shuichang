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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Jwhcy;
import com.gouhai.baoshan.service.business.jcqk.rymd.JwhcyService;

/**
 * 村,居委会成员名单 Controller entity:Jwhcy
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/jwhcy")
public class JwhcyController extends BusinessFormController {
	@Autowired
	private JwhcyService jwhcyService;

	public JwhcyController() {
		super("jwhcy");
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
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(
				jwhcyService.getLzzList(current, businessForm),
				jwhcyService.getLzzCount(businessForm), current));
		return "/business/jwhcy/item/index";
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
		return "/business/jwhcy/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Jwhcy jwhcy, String businessFormId) {
		jwhcy.setBusinessForm(new BusinessForm(businessFormId));
		jwhcyService.insert(jwhcy);
		return "redirect:/jwhcy/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jwhcy", jwhcyService.findOne(id));
		return "/business/jwhcy/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jwhcy jwhcy, String businessFormId) {
		Jwhcy j = jwhcyService.findOne(jwhcy.getId());
		if (j.getBusinessForm().getId().equals(businessFormId)) {
			j.setAddress(jwhcy.getAddress());
			j.setBirthday(jwhcy.getBirthday());
			j.setDegree(jwhcy.getDegree());
			j.setName(jwhcy.getName());
			j.setPhone(jwhcy.getPhone());
			j.setRemark(jwhcy.getRemark());
			j.setRole(jwhcy.getRole());
			j.setSex(jwhcy.getSex());
			j.setStatus(jwhcy.getStatus());
			j.setShudihua(jwhcy.getShudihua());
			j.setUpdateDate(new Date());
			jwhcyService.update(j);
		}
		return "redirect:/jwhcy/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Jwhcy j = jwhcyService.findOne(id);
		if (j.getBusinessForm().getId().equals(businessFormId)) {
			jwhcyService.delete(id);
		}
		return "redirect:/jwhcy/item/1/" + businessFormId;
	}
}
