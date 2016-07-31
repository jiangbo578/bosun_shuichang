package com.gouhai.baoshan.controller.business.shgl.xfzsx;

import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfzsx.Xfzts;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.shgl.xfzsx.XfztsService;

/**
 * 消费者投诉、举报、咨询记录表 Controller Entity:Xfzts
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/xfzts")
public class XfztsController extends BusinessFormController {
	@Autowired
	private XfztsService xfztsService;
	@Autowired
	private BusinessFormService businessFormService; //添加表单
	public XfztsController() {
		super("xfzts");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/xfzts/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(xfztsService.getObjList(current,
						businessForm), xfztsService.getObjCount(businessForm),
						current));
		return "/business/xfzts/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/xfzts/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Xfzts tsjy, String businessFormId) {
		updateBusinessForm(businessFormId);
		tsjy.setBusinessForm(new BusinessForm(businessFormId));
		xfztsService.insert(tsjy);
		return "redirect:/xfzts/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("xfzts", xfztsService.findOne(id));
		return "/business/xfzts/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Xfzts t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Xfzts g = xfztsService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setRq(t.getRq());
			g.setDjbh(t.getDjbh());
			g.setName(t.getName());
			g.setPhone(t.getPhone());
			g.setAddress(t.getAddress());
			g.setDjlx(t.getDjlx());
			g.setJtnr(t.getJtnr());
			g.setZxcljg(t.getZxcljg());
			g.setClr(t.getClr());
			g.setSj(t.getSj());
			g.setYjr(t.getYjr());
			g.setJsr(t.getJsr());
			g.setUpdateDate(new Date());
			xfztsService.update(g);
		}
		return "redirect:/xfzts/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Xfzts g = xfztsService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			xfztsService.delete(id);
		}
		return "redirect:/xfzts/item/1/" + businessFormId;
	}

	// 详情
	@RequestMapping(value = "/item/detail/{id}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable String id) {
		if (!SecurityUtils.getSubject().isPermitted("hyjl:detail")) {
			return "/error/unauthority";
		}
		model.addAttribute("xfzts", xfztsService.findOne(id));
		return "/business/xfzts/item/detail";
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/xfzts/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model
				.addAllAttributes(pageResult(xfztsService.getObjList(current,
						businessForm), xfztsService.getObjCount(businessForm),
						current));
		return "/business/xfzts/check";
	}
}
