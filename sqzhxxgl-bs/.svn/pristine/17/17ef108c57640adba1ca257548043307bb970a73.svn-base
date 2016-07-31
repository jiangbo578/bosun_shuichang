package com.gouhai.baoshan.controller.business.ggfw.kpgz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.kpgz.Jcxx;
import com.gouhai.baoshan.service.business.ggfw.kpgz.JcxxService;

/**
 * 基础信息
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/jcxx")
public class JcxxController extends BusinessFormController {
	@Autowired
	private JcxxService jcxxService;

	public JcxxController() {
		super("jcxx");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jcxx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jcxxService.getObjList(current,
				businessForm), jcxxService.getObjCount(businessForm), current));
		return "/business/jcxx/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jcxx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Jcxx t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		jcxxService.insert(t);
		return "redirect:/jcxx/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jcxx", jcxxService.findOne(id));
		return "/business/jcxx/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jcxx t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jcxx g = jcxxService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setZzkpry(t.getZzkpry());
			g.setJzkpyr(t.getJzkpyr());
			g.setZyzrs(t.getZyzrs());
			g.setBl(t.getBl());
			g.setHdcs(t.getHdcs());
			g.setSn(t.getSn());
			g.setSw(t.getSw());
			g.setKpxcl(t.getKpxcl());
			g.setGhpl(t.getGhpl());
			g.setKpts(t.getKpts());
			g.setKpgp(t.getKpgp());
			g.setKpzb(t.getKpzb());
			g.setKpzp(t.getKpzp());
			g.setKpsbmc(t.getKpsbmc());
			g.setSl(t.getSl());
			g.setQt(t.getQt());
			g.setZcjf(t.getZcjf());
			g.setBkjf(t.getBkjf());
			g.setNdkpjf(t.getNdkpjf());
			g.setJfbl(t.getJfbl());
			g.setUpdateDate(new Date());
			jcxxService.update(g);
		}
		return "redirect:/jcxx/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Jcxx g = jcxxService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			jcxxService.delete(id);
		}
		return "redirect:/jcxx/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jcxx/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jcxxService.getObjList(current,
				businessForm), jcxxService.getObjCount(businessForm), current));
		return "/business/jcxx/check";
	}
}
