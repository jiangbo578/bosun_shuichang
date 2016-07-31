/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 角色
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_role")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Role extends BaseEntity {
	
	@Column(name = "NAME")
	private String name; // 名称
	@Column(name = "CODE")
	private String code;// 标识
	@Column(name = "DESCRIPTION")
	private String description; // 描述
	@Column(name = "PARID")
	private String parid; // 父类ID  1居委  2镇  3区
	
	@Column(name = "DELETED")
	private boolean deleted; // 用户是否删除
	@Transient
	private List<Authority> authoritys;

	public Role() {
		
	}

	public Role(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	
	public String getParid() {
		return parid;
	}

	public void setParid(String parid) {
		this.parid = parid;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Authority> getAuthoritys() {
		return authoritys;
	}

	public void setAuthoritys(List<Authority> authoritys) {
		this.authoritys = authoritys;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
