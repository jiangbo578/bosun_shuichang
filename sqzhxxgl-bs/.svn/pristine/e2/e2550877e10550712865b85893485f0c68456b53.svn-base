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
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Gyqyjbxxbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Gyqyjbxx;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.nchjzl.GyqyjbxxService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.head.GyqyjbxxbtService;

/**
 * 工业企业基本信息
 * 
 * @author 徐舟
 * 
 *         有填报周期，需审核，每年十五号
 */
@Controller
@RequestMapping(value = "/gyqyjbxx")
public class GyqyjbxxController extends BusinessFormController {
	@Autowired
	private GyqyjbxxService gyqyjbxxService;
	@Autowired
	private GyqyjbxxbtService gyqyjbxxbtService;

	public GyqyjbxxController() {
		super("gyqyjbxx");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/gyqyjbxx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Gyqyjbxx superMan = gyqyjbxxbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new Gyqyjbxx();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			gyqyjbxxbtService.insert(superMan);
		}
		model.addAttribute("gyqyjbxxbt", superMan);
		model.addAllAttributes(pageResult(gyqyjbxxService.getObjList(current,
				superMan), gyqyjbxxService.getObjCount(superMan), current));
		return "/business/gyqyjbxx/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{gyid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String gyid) {
		return "/business/gyqyjbxx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Gyqyjbxxbt t, String businessFormId, String gyid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Gyqyjbxx superMan = gyqyjbxxbtService.findOne(new BusinessForm(
				businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		gyqyjbxxbtService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setGyqyjbxx(new Gyqyjbxx(gyid));
		gyqyjbxxService.insert(t);
		return "redirect:/gyqyjbxx/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		gyqyjbxxService.delete(id);
		return "redirect:/gyqyjbxx/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{gyid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId, @PathVariable() String gyid) {
		model.addAttribute("gyqyjbxx", gyqyjbxxService.findOne(id));
		return "/business/gyqyjbxx/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Gyqyjbxxbt t, String businessFormId, String gyid) {
		updateBusinessForm(businessFormId);
		Gyqyjbxxbt d = gyqyjbxxService.findOne(t.getId());
		if (d.getGyqyjbxx().getId().equals(gyid)) {
			d.setJgdm(t.getJgdm());
			d.setPwmc(t.getPwmc());
			d.setXz(t.getXz());
			d.setDz(t.getDz());
			d.setLxr(t.getLxr());
			d.setLxhd(t.getLxhd());
			d.setHylb(t.getHylb());
			d.setZg(t.getZg());
			d.setNg(t.getNg());
			d.setYsl(t.getYsl());
			d.setMtl(t.getMtl());
			d.setZyl(t.getZyl());
			d.setCyl(t.getCyl());
			d.setJjrql(t.getJjrql());
			d.setGls(t.getGls());
			d.setWsss(t.getWsss());
			d.setFqsl(t.getFqsl());
			d.setWxwsl(t.getWxwsl());
			d.setBz(t.getBz());
			d.setUpdateDate(new Date());
			gyqyjbxxService.update(d);
		}

		return "redirect:/gyqyjbxx/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/gyqyjbxx/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Gyqyjbxx gyqyjbxx = gyqyjbxxbtService.findOne(businessForm);
		model.addAttribute("gyqyjbxxbt", gyqyjbxx);
		model.addAllAttributes(pageResult(gyqyjbxxService.getObjList(current,
				gyqyjbxx), gyqyjbxxService.getObjCount(gyqyjbxx), current));
		return "/business/gyqyjbxx/check";
	}

}
