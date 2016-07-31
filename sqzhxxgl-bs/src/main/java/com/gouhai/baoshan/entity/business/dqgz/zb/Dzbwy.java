package com.gouhai.baoshan.entity.business.dqgz.zb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 党支部委员及党小组长名册
 * 
 * @author 徐舟 需要审核，每年一月十五号
 */
@Entity
@Table(name = "bs_business_dzbwy")
public class Dzbwy extends BaseEntity {

	@Column(name = "role")
	private String role;// 职务
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "rzsj")
	private String zrsj;// 任职时间
	@Column(name = "fgnr")
	private String fgnr;// 分工内容
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	// @ManyToOne
	// @JoinColumn(name = "DZB_ID")
	// private Dzbwysj dzbwysj;

	public String getRole() {
		return role;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZrsj() {
		return zrsj;
	}

	public void setZrsj(String zrsj) {
		this.zrsj = zrsj;
	}

	public String getFgnr() {
		return fgnr;
	}

	public void setFgnr(String fgnr) {
		this.fgnr = fgnr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
