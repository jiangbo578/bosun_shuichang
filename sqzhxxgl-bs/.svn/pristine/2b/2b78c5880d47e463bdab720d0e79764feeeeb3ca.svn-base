package com.gouhai.baoshan.controller.business.dqgz.shzz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.shzz.Qzhdtd;
import com.gouhai.baoshan.service.business.dqgz.shzz.QzhdtdService;

/**
 * 上海市嘉定区社区群众活动团队备案表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/qzhdtd")
public class QzhdtdController extends BusinessFormController {
	@Autowired
	private QzhdtdService qzhdtdService;

	public QzhdtdController() {
		super("qzhdtd");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/qzhdtd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model
				.addAllAttributes(pageResult(qzhdtdService.getObjList(current,
						businessForm), qzhdtdService.getObjCount(businessForm),
						current));
		return "/business/qzhdtd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/qzhdtd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Qzhdtd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		qzhdtdService.insert(t);
		return "redirect:/qzhdtd/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("qzhdtd", qzhdtdService.findOne(id));
		return "/business/qzhdtd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Qzhdtd t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Qzhdtd g = qzhdtdService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setQtmc(t.getQtmc());
			g.setSssq(t.getSssq());
			g.setClsj(t.getClsj());
			g.setHddz(t.getHddz());
			g.setHdnr(t.getHdnr());
			g.setHdsj(t.getHdsj());
			g.setMzhdcs(t.getMzhdcs());
			g.setCjrs(t.getCjrs());
			g.setDyrs(t.getDyrs());
			g.setFzrxb(t.getFzrxb());
			g.setFzrxm(t.getFzrxm());
			g.setFzrnl(t.getFzrnl());
			g.setFzrzzmm(t.getFzrzzmm());
			g.setFzrjtzz(t.getFzrjtzz());
			g.setFzrgzdw(t.getFzrgzdw());
			g.setFzrlxdh(t.getFzrlxdh());
			g.setWpqk(t.getWpqk());
			g.setZdyxm(t.getZdyxm());
			g.setZdyxb(t.getZdyxb());
			g.setZdynl(t.getZdynl());
			g.setZdygzdw(t.getZdygzdw());
			g.setDzz(t.getDzz());
			g.setZdylxdh(t.getZdylxdh());
			g.setSqbayj(t.getSqbayj());
			g.setBnny(t.getBnny());
			g.setShyj(t.getShyj());
			g.setShyjny(t.getShyjny());
			g.setUpdateDate(new Date());
			qzhdtdService.update(g);
		}
		return "redirect:/qzhdtd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Qzhdtd g = qzhdtdService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			qzhdtdService.delete(id);
		}
		return "redirect:/qzhdtd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/qzhdtd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(qzhdtdService.getObjList(current,
						businessForm), qzhdtdService.getObjCount(businessForm),
						current));
		return "/business/qzhdtd/check";
	}
}
