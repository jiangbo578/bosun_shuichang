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
import com.gouhai.baoshan.entity.business.shgl.spaq.Zbjshsbt;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Zbjshs;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.spaq.ZbjshsService;
import com.gouhai.baoshan.service.business.shgl.spaq.head.ZbjshsbtService;

/**
 * 自办酒会所情况表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/zbjshs")
public class ZbjshsController extends BusinessFormController {
	@Autowired
	private ZbjshsService zbjshsService;
	@Autowired
	private ZbjshsbtService zbjshsbtService;;

	public ZbjshsController() {
		super("zbjshs");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/zbjshs/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Zbjshs superMan = zbjshsbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new Zbjshs();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			zbjshsbtService.insert(superMan);
		}
		model.addAttribute("superman", superMan);
		model.addAllAttributes(pageResult(zbjshsService.getObjList(current,
				superMan), zbjshsService.getObjCount(superMan), current));
		return "/business/zbjshs/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{zbjshsbtid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String zbjshsbtid) {
		return "/business/zbjshs/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Zbjshsbt t, String businessFormId, String zbjshsbtid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Zbjshs superMan = zbjshsbtService.findOne(new BusinessForm(
				businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		zbjshsbtService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setZbjshs(new Zbjshs(zbjshsbtid));
		zbjshsService.insert(t);
		return "redirect:/zbjshs/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		zbjshsService.delete(id);
		return "redirect:/zbjshs/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{zbjshsbtid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String zbjshsbtid) {
		model.addAttribute("zbjshs", zbjshsService.findOne(id));
		return "/business/zbjshs/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Zbjshsbt t, String businessFormId, String zbjshsbtid) {
		updateBusinessForm(businessFormId);
		Zbjshsbt d = zbjshsService.findOne(t.getId());
		if (d.getZbjshs().getId().equals(zbjshsbtid)) {
			d.setDwmc(t.getDwmc());
			d.setJydz(t.getJydz());
			d.setFzr(t.getFzr());
			d.setPhone(t.getPhone());
			d.setJydz(t.getJyxz());
			d.setCbzs(t.getCbzs());
			d.setBa(t.getBa());
			d.setSjhs(t.getSjhs());
			d.setSjzs(t.getSjzs());
			d.setRemark(t.getRemark());
			d.setUpdateDate(new Date());
			zbjshsService.update(d);
		}

		return "redirect:/zbjshs/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/zbjshs/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Zbjshs zbjshs = zbjshsbtService.findOne(businessForm);
		model.addAttribute("superman", zbjshs);
		model.addAllAttributes(pageResult(zbjshsService.getObjList(current,
				zbjshs), zbjshsService.getObjCount(zbjshs), current));
		return "/business/zbjshs/check";
	}

}
