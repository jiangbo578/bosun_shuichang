/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.jcqk.rymd;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
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
import com.gouhai.baoshan.entity.business.jcqk.rymd.Gzldxz;
import com.gouhai.baoshan.service.business.jcqk.rymd.GzldxzService;
import com.gouhai.baoshan.utils.ExportDocUtil;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/gzldxz")
public class GzldxzController extends BusinessFormController {

	@Autowired
	private GzldxzService gzldxzService;

	public GzldxzController() {
		super("Gzldxz");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "csny", new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/gzldxz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(gzldxzService.getGzldxzList(businessForm, current),
				gzldxzService.getGzldxzCount(businessForm), current));
		return "/business/gzldxz/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/gzldxz/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Gzldxz gzldxz, String businessFormId) {
		gzldxz.setBusinessForm(new BusinessForm(businessFormId));
		gzldxzService.insert(gzldxz);
		return "redirect:/gzldxz/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		gzldxzService.delete(id, businessFormId);
		return "redirect:/gzldxz/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("gzldxz", gzldxzService.findOne(id));
		return "/business/gzldxz/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Gzldxz gzldxz, String businessFormId){
		gzldxzService.update(gzldxz, businessFormId);
		return "redirect:/gzldxz/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/export/{businessFormId}")
	public void export(HttpServletResponse response ,@PathVariable String businessFormId){
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		List<Gzldxz> gzldxzs = gzldxzService.getGzldxzList(businessForm, 1);
		Map<String,Object> dataMap = new HashMap<String,Object>();
		for(int i = 1,j = gzldxzs.size();i <= j;i++){
			gzldxzs.get(i-1).setId(i+"");
//			gzldxzs.get(i-1).setBz("");
		}
		dataMap.put("gzldxz", gzldxzs);
		String fileName = businessForm.getName();
		if(fileName.contains("(")){
			try {
				fileName = URLEncoder.encode(fileName.substring(0, fileName.indexOf("(")), "UTF-8")+fileName.substring(fileName.indexOf("("));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		new ExportDocUtil("gzldxz.ftl").setDataList(dataMap).exportDocument(response, fileName);
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("gzldxz:check")){
			return "/error/unauthority";
		}
		return "redirect:/gzldxz/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("gzldxz:check")){
			return "/error/unauthority";
		}
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(gzldxzService.getGzldxzList(businessForm, current),
				gzldxzService.getGzldxzCount(businessForm), current));
		return "/business/gzldxz/check";
	}
}
