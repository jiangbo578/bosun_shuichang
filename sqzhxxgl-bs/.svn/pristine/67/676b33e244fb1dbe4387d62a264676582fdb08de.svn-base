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
import com.gouhai.baoshan.entity.business.shgl.spaq.Wzspdwpcbt;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Wzspdwpc;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.spaq.WzspdwpcServce;
import com.gouhai.baoshan.service.business.shgl.spaq.head.WzspdwpcbtService;

/**
 * 无证食品单位季度隐患排查表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/wzspdwpc")
public class WzspdwpcController extends BusinessFormController {
	@Autowired
	private WzspdwpcServce wzspdwpcServce;
	@Autowired
	private WzspdwpcbtService wzspdwpcbtService;

	public WzspdwpcController() {
		super("wzspdwpc");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wzspdwpc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Wzspdwpc superMan = wzspdwpcbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new Wzspdwpc();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			wzspdwpcbtService.insert(superMan);
		}
		model.addAttribute("superman", superMan);
		model.addAllAttributes(pageResult(wzspdwpcServce.getObjList(current,
				superMan), wzspdwpcServce.getObjCount(superMan), current));
		return "/business/wzspdwpc/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{wzspdwpcbtid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String wzspdwpcbtid) {
		return "/business/wzspdwpc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Wzspdwpcbt t, String businessFormId, String wzspdwpcbtid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Wzspdwpc superMan = wzspdwpcbtService.findOne(new BusinessForm(
				businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		wzspdwpcbtService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setWzspdwpc(new Wzspdwpc(wzspdwpcbtid));
		wzspdwpcServce.insert(t);
		return "redirect:/wzspdwpc/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		wzspdwpcServce.delete(id);
		return "redirect:/wzspdwpc/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{wzspdwpcbtid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String wzspdwpcbtid) {
		model.addAttribute("wzspdwpc", wzspdwpcServce.findOne(id));
		return "/business/wzspdwpc/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wzspdwpcbt t, String businessFormId,
			String wzspdwpcbtid) {
		updateBusinessForm(businessFormId);
		Wzspdwpcbt d = wzspdwpcServce.findOne(t.getId());
		if (d.getWzspdwpc().getId().equals(wzspdwpcbtid)) {
			d.setDwmc(t.getDwmc());
			d.setJydz(t.getJydz());
			d.setJyqk(t.getJyqk());
			d.setFzr(t.getFzr());
			d.setLb(t.getLb());
			d.setSb(t.getSb());
			d.setPcrq(t.getPcrq());
			d.setPcr(t.getPcr());
			d.setPhone(t.getPhone());
			d.setRemark(t.getRemark());
			d.setUpdateDate(new Date());
			wzspdwpcServce.update(d);
		}

		return "redirect:/wzspdwpc/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/wzspdwpc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Wzspdwpc superman = wzspdwpcbtService.findOne(businessForm);
		model.addAttribute("superman", superman);
		model.addAllAttributes(pageResult(wzspdwpcServce.getObjList(current,
				superman), wzspdwpcServce.getObjCount(superman), current));
		return "/business/wzspdwpc/check";
	}

}
