package com.gouhai.baoshan.controller.business.dqgz.zb;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dzbwy;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dzbwysj;
import com.gouhai.baoshan.service.business.dqgz.zb.DzbwyService;
import com.gouhai.baoshan.service.business.dqgz.zb.head.DzbwysjService;

/**
 * 党支部委员及党小组长名册 Controller Entity:Dzbwy
 * 
 * @author 徐舟
 * 
 */
@Controller
@RequestMapping(value = "/dzbwy")
public class DzbwysjController extends BusinessFormController {
	@Autowired
	private DzbwysjService dzbwysjService;
	@Autowired
	private DzbwyService dzbwyService;

	public DzbwysjController() {
		super("dzbwy");
	}

	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/dzbwy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Dzbwysj d = dzbwysjService.findOne(businessForm);
		if (d == null) {
			d = new Dzbwysj();
			d.setBjdxrq(null);
			d.setBusinessForm(businessForm);
			dzbwysjService.insert(d);
		}
		model.addAttribute("d", d);
		model.addAllAttributes(pageResult(dzbwyService.getObjList(current,
						businessForm), dzbwyService.getObjCount(businessForm),
						current));
		return "/business/dzbwy/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/dzbwy/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Dzbwy t, String businessFormId) {
		t.setBusinessForm(new BusinessForm(businessFormId));
		dzbwyService.insert(t);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/dzbwy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id,
			@PathVariable() String businessFormId) {
		dzbwyService.delete(id);
		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/dzbwy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("dzbwy", dzbwyService.findOne(id));
		return "/business/dzbwy/item/update";
	}

	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Dzbwy t, String businessFormId) {
		Dzbwy d = dzbwyService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			d.setName(t.getName());
			d.setRemark(t.getRemark());
			d.setRole(t.getRole());
			d.setFgnr(t.getFgnr());
			d.setZrsj(t.getZrsj());
			dzbwyService.update(d);
		}

		updateBusinessForm(businessFormId);// 更新业务表
		return "redirect:/dzbwy/item/1/" + businessFormId;
	}

	// 修改头部
	@RequestMapping(value = "/item/head/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdateHead(Model model, @PathVariable String id,
			@PathVariable() String businessFormId) {
		model.addAttribute("d", dzbwysjService.findOne(id));
		return "/business/dzbwy/item/head/update";
	}

	@RequestMapping(value = "/item/head/update", method = RequestMethod.POST)
	public String updateHead(Dzbwysj t, String businessFormId) {
		Dzbwysj d = dzbwysjService.findOne(t.getId());
		if (d.getBusinessForm().getId().equals(businessFormId)) {
			updateBusinessForm(businessFormId);// 更新业务表
			d.setBjdxrq(t.getBjdxrq());
			d.setHjxjxs(t.getHjxjxs());
			d.setJmrq(t.getJmrq());
			dzbwysjService.update(d);
		}

		return "redirect:/dzbwy/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId) {

		return "redirect:/dzbwy/check/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current,
			@PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		Dzbwysj d = dzbwysjService.findOne(businessForm);
		model.addAttribute("d", d);
		model.addAllAttributes(pageResult(dzbwyService.getObjList(current,
						businessForm), dzbwyService.getObjCount(businessForm),
						current));
		return "/business/dzbwy/check";
	}
	@RequestMapping(value = "/export/extend/{businessFormId}", method = RequestMethod.GET)
	public void export(HttpServletRequest request,HttpServletResponse response ,@PathVariable String businessFormId){
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		Map<String,Object> dataMap = constructDataMap(businessForm,moduleName,null);//组装word所需要的map数据
		
		dataMap = constructDataMap(businessForm,"Dzbwysj",dataMap);//填充表头数据
		String fileName = businessForm.getName();
		exportWord(moduleName,dataMap,response,handlerEncoding(request,fileName));//导出word
	}
}
