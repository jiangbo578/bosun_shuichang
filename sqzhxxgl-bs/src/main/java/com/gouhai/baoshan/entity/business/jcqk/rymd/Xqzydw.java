package com.gouhai.baoshan.entity.business.jcqk.rymd;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 辖区主要单位名单
 * 
 * @author MedivhQ 需要审核 与人口有关
 * 
 */
@Entity
@Table(name = "bs_business_xqzydw")
public class Xqzydw extends BaseEntity {
	@Column(name = "dwmc")
	private String dwmc;
	@Column(name = "dz")
	private String dz;
	@Column(name = "lxr")
	private String lxr;
	@Column(name = "dh")
	private String dh;
	@Column(name = "sfgj")
	private String sfgj;

	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
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

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public String getSfgj() {
		return sfgj;
	}

	public void setSfgj(String sfgj) {
		this.sfgj = sfgj;
	}
	
}
