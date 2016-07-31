package com.gouhai.baoshan.entity.business.ggfw.agws;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 卫生经费使用情况
 * 
 * @author 徐舟
 * 
 *         与人口无关，无需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_wsjf")
public class Wsjf extends BaseEntity {
	@Column(name = "syrq")
	private String syrq;// 使用日期
	@Column(name = "yt")
	private String yt;// 用途
	@Column(name = "price")
	private Double price;// 金额
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getSyrq() {
		return syrq;
	}

	public void setSyrq(String syrq) {
		this.syrq = syrq;
	}

	public String getYt() {
		return yt;
	}

	public void setYt(String yt) {
		this.yt = yt;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
