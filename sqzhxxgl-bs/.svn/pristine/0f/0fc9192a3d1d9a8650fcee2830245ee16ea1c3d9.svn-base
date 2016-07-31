package com.gouhai.baoshan.entity.business.dqgz.zb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 党支部委员及党小组长名册 一对多一方时间
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_dzbwysj")
public class Dzbwysj extends BaseEntity {
	@Column(name = "bjdxrq")
	private String bjdxrq;// 本届当选日期
	@Column(name = "jmrq")
	private String jmrq;// 届满日期
	@Column(name = "hjxjxs")
	private String hjxjxs;// 换届选举形式
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
//	// 换届人
//	@OneToMany(mappedBy = "dzbwysj", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Dzbwy> dzbwylist;


	public String getBjdxrq() {
		return bjdxrq;
	}

	public void setBjdxrq(String bjdxrq) {
		this.bjdxrq = bjdxrq;
	}

	public String getJmrq() {
		return jmrq;
	}

	public void setJmrq(String jmrq) {
		this.jmrq = jmrq;
	}

	public String getHjxjxs() {
		return hjxjxs;
	}

	public void setHjxjxs(String hjxjxs) {
		this.hjxjxs = hjxjxs;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
