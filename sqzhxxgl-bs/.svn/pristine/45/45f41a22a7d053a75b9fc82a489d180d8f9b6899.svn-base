package com.gouhai.baoshan.controller.business.ggfw.cjrgz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Fcbkjdry;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.head.Fcbkjd;
import com.gouhai.baoshan.service.business.ggfw.cjrgz.FcbkjdryService;
import com.gouhai.baoshan.service.business.ggfw.cjrgz.head.FcbkjdService;

/**
 * 党员干部扶残帮困结对记录 Controller Entity:Fcbkjd
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/fcbkjd")
public class FcbkjdController extends BusinessFormController {
	@Autowired
	private FcbkjdService fcbkjdService;
	@Autowired
	private FcbkjdryService fcbkjdryService;

	public FcbkjdController() {
		super("fcbkjd");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/fcbkjd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Fcbkjd f = fcbkjdService.findOne(businessForm);
		if (f == null) {
			f = new Fcbkjd();
			f.setAddress(null);
			f.setBusinessForm(businessForm);
			fcbkjdService.insert(f);
		}
		model.addAttribute("fcbkjd", f);
		model.addAllAttributes(pageResult(fcbkjdryService
				.getObjList(current, f), fcbkjdryService.getObjCount(f),
				current));
		return "/business/fcbkjd/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}/{fcbkjdid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String fcbkjdid) {
		return "/business/fcbkjd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Fcbkjdry t, String businessFormId, String fcbkjdid) {
		t.setFcbkjd(new Fcbkjd(fcbkjdid));
		fcbkjdryService.insert(t);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/fcbkjd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		fcbkjdryService.delete(id);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/fcbkjd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{fcbkjdid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String fcbkjdid) {
		model.addAttribute("fcbkjd", fcbkjdryService.findOne(id));
		return "/business/fcbkjd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Fcbkjdry t, String businessFormId, String fcbkjdid) {
		Fcbkjdry d = fcbkjdryService.findOne(t.getId());
		if (d.getFcbkjd().getId().equals(fcbkjdid)) {
			updateBusinessForm(businessFormId);// 更新业务表
			d.setGbxm(t.getGbxm());
			d.setRole(t.getRole());
			d.setJdsj(t.getJdsj());
			d.setJdxm(t.getJdxm());
			d.setCjlb(t.getCjlb());
			fcbkjdryService.update(d);
		}

		return "redirect:/fcbkjd/item/1/" + businessFormId;
	}

	// 修改头部
	@RequestMapping(value = "/item/head/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdateHead(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("fcbkjd", fcbkjdService.findOne(id));
		return "/business/fcbkjd/item/head/update";
	}

	@RequestMapping(value = "/item/head/update", method = RequestMethod.POST)
	public String updateHead(Fcbkjd t, String businessFormId) {
		Fcbkjd d = fcbkjdService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);// 更新业务表
			d.setSj(t.getSj());
			d.setAddress(t.getAddress());
			d.setZjr(t.getZjr());
			fcbkjdService.update(d);
		}

		return "redirect:/fcbkjd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {

		return "redirect:/fcbkjd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {

		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Fcbkjd f = fcbkjdService.findOne(businessForm);
		model.addAttribute("fcbkjd", f);
		model.addAllAttributes(pageResult(fcbkjdryService
				.getObjList(current, f), fcbkjdryService.getObjCount(f),
				current));
		return "/business/fcbkjd/check";
	}

}
