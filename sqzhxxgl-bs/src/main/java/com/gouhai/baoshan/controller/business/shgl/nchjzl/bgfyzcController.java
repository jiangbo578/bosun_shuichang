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
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Bgfyzcbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Bgfyzc;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.shgl.nchjzl.BgfyzcService;
import com.gouhai.baoshan.service.business.shgl.nchjzl.head.BgfyzcbtService;

/**
 * 不规范生猪养殖场（户）整治推进情况统计
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/bgfyzc")
public class bgfyzcController extends BusinessFormController {
	@Autowired
	private BgfyzcService bgfyzcService;
	@Autowired
	private BgfyzcbtService bgfyzcbtService;

	public bgfyzcController() {
		super("bgfyzc");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/bgfyzc/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Bgfyzc superMan = bgfyzcbtService.findOne(businessForm);
		// 如果这个填报周期内没有标头，就增加一个，全部为空.让用户自己修改，
		if (superMan == null) {
			superMan = new Bgfyzc();
			superMan.setBusinessForm(businessForm);
			superMan.setCwh(null);
			bgfyzcbtService.insert(superMan);
		}

		// 查新出全部的合计
		List<Bgfyzcbt> list = bgfyzcService.getAll(superMan);
		Bgfyzcbt bg = new Bgfyzcbt();
		int jhzz = 0;
		int zzqk = 0;
		for (int i = 0; i < list.size(); i++) {
			bg.setGz(list.get(i).getGz() + bg.getGz());
			bg.setMz(list.get(i).getMz() + bg.getMz());
			bg.setSprz(list.get(i).getSprz() + bg.getSprz());
			System.out.println(list.get(i).getJhzzs());
			if (list.get(i).getJhzzs().equals("是")) {
				jhzz += 1;

			}
			if (list.get(i).getYzzs().equals("是")) {
				zzqk += 1;
			}
		}
		int zzjd=0;
		if(jhzz>0){
			zzjd=zzqk*100/jhzz;
		}
		model.addAttribute("superman", superMan);
		model.addAttribute("bg", bg);
		model.addAttribute("jhzz", jhzz);
		model.addAttribute("zzqk", zzqk);
		model.addAttribute("zzjd", zzjd);
		model.addAllAttributes(pageResult(bgfyzcService.getObjList(current,
				superMan), bgfyzcService.getObjCount(superMan), current));
		return "/business/bgfyzc/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{bgfyzcbtid}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String bgfyzcbtid) {
		return "/business/bgfyzc/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Bgfyzcbt t, String businessFormId, String bgfyzcbtid) {
		// 增加记录的时候更新表头
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		String username = (String) shiroSession.getAttribute("userRealName");// 用户名
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		Bgfyzc superMan = bgfyzcbtService.findOne(new BusinessForm(
				businessFormId));
		superMan.setCwh(or.getName());
		superMan.setTbr(username);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); // 格式化当前系统日期
		String dateTime = dateFm.format(new java.util.Date());
		superMan.setTbrq(dateTime);
		bgfyzcbtService.update(superMan);
		updateBusinessForm(businessFormId);
		t.setBgfyzc(new Bgfyzc(bgfyzcbtid));
		bgfyzcService.insert(t);
		return "redirect:/bgfyzc/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		bgfyzcService.delete(id);
		return "redirect:/bgfyzc/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{bgfyzcbtid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String bgfyzcbtid) {
		model.addAttribute("bgfyzc", bgfyzcService.findOne(id));
		return "/business/bgfyzc/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Bgfyzcbt t, String businessFormId, String bgfyzcbtid) {
		updateBusinessForm(businessFormId);
		Bgfyzcbt d = bgfyzcService.findOne(t.getId());
		if (d.getBgfyzc().getId().equals(bgfyzcbtid)) {
			d.setYzh(t.getYzh());
			d.setXz(t.getXz());
			d.setWlh(t.getWlh());
			d.setGs(t.getGs());
			d.setYzdd(t.getYzdd());
			d.setPhone(t.getPhone());
			d.setGz(t.getGz());
			d.setMz(t.getMz());
			d.setSprz(t.getSprz());
			d.setJhzzs(t.getJhzzs());
			d.setXzxqzz(t.getXzxqzz());
			d.setYzzs(t.getYzzs());
			d.setZzjd(t.getZzjd());
			d.setUpdateDate(new Date());
			bgfyzcService.update(d);
		}

		return "redirect:/bgfyzc/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/bgfyzc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Bgfyzc bgfyzcbt = bgfyzcbtService.findOne(businessForm);
		model.addAttribute("superman", bgfyzcbt);
		model.addAllAttributes(pageResult(bgfyzcService.getObjList(current,
				bgfyzcbt), bgfyzcService.getObjCount(bgfyzcbt), current));
		return "/business/bgfyzc/check";
	}

}
