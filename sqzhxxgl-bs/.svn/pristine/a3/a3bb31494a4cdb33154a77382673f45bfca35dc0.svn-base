/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

/**
 * 用户角色
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_user_role")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserRole{

	@Id
	@Column(name = "PID")
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	protected String id;
	
	@OneToOne
	@JoinColumn(name = "ROLE_ID", unique = true)
	private Role role;
	@OneToOne
	@JoinColumn(name = "USER_ID", unique = true)
	private User user;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
