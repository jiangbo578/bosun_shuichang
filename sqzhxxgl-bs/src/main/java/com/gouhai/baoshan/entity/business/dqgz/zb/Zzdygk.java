/**
 * Copyright (c) www.zouqi.com
 */

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
 * 在职党员概况及名册
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Entity
@Table(name = "bs_business_zzdygk")
public class Zzdygk extends BaseEntity {

	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	@Column(name = "IDCARD")
	private String idcard; //身份证
	@Column(name = "WHCD")
	private String whcd; // 文化程度
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "RDNY")
	@Temporal(TemporalType.DATE)
	private Date rdny; // 入党年月
	@Column(name="WORK_UNIT")
	private String workUnit;//工作单位
	
	@Column(name="PHONE")
	private String phone;//联系电话
	
	@Column(name="REGISTER")
	private String register;//报到情况
	
	@Column(name="TYPE")
	private String type;//预备党员  或者  正式党员
	@Column(name = "TC")
	private String tc; // 特长情况
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

	public Date getRdny() {
		return rdny;
	}

	public void setRdny(Date rdny) {
		this.rdny = rdny;
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

	public String getWorkUnit()
	{
		return workUnit;
	}

	public void setWorkUnit(String workUnit)
	{
		this.workUnit = workUnit;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getRegister()
	{
		return register;
	}

	public void setRegister(String register)
	{
		this.register = register;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getTc()
	{
		return tc;
	}

	public void setTc(String tc)
	{
		this.tc = tc;
	}
	
}
