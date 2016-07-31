package com.gouhai.baoshan.entity.business.ggfw.xxxsq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 52、重大事件记载
 * 
 * @author 徐舟
 * 
 *         需要审核，有填报周期 与人口无关
 */
@Entity
@Table(name = "bs_business_zdsj")
public class Zdsj extends BaseEntity {
	@Column(name = "bndhjqk", length = 1000000)
	private String bndhjqk;
	@Column(name = "bndsg", length = 1000000)
	private String bndsg;
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getBndhjqk() {
		return bndhjqk;
	}

	public void setBndhjqk(String bndhjqk) {
		this.bndhjqk = bndhjqk;
	}

	public String getBndsg() {
		return bndsg;
	}

	public void setBndsg(String bndsg) {
		this.bndsg = bndsg;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
