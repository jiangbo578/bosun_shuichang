package com.gouhai.baoshan.controller.business.shgl.nchjzl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Tzwpbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Tzwp;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.nchjzl.TzwpService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.head.TzwpbtService;

/**
 * 、田间（经济林）窝棚台帐
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/tzwp")
public class TzwpController extends BusinessFormController {
	@Autowired
	private TzwpService tzwpService;
	@Autowired
	private TzwpbtService tzwpbtService;

	public TzwpController() {
		super("tzwp");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/tzwp/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Tzwp tzwpbt = tzwpbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (tzwpbt == null) {
			tzwpbt = new Tzwp();
			tzwpbt.setBusinessForm(businessForm);
			tzwpbt.setCwh(null);
			tzwpbtService.insert(tzwpbt);
		}
		List<Tzwpbt> list = tzwpService.getAll(tzwpbt);
		Tzwpbt tb = new Tzwpbt();

		int cl = 0;
		int xj = 0;
		int yzz = 0;
		for (int i = 0; i < list.size(); i++) {
			tb.setMj(list.get(i).getMj() + tb.getMj());
			tb.setJzrs(list.get(i).getJzrs() + tb.getJzrs());
			tb.setGm(list.get(i).getGm() + tb.getGm());
			if (list.get(i).getZzqk().equals("存量")) {
				cl += 1;
			} else if (list.get(i).getZzqk().equals("新建")) {
				xj += 1;
			} else {
				yzz += 1;
			}
		}

		model.addAttribute("tzwpbt", tzwpbt);
		System.out.println("集合："+tzwpbt.getTzwpbtlist());
		model.addAttribute("tb", tb);
		model.addAttribute("cl", cl);
		model.addAttribute("xj", xj);
		model.addAttribute("yzz", yzz);

		model.addAllAttributes(pageResult(tzwpService.getObjList(current,
				tzwpbt), tzwpService.getObjCount(tzwpbt), current));
		return "/business/tzwp/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{tzwpbtid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String tzwpbtid) {
		return "/business/tzwp/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Tzwpbt t, String businessFormId, String tzwpbtid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Tzwp tzwpbt = tzwpbtService.findOne(new BusinessForm(businessFormId));
		tzwpbt.setCwh(or.getName());
		tzwpbt.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		tzwpbt.setTbrq(dateTime);
		tzwpbtService.update(tzwpbt);
		updateBusinessForm(businessFormId);
		t.setTzwp(new Tzwp(tzwpbtid));
		tzwpService.insert(t);
		return "redirect:/tzwp/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		tzwpService.delete(id);
		return "redirect:/tzwp/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{tzwpbtid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String tzwpbtid) {
		model.addAttribute("tzwp", tzwpService.findOne(id));
		return "/business/tzwp/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tzwpbt t, String businessFormId, String tzwpbtid) {
		updateBusinessForm(businessFormId);
		Tzwpbt d = tzwpService.findOne(t.getId());
		if (d.getTzwp().getId().equals(tzwpbtid)) {
			d.setHzs(t.getHzs());
			d.setWpwz(t.getWpwz());
			d.setMj(t.getMj());
			d.setJzrs(t.getJzrs());
			d.setLy(t.getLy());
			d.setGm(t.getGm());
			d.setDjr(t.getDjr());
			d.setTdqx(t.getTdqx());
			d.setTdxz(t.getTdxz());
			d.setLxfs(t.getLxfs());
			d.setZzqk(t.getZzqk());
			d.setUpdateDate(new Date());
			tzwpService.update(d);
		}

		return "redirect:/tzwp/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/tzwp/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Tzwp tzwpbt = tzwpbtService.findOne(businessForm);
		model.addAttribute("tzwpbt", tzwpbt);
		model.addAllAttributes(pageResult(tzwpService.getObjList(current,
				tzwpbt), tzwpService.getObjCount(tzwpbt), current));
		return "/business/tzwp/check";
	}

}
