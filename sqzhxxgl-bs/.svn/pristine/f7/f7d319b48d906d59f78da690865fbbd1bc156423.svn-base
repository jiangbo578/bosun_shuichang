/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.user;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gouhai.baoshan.entity.Response;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.user.UserService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.CollectionUtils;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends PageableController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String toIndex() {
		return "redirect:/user/1";
	}

	@RequestMapping(value = "/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, String name) {
		List<User> users = userService.getUserList(current,name);
		for (User user : users) {
			user.setRoles(userService.getRoleByUser(user));
		}
		model.addAllAttributes(pageResult(users, userService.getUserCount(name), current));
		model.addAttribute("name", name);
		return "/user/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd(Model model) {
		model.addAttribute("organizationMap", userService.getFirstOrganizationForMap());
		model.addAttribute("roleMap", userService.getAllRoleForlist());
		return "/user/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(User user, String[] roleIds, String organizationId, String childOrganizationId) {
		
		user.setOrganization(new Organization(StringUtils.isEmpty(childOrganizationId) ? organizationId : childOrganizationId));
		userService.insert(user, roleIds);
		return "redirect:/user/1";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		userService.delete(id);
		return "redirect:/user/1";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		User user = userService.findOne(id);

		model.addAttribute("user", user);
		model.addAttribute("organizationMap", userService.getFirstOrganizationForMap());
		model.addAttribute("roleIds", getRoleIds(userService.getRoleByUser(new User(id))));
		model.addAttribute("roleMap", userService.getAllRoleForlist());
		return "/user/update";
	}

	/**
	 * 用户拥有的角色id字符串, 多个角色id用','分隔.
	 * 
	 * @param roles
	 * @return
	 */
	private String getRoleIds(List<Role> roles) {
		return CollectionUtils.fetchPropertyToString(roles, "id", ",");
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(User user, String[] roleIds, String organizationId, String childOrganizationId) {
		user.setOrganization(new Organization(StringUtils.isEmpty(childOrganizationId) ? organizationId : childOrganizationId));

		userService.update(user, roleIds);
		return "redirect:/user/1";
	}

	/**
	 * 添加用户时验证用户名
	 * @param username
	 * @return
	 */
	@RequestMapping(value = "/addCheck", method = RequestMethod.POST)
	@ResponseBody
	public Response addCheck(@RequestParam String username) {
		Response response = new Response();
		if (userService.checkUserForAdd(username)) {
			response.setError("该用户名已被占用!");
		} else {
			response.setOk("该用户名可以使用!");
		}
		return response;
	}
	
	/**
	 * 修改用户时验证用户
	 * @param username
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/updateCheck", method = RequestMethod.POST)
	@ResponseBody
	public Response updateCheck(@RequestParam String username, @RequestParam String id) {
		Response response = new Response();
		if (userService.checkUserForUpdate(username, id)) {
			response.setError("该用户名已被占用!");
		} else {
			response.setOk("该用户名可以使用!");
		}
		return response;
	}

}
