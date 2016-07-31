package com.gouhai.baoshan.entity.business.jcqk.wzjzcz;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 单位违章建筑处置
 * 
 * @author MedivhQ 需要审核 与人口无关
 * 
 */
@Entity
@Table(name = "bs_business_dwwzjzcz")
public class Dwwzjzcz extends BaseEntity {
	@Column(name = "jz")
	private String jz;
	@Column(name = "cwh")
	private String cwh;
	@Column(name = "fxrq")
	private String fxrq;
	@Column(name = "sbrq")
	private String sbrq;
	@Column(name = "ly")
	private String ly;
	@Column(name = "dwmc")
	private String dwmc;
	@Column(name = "dz")
	private String dz;
	@Column(name = "yt")
	private String yt;
	@Column(name = "mj")
	private String mj;
	@Column(name = "czdw")
	private String czdw;
	@Column(name = "czqk")
	private String czqk;
	@Column(name = "bw")
	private String bw;
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}
	
	public String getBw() {
		return bw;
	}

	public void setBw(String bw) {
		this.bw = bw;
	}

	public String getJz() {
		return jz;
	}

	public void setJz(String jz) {
		this.jz = jz;
	}

	public String getCwh() {
		return cwh;
	}

	public void setCwh(String cwh) {
		this.cwh = cwh;
	}

	public String getFxrq() {
		return fxrq;
	}

	public void setFxrq(String fxrq) {
		this.fxrq = fxrq;
	}

	public String getSbrq() {
		return sbrq;
	}

	public void setSbrq(String sbrq) {
		this.sbrq = sbrq;
	}

	public String getLy() {
		return ly;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getYt() {
		return yt;
	}

	public void setYt(String yt) {
		this.yt = yt;
	}

	public String getMj() {
		return mj;
	}

	public void setMj(String mj) {
		this.mj = mj;
	}

	public String getCzdw() {
		return czdw;
	}

	public void setCzdw(String czdw) {
		this.czdw = czdw;
	}

	public String getCzqk() {
		return czqk;
	}

	public void setCzqk(String czqk) {
		this.czqk = czqk;
	}
	


}
