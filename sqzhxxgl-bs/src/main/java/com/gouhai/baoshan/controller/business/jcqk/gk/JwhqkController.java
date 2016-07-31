package com.gouhai.baoshan.controller.business.jcqk.gk;

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
import com.gouhai.baoshan.entity.business.jcqk.gk.Jwhqk;
import com.gouhai.baoshan.service.business.jcqk.gk.JwhqkService;

/**
 * 居委会情况 Controller entity:Jwhqk
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/jwhqk")
public class JwhqkController extends BusinessFormController {
	@Autowired
	private JwhqkService jwhqkService;

	public JwhqkController() {
		super("jwhqk");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jwhqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jwhqkService.getLzzList(current,
						businessForm), jwhqkService.getLzzCount(businessForm),
						current));
		return "/business/jwhqk/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jwhqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Jwhqk jwhqk, String businessFormId) {
		jwhqk.setBusinessForm(new BusinessForm(businessFormId));
		jwhqkService.insert(jwhqk);
		return "redirect:/jwhqk/item/1/" + businessFormId;

	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		Jwhqk g = jwhqkService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			jwhqkService.delete(id);
		}
		return "redirect:/jwhqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,@PathVariable() String businessFormId) {

		model.addAttribute("jwhqk", jwhqkService.findOne(id));
		return "/business/jwhqk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jwhqk jwhqk, String businessFormId) {
		if (!SecurityUtils.getSubject().isPermitted("jwhqk:update")) {
			return "/error/unauthority";
		}
		Jwhqk g = jwhqkService.findOne(jwhqk.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setJwhqc(jwhqk.getJwhqc());
			g.setDzbclrq(jwhqk.getDzbclrq());
			g.setJwhclrq(jwhqk.getJwhclrq());
			g.setDzbrs(jwhqk.getDzbrs());
			g.setDzbsj(jwhqk.getDzbsj());
			g.setDzbfsj(jwhqk.getDzbfsj());
			g.setDzbwy(jwhqk.getDzbwy());
			g.setJwhrs(jwhqk.getJwhrs());
			g.setJwhzr(jwhqk.getJwhzr());
			g.setJwhfzr(jwhqk.getJwhfzr());
			g.setJwhwy(jwhqk.getJwhwy());
			g.setJd(jwhqk.getJd());
			g.setBgdz(jwhqk.getBgdz());
			g.setPhone(jwhqk.getPhone());
			g.setEmall(jwhqk.getEmall());
			g.setCode(jwhqk.getCode());
			g.setUpdateDate(new Date());
			jwhqkService.update(g);
		}

		return "redirect:/jwhqk/item/1/" + businessFormId;
	}
}
