package com.gouhai.baoshan.entity.business.jcqk.rymd;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * entity：楼组长
 * 
 * @author xuzhou
 * 
 */
@Entity
@Table(name = "bs_business_lzz")
public class Lzz extends BaseEntity {
	@Column(name = "lh")
	private String lh;// 楼号 1
	@Column(name = "hl")
	private String hl;// 户楼  2
	@Column(name = "zzname")
	private String zzname;// 组长姓名 3
	@Column(name = "sex")
	private String sex;// 性别 4
	@Column(name = "birthday")
	private Date birthday;// 生日 5
	@Column(name = "status")
	private String status;// 政治面貌 6
	@Column(name = "address")
	private String address;// 家庭住址 7
	@Column(name = "phone")
	private String phone;// 联系电话  8
	@Column(name = "jwfggb")
	private String jwfggb;// 居委分管干部 9
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}
	public String getLh() {
		return lh;
	}

	public void setLh(String lh) {
		this.lh = lh;
	}

	public String getHl() {
		return hl;
	}

	public void setHl(String hl) {
		this.hl = hl;
	}

	public String getZzname() {
		return zzname;
	}

	public void setZzname(String zzname) {
		this.zzname = zzname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJwfggb() {
		return jwfggb;
	}

	public void setJwfggb(String jwfggb) {
		this.jwfggb = jwfggb;
	}

	public Lzz() {
	}

}
