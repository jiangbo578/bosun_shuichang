package com.gouhai.baoshan.entity.business.dqgz.fd;

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
 * 妇女代表
 * @author sun 2014-08-06
 * 
 */
@Entity
@Table(name = "bs_business_womanrepresent")
public class Womanrepresent extends BaseEntity{

	/**
	 * 姓名	性别	民族	出生年月 家庭住址	电话	
	 */
	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	
	@Column(name = "DUTY")
	private String duty; // 职务
	@Column(name = "MZ")
	private String mz; // 民族
	@Column(name = "WHCD")
	private String whcd; // 文化程度
	
	@Column(name = "ZZMM")
	private String zzmm; // 政治面貌
	
	@Column(name = "RZSJ")
	@Temporal(TemporalType.DATE)
	private Date rzsj; // 任职时间
	
	@Column(name = "JZQK")
	private String jzqk; // 兼职情况
	
	
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "HJDZ")
	private String hjdz; // 户籍地址
	@Column(name = "PHONE")
	private String phone; // 联系电话
	@Column(name = "tag")
	private String tag;
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

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

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getHjdz() {
		return hjdz;
	}

	public void setHjdz(String hjdz) {
		this.hjdz = hjdz;
	}

	public String getDuty()
	{
		return duty;
	}

	public void setDuty(String duty)
	{
		this.duty = duty;
	}

	public String getWhcd()
	{
		return whcd;
	}

	public void setWhcd(String whcd)
	{
		this.whcd = whcd;
	}

	public String getZzmm()
	{
		return zzmm;
	}

	public void setZzmm(String zzmm)
	{
		this.zzmm = zzmm;
	}

	public Date getRzsj()
	{
		return rzsj;
	}

	public void setRzsj(Date rzsj)
	{
		this.rzsj = rzsj;
	}

	public String getJzqk()
	{
		return jzqk;
	}

	public void setJzqk(String jzqk)
	{
		this.jzqk = jzqk;
	}

	public String getMz()
	{
		return mz;
	}

	public void setMz(String mz)
	{
		this.mz = mz;
	}
}
