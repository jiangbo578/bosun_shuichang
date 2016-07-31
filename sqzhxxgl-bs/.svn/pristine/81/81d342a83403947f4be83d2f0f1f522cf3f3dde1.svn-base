/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 用户
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_user")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User extends BaseEntity {

	@Column(name = "USERNAME")
	private String username; // 用户名
	@Column(name = "PASSWORD")
	private String password; // 密码
	@Column(name = "REALNAME")
	private String realName; // 真实姓名
	@Column(name = "LOGINCOUNT")
	private int loginCount; // 登录次数
	@Column(name = "LASTLOGINTIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginTime; // 最后登录时间
	@Column(name = "DESCRIPTION")
	private String description; // 备注
	@Column(name = "DELETED")
	private boolean deleted; // 用户是否删除
	
	@Column(name = "ZNBMID")
	private String znbmid; // 职能部门的ID
	@OneToOne
	@JoinColumn(name = "ORGANIZATION_ID", unique = true)
	private Organization organization;// 用户所在组织机构
	@Column(name = "SERVICE_USER_ID")
	private String serviceUserId;//远程webservice ID
	
	@Transient
	private List<Role> roles;
	
	public User() {

	}

	public User(String id) {
		this.id = id;
	}
	
	public String getZnbmid() {
		return znbmid;
	}
	
	public void setZnbmid(String znbmid) {
		this.znbmid = znbmid;
	}

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

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getServiceUserId()
	{
		return serviceUserId;
	}

	public void setServiceUserId(String serviceUserId)
	{
		this.serviceUserId = serviceUserId;
	}
	
}
