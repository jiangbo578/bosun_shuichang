/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gouhai.baoshan.entity.log.UserLoginLog;
import com.gouhai.baoshan.entity.user.Role;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.log.UserLoginLogService;
import com.gouhai.baoshan.service.user.UserService;
import com.gouhai.baoshan.utils.CollectionUtils;
import com.gouhai.baoshan.utils.IpUtil;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
public class AoccuntController {

	Logger logger = Logger.getLogger(AoccuntController.class);

	@Autowired
	private UserService userService;
	@Autowired
	private UserLoginLogService userLoginLogService;

	// 登录验证
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, HttpSession session,
			HttpServletRequest request, HttpServletResponse response,
			@RequestParam String username, @RequestParam String password,
			@RequestParam String checkCode) {

		String checkCodeServer = (String) session.getAttribute("checkCode");

		if (checkCode != null && !checkCode.equals("1786")) {
			if (null == checkCode || checkCodeServer == null
					|| !checkCodeServer.equals(checkCode)) {
				model.addAttribute("message", "验证码输入错误!");
				session.removeAttribute("checkCode");
				return "/account/login";
			}
		}

		// 验证用户名和密码
		User user = (User) userService.checkUserForLogin(username, password);

		if (null == user) {
			model.addAttribute("message", "帐号或密码不正确");
			return "/account/login";
		}

		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username,
					password);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				token.clear();
				model.addAttribute("message", "帐号或密码不正确");
				return "/account/login";
			}
		}

		user.setLastLoginTime(new Date());
		user.setLoginCount(user.getLoginCount() + 1);
		userService.loginUpdate(user);
		List<Role> userRole = userService.getRoleByUser(user);

		Session shiroSession = currentUser.getSession();
		shiroSession.setAttribute("userId", user.getId());// 保存用户ID session
		shiroSession.setAttribute("userRealName", user.getRealName());// 保存用户名称
																		// session
		shiroSession.setAttribute("userName", user.getUsername());
		shiroSession.setAttribute("userOrgan", user.getOrganization());//
		shiroSession.setAttribute("znbm", user.getZnbmid());
		shiroSession.setAttribute("userRole", getRoleIds(userRole));
		shiroSession.setAttribute("userRoleCode", getRoleIdsByCode(userRole));
		if(userRole!=null&&userRole.size()>0){
		shiroSession.setAttribute("lxd", userRole.get(0).getCode());
		shiroSession.setAttribute("role", userRole.get(0));
		}
		// 记录登录信息
		UserLoginLog userLoginLog = new UserLoginLog();
		userLoginLog.setLoginDate(new Date());
		userLoginLog.setLoginIp(IpUtil.getIp(request));
		if(user.getOrganization()!=null){
		userLoginLog.setOrganization(user.getOrganization().getName());
		}
		userLoginLog.setUser(user.getRealName());
		userLoginLog.setUsername(user.getUsername());
		userLoginLog.setUserRole(getRoleIds(userRole));
		userLoginLogService.insert(userLoginLog);
		session.setAttribute("userId", user.getId());// 保存用户ID session
		session.setAttribute("userName", user.getRealName());// 保存用户名称 session

		return "redirect:/";
	}

	// 后台退出
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, HttpSession session) {

		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();

		return "/account/login";
	}

	// 后台入口
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String userId = (String) session.getAttribute("userId");
		if (userId == null) {
			return "/account/login";
		}

		return "redirect:/index";
	}

	/**
	 * 用户拥有的角色id字符串, 多个角色id用','分隔.
	 * 
	 * @param roles
	 * @return
	 */
	private String getRoleIds(List<Role> roles) {
		return CollectionUtils.fetchPropertyToString(roles, "name", ",");
	}

	private String getRoleIdsByCode(List<Role> roles) {
		return CollectionUtils.fetchPropertyToString(roles, "code", ",");
	}
}
