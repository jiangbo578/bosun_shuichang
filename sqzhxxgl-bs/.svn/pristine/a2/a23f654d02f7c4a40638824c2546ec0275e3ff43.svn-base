package com.gouhai.baoshan.entity.business.dqgz.zb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 党员志愿者参与活动
 * 
 * @author 徐舟 与人口无关,不用审核
 */
@Entity
@Table(name = "bs_business_dyzyzcjhd")
public class Dyzyzcjhd extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "zc")
	private String zc;// 在职/在册
	@Column(name = "tcqk")
	private String tcqk;// 
	@Column(name = "cjhdcs")
	private String cjhdcs;// canjiahuodongcishu
	@Column(name = "xjdc")
	private String xjdc;// 星级档次
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZc() {
		return zc;
	}

	public void setZc(String zc) {
		this.zc = zc;
	}

	public String getTcqk() {
		return tcqk;
	}

	public void setTcqk(String tcqk) {
		this.tcqk = tcqk;
	}

	public String getCjhdcs() {
		return cjhdcs;
	}

	public void setCjhdcs(String cjhdcs) {
		this.cjhdcs = cjhdcs;
	}

	public String getXjdc() {
		return xjdc;
	}

	public void setXjdc(String xjdc) {
		this.xjdc = xjdc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
