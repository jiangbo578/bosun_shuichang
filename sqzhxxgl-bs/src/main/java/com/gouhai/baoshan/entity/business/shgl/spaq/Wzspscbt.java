package com.gouhai.baoshan.entity.business.shgl.spaq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Wzspsc;

/**
 * 新增无证食品药品生产经营消费单位情况表
 * 
 * @author 徐舟
 * 
 * 
 *         有填报周期，需审核，
 */
@Entity
@Table(name = "bs_business_wzspscbt")
public class Wzspscbt extends BaseEntity {
	@Column(name = "dwmc")
	private String dwmc;// 单位名称
	@Column(name = "jydz")
	private String jydz;// 经营地址
	@Column(name = "fzr")
	private String fzr;// 负责人
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "jyxm")
	private String jyxm;// 经营项目
	@Column(name = "czqk")
	private String czqk;// 处置情况
	@Column(name = "fxr")
	private String fxr;// 发现人
	@Column(name = "sj")
	private String sj;// 时间
	@Column(name = "remark")
	private String remark;// 备注
	@ManyToOne
	@JoinColumn(name = "wzspsc_id")
	private Wzspsc wzspsc;

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getJydz() {
		return jydz;
	}

	public void setJydz(String jydz) {
		this.jydz = jydz;
	}

	public String getFzr() {
		return fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJyxm() {
		return jyxm;
	}

	public void setJyxm(String jyxm) {
		this.jyxm = jyxm;
	}

	public String getCzqk() {
		return czqk;
	}

	public void setCzqk(String czqk) {
		this.czqk = czqk;
	}

	public String getFxr() {
		return fxr;
	}

	public void setFxr(String fxr) {
		this.fxr = fxr;
	}

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Wzspsc getWzspsc() {
		return wzspsc;
	}

	public void setWzspsc(Wzspsc wzspsc) {
		this.wzspsc = wzspsc;
	}

}
