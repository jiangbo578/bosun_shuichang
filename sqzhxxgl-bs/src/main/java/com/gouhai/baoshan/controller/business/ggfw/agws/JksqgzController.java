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
import com.gouhai.baoshan.entity.business.ggfw.agws.Jksqgz;
import com.gouhai.baoshan.service.business.ggfw.agws.JksqgzService;

/**
 * 健康社区工作统计表 Controller Entity:Jksqgz
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/jksqgz")
public class JksqgzController extends BusinessFormController {
	@Autowired
	private JksqgzService jksqgzService;

	public JksqgzController() {
		super("jksqgz");
	}

	// 查询
	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jksqgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jksqgzService.getObjList(current,
						businessForm), jksqgzService.getObjCount(businessForm),
						current));
		return "/business/jksqgz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jksqgz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Jksqgz t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		jksqgzService.insert(t);
		return "redirect:/jksqgz/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jksqgz", jksqgzService.findOne(id));
		return "/business/jksqgz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jksqgz t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jksqgz g = jksqgzService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setJkrcs(t.getJkrcs());
			g.setJkrrs(t.getJkrrs());
			g.setJkrfs(t.getJkrfs());
			g.setJkrsl(t.getJkrsl());
			g.setLsgs(t.getLsgs());
			g.setLszgs(t.getLszgs());
			g.setKzdws(t.getKzdws());
			g.setKzzgs(t.getKzzgs());
			g.setJkts(t.getJkts());
			g.setJkcd(t.getJkcd());
			g.setJkzs(t.getJkzs());
			g.setJkzc(t.getJkzc());
			g.setJkhd(t.getJkhd());
			g.setJkjzcs(t.getJkjzcs());
			g.setJkjzrs(t.getJkjzrs());
			g.setJsjt(t.getJsjt());
			g.setJsdws(t.getJsdws());
			g.setUpdateDate(new Date());
			jksqgzService.update(g);
		}
		return "redirect:/jksqgz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Jksqgz g = jksqgzService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);
			jksqgzService.delete(id);
		}
		return "redirect:/jksqgz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jksqgz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jksqgzService.getObjList(current,
						businessForm), jksqgzService.getObjCount(businessForm),
						current));
		return "/business/jksqgz/check";
	}

}
