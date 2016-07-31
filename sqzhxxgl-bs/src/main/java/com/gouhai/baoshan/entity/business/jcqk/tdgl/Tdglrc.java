package com.gouhai.baoshan.entity.business.jcqk.tdgl;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 土地管理日常巡查记录
 * 
 * @author MedivhQ 需要审核 与人口无关
 * 
 */
@Entity
@Table(name = "bs_business_tdglrc")
public class Tdglrc extends BaseEntity {
	@Column(name = "jz")
	private String jz;
	@Column(name = "cwh")
	private String cwh;
	@Column(name = "tdzl")
	private String tdzl;
	@Column(name = "wfdsr")
	private String wfdsr;
	@Column(name = "xmmc")
	private String xmmc;
	@Column(name = "zdmj")
	private String zdmj;
	@Column(name = "wfydlx")
	private String wfydlx;
	@Column(name = "zzyq")
	private String zzyq;
	@Column(name = "xczrr")
	private String xczrr;
	@Column(name = "fxrq")
	private String fxrq;
	@Column(name = "sbrq")
	private String sbrq;
	@Column(name = "kgrq")
	private String kgrq;

	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
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

	public String getTdzl() {
		return tdzl;
	}

	public void setTdzl(String tdzl) {
		this.tdzl = tdzl;
	}

	public String getWfdsr() {
		return wfdsr;
	}

	public void setWfdsr(String wfdsr) {
		this.wfdsr = wfdsr;
	}

	public String getXmmc() {
		return xmmc;
	}

	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}

	public String getZdmj() {
		return zdmj;
	}

	public void setZdmj(String zdmj) {
		this.zdmj = zdmj;
	}

	public String getWfydlx() {
		return wfydlx;
	}

	public void setWfydlx(String wfydlx) {
		this.wfydlx = wfydlx;
	}

	public String getZzyq() {
		return zzyq;
	}

	public void setZzyq(String zzyq) {
		this.zzyq = zzyq;
	}

	public String getXczrr() {
		return xczrr;
	}

	public void setXczrr(String xczrr) {
		this.xczrr = xczrr;
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

	public String getKgrq() {
		return kgrq;
	}

	public void setKgrq(String kgrq) {
		this.kgrq = kgrq;
	}

	
}
