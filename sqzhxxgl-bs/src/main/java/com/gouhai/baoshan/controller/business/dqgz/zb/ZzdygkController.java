/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.zb;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.controller.business.BusinessFormController;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Zzdygk;
import com.gouhai.baoshan.entity.business.dqgz.zb.head.ZzdygkHead;
import com.gouhai.baoshan.service.business.dqgz.zb.ZzdygkService;
import com.gouhai.baoshan.service.business.dqgz.zb.head.ZzdygkHeadService;

/**
 * 
 * 
 * @author sun
 * 
 */
@Controller
@RequestMapping(value = "/zzdygk")
public class ZzdygkController extends BusinessFormController {
	@Autowired
	private ZzdygkService zzdygkService;
	
	@Autowired
	private ZzdygkHeadService zzdygkHeadService;
	protected final Log log = LogFactory.getLog(getClass());
	public ZzdygkController() {
		super("Zzdygk");
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/zzdygk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		//处理表头
		ZzdygkHead zzdygkHead = null;
		
		zzdygkHead = zzdygkHeadService.findOne(businessFormId);
		
		if(null == zzdygkHead)
		{
			
			zzdygkHead = new ZzdygkHead();
			zzdygkHead.setBusinessForm(businessForm);
			zzdygkHeadService.insert(zzdygkHead);
			log.info("first ...zzdygk  Head generate....");
		}
		model.addAttribute("zzdygkHead", zzdygkHead);
		model.addAttribute("businessForm",businessForm);
		model.addAllAttributes(pageResult(zzdygkService.getZcdygkList(businessForm, current),
				zzdygkService.getZcdygkCount(businessForm), current));
		return "/business/zzdygk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/zzdygk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Zzdygk zzdygk, String businessFormId) {
		zzdygk.setBusinessForm(new BusinessForm(businessFormId));
		zzdygkService.insert(zzdygk);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/zzdygk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		zzdygkService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/zzdygk/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("zzdygk", zzdygkService.findOne(id));
		return "/business/zzdygk/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Zzdygk zzdygk, String businessFormId){
		zzdygkService.update(zzdygk, businessFormId);
		updateBusinessForm(businessFormId);//更新业务表
		return "redirect:/zzdygk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("zzdygk:check")){
			return "/error/unauthority";
		}
		return "redirect:/zzdygk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("zzdygk:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAllAttributes(pageResult(zzdygkService.getZcdygkList(businessForm, current),
				zzdygkService.getZcdygkCount(businessForm), current));
		return "/business/zzdygk/check";
	}
	
	@RequestMapping(value = "/item/head/update/{businessFormId}", method = RequestMethod.POST)
	public String updateHead(@ModelAttribute("zzdygkHead") ZzdygkHead zzdygkHead, @PathVariable String businessFormId){
		ZzdygkHead head = zzdygkHeadService.findOneById(zzdygkHead.getId());
		if(null!=head)
		{
			head.setDate(zzdygkHead.getDate());
			head.setRegisterCount(zzdygkHead.getRegisterCount());
			head.setTcCount(zzdygkHead.getTcCount());
			head.setUpdateDate(new Date());
			head.setYbCount(zzdygkHead.getYbCount());
			head.setZsCount(zzdygkHead.getZsCount());
			head.setZzCount(zzdygkHead.getZzCount());
			zzdygkHeadService.update(head, businessFormId);
			log.info(".................update head successfully!...............");
		}
		return "redirect:/zzdygk/item/1/" + businessFormId;
	}
	@RequestMapping(value = "/export/extend/{businessFormId}", method = RequestMethod.GET)
	public void export(HttpServletRequest request,HttpServletResponse response ,@PathVariable String businessFormId){
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		Map<String,Object> dataMap = constructDataMap(businessForm,moduleName,null);//组装word所需要的map数据
		
		dataMap = constructDataMap(businessForm,"ZzdygkHead",dataMap);//填充表头数据
		String fileName = businessForm.getName();
		exportWord(moduleName,dataMap,response,handlerEncoding(request,fileName));//导出word
	}
}
