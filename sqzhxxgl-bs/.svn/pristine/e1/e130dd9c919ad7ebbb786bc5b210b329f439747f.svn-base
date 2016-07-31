/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.log;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 用户登录信息日志
 * 
 * @author sun
 * 
 */
@Entity
@Table(name = "bs_user_login_log")
public class UserLoginLog extends BaseEntity {

	@Column(name = "LOGIN_IP")
	private String loginIp; // 登录IP

	@Column(name = "LOGIN_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date loginDate;// 登录时间

	@Column(name = "USERNAME")
	private String username; // 登录用户名

	@Column(name = "user")
	private String user;

	@Column(name = "USER_ROLE")
	private String userRole;

	@Column(name = "organization")
	private String organization;

	public UserLoginLog() {

	}

	public UserLoginLog(String id) {
		this.id = id;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

}
