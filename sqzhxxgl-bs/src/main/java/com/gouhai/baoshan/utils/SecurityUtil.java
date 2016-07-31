/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.gouhai.baoshan.entity.user.User;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class SecurityUtil {

	public static String getUserId() {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		return (String) session.getAttribute("userId");
	}

	public static User getUser() {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		User user = new User((String) session.getAttribute("userId"));
		return user;
	}
}
