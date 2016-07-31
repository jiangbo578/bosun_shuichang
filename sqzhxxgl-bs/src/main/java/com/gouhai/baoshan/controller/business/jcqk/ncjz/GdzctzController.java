package com.gouhai.baoshan.controller.business.jcqk.ncjz;

import java.util.Date;
import java.text.SimpleDateFormat;

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
import com.gouhai.baoshan.entity.business.jcqk.ncjz.Gdzctz;
import com.gouhai.baoshan.service.business.jcqk.ncjz.GdzctzService;
/**
 * 固定资产台账 Controller Entity:Gdzctz
 * 
 * @author 固定资产台账
 * 
 */
@Controller
@RequestMapping(value = "/gdzctz")
public class GdzctzController extends BusinessFormController {
	@Autowired
	private GdzctzService gdzctzService;
	public GdzctzController()
	{
		super("gdzctz");
	}

	public void setGdzctzService(GdzctzService gdzctzService) {
		this.gdzctzService = gdzctzService;
	}

	// 初始化时间
	@InitBinder
	// Gdzctz
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/gdzctz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(gdzctzService.getLzzList(current,
				businessForm), gdzctzService.getLzzCount(businessForm),
				current));
		return "/business/gdzctz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/gdzctz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Gdzctz gdzctz, String businessFormId) {
		updateBusinessForm(businessFormId);
		gdzctz.setBusinessForm(new BusinessForm(businessFormId));
		gdzctzService.insert(gdzctz);
		return "redirect:/gdzctz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		gdzctzService.delete(id);
		return "redirect:/gdzctz/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("gdzctz", gdzctzService.findOne(id));
		return "/business/gdzctz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Gdzctz gdzctz, String businessFormId) {
		updateBusinessForm(businessFormId);
		Gdzctz d = gdzctzService.findOne(gdzctz.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setBz(gdzctz.getBz());
			d.setUpdateDate(new Date());
			d.setCfdd(gdzctz.getCfdd());
			d.setDj(gdzctz.getDj());
			d.setDjr(gdzctz.getDjr());
			d.setGgxh(gdzctz.getGgxh());
			d.setJcz(gdzctz.getJcz());
			d.setJczl(gdzctz.getJczl());
			d.setJldw(gdzctz.getJldw());
			d.setJz(gdzctz.getJz());
			d.setKssyrq(gdzctz.getKssyrq());
			d.setLjzj(gdzctz.getLjzj());
			d.setLjzjkm(gdzctz.getLjzjkm());
			d.setRq(gdzctz.getRq());
			d.setSl(gdzctz.getSl());
			d.setSynx(gdzctz.getSynx());
			d.setSyzt(gdzctz.getSyzt());
			d.setYtzjyf(gdzctz.getYtzjyf());
			d.setYz(gdzctz.getYz());
			d.setYzjl(gdzctz.getYzjl());
			d.setZcbh(gdzctz.getZcbh());
			d.setZclb(gdzctz.getZclb());
			d.setZcmc(gdzctz.getZcmc());
			d.setZjdykm(gdzctz.getZjdykm());
			d.setZjfs(gdzctz.getZjfs());
			d.setZjzq(gdzctz.getZjzq());
			d.setZrbm(gdzctz.getZrbm());
			d.setZrr(gdzctz.getZrr());
			d.setZzjfs(gdzctz.getZzjfs());
			d.setYzje(gdzctz.getYzje());
			gdzctzService.update(d);
		}

		return "redirect:/gdzctz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/gdzctz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(gdzctzService.getLzzList(current,
				businessForm), gdzctzService.getLzzCount(businessForm),
				current));
		return "/business/gdzctz/check";
	}
}