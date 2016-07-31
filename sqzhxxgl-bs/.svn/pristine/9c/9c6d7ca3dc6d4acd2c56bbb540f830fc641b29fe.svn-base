package com.gouhai.baoshan.entity.business.shgl.spaq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Wzspdwpc;

/**
 * 无证食品单位季度隐患排查表
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_wzspdwpcbt")
public class Wzspdwpcbt extends BaseEntity {
	@Column(name = "dwmc")
	private String dwmc;// 单位名称
	@Column(name = "jydz")
	private String jydz;// 经营地址
	@Column(name = "fzr")
	private String fzr;// 负责人
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "lb")
	private String lb;// 类别
	@Column(name = "jyqk")
	private String jyqk;// 经营情况
	@Column(name = "sb")
	private String sb;// 上报
	@Column(name = "pcrq")
	private String pcrq;
	@Column(name = "pcr")
	private String pcr;// 排查人
	@Column(name = "remark")
	private String remark;// 备注

	@ManyToOne
	@JoinColumn(name = "wzspdwpc_id")
	private Wzspdwpc wzspdwpc;

	public Wzspdwpc getWzspdwpc() {
		return wzspdwpc;
	}

	public void setWzspdwpc(Wzspdwpc wzspdwpc) {
		this.wzspdwpc = wzspdwpc;
	}

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

	public String getLb() {
		return lb;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	public String getJyqk() {
		return jyqk;
	}

	public void setJyqk(String jyqk) {
		this.jyqk = jyqk;
	}

	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb;
	}

	public String getPcrq() {
		return pcrq;
	}

	public void setPcrq(String pcrq) {
		this.pcrq = pcrq;
	}

	public String getPcr() {
		return pcr;
	}

	public void setPcr(String pcr) {
		this.pcr = pcr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
