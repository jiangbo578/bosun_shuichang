/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.entity.assess.AssessTemplateInstance;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.entity.user.OrganizationVo;
import com.gouhai.baoshan.service.assess.AssessTemplateInstanceService;
import com.gouhai.baoshan.service.user.OrganizationService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.CollectionUtils;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.entiy.Tnode;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/organization")
public class OrganizationController extends PageableController {

	@Autowired
	private OrganizationService organizationService;
@Autowired
private AssessTemplateInstanceService assessTemplateInstanceService;
	@RequestMapping(value = "/orglit/{id}", method = RequestMethod.GET)
	public String orglit(@PathVariable String id,HttpServletResponse response) throws IOException {
		//获取登录用户的组织结构
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Organization organization = (Organization) session.getAttribute("userOrgan");
		String	selectDate = DateTimeUtil.getDateToString(new Date(), "yyyy");// 为空则默认当前时间年份
    	PrintWriter out = response.getWriter();
    	response.setContentType("application/json;charset=GBK");
    List<Tnode> list =new ArrayList<Tnode>();
    Tnode   t1= new Tnode();
    t1.setId("1");
	t1.setName("上海市嘉定区");
	t1.setpId("0");
	t1.setOpen(true);
	list.add(t1);
	List<Organization> org =null;
			if(organization.getId().equals("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")){
				org=organizationService.getOrganizationAll(null);
			}else{
				org=organizationService.getOrganizationAll(organization);
			}
	for(Organization o:org){
		t1= new Tnode();

		if(o.getParent()!=null){
		if(o.getParent().getId().equals("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1")){
			t1.setId(o.getId());
			t1.setName(o.getName());
			t1.setpId("1");
			t1.setOpen(false);
			list.add(t1);				
		}else {
			//1为未提交.2提交.3保存
			///如果提交了就查询提交了几张600分考评
			if(o.getType()!=null &&(o.getType()==1||o.getType()==2)){
				//t1.setIcon("/styles/images/cross.png");
				Long count=	assessTemplateInstanceService.getSubmitKpCount(selectDate, o);	
				if(count>0){
				t1.setIcon("/styles/images/"+count+".gif");			}else{
					t1.setIcon("/styles/images/cross.png");
				}
				
			}else if(o.getType()!=null &&o.getType()==3){
				Long count=assessTemplateInstanceService.getSaveKpCount(selectDate, o);
				t1.setIcon("/styles/images/save.png");
			}else{
				t1.setIcon("/styles/images/cross.png");
			}
	
			t1.setId(o.getId());
			t1.setName(o.getName());
			t1.setpId(o.getParent().getId());
			t1.setOpen(false);
			list.add(t1);	
		
		}
		}
		
		
	}
	
	JSONArray json = JSONArray.fromObject(list);
	out.print(json.toString());
	//System.out.println(json.toString());
	out.flush();
	out.close();
	
	
	return null;
	}
	
	
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
		if(!SecurityUtils.getSubject().isPermitted("organization:list")){
			return "/error/unauthority";
		}
	
