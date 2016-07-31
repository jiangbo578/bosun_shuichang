/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.business;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessType;
import com.gouhai.baoshan.entity.business.Remind;
import com.gouhai.baoshan.service.business.BusinessService;
import com.gouhai.baoshan.service.business.BusinessTypeService;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 业务
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/business")
public class BusinessController extends PageableController {

	@Autowired
	private BusinessService businessService;
	@Autowired
	private BusinessTypeService businessTypeService;//业务类型
	
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String code) {
		return "redirect:/business/1/"+code;
	}

	@RequestMapping(value = "/type/{code}", method = RequestMethod.GET)
	public String jsontype(HttpServletResponse response,@PathVariable() String code) {
		try {
			List<BusinessType> list =businessTypeService.findByparid(code);
			JSONArray json = JSONArray.fromObject(list);
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@RequestMapping(value = "/{current}/{code}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,@PathVariable() String code) {
		model.addAllAttributes(pageResult(businessService.getBusinessList(current,code),
				businessService.getBusinessCount(code), current));
		return "/business/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		return "/business/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Business business) {
		business.setLowerCode();
		businessService.insert(business);
		return "redirect:/business/1";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		businessService.delete(id);
		return "redirect:/business/1";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		Business bs =businessService.findOne(id);
		model.addAttribute("business", bs);
		model.addAttribute("types", businessTypeService.findOneByCode(bs.getParid()));
		return "/business/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Business business) {
		Business findBusiness = businessService.findOne(business.getId());
		if (findBusiness != null) {
			findBusiness.setPeriod(business.getPeriod());
			findBusiness.setName(business.getName());
			findBusiness.setCode(business.getCode());
			findBusiness.setLowerCode();
			findBusiness.setFormat(business.getFormat());
			findBusiness.setAudit(business.isAudit());
			findBusiness.setRemind(business.isRemind());
			findBusiness.setUpdateDate(new Date());
			findBusiness.setParid(business.getParid());
			findBusiness.setExporttype(business.getExporttype());
			businessService.update(findBusiness);
		}
		return "redirect:/business/1";
	}

	@RequestMapping(value = "/findRemind", method = RequestMethod.GET)
	@ResponseBody
	public List<Remind> findRemindBusinessList(){
		List<Remind> reminds = businessService.findRemindBusinessList();
	//	System.out.println("集合长度"+reminds.get(0).getName());
		return reminds;
	}
	@RequestMapping(value = "/findRemindMore", method = RequestMethod.GET)
	public String findRemindBusinessMoreList(Model model){
		List<Remind> reminds = businessService.findRemindBusinessList();
	//	System.out.println("集合长度"+reminds.get(0).getName());
		model.addAttribute("businessList", reminds);
		return "/test/ganshitask";
	}
	/*
	 * @author sun 2014-08-13
	 * 消息提示 
	 */
    public void saveMessage(HttpServletRequest request, String msg) {
        List messages = (List) request.getSession().getAttribute("message");
        if (messages == null) {
            messages = new ArrayList();
        }
        messages.add(msg);
        request.getSession().setAttribute("message", messages);
    }
}
