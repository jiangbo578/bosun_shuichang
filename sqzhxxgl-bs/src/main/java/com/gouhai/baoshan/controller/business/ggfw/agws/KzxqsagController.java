package com.gouhai.baoshan.controller.business.ggfw.agws;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Kzxqsag;
import com.gouhai.baoshan.service.business.ggfw.agws.KzxqsagService;

/**
 * 开展星期四爱国卫生义务劳动情况记录表 Controller enTITY:Kzxqsag
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/kzxqsag")
public class KzxqsagController extends BusinessFormController {
	@Autowired
	private KzxqsagService kzxqsagService;

	public KzxqsagController() {
		super("kzxqsag");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/kzxqsag/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(kzxqsagService.getObjList(current,
				businessForm), kzxqsagService.getObjCount(businessForm),
				current));
		return "/business/kzxqsag/item/index";
	}

	// // 初始化转换日期
	// @InitBinder
	// public void initBinder(WebDataBinder binder) {
	// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// dateFormat.setLenient(false);
	// binder.registerCustomEditor(Date.class, "gjsj", new CustomDateEditor(
	// dateFormat, true));
	// }

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/kzxqsag/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Kzxqsag t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		kzxqsagService.insert(t);
		return "redirect:/kzxqsag/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("kzxqsag", kzxqsagService.findOne(id));
		return "/business/kzxqsag/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Kzxqsag t, String businessFormId) {
		Kzxqsag g = kzxqsagService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setRq(t.getRq());
			g.setNr(t.getNr());
			g.setCjxqs(t.getCjxqs());
			g.setCjdws(t.getCjdws());
			g.setCjrs(t.getCjrs());
			g.setUpdateDate(new Date());
			kzxqsagService.update(g);
		}
		return "redirect:/kzxqsag/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Kzxqsag g = kzxqsagService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			kzxqsagService.delete(id);
		}
		return "redirect:/kzxqsag/item/1/" + businessFormId;
	}
}
