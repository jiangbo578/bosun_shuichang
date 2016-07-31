package com.gouhai.baoshan.entity.business.shgl.nchjzl.head;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Tzwpbt;

@Entity
@Table(name = "bs_business_tzwp")
public class Tzwp extends BaseEntity {
	@Column(name = "cwh")
	private String cwh;// 填报村委会
	@Column(name = "tbrq")
	private String tbrq;// 填报日期
	@Column(name = "tbr")
	private String tbr;// 填报人
	@Column(name = "phone")
	private String phone;// 联系电话
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	@OneToMany(mappedBy = "tzwp", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Tzwpbt> tzwpbtlist;

	public Tzwp(String id) {
		this.id = id;
	}

	public Tzwp() {

	}

	public String getCwh() {
		return cwh;
	}

	public void setCwh(String cwh) {
		this.cwh = cwh;
	}

	public String getTbrq() {
		return tbrq;
	}

	public void setTbrq(String tbrq) {
		this.tbrq = tbrq;
	}

	public String getTbr() {
		return tbr;
	}

	public void setTbr(String tbr) {
		this.tbr = tbr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public List<Tzwpbt> getTzwpbtlist() {
		return tzwpbtlist;
	}

	public void setTzwpbtlist(List<Tzwpbt> tzwpbtlist) {
		this.tzwpbtlist = tzwpbtlist;
	}

}
