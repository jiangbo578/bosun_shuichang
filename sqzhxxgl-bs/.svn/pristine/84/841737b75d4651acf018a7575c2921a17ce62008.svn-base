/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.dqgz.zb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 党费收支、使用情况表
 * 每月20号填报 需审核
 * @author Rui
 * 
 */
@Entity
@Table(name = "bs_business_dfszsyqk")
public class Dfszsyqk extends BaseEntity {

	@Column(name = "JNDF")
	private Float jndf; //缴纳党费
	@Column(name = "SRDFFH")
	private Float srdffh;//党费返还 收入
	@Column(name = "SRJZ")
	private Float srjz;//捐助 收入
	@Column(name = "SRSJXB")
	private Float srsjxb;//上级下拔 收入
	@Column(name = "ZCDFFH")
	private Float zcdffh;//支出
	@Column(name = "ZCJZ")
	private Float zcjz;//支出
	@Column(name = "ZCSJXB")
	private Float zcsjxb;//支出
	@Column(name = "KYDFLJ")
	private Float kydflj;//可用党费累计数
	
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public Float getJndf() {
		return jndf;
	}

	public void setJndf(Float jndf) {
		this.jndf = jndf;
	}

	public Float getSrdffh() {
		return srdffh;
	}

	public void setSrdffh(Float srdffh) {
		this.srdffh = srdffh;
	}

	public Float getSrjz() {
		return srjz;
	}

	public void setSrjz(Float srjz) {
		this.srjz = srjz;
	}

	public Float getSrsjxb() {
		return srsjxb;
	}

	public void setSrsjxb(Float srsjxb) {
		this.srsjxb = srsjxb;
	}

	public Float getZcdffh() {
		return zcdffh;
	}

	public void setZcdffh(Float zcdffh) {
		this.zcdffh = zcdffh;
	}

	public Float getZcjz() {
		return zcjz;
	}

	public void setZcjz(Float zcjz) {
		this.zcjz = zcjz;
	}

	public Float getZcsjxb() {
		return zcsjxb;
	}

	public void setZcsjxb(Float zcsjxb) {
		this.zcsjxb = zcsjxb;
	}

	public Float getKydflj() {
		return kydflj;
	}

	public void setKydflj(Float kydflj) {
		this.kydflj = kydflj;
	}
	
	
}
