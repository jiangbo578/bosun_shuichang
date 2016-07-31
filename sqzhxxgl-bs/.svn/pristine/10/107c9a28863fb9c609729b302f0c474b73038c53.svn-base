/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.filter;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

/**
 * 可以多个角色
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class RolesAnyAuthorizationFilter extends AuthorizationFilter {

	public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws IOException {

		Subject subject = getSubject(request, response);
		String[] rolesArray = (String[]) mappedValue;
		int len = 0;

		if (rolesArray == null || (len = rolesArray.length) == 0) {
			return true;
		}
		for (int i = 0; i < len; i++) {
			if (subject.hasRole(rolesArray[i])) {
				return true;
			}
		}
		return false;
	}
}
