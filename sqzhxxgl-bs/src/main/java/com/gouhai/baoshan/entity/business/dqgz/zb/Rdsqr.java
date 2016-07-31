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
 * 年度发展党员工作情况表：入党申请人
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_ndfzdy_rdsqr")
public class Rdsqr extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "mz")
	private String mz;// 名族
	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	private Date birthday;// 出生年月
	@Column(name = "whcd")
	private String whcd;// 文化程度
	@Column(name = "address")
	private String address;// 居住地址
	@Column(name = "sqrdsj")
	@Temporal(TemporalType.DATE)
	private Date sqrdsj;// 申请入党时间
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

	public String getMz() {
		return mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getWhcd() {
		return whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getSqrdsj() {
		return sqrdsj;
	}

	public void setSqrdsj(Date sqrdsj) {
		this.sqrdsj = sqrdsj;
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
