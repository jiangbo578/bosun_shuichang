/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.utils.StringUtil;

/**
 * 业务
 * 
 * @author 肖
 * 
 */
@Entity
@Table(name = "bs_business_type")
public class BusinessType extends BaseEntity {

	@Column(name = "NAME")
	private String name; // 业务名称

	@Column(name = "PARID")
	private String parid; // 父亲编号
	@Column(name = "code")
	private String code;// 编码
	// 对应下面的业务字段
	@Transient
	private List<Business> businesslist;

	public List<Business> getBusinesslist() {
		return businesslist;
	}

	public void setBusinesslist(List<Business> businesslist) {
		this.businesslist = businesslist;
	}

	public BusinessType() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BusinessType(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParid() {
		return parid;
	}

	public void setParid(String parid) {
		this.parid = parid;
	}

}
