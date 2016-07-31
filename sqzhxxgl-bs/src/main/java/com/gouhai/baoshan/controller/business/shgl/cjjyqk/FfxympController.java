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
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Ffxympbt;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffxymp;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.FfxympService;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.head.FfxympbtService;

/**
 * 非法行医情况排摸信息表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/ffxymp")
public class FfxympController extends BusinessFormController {
	@Autowired
	private FfxympService ffxympService;
	@Autowired
	private FfxympbtService ffxympbtService;

	public FfxympController() {
		super("ffxymp");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/ffxymp/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Ffxymp superMan = ffxympbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new Ffxymp();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			ffxympbtService.insert(superMan);
		}
		model.addAttribute("superman", superMan);
		model.addAllAttributes(pageResult(ffxympService.getObjList(current,
				superMan), ffxympService.getObjCount(superMan), current));
		return "/business/ffxymp/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{ffxympid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String ffxympid) {
		return "/business/ffxymp/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Ffxympbt t, String businessFormId, String ffxympid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Ffxymp superMan = ffxympbtService.findOne(new BusinessForm(
				businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		ffxympbtService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setFfxymp(new Ffxymp(ffxympid));
		ffxympService.insert(t);
		return "redirect:/ffxymp/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		ffxympService.delete(id);
		return "redirect:/ffxymp/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{ffxympid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,@PathVariable() String ffxympid) {
		model.addAttribute("ffxymp", ffxympService.findOne(id));
		return "/business/ffxymp/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Ffxympbt t, String businessFormId,String ffxympid) {
		updateBusinessForm(businessFormId);
		Ffxympbt d = ffxympService.findOne(t.getId());
		if (d.getFfxymp().getId().equals(ffxympid)) {
			d.setCwh(t.getCwh());
			d.setDz(t.getDz());
			d.setFwxz(t.getFwxz());
			d.setXyrxm(t.getXyrxm());
			d.setXyrsfz(t.getXyrsfz());
			d.setXynr(t.getXynr());
			d.setXybz(t.getXybz());
			d.setFdxm(t.getFdxm());
			d.setMprxm(t.getMprxm());
			d.setRq(t.getRq());
			d.setSfxz(t.getSfxz());
	
			d.setUpdateDate(new Date());
			ffxympService.update(d);
		}

		return "redirect:/ffxymp/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/ffxymp/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Ffxymp ffxymp = ffxympbtService.findOne(businessForm);
		model.addAttribute("superman", ffxymp);
		model.addAllAttributes(pageResult(ffxympService.getObjList(current,
				ffxymp), ffxympService.getObjCount(ffxymp), current));
		return "/business/ffxymp/check";
	}

}
