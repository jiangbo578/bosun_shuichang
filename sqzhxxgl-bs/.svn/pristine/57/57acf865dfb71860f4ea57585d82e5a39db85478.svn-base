/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business.dqgz.sygz;

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
import com.gouhai.baoshan.entity.business.dqgz.sygz.Ggwgz;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Lxgbjbqk;
import com.gouhai.baoshan.service.business.dqgz.sygz.GgwgzService;
import com.gouhai.baoshan.service.business.dqgz.sygz.LxgbjbqkService;

/**
 * 
 * 结对包户联系登记表
 * @author sun 2014-08-04 
 * 
 */
@Controller
@RequestMapping(value = "/lxgbjbqk")
public class LxgbjbqkController extends BusinessFormController {
	@Autowired
	private LxgbjbqkService ggwgzService;
	
	public LxgbjbqkController() {
		super("lxgbjbqk");
	}
	
	@RequestMapping(value = "/item/{businessFormId}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String businessFormId) {
		return "redirect:/lxgbjbqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/{current}/{businessFormId}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		BusinessForm businessForm =businessFormService.findOne(businessFormId);
		model.addAttribute("type", "lxgbjbqk");
		model.addAttribute("businessForm",businessForm);	
		model.addAllAttributes(pageResult(ggwgzService.getBeanList(businessForm, current),
				ggwgzService.getBeanCount(businessForm), current));
		return "/business/lxgbjbqk/item/index";
	}

	@RequestMapping(value = "/item/add/{businessFormId}", method = RequestMethod.GET)
	public String toAdd(@PathVariable() String businessFormId) {
		return "/business/lxgbjbqk/item/add";
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public String add(Lxgbjbqk ggwgz, String businessFormId) {
		ggwgz.setBusinessForm(new BusinessForm(businessFormId));
		ggwgzService.insert(ggwgz);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbjbqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/item/delete/{id}/{businessFormId}", method = RequestMethod.GET)
	public String delete(@PathVariable String id, @PathVariable() String businessFormId){
		ggwgzService.delete(id, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbjbqk/item/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/item/update/{id}/{businessFormId}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id, @PathVariable() String businessFormId){
		model.addAttribute("lxgbjbqk", ggwgzService.findOne(id));
		return "/business/lxgbjbqk/item/update";
	}
	
	@RequestMapping(value = "/item/update", method = RequestMethod.POST)
	public String update(Lxgbjbqk ggwgz, String businessFormId){
		ggwgzService.update(ggwgz, businessFormId);
		updateBusinessForm(businessFormId);//更新业务
		return "redirect:/lxgbjbqk/item/1/" + businessFormId;
	}

	@RequestMapping(value = "/check/{businessFormId}", method = RequestMethod.GET)
	public String toCheck(Model model, @PathVariable String businessFormId){
		if(!SecurityUtils.getSubject().isPermitted("lxgbjbqk:check")){
			return "/error/unauthority";
		}
		return "redirect:/lxgbjbqk/check/1/" + businessFormId;
	}
	
	@RequestMapping(value = "/check/{current}/{businessFormId}", method = RequestMethod.GET)
	public String check(Model model, @PathVariable() int current, @PathVariable() String businessFormId) {
		if(!SecurityUtils.getSubject().isPermitted("lxgbjbqk:check")){
			return "/error/unauthority";
		}
		
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		model.addAttribute("businessForm", businessForm);
		model.addAttribute("type", "lxgbjbqk");
		model.addAllAttributes(pageResult(ggwgzService.getBeanList(businessForm, current),
				ggwgzService.getBeanCount(businessForm), current));
		return "/business/lxgbjbqk/check";
	}
	
	/**
	 * 导出数据（离休干部基本情况表,离退休干部学习活动情况表（包括就近发挥作用、受到组织关爱等）,离退休干部担任村（居）骨干情况表,关工委工作）
	 */
	@RequestMapping(value = "/export/extend/{businessFormId}", method = RequestMethod.GET)
	public void export(HttpServletRequest request,HttpServletResponse response ,@PathVariable String businessFormId){
		BusinessForm businessForm = businessFormService.findOne(businessFormId);
		Map<String,Object> dataMap = constructDataMap(businessForm,moduleName,null);//组装word所需要的map数据 填充 离休干部基本情况表    数据 
		
		dataMap = constructDataMap(businessForm,"lxgbxxqk",dataMap);//填充 离退休干部学习活动情况表    数据 
		dataMap = constructDataMap(businessForm,"lxgbjbdrggqk",dataMap);//填充 离退休干部担任村（居）骨干情况表   数据 
		String fileName = businessForm.getName();
		exportWord(moduleName,dataMap,response,handlerEncoding(request,fileName));//导出word
	}
}
