package com.gouhai.baoshan.controller.business.jcqk.fwcz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.fwcz.Bzcy;
import com.gouhai.baoshan.entity.business.jcqk.fwcz.Bzcybt;
import com.gouhai.baoshan.service.business.jcqk.fwcz.BzcyService;
import com.gouhai.baoshan.service.business.jcqk.fwcz.BzcybtService;

@Controller
@RequestMapping(value = "/bzcybt")
public class BzcyController extends BusinessFormController {
	@Autowired
	private BzcyService bzcyService;
	@Autowired
	private BzcybtService bzcybtService;

	public BzcyController() {
		super("bzcybt");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/bzcybt/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		Bzcybt bzcybt = bzcybtService.findOne(businessForm);
		if (null == bzcybt) {
			bzcybt = new Bzcybt();
			bzcybt.setBusinessForm(businessForm);
			bzcybt.setFa("尚未填写");
			bzcybtService.insert(bzcybt);
		}
		model.addAttribute("bzcybt", bzcybt);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(bzcyService.getLzzList(current,
				bzcybt), bzcyService.getLzzCount(bzcybt), current));

		return "/business/bzcybt/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{bzcybtId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String bzcybtId) {
		return "/business/bzcybt/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Bzcy bzcy, String businessFormId, String bzcybtId) {
		updateBusinessForm(businessFormId);
		bzcy.setBzcybt(new Bzcybt(bzcybtId));
		bzcyService.insert(bzcy);
		return "redirect:/bzcybt/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		bzcyService.delete(id);
		return "redirect:/bzcybt/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{bzcybtId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,@PathVariable() String bzcybtId) {
		model.addAttribute("bzcy", bzcyService.findOne(id));
		return "/business/bzcybt/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Bzcy bzcy, String businessFormId,String bzcybtId) {
		updateBusinessForm(businessFormId);
		Bzcy d = bzcyService.findOne(bzcy.getId());
		if (d.getBzcybt().getId().equals(bzcybtId)) {
			d.setUpdateDate(new Date());

			d.setCsny(bzcy.getCsny());
			d.setGzdw(bzcy.getGzdw());
			d.setJtzz(bzcy.getJtzz());
			d.setMz(bzcy.getMz());
			d.setTnzw(bzcy.getTnzw());
			d.setXb(bzcy.getXb());
			d.setXm(bzcy.getXm());
			d.setZzmm(bzcy.getZzmm());

			bzcyService.update(d);
		}

		return "redirect:/bzcybt/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update1", method = RequestMethod.POST)
	public String updateBt(Bzcybt bzcybt, String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		Bzcybt d = bzcybtService.findOne(businessForm);
		d.setUpdateDate(new Date());
		d.setFa(bzcybt.getFa());
		d.setFb(bzcybt.getFb());
		d.setFc(bzcybt.getFc());
		d.setFd(bzcybt.getFd());
		d.setFe(bzcybt.getFe());
		d.setSstzbs(bzcybt.getSstzbs());
		d.setTys(bzcybt.getTys());
		d.setTzbmc(bzcybt.getTzbmc());
		d.setTzbsjxm(bzcybt.getTzbsjxm());

		bzcybtService.update(d);

		return "redirect:/bzcybt/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/bzcybt/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Bzcybt bzcybt = bzcybtService.findOne(businessForm);
		if (null == bzcybt) {
			bzcybt = new Bzcybt();
			bzcybt.setBusinessForm(businessForm);
			bzcybt.setFa("尚未填写");
			bzcybtService.insert(bzcybt);
		}
		model.addAttribute("bzcybt", bzcybt);
		model.addAllAttributes(pageResult(bzcyService.getLzzList(current,
				bzcybt), bzcyService.getLzzCount(bzcybt), current));
		return "/business/bzcybt/check";
	}


}
