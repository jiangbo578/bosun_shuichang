package com.gouhai.baoshan.entity.business.jcqk.rymd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 志愿者名单
 * 
 * @author MedivhQ 需要审核 与人口有关
 * 
 */
@Entity
@Table(name = "bs_business_zyymd")
public class Zyzmd extends BaseEntity {
	@Column(name = "xm")
	private String xm;
	@Column(name = "xb")
	private String xb;
	@Column(name = "csny")
	private String csny;
	@Column(name = "whcd")
	private String whcd;
	@Column(name = "zzmm")
	private String zzmm;
	@Column(name = "jtzz")
	private String jtzz;
	@Column(name = "dh")
	private String dh;
	@Column(name = "lx")
	private String lx;
	@Column(name = "fwxm")
	private String fwxm;


	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

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

	public String getCsny() {
		return csny;
	}

	public void setCsny(String csny) {
		this.csny = csny;
	}

	public String getWhcd() {
		return whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getZzmm() {
		return zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getFwxm() {
		return fwxm;
	}

	public void setFwxm(String fwxm) {
		this.fwxm = fwxm;
	}
	

}
