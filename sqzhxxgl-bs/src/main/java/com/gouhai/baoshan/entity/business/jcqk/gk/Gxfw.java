package com.gouhai.baoshan.entity.business.jcqk.gk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 管辖范围
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_gxfw")
public class Gxfw extends BaseEntity {
	@Column(name = "lxc")
	private String lxc;
	@Column(name = "nong")
	private String nong;
	@Column(name = "hao")
	private String hao;
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getLxc() {
		return lxc;
	}

	public void setLxc(String lxc) {
		this.lxc = lxc;
	}

	public String getNong() {
		return nong;
	}

	public void setNong(String nong) {
		this.nong = nong;
	}

	public String getHao() {
		return hao;
	}

	public void setHao(String hao) {
		this.hao = hao;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
