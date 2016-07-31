package com.gouhai.baoshan.controller.business.ggfw.llgz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Lnxxry;
import com.gouhai.baoshan.entity.business.ggfw.llgz.head.Lnxx;
import com.gouhai.baoshan.service.business.ggfw.llgz.LnxxryService;
import com.gouhai.baoshan.service.business.ggfw.llgz.head.LnxxService;

/**
 * 老年学校在册人员名册 Controller Entity:Lnxx
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/lnxx")
public class LnxxController extends BusinessFormController {
	@Autowired
	private LnxxService lnxxService;
	@Autowired
	private LnxxryService lnxxryService;

	public LnxxController() {
		super("lnxx");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/lnxx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Lnxx f = lnxxService.findOne(businessForm);
		if (f == null) {
			f = new Lnxx();
			f.setJlsj(null);
			f.setBusinessForm(businessForm);
			lnxxService.insert(f);
		}
		 model.addAttribute("lnxx", f);
		 model.addAllAttributes(pageResult(lnxxryService.getObjList(current,
		 f), lnxxryService.getObjCount(f),
		 current));
		return "/business/lnxx/item/index";
	}

	@RequestMapping(value = "/item/add/{lnxxid}/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String lnxxid,@PathVariable() String businessFormId) {
		return "/business/lnxx/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Lnxxry t, String lnxxid,String businessFormId) {
		t.setLnxx(new Lnxx(lnxxid));
		lnxxryService.insert(t);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/lnxx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		lnxxryService.delete(id);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/lnxx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}/{lnxxid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId,@PathVariable() String lnxxid) {
		model.addAttribute("lnxxry", lnxxryService.findOne(id));
		return "/business/lnxx/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Lnxxry t, String businessFormId,String lnxxid) {
		Lnxxry d = lnxxryService.findOne(t.getId());
		if (d.getLnxx().getId().equals(lnxxid)) {
			updateBusinessForm(businessFormId);// 更新业务表
			d.setName(t.getName());
			d.setSex(t.getSex());
			d.setAge(t.getAge());
			d.setUpdateDate(new Date());
			lnxxryService.update(d);
		}

		return "redirect:/lnxx/item/1/" + businessFormId;
	}

	// 修改头部
	@RequestMapping(value = "/item/head/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdateHead(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("lnxx", lnxxService.findOne(id));
		return "/business/lnxx/item/head/update";
	}

	@RequestMapping(value = "/item/head/update", method = RequestMethod.POST)
	public String updateHead(Lnxx t, String businessFormId) {
		Lnxx d = lnxxService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);// 更新业务表
			d.setJlsj(t.getJlsj());
			d.setXxmc(t.getXxmc());
			lnxxService.update(d);
		}

		return "redirect:/lnxx/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {

		return "redirect:/lnxx/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {

		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Lnxx f = lnxxService.findOne(businessForm);
		model.addAttribute("lnxx", f);
		// model.addAllAttributes(pageResult(lnxxryService.getObjList(current,
		// businessForm), lnxxryService.getObjCount(businessForm),
		// current));
		return "/business/lnxx/check";
	}

	// /**
	// * 导出表头及数据
	// */
	// @RequestMapping(value = "/export/extend/{businessFormId}", method =
	// RequestMethod.GET)
	// public void export(HttpServletRequest request,
	// HttpServletResponse response, @PathVariable String businessFormId) {
	// BusinessForm businessForm = businessFormService.findOne(businessFormId);
	// Map<String, Object> dataMap = constructDataMap(businessForm,
	// moduleName, null);// 组装word所需要的map数据
	// dataMap = constructDataMap(businessForm, "lnxxry", dataMap);// 填充表头数据
	// String fileName = businessForm.getName();
	// exportWord(moduleName, dataMap, response, handlerEncoding(request,
	// fileName));// 导出word
	// }
}
