package com.gouhai.baoshan.entity.business.ggfw.cjrgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 参加社区体育活动的残疾人名册
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_tyhdcjr")
public class Tyhdcjr extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "birthday")
	private String birthday;// 出生年月
	@Column(name = "address")
	private String address;// 户籍 住址
	@Column(name = "cjlb")
	private String cjlb;// 残疾类别
	@Column(name = "hdxm")
	private String hdxm;// 特奥活动项目
	@Column(name = "hdqk")
	private String hdqk;// 参与活动情况
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

	public String getCjlb() {
		return cjlb;
	}

	public void setCjlb(String cjlb) {
		this.cjlb = cjlb;
	}

	public String getHdxm() {
		return hdxm;
	}

	public void setHdxm(String hdxm) {
		this.hdxm = hdxm;
	}

	public String getHdqk() {
		return hdqk;
	}

	public void setHdqk(String hdqk) {
		this.hdqk = hdqk;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
