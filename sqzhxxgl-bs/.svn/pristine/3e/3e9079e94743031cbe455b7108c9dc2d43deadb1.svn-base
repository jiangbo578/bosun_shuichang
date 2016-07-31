package com.gouhai.baoshan.entity.business.hyjl.hyhd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 工作计划
 * 
 * @author 徐舟
 * 
 *         2014-10-13
 */
@Entity
@Table(name = "bs_business_gzjh")
public class Gzjh extends BaseEntity {
	@Column(name = "type")
	private String type;// 类别
	@Column(name = "nr", length = 100000)
	private String nr;// 内容
	@Column(name = "jlr")
	private String jlr;// 记录人
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getJlr() {
		return jlr;
	}

	public void setJlr(String jlr) {
		this.jlr = jlr;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
