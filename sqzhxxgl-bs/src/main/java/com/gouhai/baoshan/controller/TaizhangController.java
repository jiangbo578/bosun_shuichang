/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.BusinessType;
import com.gouhai.baoshan.entity.mould.Mould;
import com.gouhai.baoshan.entity.mould.Mould_Gather;
import com.gouhai.baoshan.service.business.BusinessFormService;
import com.gouhai.baoshan.service.business.BusinessService;
import com.gouhai.baoshan.service.business.BusinessTypeService;
import com.gouhai.baoshan.service.mould.MouldService;
import com.gouhai.baoshan.utils.entiy.Tnode;
import com.gouhai.baoshan.utils.log.Log;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/taizhang/")
public class TaizhangController {
	@Autowired
	private BusinessService businessService;

	@Autowired
	private BusinessTypeService businessTypeService;

	@Autowired
	private MouldService mouldService;

	@RequestMapping(value = "/list/{index}")
	public String getIndex(@PathVariable String index) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String userRoleCode = (String) session.getAttribute("userRoleCode");
		return "redirect:/taizhang/list/" + index + "/" + userRoleCode;
	}

	@RequestMapping(value = "/mouldlist")
	@Log(value="11")
	public String getMouldTaizhang(Model model) {

		String typename = "村居台账";
		List<Mould> mould = mouldService.getAll();
		for (Mould mou : mould) {
			List<Mould_Gather> mg = mouldService.getGathers(mou);
			mou.setMould_Gathers(mg);
			model.addAttribute("mould", mould);
		}
		model.addAttribute("datas", mould);
		model.addAttribute("onetype", typename);
		return "/publics/bs";
	}

	@RequestMapping(value = "/list/{index}/{userRoleCode}")
	public String gettaizhangList(@PathVariable String index, Model model) {
		// 根据index获得某个台账的表单
		/**
		 * 暂时做跳转而已，以后5个类别和为一个，数据从数据库拿
		 */
		// model.addAttribute("type", index);
		/*
		 * if("1".equals(index)){ return "/page/taizhangCategory"; }
		 * if("2".equals(index)){ return "/page/taizhangCategory2"; }
		 * if("3".equals(index)){ return "/page/taizhangCategory3"; }
		 * if("4".equals(index)){ return "/page/taizhangCategory4"; }
		 */
		if ("5".equals(index)) {
			return "/page/taizhangCategory5";
		}
		List<BusinessType> list = businessTypeService.findByparid(index);
		for (BusinessType b : list) {
			List<Business> li = businessService.getBusinessByParid(b.getId());
			b.setBusinesslist(li);
		}
		String typename = "";
		if (index.equals("1")) {

			typename = "基础信息";
		} else if (index.equals("2")) {

			typename = "社会管理";
		} else if (index.equals("3")) {

			typename = "公共服务";
		} else if (index.equals("4")) {

			typename = "党群工作";
		} else if (index.equals("5")) {

			typename = "会议活动";
		}
		model.addAttribute("datas", list);
		model.addAttribute("onetype", typename);
		return "/page/taizhang";
	}

	@RequestMapping(value = "/typejson/{index}")
	public String gettaizhangList(Model model, String index,
			HttpServletResponse response) throws IOException {
		// System.out.println("请求来了");
		// 最高区域ID

		List<Business> buslist = businessService.getAllList();// 查询全部的业务表
		List<BusinessType> typelist = businessTypeService.getAllList();// 查询全部的业务类型表
		// System.err.println(typelist.size()+"wz");

		PrintWriter out = response.getWriter();
		response.setContentType("application/json;charset=GBK");
		List<Tnode> list = new ArrayList<Tnode>();

		// 初始化台账
		String arename[] = "我的台账,基础信息,社会管理,公共服务,党群工作,会议活动".split(",");
		for (int i = 0; i <= 5; i++) {
			Tnode t1 = new Tnode();
			if (i == 0) {
				t1.setId("1");
				t1.setName(arename[i]);
				t1.setpId("0");
				t1.setOpen(true);
			} else {
				t1.setId(1 + i + "");
				t1.setName(arename[i]);
				t1.setpId("1");
				t1.setOpen(false);
			}
			list.add(t1);
		}

		// 初始化子目录int i=0;i<typelist.size();i++
		Map<String, String> maptype = new HashMap<String, String>(); // 创建一个 MAP

		for (BusinessType t : typelist) {
			maptype.put(t.getId(), t.getParid());// 保存进去方便后面遍历
			Tnode t1 = new Tnode();
			t1.setId(Integer.parseInt(t.getParid()) + 1 + t.getId());
			// System.out.println(t.getName()+":"+t.getParid()+1+t.getId());

			t1.setName(t.getName());
			t1.setpId(Integer.parseInt(t.getParid()) + 1 + "");
			t1.setOpen(false);
			list.add(t1);
		}
		// 初始化表
		for (int i = 0; i < buslist.size(); i++) {
			Business b = buslist.get(i);
			Tnode t1 = new Tnode();
			if (b.getParid() != null) {
				
				t1.setId(b.getId());
				t1.setCode(b.getCode());
				// System.out.println(Integer.parseInt(maptype.get(b.getParid()))+1);
				// t1.setId(Integer.parseInt(maptype.get(b.getParid())+1)+b.getParid()+i+1+"");
//				System.out.println(b.getName());
//				System.out.println(b.getParid());
//				System.out.println(maptype.get(b.getParid()));
				t1.setpId(Integer.parseInt(Integer.parseInt(maptype.get(b.getParid())) + 1 + b.getParid())+ "");
				t1.setName(b.getName());
				t1.setOpen(false);
				list.add(t1);
			} else {
				t1.setpId("1");
				t1.setId(1 + i + "");
			
			}

		}

		JSONArray json = JSONArray.fromObject(list);
		out.print(json.toString());
		// System.out.println(json.toString());
		out.flush();
		out.close();
		return null;
	}

	@Autowired
	private TaskService taskService;
	@Autowired
	protected BusinessFormService businessFormService;

	// 设置更多待审核表单
	@RequestMapping(value = "/gengduo/", method = RequestMethod.GET)
	public String genduo(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String userId = (String) session.getAttribute("userId");
		List<BusinessForm> businessForms = new ArrayList<BusinessForm>();
		// 根据当前人未签收的任务
		List<Task> tasks = taskService.createTaskQuery().taskAssignee(userId)
				.list();

		// 根据流程的业务ID查询实体并关联
		for (Task task : tasks) {
			String processInstanceId = task.getProcessInstanceId();
			/*
			 * ProcessInstance processInstance =xia
			 * runtimeService.createProcessInstanceQuery
			 * ().processInstanceId(processInstanceId).active().singleResult();
			 * String businessKey = processInstance.getBusinessKey(); if
			 * (businessKey == null) { continue; }
			 */
			businessForms.addAll(businessFormService
					.getBusinessFormListByProcessInstanceId(processInstanceId));

		}
		model.addAttribute("businessForms", businessForms);

		return "/test/index";

	}
	//电子台账
	@RequestMapping(value = "/dztz", method = RequestMethod.GET)
	public String genduo() {
		return "/dztz";

	}
}
