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
import com.gouhai.baoshan.entity.business.ggfw.agws.Wszcqk;
import com.gouhai.baoshan.service.business.ggfw.agws.WszcqkService;

/**
 * 卫生自查情况记录表 Controller Entity:Wszcqk
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/wszcqk")
public class WszcqkController extends BusinessFormController {
	@Autowired
	private WszcqkService wszcqkService;

	public WszcqkController() {
		super("wszcqk");
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/wszcqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(wszcqkService.getObjList(current,
						businessForm), wszcqkService.getObjCount(businessForm),
						current));
		return "/business/wszcqk/item/index";
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
		return "/business/wszcqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String toAdd(Wszcqk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		t.setBusinessForm(new BusinessForm(businessFormId));
		wszcqkService.insert(t);
		return "redirect:/wszcqk/item/1/" + businessFormId;

	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("wszcqk", wszcqkService.findOne(id));
		return "/business/wszcqk/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Wszcqk t, String businessFormId) {
		updateBusinessForm(businessFormId);
		Wszcqk g = wszcqkService.findOne(t.getId());
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			g.setJcsj(t.getJcsj());
			g.setXqhj(t.getXqhj());
			g.setLjxf(t.getLjxf());
			g.setGc(t.getGc());
			g.setGybw(t.getGybw());
			g.setShfz(t.getShfz());
			g.setUpdateDate(new Date());
			wszcqkService.update(g);
		}
		return "redirect:/wszcqk/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		updateBusinessForm(businessFormId);
		Wszcqk g = wszcqkService.findOne(id);
		if (g.getBusinessForm().getId().equals(businessFormId)) {
			wszcqkService.delete(id);
		}
		return "redirect:/wszcqk/item/1/" + businessFormId;
	}
}
