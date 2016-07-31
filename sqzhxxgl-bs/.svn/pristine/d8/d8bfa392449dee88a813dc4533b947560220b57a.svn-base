package com.gouhai.baoshan.entity.business.ggfw.llgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 独居老人名册
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核，有填报周期
 * 
 */
@Entity
@Table(name = "bs_business_djlr")
public class Djlr extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "age")
	private String age;// 年龄
	@Column(name = "address")
	private String address;// 住址
	@Column(name = "lxr")
	private String lxr;// 联系人
	@Column(name = "phone")
	private String phone;// 电话
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
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
}
