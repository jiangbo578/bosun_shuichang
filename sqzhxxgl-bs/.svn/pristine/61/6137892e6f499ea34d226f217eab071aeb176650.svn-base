package com.gouhai.baoshan.controller.business.dqgz.zb;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Lxfwqzgz;
import com.gouhai.baoshan.service.business.dqgz.zb.LxfwqzgzService;

/**
 * 联系服务群众工作统计表
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/lxfwqzgz")
public class LxfwqzgzController extends BusinessFormController {
	@Autowired
	private LxfwqzgzService lxfwqzgzService;

	public LxfwqzgzController() {
		super("lxfwqzgz");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/lxfwqzgz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);

		model.addAllAttributes(pageResult(lxfwqzgzService.getobjList(current,
				businessForm), lxfwqzgzService.getobjCount(businessForm),
				current));
		return "/business/lxfwqzgz/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/lxfwqzgz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Lxfwqzgz t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		lxfwqzgzService.insert(t);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/lxfwqzgz/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		lxfwqzgzService.delete(id);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/lxfwqzgz/item/1/" + businessFormId;
	}

	// 更新
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("lxfwqzgz", lxfwqzgzService.findOne(id));
		return "/business/lxfwqzgz/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Lxfwqzgz t, String businessFormId) {
		Lxfwqzgz d = lxfwqzgzService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setRhzfys(t.getRhzfys());
			d.setRhzfljs(t.getRhzfljs());
			d.setFrhzfys(t.getFrhzfys());
			d.setFrhzfljs(t.getFrhzfljs());
			d.setMslys(t.getMslys());
			d.setMslljs(t.getMslljs());
			d.setWslys(t.getWslys());
			d.setWslljs(t.getWslljs());
			d.setWygllys(t.getWygllys());
			d.setWygllljs(t.getWygllljs());
			d.setZagllys(t.getZagllys());
			d.setZagllljs(t.getZagllljs());
			d.setQtlys(t.getQtlys());
			d.setQtlljs(t.getQtlljs());
			d.setHjys(t.getHjys());
			d.setHjljs(t.getHjljs());
			d.setZxwtlys(t.getZxwtlys());
			d.setZxwtlljs(t.getZxwtlljs());
			d.setJmqyjjys(t.getJmqyjjys());
			d.setJmqyjjljs(t.getJmqyjjljs());
			d.setKczxjjys(t.getKczxjjys());
			d.setKczxjjljs(t.getKczxjjljs());
			d.setCmxtjjys(t.getCmxtjjys());
			d.setCmxtjjljs(t.getCmxtjjljs());
			d.setSdbjjljs(t.getSdbjjljs());
			d.setSdbjjys(t.getSdbjjys());
			d.setDjjwtys(t.getDjjwtys());
			d.setDjjwtljs(t.getDjjwtljs());
			d.setHjzdmdys(t.getHjzdmdys());
			d.setHjzdmdljs(t.getHjzdmdljs());
			d.setNyjjys(t.getNyjjys());
			d.setNyjjljs(t.getNyjjljs());
			d.setSbnwjj(t.getSbnwjj());
			d.setSbnyl(t.getSbnyl());
			d.setKs(t.getKs());
			d.setZtll(t.getZtll());
			d.setBz(t.getBz());
			d.setTbrqm(t.getTbrqm());
			d.setUpdateDate(new Date());
			lxfwqzgzService.update(d);
			updateBusinessForm(businessFormId);// 更新业务表
		}

		return "redirect:/lxfwqzgz/item/1/" + businessFormId;
	}

	// 审核
	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {
		return "redirect:/lxfwqzgz/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(lxfwqzgzService.getobjList(current,
				businessForm), lxfwqzgzService.getobjCount(businessForm),
				current));
		return "/business/lxfwqzgz/check";
	}
}
