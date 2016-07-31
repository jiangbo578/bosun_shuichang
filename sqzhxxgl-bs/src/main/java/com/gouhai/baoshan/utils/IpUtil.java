/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 获取IP地址
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 */
public final class IpUtil {
    
    public static String getIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

}
