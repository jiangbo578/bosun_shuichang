/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Peoplesummary;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.BusinessService;
import com.gouhai.baoshan.service.business.jcqk.gk.PeoplesummaryService;
import com.gouhai.baoshan.service.publics.NewsService;
import com.gouhai.baoshan.service.user.InitService;
import com.gouhai.baoshan.utils.DateTimeUtil;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
public class IndexController {

	@Autowired
	private InitService initService;
	@Autowired
	private TaskService taskService;
	@Autowired
	protected HistoryService historyService;
	@Autowired
	protected RuntimeService runtimeService;
	@Autowired
	protected BusinessFormService businessFormService;
	@Autowired
	protected NewsService newsService;
	
	@Autowired
	protected PeoplesummaryService peoplesummaryService;
	@Autowired
	protected BusinessService businessService;
	@Autowired  
	private  HttpServletRequest request;  

	private final static String[] mm = {"01","02","03","04","05","06","07","08","09","10","11","12"};
	
	private static final Log log = LogFactory.getLog(IndexController.class);
	
	
	@RequestMapping(value = "/centent", method = RequestMethod.GET)
	public String toCentent(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String userId = (String) session.getAttribute("userId");
		Organization organization = (Organization) session.getAttribute("userOrgan");
		List<BusinessForm> businessForms = new ArrayList<BusinessForm>();
		
		// 根据当前人未签收的任务
		List<Task> tasks = taskService.createTaskQuery().taskAssignee(userId)
				.list();
		// 根据流程的业务ID查询实体并关联
		for (Task task : tasks) {
			String processInstanceId = task.getProcessInstanceId();
			businessForms.addAll(businessFormService
					.getBusinessFormListByProcessInstanceId(processInstanceId));
			
		}
		
		model.addAttribute("businessForms", businessForms);
	
		model.addAttribute("newslist", newsService.getNewsListbytop(1));
		/**
		 * 处理首页统计表图数据
		 */
		Peoplesummary peoplesummary =null;
		if(organization!=null){
		if(organization.getFlag()!=null&&organization.getFlag()==2){
			peoplesummary=peoplesummaryService.findListByID(organization.getId());
		}else if(organization.getId().equals("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")){
			peoplesummary=peoplesummaryService.findListByID();
		}else{
			peoplesummary= peoplesummaryService.findOneByDesc(organization);
			
		}
		if(null == peoplesummary){
			peoplesummary = new Peoplesummary();
		}
		peoplesummary.setAloneCount(organization.getName());
		}
		model.addAttribute("peoplesummary", peoplesummary);
		/**
		 * 柱状图
		 */
		String date =	DateTimeUtil.getDateToString(new Date(), "yyyy");
		Business business = businessService.findOneByCode("peoplesummary");//获取到业务表
		Map<String,Integer> barMap = null;
		barMap = new HashMap<String,Integer>();
		for(String m : mm){
			barMap.put(m, 0);//初始化数据
		}
		List<BusinessForm> businessFs=null;
		try{
			if(null!=business){
				if(organization!=null){
					//查询镇下面所有居委会的数据
				if(organization.getFlag()!=null&&organization.getFlag()==2){
					businessFs=businessFormService.getBusinessFormsByORGid(organization.getId(), date,"peoplesummary");
				}else if(organization.getId().equals("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")){
					businessFs=businessFormService.getBusinessFormsByORGid(date,"peoplesummary");
				}else{
				//根据居委会查询ganshi
					businessFs=	businessFormService.getBusinessFormByYear(date,organization.getId());
			}
				}
				if(null!=businessFs && businessFs.size()>0){
					Peoplesummary summary = null;
					for(BusinessForm bf : businessFs){
						//获取唯一的peoplesummary对象
						List<Peoplesummary> summarys = peoplesummaryService.getAll(bf);//根据每一个业务填报周期 ,所在村居  查找条目记录
						String da =	DateTimeUtil.getDateToString(bf.getInsertDate(), "MM");
						if(null!=summarys && summarys.size()>0){
							summary = summarys.get(0);
							int syrkzs=0;
							if(!summary.getSyrkzs().equals("")){
								syrkzs = Integer.valueOf(summary.getSyrkzs());
							}							
							int sum=barMap.get(da);
							syrkzs+=sum;
							barMap.put(da, syrkzs);
						}
					}
				}
			}
		} catch (Exception e){
			log.error("error index", e);
		}
		model.addAttribute("map",barMap);
		
//		//登陆是村居的话
//		if(organization!=null){
//			if(organization.getFlag()!=null&&(organization.getFlag()==1||organization.getFlag()==0)){
//	        AssessRemind ar=assessTemplateService.findAssessRemind();
//	        Date time=DateTimeUtil.getYMDDate(ar.getRemindDate());
//	        System.out.println("考核时间"+DateTimeUtil.getDateToString(time,"yyyy-MM-dd"));
//			long  i=assessTemplateInstanceService.getCountByDate(organization,DateTimeUtil.getYMDDate(time));
//			}
//		}else{
//			
//		}
	    return "/centent";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String toIndex(Model model) {
		
		String retUrl = request.getHeader("Referer"); 
		//防止审核重新跳转首页
		if(retUrl !=null && retUrl.indexOf("check")!=-1){
			 return toCentent(model);
		}
	
    return "/index";
	}

	/**
	 * 没有权限
	 * 
	 * @return
	 */
	@RequestMapping(value = "/unauthority", method = RequestMethod.GET)
	public String unauthority() {

		return "/error/unauthority";
	}

	/**
	 * 系统初始化
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/init", method = RequestMethod.GET)
	public String init(Model model) {
		String message = initService.initAll();
		model.addAttribute("message", message);
		return "/init";
	}
	
}
