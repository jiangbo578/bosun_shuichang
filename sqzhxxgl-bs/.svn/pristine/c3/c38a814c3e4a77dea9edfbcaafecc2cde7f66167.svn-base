package com.gouhai.baoshan.controller.business.jcqk.gk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Szbj;
import com.gouhai.baoshan.service.business.jcqk.gk.SzbjService;

/**
 * 四至边界 Controller entity:Szbj
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/szbj")
public class SzbjController extends BusinessFormController {
	@Autowired
	private SzbjService szbjService;

	public SzbjController() {
		super("szbj");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/szbj/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(szbjService.getLzzList(current,
				businessForm), szbjService.getLzzCount(businessForm), current));
		return "/business/szbj/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/szbj/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Szbj szbj, String businessFormId) {
		szbj.setBusinessForm(new BusinessForm(businessFormId));
		szbjService.insert(szbj);
		return "redirect:/szbj/item/1/" + businessFormId;

	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Szbj g = szbjService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			szbjService.delete(id);
		}
		return "redirect:/szbj/item/1/" + businessFormId;
	}

	//
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("szbj", szbjService.findOne(id));
		return "/business/szbj/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Szbj szbj, String businessFormId) {
		Szbj g = szbjService.findOne(szbj.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setDong(szbj.getDong());
			g.setDongyu(szbj.getDongyu());
			g.setNan(szbj.getNan());
			g.setNanyu(szbj.getNanyu());
			g.setBei(szbj.getBei());
			g.setXi(szbj.getXi());
			g.setXiyu(szbj.getXiyu());
			g.setBeiyu(szbj.getBeiyu());
			szbjService.update(g);
		}

		return "redirect:/szbj/item/1/"+businessFormId;
	}
}
