package com.gouhai.baoshan.entity.business.ggfw.xxxsq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 季度考核情况
 * 
 * @author 徐舟
 * 
 *         需审核 与人口无关 填报周期
 */
@Entity
@Table(name = "bs_business_jdkhqk")
public class Jdkhqk extends BaseEntity {
	@Column(name = "jd")
	private String jd;// 季度
	@Column(name = "nr")
	private String nr;// 内容
	@Column(name = "tbr")
	private String tbr;// 填表人
	@Column(name = "rq")
	private String rq;// 日期
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getTbr() {
		return tbr;
	}

	public void setTbr(String tbr) {
		this.tbr = tbr;
	}

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
