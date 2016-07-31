/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.spring;

import java.io.Serializable;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class CommonVariableModel implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String username;
	private String realName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

}
