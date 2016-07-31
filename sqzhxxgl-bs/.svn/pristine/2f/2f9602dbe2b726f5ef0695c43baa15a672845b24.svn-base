package com.gouhai.baoshan.controller.business.dqgz.zb;

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
import com.gouhai.baoshan.entity.business.dqgz.zb.Ndfzdx;
import com.gouhai.baoshan.service.business.dqgz.zb.NdfzdxService;

/**
 * 年度发展对象 Controller entity：Ndfzdx
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/ndfzdx")
public class NdfzdxController extends BusinessFormController {
	@Autowired
	private NdfzdxService ndfzdxService;

	public NdfzdxController() {
		super("ndfzdx");
	}

	// 初始化时间
	@InitBinder
	// zrsj
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "birthday",
				new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(Date.class, "sqrdsj", new CustomDateEditor(
				dateFormat, true));
		binder.registerCustomEditor(Date.class, "jjfzsj", new CustomDateEditor(
				dateFormat, true));
		binder.registerCustomEditor(Date.class, "pxsj", new CustomDateEditor(
				dateFormat, true));
		binder.registerCustomEditor(Date.class, "fzsj", new CustomDateEditor(
				dateFormat, true));


	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/ndfzdx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(ndfzdxService.getLzzList(current,
						businessForm), ndfzdxService.getLzzCount(businessForm),
						current));
		return "/business/ndfzdx/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/ndfzdx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Ndfzdx obj, String businessFormId) {
		obj.setBusinessForm(new BusinessForm(businessFormId));
		ndfzdxService.insert(obj);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/ndfzdx/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		ndfzdxService.delete(id);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/ndfzdx/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("ndfzdx", ndfzdxService.findOne(id));
		return "/business/ndfzdx/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Ndfzdx obj, String businessFormId) {
		Ndfzdx d = ndfzdxService.findOne(obj.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setName(obj.getName());
			d.setSex(obj.getSex());
			d.setMz(obj.getMz());
			d.setBirthday(obj.getBirthday());
			d.setWhcd(obj.getWhcd());
			d.setSqrdsj(obj.getSqrdsj());
			d.setAddress(obj.getAddress());
			d.setPxsj(obj.getPxsj());
			d.setJjfzsj(obj.getJjfzsj());
			d.setPxlxr(obj.getPxlxr());
			d.setFzsj(obj.getFzsj());
			d.setPxsj(obj.getPxsj());
			d.setUpdateDate(new Date());
			ndfzdxService.update(d);
			updateBusinessForm(businessFormId);//更新业务表
		}

		return "redirect:/ndfzdx/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/ndfzdx/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(ndfzdxService.getLzzList(current,
						businessForm), ndfzdxService.getLzzCount(businessForm),
						current));
		return "/business/ndfzdx/check";
	}
}
