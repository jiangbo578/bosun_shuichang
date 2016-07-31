package com.gouhai.baoshan.controller.business.jcqk.rymd;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Qzwhtd;
import com.gouhai.baoshan.service.business.jcqk.rymd.QzwhtdService;

/**
 * 群众文化团队 Controller entity:Qzwhtd
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/qzwhtd")
public class QzwhtdController extends BusinessFormController {
	@Autowired
	private QzwhtdService qzwhtdService;

	public QzwhtdController() {
		super("qzwhtd");
	}

	// 初始化转换日期
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "birthday",
				new CustomDateEditor(dateFormat, true));
	}

	// 查询
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/qzwhtd/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(
				qzwhtdService.getTdmcList(businessForm, current),
				qzwhtdService.getTdmcCount(businessForm), current));
		return "/business/qzwhtd/item/index";
	}

	// 增加
	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/qzwhtd/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Qzwhtd qzwhtd, String businessFormId) {
		qzwhtd.setBusinessForm(new BusinessForm(businessFormId));
		qzwhtdService.insert(qzwhtd);
		return "redirect:/qzwhtd/item/1/" + businessFormId;
	}

	// 修改
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("qzwhtd", qzwhtdService.findOne(id));
		return "/business/qzwhtd/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Qzwhtd qzwhtd, String businessFormId) {
		Qzwhtd q = qzwhtdService.findOne(qzwhtd.getId());
		if (q.getBusinessForm().getId().equals(businessFormId)) {
			q.setTdname(qzwhtd.getTdname());
			q.setName(qzwhtd.getName());
			q.setSex(qzwhtd.getSex());
			q.setBirthday(qzwhtd.getBirthday());
			q.setRdny(qzwhtd.getRdny());
			q.setYdwrole(qzwhtd.getYdwrole());
			q.setTdrole(qzwhtd.getTdrole());
			q.setAddress(qzwhtd.getAddress());
			q.setPhone(qzwhtd.getPhone());
			q.setClsj(qzwhtd.getClsj());
			q.setHdsj(qzwhtd.getHdsj());
			q.setHdaddress(qzwhtd.getHdaddress());
			q.setType(qzwhtd.getType());
			q.setUpdateDate(new Date());
			qzwhtdService.update(q);
		}
		return "redirect:/qzwhtd/item/1/" + businessFormId;
	}

	// 删除
	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		Qzwhtd q = qzwhtdService.findOne(id);
		if (q.getBusinessForm().getId().equals(businessFormId)) {
			qzwhtdService.delete(id);
		}
		return "redirect:/qzwhtd/item/1/" + businessFormId;
	}
}
