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
import com.gouhai.baoshan.entity.business.jcqk.gk.Cwhjcqk;
import com.gouhai.baoshan.service.business.jcqk.gk.CwhjcqkService;

/**
 * 村委会基础情况 Controller Entity:Cwhjcqk
 * 
 * @author MedivhQ
 * 
 */
@Controller
@RequestMapping(value = "/cwhjcqk")
public class CwhjcqkController extends BusinessFormController {
	@Autowired
	private CwhjcqkService cwhjcqkService;
	public CwhjcqkController()
	{
		super("cwhjcqk");
	}

	public void setCwhjcqkService(CwhjcqkService cwhjcqkService) {
		this.cwhjcqkService = cwhjcqkService;
	}

	// 初始化时间
	@InitBinder
	// Cwhjcqk
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/cwhjcqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(cwhjcqkService.getLzzList(current,
				businessForm), cwhjcqkService.getLzzCount(businessForm),
				current));
		return "/business/cwhjcqk/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/cwhjcqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Cwhjcqk cwhjcqk, String businessFormId) {
		updateBusinessForm(businessFormId);
		cwhjcqk.setBusinessForm(new BusinessForm(businessFormId));
		cwhjcqkService.insert(cwhjcqk);
		return "redirect:/cwhjcqk/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		cwhjcqkService.delete(id);
		return "redirect:/cwhjcqk/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("cwhjcqk", cwhjcqkService.findOne(id));
		return "/business/cwhjcqk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Cwhjcqk cwhjcqk, String businessFormId) {
		updateBusinessForm(businessFormId);
		Cwhjcqk d = cwhjcqkService.findOne(cwhjcqk.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setUpdateDate(new Date());
			d.setCmxzs(cwhjcqk.getCmxzs());
			d.setCwsgbxm(cwhjcqk.getCwsgbxm());
			d.setFgdmj(cwhjcqk.getFgdmj());
			d.setGdmj(cwhjcqk.getGdmj());
			d.setGgcs(cwhjcqk.getGgcs());
			d.setJkxcl(cwhjcqk.getJkxcl());
			d.setKzpzj(cwhjcqk.getKzpzj());
			d.setLdsr(cwhjcqk.getLdsr());
			d.setLjrqj(cwhjcqk.getLjrqj());
			d.setLsjtjdj(cwhjcqk.getLsjtjdj());
			d.setLsjtjdjbl(cwhjcqk.getLsjtjdjbl());
			d.setLsjtqg(cwhjcqk.getLsjtqg());
			d.setLsjtqgbl(cwhjcqk.getLsjtqgbl());
			d.setLsjtqj(cwhjcqk.getLsjtqj());
			d.setLsjtqjbl(cwhjcqk.getLsjtqjbl());
			d.setLsjtsj(cwhjcqk.getLsjtsj());
			d.setLsjtsjbl(cwhjcqk.getLsjtsjbl());
			d.setLxdh(cwhjcqk.getLxdh());
			d.setPajtjdj(cwhjcqk.getPajtjdj());
			d.setPajtjdjbl(cwhjcqk.getPajtjdjbl());
			d.setPajtqg(cwhjcqk.getPajtqg());
			d.setPajtqgbl(cwhjcqk.getPajtqgbl());
			d.setPajtqj(cwhjcqk.getPajtqj());
			d.setPajtqjbl(cwhjcqk.getPajtqjbl());
			d.setPajtsj(cwhjcqk.getPajtsj());
			d.setPajtsjbl(cwhjcqk.getPajtsjbl());
			d.setQzxfxcls(cwhjcqk.getQzxfxcls());
			d.setRjsr(cwhjcqk.getRjsr());
			d.setSj(cwhjcqk.getSj());
			d.setSxfhs(cwhjcqk.getSxfhs());
			d.setSywshcs(cwhjcqk.getSywshcs());
			d.setSyzlszhs(cwhjcqk.getSyzlszhs());
			d.setTdzmj(cwhjcqk.getTdzmj());
			d.setWhwmjtjdj(cwhjcqk.getWhwmjtjdj());
			d.setWhwmjtjdjbl(cwhjcqk.getWhwmjtjdjbl());
			d.setWhwmjtqg(cwhjcqk.getWhwmjtqg());
			d.setWhwmjtqgbl(cwhjcqk.getWhwmjtqgbl());
			d.setWhwmjtqj(cwhjcqk.getWhwmjtqj());
			d.setWhwmjtqjbl(cwhjcqk.getWhwmjtqjbl());
			d.setWhwmjtsj(cwhjcqk.getWhwmjtsj());
			d.setWhwmjtsjbl(cwhjcqk.getWhwmjtsjbl());
			d.setWshcpjl(cwhjcqk.getWshcpjl());
			d.setXwg(cwhjcqk.getXwg());
			d.setZlspjl(cwhjcqk.getZlspjl());
			d.setXxxjtjdj(cwhjcqk.getXxxjtjdj());
			d.setXxxjtjdjbl(cwhjcqk.getXxxjtjdjbl());
			d.setXxxjtqg(cwhjcqk.getXxxjtqg());
			d.setXxxjtqgbl(cwhjcqk.getXxxjtqgbl());
			d.setXxxjtqj(cwhjcqk.getXxxjtqj());
			d.setXxxjtqjbl(cwhjcqk.getXxxjtqjbl());
			d.setXxxjtsj(cwhjcqk.getXxxjtsj());
			d.setXxxjtsjbl(cwhjcqk.getXxxjtsjbl());
			
			cwhjcqkService.update(d);
		}

		return "redirect:/cwhjcqk/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/cwhjcqk/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(cwhjcqkService.getLzzList(current,
				businessForm), cwhjcqkService.getLzzCount(businessForm),
				current));
		return "/business/cwhjcqk/check";
	}
}