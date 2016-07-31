/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.hyjl.hyhd;

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
import com.gouhai.baoshan.entity.user.User;

/**
 * 会议记录
 * 
 * @author Rui
 * 
 */
@Entity
@Table(name = "bs_business_hyjl")
public class Hyjl extends BaseEntity {

	@Column(name = "NAME")
	private String name; // 标题
	@Column(name = "SJ")
	@Temporal(TemporalType.DATE)
	private Date sj; // 记录时间
	@Column(name = "ZCR")
	private String zcr; // 主持人
	@Column(name = "NR")
	private String nr; // 内容
	@Column(name = "DD")
	private String dd; // 地点
	@Column(name = "CJDX")
	private String cjdx; // 参加对象
	@Column(name = "JLR")
	private String jlr; // 记录人
	@Column(name = "RS")
	private int rs; // 参加人数
	@Column(name = "HYYT")
	private String hyyt; // 会议议题
	@Column(name = "HYLB")
	private String hylb; // 会议类别

	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public Date getSj() {
		return sj;
	}

	public void setSj(Date sj) {
		this.sj = sj;
	}

	public String getZcr() {
		return zcr;
	}

	public void setZcr(String zcr) {
		this.zcr = zcr;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	public String getCjdx() {
		return cjdx;
	}

	public void setCjdx(String cjdx) {
		this.cjdx = cjdx;
	}

	public String getJlr() {
		return jlr;
	}

	public void setJlr(String jlr) {
		this.jlr = jlr;
	}

	public int getRs() {
		return rs;
	}

	public void setRs(int rs) {
		this.rs = rs;
	}

	public String getHyyt() {
		return hyyt;
	}

	public void setHyyt(String hyyt) {
		this.hyyt = hyyt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHylb() {
		return hylb;
	}

	public void setHylb(String hylb) {
		this.hylb = hylb;
	}
}
