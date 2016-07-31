package com.gouhai.baoshan.controller.business.shgl.cjjyqk;

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
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Ffbxdbt;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffbxd;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.FfbxdService;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.head.FfbxdbtService;

/**
 * 、村、居非法办学点情况表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/ffbxd")
public class FfbxdController extends BusinessFormController {
	@Autowired
	private FfbxdService ffbxdService;
	@Autowired
	private FfbxdbtService ffbxdbtService;

	public FfbxdController() {
		super("ffbxd");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/ffbxd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Ffbxd superMan = ffbxdbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new Ffbxd();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			ffbxdbtService.insert(superMan);
		}
		model.addAttribute("superman", superMan);
		model.addAllAttributes(pageResult(ffbxdService.getObjList(current,
				superMan), ffbxdService.getObjCount(superMan), current));
		return "/business/ffbxd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{ffbxdbtid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String ffbxdbtid) {
		return "/business/ffbxd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Ffbxdbt t, String businessFormId, String ffbxdbtid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Ffbxd superMan = ffbxdbtService
				.findOne(new BusinessForm(businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		ffbxdbtService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setFfbxd(new Ffbxd(ffbxdbtid));
		ffbxdService.insert(t);
		return "redirect:/ffbxd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		ffbxdService.delete(id);
		return "redirect:/ffbxd/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{ffbxdbtid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String ffbxdbtid) {
		model.addAttribute("ffbxd", ffbxdService.findOne(id));
		return "/business/ffbxd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Ffbxdbt t, String businessFormId, String ffbxdbtid) {
		updateBusinessForm(businessFormId);
		Ffbxdbt d = ffbxdService.findOne(t.getId());
		if (d.getFfbxd().getId().equals(ffbxdbtid)) {
			d.setSsjd(t.getSsjd());
			d.setSscwh(t.getSscwh());
			d.setBxmc(t.getBxmc());
			d.setXm(t.getXm());
			d.setJg(t.getJg());
			d.setSfz(t.getSfz());
			d.setPhone(t.getPhone());
			d.setBxdz(t.getBxdz());
			d.setBjs(t.getBjs());
			d.setYrs(t.getYrs());
			d.setFwxz(t.getFwxz());
			d.setWz(t.getWz());
			d.setJbsj(t.getJbsj());
			d.setUpdateDate(new Date());
			ffbxdService.update(d);
		}

		return "redirect:/ffbxd/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/ffbxd/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Ffbxd superMan = ffbxdbtService.findOne(businessForm);
		model.addAttribute("superman", superMan);

		model.addAllAttributes(pageResult(ffbxdService.getObjList(current,
				superMan), ffbxdService.getObjCount(superMan), current));
		return "/business/ffbxd/check";
	}

}
