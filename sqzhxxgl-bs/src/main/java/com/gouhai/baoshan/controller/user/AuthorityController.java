/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.user;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.entity.user.Authority;
import com.gouhai.baoshan.service.user.AuthorityService;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/authority")
public class AuthorityController extends PageableController {

	@Autowired
	private AuthorityService authorityService;

	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public String toIndex(@PathVariable() String code)
			throws UnsupportedEncodingException {
		System.out.println("code：" + code);
		return "redirect:/authority/1/" + code;
	}

	@RequestMapping(value = "/{current}/{code}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current,
			@PathVariable() String code) throws UnsupportedEncodingException {
		model.addAllAttributes(pageResult(authorityService.getAuthorityList(
				current, code), authorityService.getAuthorityCount(code),
				current));
		//code = new String(code.getBytes("ISO-8859-1"), "UTF-8");
		model.addAttribute("code", code);
		return "/user/authority/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAdd() {
		return "/user/authority/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Authority authority) {
		authorityService.insert(authority);
		return "redirect:/authority/1";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		authorityService.delete(id);
		return "redirect:/authority/1";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable String id) {
		model.addAttribute("authority", authorityService.findOne(id));
		return "/user/authority/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Authority authority) {
		Authority findAuthority = authorityService.findOne(authority.getId());
		if (findAuthority != null) {
			findAuthority.setName(authority.getName());
			findAuthority.setCode(authority.getCode());
			findAuthority.setPath(authority.getPath());
			findAuthority.setDescription(authority.getDescription());
			findAuthority.setUpdateDate(new Date());
			authorityService.update(findAuthority);
		}
		return "redirect:/authority/1";
	}

}
