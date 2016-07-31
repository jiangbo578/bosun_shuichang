/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 组织机构
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_organization")
public class Organization extends BaseEntity {

	@Column(name = "NAME")
	private String name; // 名称
	@Column(name = "DESCRIPTION")
	private String description; // 描述
	@Column(name = "DELETED")
	private boolean deleted; // 用户是否删除
	@OneToOne
	@JoinColumn(name = "PARENT_ID", unique = true)
	private Organization parent;// 父组织机构

	@Column(name = "LEVEL")
	private Integer level; // 名称

	@Column(name = "FLAG")
	private Integer flag; // 0表示村，1表示居，2表示镇

	@Column(name = "TYPE")
	private Integer type;// 表示状态 1未提交，2提交 3保存

	@Column(name = "code")
	private String code;// 居委会编码，此字段是用来识别实有人口库

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Organization() {

	}

	public Organization(String id) {
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

	public void setDescription(String description) {
		this.description = description;
	}

	public Organization getParent() {
		return parent;
	}

	public void setParent(Organization parent) {
		this.parent = parent;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
