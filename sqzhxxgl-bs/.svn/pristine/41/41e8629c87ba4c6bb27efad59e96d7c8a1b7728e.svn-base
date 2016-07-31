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
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Wptzbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Wptz;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.nchjzl.WptzService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.head.WptzbtService;

/**
 * 田间（经济林）窝棚台帐
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/wptz")
public class WpztController extends BusinessFormController {
	@Autowired
	private WptzService wptzService;
	@Autowired
	private WptzbtService wptzbtService;

	private WpztController() {
		super("wptz");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wptz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Wptz superMan = wptzbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new Wptz();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			wptzbtService.insert(superMan);
		}
		List<Wptzbt> list = wptzService.getAll(superMan);
		Wptzbt tb = new Wptzbt();

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

		model.addAttribute("tb", tb);
		model.addAttribute("cl", cl);
		model.addAttribute("xj", xj);
		model.addAttribute("yzz", yzz);
		model.addAttribute("superman", superMan);
		model.addAllAttributes(pageResult(wptzService.getObjList(current,
				superMan), wptzService.getObjCount(superMan), current));
		return "/business/wptz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{wptzbtid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String wptzbtid) {
		return "/business/wptz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Wptzbt t, String businessFormId, String wptzbtid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Wptz superMan = wptzbtService.findOne(new BusinessForm(businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		wptzbtService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setWptz(superMan);
		wptzService.insert(t);
		return "redirect:/wptz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		wptzService.delete(id);
		return "redirect:/wptz/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{wptzbtid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String wptzbtid) {
		model.addAttribute("wptz", wptzService.findOne(id));
		return "/business/wptz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wptzbt t, String businessFormId, String wptzbtid) {
		updateBusinessForm(businessFormId);
		Wptzbt d = wptzService.findOne(t.getId());
		if (d.getWptz().getId().equals(wptzbtid)) {
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
			wptzService.update(d);
		}

		return "redirect:/wptz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/wptz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Wptz superman = wptzbtService.findOne(businessForm);
		model.addAttribute("superman", superman);
		model.addAllAttributes(pageResult(wptzService.getObjList(current,
				superman), wptzService.getObjCount(superman), current));
		return "/business/wptz/check";
	}

}
