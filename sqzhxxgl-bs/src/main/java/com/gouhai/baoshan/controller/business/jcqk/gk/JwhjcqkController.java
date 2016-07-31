package com.gouhai.baoshan.controller.business.jcqk.gk;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Jwhjcqk;
import com.gouhai.baoshan.service.business.jcqk.gk.JwhjcqkService;

/**
 * 居委会基础情况 Controller Entity:Jwhjcqk
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/jwhjcqk")
public class JwhjcqkController extends BusinessFormController {
	@Autowired
	private JwhjcqkService jwhjcqkService;
	public JwhjcqkController()
	{
		super("jwhjcqk");
	}

	public void setJwhjcqkService(JwhjcqkService jwhjcqkService) {
		this.jwhjcqkService = jwhjcqkService;
	}

	// 初始化时间
	@InitBinder
	// Jwhjcqk
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/jwhjcqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(jwhjcqkService.getLzzList(current,
				businessForm), jwhjcqkService.getLzzCount(businessForm),
				current));
		return "/business/jwhjcqk/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/jwhjcqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Jwhjcqk jwhjcqk, String businessFormId) {
		updateBusinessForm(businessFormId);
		jwhjcqk.setBusinessForm(new BusinessForm(businessFormId));
		jwhjcqkService.insert(jwhjcqk);
		return "redirect:/jwhjcqk/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		jwhjcqkService.delete(id);
		return "redirect:/jwhjcqk/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("jwhjcqk", jwhjcqkService.findOne(id));
		return "/business/jwhjcqk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Jwhjcqk jwhjcqk, String businessFormId) {
		updateBusinessForm(businessFormId);
		Jwhjcqk d = jwhjcqkService.findOne(jwhjcqk.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setUpdateDate(new Date());
			d.setLjxf(jwhjcqk.getLjxf());
			d.setGgcs(jwhjcqk.getGgcs());
			d.setJkxcl(jwhjcqk.getJkxcl());
			d.setLsjtjdj(jwhjcqk.getLsjtjdj());
			d.setLsjtjdjbl(jwhjcqk.getLsjtjdjbl());
			d.setLsjtqg(jwhjcqk.getLsjtqg());
			d.setLsjtqgbl(jwhjcqk.getLsjtqgbl());
			d.setLsjtqj(jwhjcqk.getLsjtqj());
			d.setLsjtqjbl(jwhjcqk.getLsjtqjbl());
			d.setLsjtsj(jwhjcqk.getLsjtsj());
			d.setLsjtsjbl(jwhjcqk.getLsjtsjbl());
			d.setPajtjdj(jwhjcqk.getPajtjdj());
			d.setPajtjdjbl(jwhjcqk.getPajtjdjbl());
			d.setPajtqg(jwhjcqk.getPajtqg());
			d.setPajtqgbl(jwhjcqk.getPajtqgbl());
			d.setPajtqj(jwhjcqk.getPajtqj());
			d.setPajtqjbl(jwhjcqk.getPajtqjbl());
			d.setPajtsj(jwhjcqk.getPajtsj());
			d.setPajtsjbl(jwhjcqk.getPajtsjbl());
			d.setQzxfxcls(jwhjcqk.getQzxfxcls());
			d.setSxfhs(jwhjcqk.getSxfhs());
			d.setWhwmjtjdj(jwhjcqk.getWhwmjtjdj());
			d.setWhwmjtjdjbl(jwhjcqk.getWhwmjtjdjbl());
			d.setWhwmjtqg(jwhjcqk.getWhwmjtqg());
			d.setWhwmjtqgbl(jwhjcqk.getWhwmjtqgbl());
			d.setWhwmjtqj(jwhjcqk.getWhwmjtqj());
			d.setWhwmjtqjbl(jwhjcqk.getWhwmjtqjbl());
			d.setWhwmjtsj(jwhjcqk.getWhwmjtsj());
			d.setWhwmjtsjbl(jwhjcqk.getWhwmjtsjbl());
			d.setXwg(jwhjcqk.getXwg());
			d.setXxxjtjdj(jwhjcqk.getXxxjtjdj());
			d.setXxxjtjdjbl(jwhjcqk.getXxxjtjdjbl());
			d.setXxxjtqg(jwhjcqk.getXxxjtqg());
			d.setXxxjtqgbl(jwhjcqk.getXxxjtqgbl());
			d.setXxxjtqj(jwhjcqk.getXxxjtqj());
			d.setXxxjtqjbl(jwhjcqk.getXxxjtqjbl());
			d.setXxxjtsj(jwhjcqk.getXxxjtsj());
			d.setXxxjtsjbl(jwhjcqk.getXxxjtsjbl());
			
			d.setWygsgs(jwhjcqk.getWygsgs());
			d.setWygsmc(jwhjcqk.getWygsmc());
			d.setBags(jwhjcqk.getBags());
			d.setJwhbgyfmj(jwhjcqk.getJwhbgyfmj());
			d.setHdsmj(jwhjcqk.getHdsmj());
			d.setXqzdmj(jwhjcqk.getXqzdmj());
			d.setFwjzmj(jwhjcqk.getFwjzmj());
			d.setLhmj(jwhjcqk.getLhmj());
			d.setJmzzxq(jwhjcqk.getJmzzxq());
			d.setZzl(jwhjcqk.getZzl());
			d.setXqlds(jwhjcqk.getXqlds());
			d.setMld(jwhjcqk.getMld());
			d.setXqdw(jwhjcqk.getXqdw());
			d.setGjqydw(jwhjcqk.getGjqydw());
			d.setWmls(jwhjcqk.getWmls());
			d.setSjwmls(jwhjcqk.getSjwmls());
			d.setQjwmls(jwhjcqk.getQjwmls());
			d.setJdjwmls(jwhjcqk.getJdjwmls());
			
			d.setLxxm(jwhjcqk.getLxxm());
			d.setLxdh(jwhjcqk.getLxdh());
			
			jwhjcqkService.update(d);
		}

		return "redirect:/jwhjcqk/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/jwhjcqk/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(jwhjcqkService.getLzzList(current,
				businessForm), jwhjcqkService.getLzzCount(businessForm),
				current));
		return "/business/jwhjcqk/check";
	}
}