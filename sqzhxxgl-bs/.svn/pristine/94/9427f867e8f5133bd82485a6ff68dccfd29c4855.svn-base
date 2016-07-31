/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.dqgz.zb;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 困难党员情况名册
 * 一月15号 审核
 * @author Rui
 * 
 */
@Entity
@Table(name = "bs_business_kndymc")
public class Kndyqk extends BaseEntity {

	
	//姓名	性别	出生年月	文化程度	健康状况	家庭住址	联系电话	困难情况	结对党员姓名	联系电话	结对时间

	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	@Column(name = "WHCD")
	private String whcd; // 文化程度
	@Column(name = "JKZK")
	private String jkzk;//健康状况
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "KNQK")
	private String knqk; // 困难情况
	@Column(name = "JDDYXM")
	private String jddyxm; // 结对党员姓名
	@Column(name = "JDSJ")
	@Temporal(TemporalType.DATE)
	private Date jdsj;//结对时间
	@Column(name = "LXDH")
	private String phone; // 联系电话
	@Column(name = "JDLXDH")
	private String jdphone; // 联系电话
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public Date getCsny() {
		return csny;
	}

	public void setCsny(Date csny) {
		this.csny = csny;
	}

	public String getWhcd() {
		return whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}


	public String getJkzk() {
		return jkzk;
	}

	public void setJkzk(String jkzk) {
		this.jkzk = jkzk;
	}

	public String getKnqk() {
		return knqk;
	}

	public void setKnqk(String knqk) {
		this.knqk = knqk;
	}

	public String getJddyxm() {
		return jddyxm;
	}

	public void setJddyxm(String jddyxm) {
		this.jddyxm = jddyxm;
	}

	public Date getJdsj() {
		return jdsj;
	}

	public void setJdsj(Date jdsj) {
		this.jdsj = jdsj;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJdphone() {
		return jdphone;
	}

	public void setJdphone(String jdphone) {
		this.jdphone = jdphone;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}
}
