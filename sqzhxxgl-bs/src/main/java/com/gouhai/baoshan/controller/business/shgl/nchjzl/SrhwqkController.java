package com.gouhai.baoshan.controller.business.shgl.nchjzl;

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
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Srhwqk;
import com.gouhai.baoshan.entity.business.shgl.spaq.SuperMan;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.nchjzl.SrhwqkService;
import com.gouhai.baoshan.service.business.shgl.spaq.SuperManService;

/**
 * 嘉定区镇村市容环卫情况调查表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/srhwqk")
public class SrhwqkController extends BusinessFormController {
	@Autowired
	private SrhwqkService srhwqkService;
	@Autowired
	private SuperManService manService;

	public SrhwqkController() {
		super("srhwqk");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/srhwqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		SuperMan superMan = manService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new SuperMan();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			manService.insert(superMan);
		}
		model.addAttribute("superman", superMan);
		model
				.addAllAttributes(pageResult(srhwqkService.getObjList(current,
						businessForm), srhwqkService.getObjCount(businessForm),
						current));
		return "/business/srhwqk/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/srhwqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Srhwqk t, String businessFormId) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		SuperMan superMan = manService
				.findOne(new BusinessForm(businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		manService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		srhwqkService.insert(t);
		return "redirect:/srhwqk/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		srhwqkService.delete(id);
		return "redirect:/srhwqk/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("srhwqk", srhwqkService.findOne(id));
		return "/business/srhwqk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Srhwqk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Srhwqk d = srhwqkService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setNczzdd(t.getNczzdd());
			d.setNczzsl(t.getNczzsl());
			d.setNczzxs(t.getNczzxs());
			d.setNczzbz(t.getNczzbz());

			d.setHwzzdd(t.getHwzzdd());
			d.setHwzzsl(t.getHwzzsl());
			d.setHwzzxs(t.getHwzzxs());
			d.setHwzzbz(t.getHwzzbz());
			d.setUpdateDate(new Date());

			d.setLdzzdd(t.getLdzzdd());
			d.setLdzzsl(t.getLdzzsl());
			d.setLdzzxs(t.getLdzzxs());
			d.setLdzzbz(t.getLdzzbz());
			
			d.setLjzzdd(t.getLjzzdd());
			d.setLjzzsl(t.getLjzzsl());
			d.setLjzzxs(t.getLjzzxs());
			d.setLjzzbz(t.getLjzzbz());

			d.setLstzzdd(t.getLstzzdd());
			d.setLstzzsl(t.getLstzzsl());
			d.setLstzzxs(t.getLstzzxs());
			d.setLstzzbz(t.getLstzzbz());
			
			d.setSltzzdd(t.getSltzzdd());
			d.setSltzzsl(t.getSltzzsl());
			d.setSltzzxs(t.getSltzzxs());
			d.setSltzzbz(t.getSltzzbz());
			
			d.setSstzzdd(t.getSstzzdd());
			d.setSstzzss(t.getSstzzss());
			d.setSstzzxs(t.getSstzzxs());
			d.setSstzzbz(t.getSstzzbz());
			d.setUpdateDate(new Date());
			srhwqkService.update(d);
		}

		return "redirect:/srhwqk/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/srhwqk/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("superman", manService.findOne(businessForm));
		model
				.addAllAttributes(pageResult(srhwqkService.getObjList(current,
						businessForm), srhwqkService.getObjCount(businessForm),
						current));
		return "/business/srhwqk/check";
	}

}
