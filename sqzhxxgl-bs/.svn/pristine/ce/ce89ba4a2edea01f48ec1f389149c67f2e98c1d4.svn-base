/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.shgl.xfgz;

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
 * 消防器材维护记录
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_business_xfqcwh")
public class Xfqcwh extends BaseEntity {

	@Column(name = "MC")
	private String mc; // 器材名称
	@Column(name = "SL")
	private int sl; // 配备数量
	@Column(name = "RQ")
	@Temporal(TemporalType.DATE)
	private Date rq; // 配备日期
	@Column(name = "JC")
	@Temporal(TemporalType.DATE)
	private Date jc; // 检查日期
	@Column(name = "QK")
	private String qk; // 检查情况
	@Column(name = "CJC")
	private String cjc; // 检查人
	@Column(name = "BZ")
	private String bz; // 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm; 

	public String getMc() {
		return mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	public Date getRq() {
		return rq;
	}

	public void setRq(Date rq) {
		this.rq = rq;
	}

	public Date getJc() {
		return jc;
	}

	public void setJc(Date jc) {
		this.jc = jc;
	}

	public String getQk() {
		return qk;
	}

	public void setQk(String qk) {
		this.qk = qk;
	}

	public String getCjc() {
		return cjc;
	}

	public void setCjc(String cjc) {
		this.cjc = cjc;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
