/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.jcqk.rymd;

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
 * 各类工作领导小组名单
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_business_gzldxz")
public class Gzldxz extends BaseEntity {

	@Column(name = "XM")
	private String xm; //姓名
	@Column(name = "XB")
	private String xb; //性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; //出生年月
	@Column(name = "ZZMM")
	private String zzmm; //政治面貌
	@Column(name = "DZ")
	private String dz; //地址（或单位）
	@Column(name = "DRZW")
	private String drzw; //担任职务
	@Column(name = "FGZZ")
	private String fgzz; //分工职责
	@Column(name = "BZ")
	private String bz; //备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getZzmm() {
		return zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	public String getDrzw() {
		return drzw;
	}

	public void setDrzw(String drzw) {
		this.drzw = drzw;
	}

	public String getFgzz() {
		return fgzz;
	}

	public void setFgzz(String fgzz) {
		this.fgzz = fgzz;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}
	
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

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}
}
