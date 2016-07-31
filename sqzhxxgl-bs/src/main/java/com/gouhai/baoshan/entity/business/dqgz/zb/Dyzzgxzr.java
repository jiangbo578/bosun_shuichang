package com.gouhai.baoshan.entity.business.dqgz.zb;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 党员组织关系转入
 * 
 * @author 徐舟 与人口无关， 需审核 每年一月十五号
 */
@Entity
@Table(name = "bs_business_dyzzgxzr")
public class Dyzzgxzr extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "zrrq")
	@Temporal(TemporalType.DATE)
	private Date zrrq;// 转入日期
	@Column(name = "dwtr")
	private String dwtr;// 何单位调入
	@Column(name = "sfzsdy")
	private String sfzsdy;// 是否正式党员
	@Column(name = "phone")
	private String phone;// 联系电话
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getZrrq() {
		return zrrq;
	}

	public void setZrrq(Date zrrq) {
		this.zrrq = zrrq;
	}

	public String getDwtr() {
		return dwtr;
	}

	public void setDwtr(String dwtr) {
		this.dwtr = dwtr;
	}

	public String getSfzsdy() {
		return sfzsdy;
	}

	public void setSfzsdy(String sfzsdy) {
		this.sfzsdy = sfzsdy;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
