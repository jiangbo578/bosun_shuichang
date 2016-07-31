/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 权限
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_authority")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Authority extends BaseEntity {

	@Column(name = "NAME")
	private String name; //名称
	@Column(name = "CODE")
	private String code;// 标识
	@Column(name = "PATH")
	private String path; // 访问action,多个用逗号隔开
	@Column(name = "DESCRIPTION")
	private String description;// 描述
	@OneToOne
	@JoinColumn(name = "RESOURCE_ID", unique = true)
	private Resource resource;// 属于哪个资源
	
	public Authority() {
		
	}

	public Authority(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
}
