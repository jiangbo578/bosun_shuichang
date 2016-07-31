/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.user.Authority;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.service.user.RoleService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.CollectionUtils;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController extends PageableController {

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String toIndex() {
		return "redirect:/role/1";
	}

	@RequestMapping(value = "/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		List<Role> roles = roleService.getRoleList(current);
		for (Role role : roles) {
			role.setAuthoritys(roleService.getAuthorityByRole(role));
		}
		model.addAllAttributes(pageResult(roles, roleService.getRoleCount(), current));
		return "/user/role/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd(Model model) {
		model.addAttribute("authorityMap", roleService.getAllAuthorityForMap());
		return "/user/role/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Role role, String[] authorityIds) {
		roleService.insert(role, authorityIds);
		return "redirect:/role/1";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		roleService.delete(id);
		return "redirect:/role/1";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		model.addAttribute("role", roleService.findOne(id));
		model.addAttribute("authorityIds", getAuthorityIds(roleService.getAuthorityByRole(new Role(id))));
		model.addAttribute("authorityMap", roleService.getAllAuthorityForMap());
		return "/user/role/update";
	}

	/**
	 * 角色拥有的权限id字符串, 多个权限id用','分隔.
	 * @param authoritys
	 * @return
	 */
	private String getAuthorityIds(List<Authority> authoritys){
		return CollectionUtils.fetchPropertyToString(authoritys, "id", ",");
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Role role, String[] authorityIds) {
		roleService.update(role, authorityIds);
		return "redirect:/role/1";
	}

}
