package com.gouhai.baoshan.entity.business.shgl.spaq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Zbjshs;

/**
 * 自办酒会所情况表
 * 
 * @author 徐舟
 * 
 *         需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_zbjshsbt")
public class Zbjshsbt extends BaseEntity {
	@Column(name = "dwmc")
	private String dwmc;// 单位名称
	@Column(name = "jydz")
	private String jydz;// 经营地址
	@Column(name = "fzr")
	private String fzr;// 负责人
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "jyxz")
	private String jyxz;// 经营性质
	@Column(name = "cbzs")
	private String cbzs;// 承办桌数
	@Column(name = "ba")
	private String ba;// 备案
	@Column(name = "SJZS")
	private String sjzs;// 实际桌数
	@Column(name = "sjhs")
	private String sjhs;// 实际户数
	@Column(name = "remark")
	private String remark;// 备注
	@ManyToOne
	@JoinColumn(name = "zbjshs_id")
	private Zbjshs zbjshs;

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

	public String getJyxz() {
		return jyxz;
	}

	public void setJyxz(String jyxz) {
		this.jyxz = jyxz;
	}

	public String getCbzs() {
		return cbzs;
	}

	public void setCbzs(String cbzs) {
		this.cbzs = cbzs;
	}

	public String getBa() {
		return ba;
	}

	public void setBa(String ba) {
		this.ba = ba;
	}

	public String getSjzs() {
		return sjzs;
	}

	public void setSjzs(String sjzs) {
		this.sjzs = sjzs;
	}

	public String getSjhs() {
		return sjhs;
	}

	public void setSjhs(String sjhs) {
		this.sjhs = sjhs;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Zbjshs getZbjshs() {
		return zbjshs;
	}

	public void setZbjshs(Zbjshs zbjshs) {
		this.zbjshs = zbjshs;
	}

}