		return "redirect:/organization/list/1";
	}

	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if(!SecurityUtils.getSubject().isPermitted("organization:list")){
			return "/error/unauthority";
		}
		model.addAllAttributes(pageResult(organizationService.getOrganizationList(current),
				organizationService.getOrganizationCount(), current));
		return "/user/organization/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		if(!SecurityUtils.getSubject().isPermitted("organization:add")){
			return "/error/unauthority";
		}
		return "/user/organization/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Organization organization) {
		if(!SecurityUtils.getSubject().isPermitted("organization:add")){
			return "/error/unauthority";
		}
		Organization o =organizationService.findOne("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1");
		organization.setParent(o);
		organization.setFlag(2);
		organizationService.insert(organization);
		return "redirect:/organization/list/1";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		if(!SecurityUtils.getSubject().isPermitted("organization:delete")){
			return "/error/unauthority";
		}
		organizationService.delete(id);
		return "redirect:/organization/list/1";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		if(!SecurityUtils.getSubject().isPermitted("organization:update")){
			return "/error/unauthority";
		}
		model.addAttribute("organization", organizationService.findOne(id));
		return "/user/organization/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Organization organization) {
		if(!SecurityUtils.getSubject().isPermitted("organization:update")){
			return "/error/unauthority";
		}
		Organization findOrganization = organizationService.findOne(organization.getId());
		if (findOrganization != null) {
			findOrganization.setName(organization.getName());
			findOrganization.setDescription(organization.getDescription());
			findOrganization.setFlag(2);
			findOrganization.setUpdateDate(new Date());
			organizationService.update(findOrganization);
		}
		return "redirect:/organization/list/1";
	}
	

	@RequestMapping(value = "/child/{parentId}", method = RequestMethod.GET)
	public String toChildIndex(@PathVariable String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:child")){
			return "/error/unauthority";
		}
		return "redirect:/organization/child/"+parentId+"/1";
	}

	@RequestMapping(value = "/child/{parentId}/{current}", method = RequestMethod.GET)
	public String childIndex(Model model, @PathVariable String parentId, @PathVariable() int current) {
		if(!SecurityUtils.getSubject().isPermitted("organization:child")){
			return "/error/unauthority";
		}
		Organization organization = organizationService.findOne(parentId);
		model.addAllAttributes(pageResult(organizationService.getOrganizationList(organization, current),
				organizationService.getOrganizationCount(organization), current));
		model.addAttribute("parentName", organization.getName());
		return "/user/organization/child/index";
	}

	//办事处
	@RequestMapping(value = "/bsc/{parentId}", method = RequestMethod.GET)
	public String toBscIndex(@PathVariable String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:bsc")){
			return "/error/unauthority";
		}
		return "redirect:/organization/bsc/"+parentId+"/1";
	}
	//子办事处列表
	@RequestMapping(value = "/bsc/{parentId}/{current}", method = RequestMethod.GET)
	public String bscIndex(Model model, @PathVariable String parentId, @PathVariable() int current) {
		if(!SecurityUtils.getSubject().isPermitted("organization:bsc")){
			return "/error/unauthority";
		}
		Organization organization = organizationService.findOne(parentId);
		
		model.addAllAttributes(pageResult(organizationService.getOrgbscList(organization, current),
				organizationService.getOrgbscCount(organization), current));
		model.addAttribute("parentName", organization.getName());
		return "/user/organization/bsc/index";
	}
	
	
	

	
	
	@RequestMapping(value = "/childall/{parentId}", method = RequestMethod.GET)
	@ResponseBody
	public List<OrganizationVo> childAll(@PathVariable String parentId) {
		Organization organization = organizationService.findOne(parentId);
		List<OrganizationVo> organizationVos = new ArrayList<OrganizationVo>();
		List<Organization> organizations = new ArrayList<Organization>();
		organizations = organizationService.getOrganizationList(organization);
		if (!CollectionUtils.isEmpty(organizations)) {
			for (Organization Organization : organizations) {
				organizationVos.add(new OrganizationVo(Organization.getId(), Organization.getName()));
			}
		}
		return organizationVos;
	}
	
	//输出一个区域的职能部门
	@RequestMapping(value = "/znbmAll/{parentId}", method = RequestMethod.GET)
	public String znbmAll(HttpServletResponse response,@PathVariable String parentId) throws IOException {
		List<Organization> organizations = organizationService.getOrganizationList(parentId);
		JSONArray json = JSONArray.fromObject(organizations);
		response.getWriter().write(json.toString());
		return null;
	}
	
	
	@RequestMapping(value = "/bsc/add/{parentId}", method = RequestMethod.GET)
	public String tobscdAdd(Model model, @PathVariable String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:bsc")){
			return "/error/unauthority";
		}
		Organization parent = organizationService.findOne(parentId);
		if (parent != null) {
			model.addAttribute("parentName", parent.getName());
		}
		return "/user/organization/bsc/add";
	}
	//办事处的添加
	@RequestMapping(value = "/bsc/add", method = RequestMethod.POST)
	public String bscAdd(Organization organization, String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:bsc")){
			return "/error/unauthority";
		}
		organization.setLevel(2);//设置的级别
		organization.setParent(new Organization(parentId));
		organization.setDeleted(false);
		organizationService.insert(organization);
		return "redirect:/organization/bsc/"+parentId+"/1";
	}
	
	

	//办事处的删除
	@RequestMapping(value = "/bsc/delete/{id}/{parentId}", method = RequestMethod.GET)
	public String bscDelete(@PathVariable String id, @PathVariable String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:bsc")){
			return "/error/unauthority";
		}
		organizationService.delete(id);
		return "redirect:/organization/bsc/"+parentId+"/1";
	}
	
	@RequestMapping(value = "/bsc/update/{id}/{parentId}", method = RequestMethod.GET)
	public String tobscUpdate(Model model, @PathVariable String id, @PathVariable String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:bsc")){
			return "/error/unauthority";
		}
		model.addAttribute("organization", organizationService.findOne(id));
		Organization parent = organizationService.findOne(parentId);
		if (parent != null) {
			model.addAttribute("parentName", parent.getName());
		}
		return "/user/organization/bsc/update";
	}

	@RequestMapping(value = "/bsc/update", method = RequestMethod.POST)
	public String	bscUpdate(Organization organization, String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:bsc")){
			return "/error/unauthority";
		}
		Organization findOrganization = organizationService.findOne(organization.getId());
		if (findOrganization != null) {
			findOrganization.setLevel(2);
			findOrganization.setName(organization.getName());
			findOrganization.setDescription(organization.getDescription());
			findOrganization.setUpdateDate(new Date());
			organizationService.update(findOrganization);
		}
		return "redirect:/organization/bsc/"+parentId+"/1";
	}
	
	
	
	
	@RequestMapping(value = "/child/add/{parentId}", method = RequestMethod.GET)
	public String toChildAdd(Model model, @PathVariable String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:child")){
			return "/error/unauthority";
		}
		Organization parent = organizationService.findOne(parentId);
		if (parent != null) {
			model.addAttribute("parentName", parent.getName());
		}
		return "/user/organization/child/add";
	}

	@RequestMapping(value = "/child/add", method = RequestMethod.POST)
	public String childAdd(Organization organization, String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:child")){
			return "/error/unauthority";
		}
		organization.setParent(new Organization(parentId));
		organization.setDeleted(false);
		organization.setType(1);
		organizationService.insert(organization);
		return "redirect:/organization/child/"+parentId+"/1";
	}

	@RequestMapping(value = "/child/delete/{id}/{parentId}", method = RequestMethod.GET)
	public String childDelete(@PathVariable String id, @PathVariable String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:child")){
			return "/error/unauthority";
		}
		organizationService.delete(id);
		return "redirect:/organization/child/"+parentId+"/1";
	}

	@RequestMapping(value = "/child/update/{id}/{parentId}", method = RequestMethod.GET)
	public String toChildUpdate(Model model, @PathVariable String id, @PathVariable String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:child")){
			return "/error/unauthority";
		}
		model.addAttribute("organization", organizationService.findOne(id));
		Organization parent = organizationService.findOne(parentId);
		if (parent != null) {
			model.addAttribute("parentName", parent.getName());
		}
		return "/user/organization/child/update";
	}

	@RequestMapping(value = "/child/update", method = RequestMethod.POST)
	public String childUpdate(Organization organization, String parentId) {
		if(!SecurityUtils.getSubject().isPermitted("organization:child")){
			return "/error/unauthority";
		}
		Organization findOrganization = organizationService.findOne(organization.getId());
		if (findOrganization != null) {
			findOrganization.setName(organization.getName());
			findOrganization.setDescription(organization.getDescription());
			findOrganization.setUpdateDate(new Date());
			findOrganization.setFlag(organization.getFlag());
			findOrganization.setType(1);
			findOrganization.setCode(organization.getCode());
			organizationService.update(findOrganization);
		}
		return "redirect:/organization/child/"+parentId+"/1";
	}
}
