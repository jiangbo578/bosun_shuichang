package com.gouhai.baoshan.controller.business.ggfw.whtygz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.whtygz.Tyssqc;
import com.gouhai.baoshan.entity.business.ggfw.whtygz.head.Tyssqclb;
import com.gouhai.baoshan.service.business.ggfw.whtygz.TyssqclbService;

/**
 * 上海市社区公共体育设施器材（场地）详细情况登记表 control Entiry:Tyssqclb
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/tyssqclb")
public class TyssqclbController extends BusinessFormController {
	@Autowired
	private TyssqclbService tyssqclbService;

	public TyssqclbController() {
		super("tyssqclb");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/tyssqclb/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Tyssqclb tyssqclb = tyssqclbService.findOne(businessForm);// 获取表头
		if (tyssqclb == null) {
			// 如果这个填报周期内没有表头，就自动生成一张空的，让用户修改
			Tyssqclb lb = new Tyssqclb();
			lb.setLb(null);
			lb.setBusinessForm(new BusinessForm(businessFormId));
			tyssqclbService.insert(lb);
		}
		List<Tyssqc> list = tyssqclbService.getObjList(current, tyssqclb);
		model.addAttribute("tyssqclb", tyssqclb);
		model.addAllAttributes(pageResult(list, tyssqclbService
				.getObjCount(tyssqclb), current));
		return "/business/tyssqclb/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}/{tyssqcId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId,
			@PathVariable() String tyssqcId) {
		return "/business/tyssqclb/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Tyssqc tyssqc, String businessFormId, String tyssqcId,
			Model model) {
		updateBusinessForm(businessFormId);
		
		tyssqc.setTyssqclb(new Tyssqclb(tyssqcId));
		tyssqclbService.updateMany(tyssqc);
		model.addAttribute("meg", tyssqc.getQcmc() + "添加成功");
		//return "/business/tyssqclb/item/add";

		 return "redirect:/tyssqclb/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		tyssqclbService.deleteNo(id);
		return "redirect:/tyssqclb/item/1/" + businessFormId;
	}

	// // 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("tyssqclb", tyssqclbService.findOne(id));
		return "/business/tyssqclb/item/update";
	}

	// 修改
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Tyssqclb t, String businessFormId) {
		Tyssqclb d = tyssqclbService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setAddress(t.getAddress());
			d.setLb(t.getLb());
			tyssqclbService.insert(d);
		}
		return "redirect:/tyssqclb/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update1/{id}/{businessFormId}/{tyssqcId}", method = RequestMethod.GET)
	public String toUpdate1(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,
			@PathVariable() String tyssqcId) {
		model.addAttribute("tyssqc", tyssqclbService.findMany(id));
		return "/business/tyssqclb/item/update1";
	}

	// 修改子类
	@RequestMapping(value = "/item/update1", method = RequestMethod.POST)
	public String update1(Tyssqc t, String businessFormId, String tyssqcId) {
		Tyssqc d = tyssqclbService.findMany(t.getId());
		if (d.getTyssqclb().getId().equals(tyssqcId)) {
			d.setQcmc(t.getQcmc());
			d.setSl(t.getSl());
			tyssqclbService.updateMany(d);
		}
		return "redirect:/tyssqclb/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/tyssqc/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Tyssqclb tyssqclb = tyssqclbService.findOne(businessForm);// 获取表头
		model.addAttribute("tyssqclb", tyssqclb);
		model.addAllAttributes(pageResult(tyssqclbService.getObjList(current,
				tyssqclb), tyssqclbService.getObjCount(tyssqclb), current));
		return "/business/tyssqclb/check";
	}

}
