/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.fd;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbsspro;
import com.gouhai.baoshan.service.business.dqgz.fd.SxsbssproService;

/**
 * 
 * 实事项目
 * @author sun 2014-08-18
 * 
 */
@Controller
@RequestMapping(value = "/sxsbsspro")
public class SxsbssproController extends BusinessFormController {
	@Autowired
	private SxsbssproService sxsbssproService;
	
	public SxsbssproController() {
		super("sxsbsspro");
	}
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/sxsbsspro/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "sxsbsspro");
		model.addAllAttributes(pageResult(sxsbssproService.getBeanList(businessForm, current),
				sxsbssproService.getBeanCount(businessForm), current));
		return "/business/sxsbsspro/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/sxsbsspro/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Sxsbsspro sxsbsspro, String businessFormId) {
		updateBusinessForm(businessFormId);
		sxsbsspro.setBusinessForm(new BusinessForm(businessFormId));
		sxsbssproService.insert(sxsbsspro);
		return "redirect:/sxsbsspro/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		updateBusinessForm(businessFormId);
		sxsbssproService.delete(id, businessFormId);
		return "redirect:/sxsbsspro/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("sxsbsspro", sxsbssproService.findOne(id));
		return "/business/sxsbsspro/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Sxsbsspro sxsbsspro, String businessFormId){
		updateBusinessForm(businessFormId);
		sxsbssproService.update(sxsbsspro, businessFormId);
		return "redirect:/sxsbsspro/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("sxsbsspro:check")){
			return "/error/unauthority";
		}
		return "redirect:/sxsbsspro/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("sxsbsspro:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "sxsbsspro");
		model.addAllAttributes(pageResult(sxsbssproService.getBeanList(businessForm, current),
				sxsbssproService.getBeanCount(businessForm), current));
		return "/business/sxsbsspro/check";
	}
	/**
	 * 导出数据   双学双比活动情况（实事项目   示范基地   女性专业合作社   美好家园示范村=》活动情况   女能手名册）
	 */
	@RequestMapping(value = "/export/extend/{businessFormId}", method = RequestMethod.GET)
	public void export(HttpServletRequest request,HttpServletResponse response ,@PathVariable String businessFormId){
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		Map<String,Object> dataMap = constructDataMap(businessForm,moduleName,null);//组装word所需要的map数据 实事项目
		
		dataMap = constructDataMap(businessForm,"sxsbsfbase",dataMap);//填充 示范基地    数据 
		dataMap = constructDataMap(businessForm,"sxsbsfwomanhzs",dataMap);//填充 女性专业合作社    数据 
		dataMap = constructDataMap(businessForm,"sxsbmhsfc",dataMap);//填充  美好家园示范村=》活动情况   数据 
		dataMap = constructDataMap(businessForm,"sxsbsfnvhand",dataMap);//填充 女能手名册  数据 
		String fileName = businessForm.getName();
		exportWord(moduleName,dataMap,response,handlerEncoding(request,fileName));//导出word
	}
}
