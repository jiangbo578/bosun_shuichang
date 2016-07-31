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
 * 年度发展对象
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_ndfzdy_ndfzdx")
public class Ndfzdx extends BaseEntity {
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
	@Column(name = "jjfzsj")
	@Temporal(TemporalType.DATE)
	private Date jjfzsj;// 列为积极分子时间
	@Column(name = "pxsj")
	@Temporal(TemporalType.DATE)
	private Date pxsj;// 培训时间
	@Column(name = "fzsj")
	@Temporal(TemporalType.DATE)
	private Date fzsj;// 发展时间
	@Column(name = "pxlxr")
	private String pxlxr;// 培训联系人
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

	public Date getJjfzsj() {
		return jjfzsj;
	}

	public void setJjfzsj(Date jjfzsj) {
		this.jjfzsj = jjfzsj;
	}

	public Date getPxsj() {
		return pxsj;
	}

	public void setPxsj(Date pxsj) {
		this.pxsj = pxsj;
	}

	public Date getFzsj() {
		return fzsj;
	}

	public void setFzsj(Date fzsj) {
		this.fzsj = fzsj;
	}

	public String getPxlxr() {
		return pxlxr;
	}

	public void setPxlxr(String pxlxr) {
		this.pxlxr = pxlxr;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
