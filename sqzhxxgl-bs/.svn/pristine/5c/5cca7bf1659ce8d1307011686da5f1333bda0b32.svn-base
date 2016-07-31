package com.gouhai.baoshan.controller.business.jcqk.rymd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Yzwyh;
import com.gouhai.baoshan.service.business.jcqk.rymd.MemberService;

/**
 * 业主委员会成员名单 Controller entity:Member
 * 
 * @author xuzhou
 * 
 */
@Controller
@RequestMapping(value = "/yzwyh")
public class MemberController extends BusinessFormController {
	@Autowired
	private MemberService memberService;

	public MemberController() {
		super("yzwyh");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/yzwyh/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(
				memberService.getMemberList(businessForm, current),
				memberService.getMemberCount(businessForm), current));
		return "/business/yzwyh/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/yzwyh/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Yzwyh member, String businessFormId) {
		member.setBusinessForm(new BusinessForm(businessFormId));
		memberService.insert(member);
		return "redirect:/yzwyh/item/1/" + businessFormId;

	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Yzwyh m = memberService.findOne(id);
		if (m.getBusinessForm().getId().equals(businessFormId)) {
			memberService.delete(id);
		}

		return "redirect:/yzwyh/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("member", memberService.findOne(id));
		return "/business/yzwyh/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Yzwyh member, String businessFormId) {
		System.err.println("更新");
		memberService.update(member, businessFormId);
		return "redirect:/yzwyh/item/1/" + businessFormId;
	}
}
