package com.gouhai.baoshan.entity.business.dqgz.zb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 联系服务工作收集问题提交单
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_lxfwgzsjwt")
public class Lxfwgzsjwt extends BaseEntity {
	@Column(name = "jmq")
	private String jmq;// 居民区
	@Column(name = "bh")
	private String bh;// 编号
	@Column(name = "sqfyr")
	private String sqfyr;// 诉求反映人
	@Column(name = "sszrq")
	private String sszrq;// 所属责任区
	@Column(name = "dz")
	private String dz;// 地址
	@Column(name = "lxfs")
	private String lxfs;// 联系方式
	@Column(name = "wtjs")
	private String wtjs;// 问题简述
	@Column(name = "wtgl")
	private String wtgl;// 问题归类
	@Column(name = "zzkclyj")
	private String zzkclyj;// 组织科处理意见
	@Column(name = "jjqkfk")
	private String jjqkfk;// 职能科室解决情况反馈
	@Column(name = "ldbzyj")
	private String ldbzyj;// 领导班子研究
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getJmq() {
		return jmq;
	}

	public void setJmq(String jmq) {
		this.jmq = jmq;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getSqfyr() {
		return sqfyr;
	}

	public void setSqfyr(String sqfyr) {
		this.sqfyr = sqfyr;
	}

	public String getSszrq() {
		return sszrq;
	}

	public void setSszrq(String sszrq) {
		this.sszrq = sszrq;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getLxfs() {
		return lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}

	public String getWtjs() {
		return wtjs;
	}

	public void setWtjs(String wtjs) {
		this.wtjs = wtjs;
	}

	public String getWtgl() {
		return wtgl;
	}

	public void setWtgl(String wtgl) {
		this.wtgl = wtgl;
	}

	public String getZzkclyj() {
		return zzkclyj;
	}

	public void setZzkclyj(String zzkclyj) {
		this.zzkclyj = zzkclyj;
	}

	public String getJjqkfk() {
		return jjqkfk;
	}

	public void setJjqkfk(String jjqkfk) {
		this.jjqkfk = jjqkfk;
	}

	public String getLdbzyj() {
		return ldbzyj;
	}

	public void setLdbzyj(String ldbzyj) {
		this.ldbzyj = ldbzyj;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
