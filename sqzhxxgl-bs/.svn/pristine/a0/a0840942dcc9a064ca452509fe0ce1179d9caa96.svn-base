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
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Wzwzjyh;
import com.gouhai.baoshan.entity.business.shgl.spaq.SuperMan;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.cjjyqk.WzwzjyhService;
import com.gouhai.baoshan.service.business.shgl.spaq.SuperManService;

/**
 * 无证无照经营户
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/wzwzjyh")
public class WzwzjyhController extends BusinessFormController {
	@Autowired
	private WzwzjyhService wzwzjyhService;
	@Autowired
	private SuperManService manService;

	public WzwzjyhController() {
		super("wzwzjyh");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wzwzjyh/item/1/" + businessFormId;
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
		model.addAllAttributes(pageResult(wzwzjyhService.getObjList(current,
				businessForm), wzwzjyhService.getObjCount(businessForm),
				current));
		return "/business/wzwzjyh/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/wzwzjyh/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Wzwzjyh t, String businessFormId) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		SuperMan superMan = manService.findOne(new BusinessForm(businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		manService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		wzwzjyhService.insert(t);
		return "redirect:/wzwzjyh/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		wzwzjyhService.delete(id);
		return "redirect:/wzwzjyh/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("wzwzjyh", wzwzjyhService.findOne(id));
		return "/business/wzwzjyh/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wzwzjyh t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Wzwzjyh d = wzwzjyhService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setYz(t.getYz());
			d.setHj(t.getHj());
			d.setPhone(t.getPhone());
			d.setJydz(t.getJydz());
			d.setJynr(t.getJynr());
			d.setSshyp(t.getSshyp());
			d.setFwxz(t.getFwxz());
			d.setCqsy(t.getCqsy());

			d.setRemark(t.getRemark());
			d.setUpdateDate(new Date());
			wzwzjyhService.update(d);
		}

		return "redirect:/wzwzjyh/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/wzwzjyh/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("superman", manService.findOne(businessForm));
		model.addAllAttributes(pageResult(wzwzjyhService.getObjList(current,
				businessForm), wzwzjyhService.getObjCount(businessForm),
				current));
		return "/business/wzwzjyh/check";
	}
}
