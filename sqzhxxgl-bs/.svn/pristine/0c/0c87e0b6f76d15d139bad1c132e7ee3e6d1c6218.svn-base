/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.publics;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
 * @author 肖得明
 * 
 */
@Controller
@RequestMapping(value = "/puser")
public class PuserController extends PageableController {

	@Autowired
	private UserService userService;

	
	@RequestMapping(value = "/pass", method = RequestMethod.GET)
	public String toPass(Model model,HttpSession session) {
		
		model.addAttribute("user", userService.findOne(session.getAttribute("userId")+""));
		return "/user/chagepass";
		
	}
	@RequestMapping(value = "/pass", method = RequestMethod.POST)
	public String pass(Model model, HttpSession session,HttpServletResponse response,HttpServletRequest request) {
		String userid = request.getParameter("id");
		String pass1 = request.getParameter("password1");
		String pass2 = request.getParameter("password2");
		User u =userService.findOne(userid);
		if(u==null){
			model.addAttribute("msg", "用户不存在!");
		}else{
			if(u.getPassword().equals(pass1)){
				u.setPassword(pass2);
				userService.update(u);
				model.addAttribute("msg", "密码修改成功!");
			}else{
				model.addAttribute("msg", "原始密码错误!");
			}
			
		}
		model.addAttribute("user", u);
		//System.out.println(user.getId());
		return "/user/chagepass";
	}
	
	

}
