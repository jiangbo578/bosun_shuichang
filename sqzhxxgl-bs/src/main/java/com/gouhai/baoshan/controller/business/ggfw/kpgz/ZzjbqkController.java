package com.gouhai.baoshan.controller.business.ggfw.kpgz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.kpgz.Zzjbqk;
import com.gouhai.baoshan.service.business.ggfw.kpgz.ZzjbqkService;

@Controller
@RequestMapping(value = "/zzjbqk")
public class ZzjbqkController extends BusinessFormController {
	@Autowired
	private ZzjbqkService zzjbqkService;

	public ZzjbqkController() {
		super("zzjbqk");
	}
	// 查询
		@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
		public String toIndex(@PathVariable() String businessFormId) {
			return "redirect:/zzjbqk/item/1/" + businessFormId;
		}

		@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
		public String index(Model model, @PathVariable() int current,
				@PathVariable() String businessFormId) {
			BusinessForm businessForm = businessFormService.findOne(businessFormId);
			model.addAttribute("businessForm", businessForm);
			model.addAllAttributes(pageResult(zzjbqkService.getObjList(current,
					businessForm), zzjbqkService.getObjCount(businessForm), current));
			return "/business/zzjbqk/item/index";
		}

		// 增加
		@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
		public String toAdd(@PathVariable() String businessFormId) {
			return "/business/zzjbqk/item/add";
		}

		@RequestMapping(value = "/item/add", method = RequestMethod.POST)
		public String toAdd(Zzjbqk t, String businessFormId) {
			updateBusinessForm(businessFormId);
			t.setBusinessForm(new BusinessForm(businessFormId));
			zzjbqkService.insert(t);
			return "redirect:/zzjbqk/item/1/" + businessFormId;

		}

		// 修改
		@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
		public String toUpdate(Model model, @PathVariable String id,
				@PathVariable() String businessFormId) {
			model.addAttribute("zzjbqk", zzjbqkService.findOne(id));
			return "/business/zzjbqk/item/update";
		}

		@RequestMapping(value = "/item/update", method = RequestMethod.POST)
		public String update(Zzjbqk t, String businessFormId) {
			updateBusinessForm(businessFormId);
			Zzjbqk g = zzjbqkService.findOne(t.getId());
			if (g.getBusinessForm().getId().equals(businessFormId)) {
				g.setDwmc(t.getDwmc());
				g.setMj(t.getMj());
				g.setLdfbsl(t.getLdfbsl());
				g.setJzzhs(t.getJzzhs());
				g.setJzzrks(t.getJzzrks());
				g.setFzr(t.getFzr());
				g.setFzrlxdh(t.getFzrlxdh());
				g.setLxr(t.getLxr());
				g.setLxrlxdh(t.getLxrlxdh());
				g.setTxdz(t.getTxdz());
				g.setYzbm(t.getYzbm());
				g.setCz(t.getCz());
				g.setDzyx(t.getDzyx());
				g.setWy(t.getWy());
				g.setGzry(t.getGzry());
				g.setUpdateDate(new Date());
				zzjbqkService.update(g);
			}
			return "redirect:/zzjbqk/item/1/" + businessFormId;
		}

		// 删除
		@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
		public String delete(@PathVariable String id,
				@PathVariable() String businessFormId) {
			updateBusinessForm(businessFormId);
			Zzjbqk g = zzjbqkService.findOne(id);
			if (g.getBusinessForm().getId().equals(businessFormId)) {
				zzjbqkService.delete(id);
			}
			return "redirect:/zzjbqk/item/1/" + businessFormId;
		}

		// 审核
		@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
		public String toCheck(Model model, @PathVariable String businessFormId) {
			return "redirect:/zzjbqk/check/1/" + businessFormId;
		}

		@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
		public String check(Model model, @PathVariable() int current,
				@PathVariable() String businessFormId) {
			BusinessForm businessForm = businessFormService.findOne(businessFormId);
			model.addAttribute("businessForm", businessForm);
			model.addAllAttributes(pageResult(zzjbqkService.getObjList(current,
					businessForm), zzjbqkService.getObjCount(businessForm), current));
			return "/business/zzjbqk/check";
		}
}
