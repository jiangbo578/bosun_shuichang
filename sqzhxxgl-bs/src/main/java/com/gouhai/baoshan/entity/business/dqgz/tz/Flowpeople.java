/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.dqgz.tz;

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
 * 小区流动人口名单
 * 审核时间：每年一月15日
 * (与人口有关的表)
 * @author sun 2014-08-06
 * 
 */
@Entity
@Table(name = "bs_business_flow_person")
public class Flowpeople extends BaseEntity {
	/**
	 * 姓名	性别	出生年月	民族	文化程度	身份	工作单位	家庭住址	联系电话等
	 * 身份（选项）：归侨，侨眷，港澳居民眷属，归国留学人员，留学生眷属，台胞，台属
	 */
	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "ISMARY")
	private String isMarry; // 婚姻状况   已婚    未婚
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	@Column(name = "IDCARD")
	private String idcard; //身份证
	@Column(name = "WHCD")
	private String whcd; // 文化程度
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "SF")
	private String sf; // 身份
	@Column(name = "MZ")
	private String mz; // 民族
	@Column(name = "GZDW")
	private String gzdw; // 工作单位
	@Column(name = "LXDH")
	private String phone; // 联系电话
	@Column(name = "TAG",length=512)
	private String tag; // 备注
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public Date getCsny() {
		return csny;
	}

	public void setCsny(Date csny) {
		this.csny = csny;
	}

	public String getWhcd() {
		return whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getMz() {
		return mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	public String getSf() {
		return sf;
	}

	public void setSf(String sf) {
		this.sf = sf;
	}

	public String getGzdw() {
		return gzdw;
	}

	public void setGzdw(String gzdw) {
		this.gzdw = gzdw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getIsMarry()
	{
		return isMarry;
	}

	public void setIsMarry(String isMarry)
	{
		this.isMarry = isMarry;
	}

	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}
	
}
