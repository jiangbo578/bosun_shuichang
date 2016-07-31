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
import com.gouhai.baoshan.entity.business.dqgz.zb.Rdsqr;
import com.gouhai.baoshan.service.business.dqgz.zb.RdsqrService;

/**
 * 年度发展党员:入党申请人 control entit：Rdsqr
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/rdsqr")
public class RdsqrController extends BusinessFormController {
	@Autowired
	private RdsqrService rdsqrService;

	public RdsqrController() {
		super("rdsqr");
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

	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/rdsqr/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);

		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(rdsqrService.getLzzList(current,
						businessForm), rdsqrService.getLzzCount(businessForm),
						current));
		return "/business/rdsqr/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/rdsqr/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Rdsqr rdsqr, String businessFormId) {
		rdsqr.setBusinessForm(new BusinessForm(businessFormId));
		rdsqrService.insert(rdsqr);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/rdsqr/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		rdsqrService.delete(id);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/rdsqr/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("rdsqr", rdsqrService.findOne(id));
		return "/business/rdsqr/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Rdsqr rdsqr, String businessFormId) {
		Rdsqr d = rdsqrService.findOne(rdsqr.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setName(rdsqr.getName());
			d.setSex(rdsqr.getSex());
			d.setMz(rdsqr.getMz());
			d.setBirthday(rdsqr.getBirthday());
			d.setWhcd(rdsqr.getWhcd());
			d.setSqrdsj(rdsqr.getSqrdsj());
			d.setAddress(rdsqr.getAddress());
			d.setRemark(rdsqr.getRemark());
			d.setUpdateDate(new Date());
			rdsqrService.update(d);
			updateBusinessForm(businessFormId);//更新业务表
		}

		return "redirect:/rdsqr/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/rdsqr/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(rdsqrService.getLzzList(current,
						businessForm), rdsqrService.getLzzCount(businessForm),
						current));
		return "/business/rdsqr/check";
	}

}
