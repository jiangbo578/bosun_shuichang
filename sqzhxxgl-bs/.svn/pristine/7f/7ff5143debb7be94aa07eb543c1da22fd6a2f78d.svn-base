package com.gouhai.baoshan.entity.business.jcqk.rymd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 居务村务监督委员会名单
 * 
 * @author 徐舟 需要审核 与人口有关
 * 
 */
@Entity
@Table(name = "bs_business_cwjd")
public class Cwjd extends BaseEntity {
	@Column(name = "xm")
	private String xm;
	@Column(name = "zw")
	private String zw;
	@Column(name = "xb")
	private String xb;
	@Column(name = "csny")
	private String csny;
	@Column(name = "whcd")
	private String whcd;
	@Column(name = "zzmm")
	private String zzmm;
	@Column(name = "xrzw")
	private String xrzw;
	@Column(name = "dh")
	private String dh;

	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getZw() {
		return zw;
	}

	public void setZw(String zw) {
		this.zw = zw;
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

	public String getXrzw() {
		return xrzw;
	}

	public void setXrzw(String xrzw) {
		this.xrzw = xrzw;
	}

	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
