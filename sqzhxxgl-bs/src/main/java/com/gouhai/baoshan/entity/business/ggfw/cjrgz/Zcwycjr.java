package com.gouhai.baoshan.entity.business.ggfw.cjrgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 重残无业残疾人名册
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核 有填报周期
 */
@Entity
@Table(name = "bs_business_zcwycjr")
public class Zcwycjr extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "age")
	private String age;// 年龄
	@Column(name = "birthday")
	private String birthday;
	@Column(name = "address")
	private String address;// 住址
	@Column(name = "cjlb")
	private String cjlb;// 残疾类别
	@Column(name = "cjzh")
	private String cjzh;// 残疾证号
	@Column(name = "zyqk")
	private String zyqk;// 助养情况
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

	public String getCjzh() {
		return cjzh;
	}

	public void setCjzh(String cjzh) {
		this.cjzh = cjzh;
	}

	public String getZyqk() {
		return zyqk;
	}

	public void setZyqk(String zyqk) {
		this.zyqk = zyqk;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
