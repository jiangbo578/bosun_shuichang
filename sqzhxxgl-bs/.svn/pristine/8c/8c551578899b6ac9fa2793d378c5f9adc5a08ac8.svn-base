/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.dqgz.tw;

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
 * 小区团支部概况及班子成员名单
 * @author cgw
 * 
 */
@Entity
@Table(name = "bs_business_tzbgk")
public class tzbgk extends BaseEntity {
	/**
	 * 姓名	出生年月	性别	家庭住址	民族	政治面貌	团内职务	就读学校或工作单位 
	 */
	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "MZ")
	private String mz; // 民族
	@Column(name = "ZZMM")
	private String zzmm; // 政治面貌
	@Column(name = "TNZW")
	private String tnzw; // 团内职务
	@Column(name = "GZDW")
	private String gzdw; // 工作单位
	
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

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getMz() {
		return mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	public String getZzmm() {
		return zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	public String getTnzw() {
		return tnzw;
	}

	public void setTnzw(String tnzw) {
		this.tnzw = tnzw;
	}

	public String getGzdw() {
		return gzdw;
	}

	public void setGzdw(String gzdw) {
		this.gzdw = gzdw;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
