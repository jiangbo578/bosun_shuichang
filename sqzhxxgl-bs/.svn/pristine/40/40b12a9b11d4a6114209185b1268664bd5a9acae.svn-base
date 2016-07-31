/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.dqgz.zb;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.dqgz.zb.head.Zcdygk;

/**
 * 在册党员概况及名册
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_business_zcdygkbt")
public class Zcdygkbt extends BaseEntity {

	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	@Column(name = "IDCARD")
	private String idcard; // 身份证
	@Column(name = "WHCD")
	private String whcd; // 文化程度
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "RDNY")
	// @Temporal(TemporalType.DATE)
	private String rdny; // 入党年月

	@Column(name = "phone")
	private String phone; // 联系电话

	@Column(name = "BZ")
	private String bz; // 备注
	@ManyToOne
	@JoinColumn(name = "zcdygk_id")
	private Zcdygk zcdygk;

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

	public String getRdny() {
		return rdny;
	}

	public void setRdny(String rdny) {
		this.rdny = rdny;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Zcdygk getZcdygk() {
		return zcdygk;
	}

	public void setZcdygk(Zcdygk zcdygk) {
		this.zcdygk = zcdygk;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
