package com.gouhai.baoshan.controller.business.shgl.spaq;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.spaq.Wzspscbt;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Wzspsc;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.spaq.WzspscdwService;
import com.gouhai.baoshan.service.business.shgl.spaq.head.WzspscdwbtService;

/**
 * 新增无证食品药品生产经营消费单位情况表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/wzspsc")
public class WzspscdwController extends BusinessFormController {
	@Autowired
	private WzspscdwService wzspscdwService;
	@Autowired
	private WzspscdwbtService wzspscdwbtService;

	public WzspscdwController() {
		super("wzspsc");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wzspsc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Wzspsc superMan = wzspscdwbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new Wzspsc();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			wzspscdwbtService.insert(superMan);
		}
		model.addAttribute("superman", superMan);
		model.addAllAttributes(pageResult(wzspscdwService.getObjList(current,
				superMan), wzspscdwService.getObjCount(superMan), current));
		return "/business/wzspsc/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{wzspscbtid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String wzspscbtid) {
		return "/business/wzspsc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Wzspscbt t, String businessFormId, String wzspscbtid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Wzspsc superMan = wzspscdwbtService.findOne(new BusinessForm(
				businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		wzspscdwbtService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setWzspsc(new Wzspsc(wzspscbtid));
		wzspscdwService.insert(t);
		return "redirect:/wzspsc/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		wzspscdwService.delete(id);
		return "redirect:/wzspsc/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{wzspscbtid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String wzspscbtid) {
		model.addAttribute("wzspsc", wzspscdwService.findOne(id));
		return "/business/wzspsc/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wzspscbt t, String businessFormId, String wzspscbtid) {
		updateBusinessForm(businessFormId);
		Wzspscbt d = wzspscdwService.findOne(t.getId());
		if (d.getWzspsc().getId().equals(wzspscbtid)) {
			d.setDwmc(t.getDwmc());
			d.setJydz(t.getJydz());
			d.setFzr(t.getFzr());
			d.setPhone(t.getPhone());
			d.setJyxm(t.getJyxm());
			d.setCzqk(t.getCzqk());
			d.setFxr(t.getFxr());
			d.setSj(t.getSj());
			d.setRemark(t.getRemark());
			d.setRemark(t.getRemark());
			d.setUpdateDate(new Date());
			wzspscdwService.update(d);
		}

		return "redirect:/wzspsc/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/wzspsc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Wzspsc wzspsc = wzspscdwbtService.findOne(businessForm);
		model.addAttribute("superman", wzspsc);
		model.addAllAttributes(pageResult(wzspscdwService.getObjList(current,
				wzspsc), wzspscdwService.getObjCount(wzspsc), current));
		return "/business/wzspsc/check";
	}

}
