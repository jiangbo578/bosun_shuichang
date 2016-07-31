package com.gouhai.baoshan.entity.business.ggfw.hszh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 红十字服务站特困家庭名册
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_hszfwztk")
public class Hszfwztk extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "birthday")
	private String birthday;// 出生年月
	@Column(name = "address")
	private String address;// 住址
	@Column(name = "phone")
	private String phone;// 电话
	@Column(name = "knqk")
	private String knqk;// 困哪情况
	@Column(name = "bz")
	private String bz;// 备注
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
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

	public String getKnqk() {
		return knqk;
	}

	public void setKnqk(String knqk) {
		this.knqk = knqk;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
