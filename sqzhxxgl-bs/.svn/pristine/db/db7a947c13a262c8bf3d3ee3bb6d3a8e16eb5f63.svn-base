/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.controller.person;

import java.text.ParseException;
import java.util.List;

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

import com.gouhai.baoshan.entity.person.Person;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.person.PersonService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.SecurityUtil;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Controller
@RequestMapping(value = "/person")
public class PersonController extends PageableController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	@ResponseBody
	public List<Person> search(String searchName) throws ParseException {
		System.out.println("ajax请求进来了..." + searchName);
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		List<Person> persons = personService.findPerson(searchName,or.getCode());
//	System.out.println("长度"+persons.size());
		return persons;
	}

	// 查询
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String toIndex() {
		return "redirect:/person/find/1";
	}

	@RequestMapping(value = "/find/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current, String code)
			throws ParseException {
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
		Organization or = (Organization) shiroSession.getAttribute("userOrgan");
		model.addAllAttributes(pageResult(
				personService.getObjList(current, or.getCode(), code),
				personService.getObjCount(or.getCode(), code), current));
		model.addAttribute("code", code);
		return "/person/index";
	}
}
