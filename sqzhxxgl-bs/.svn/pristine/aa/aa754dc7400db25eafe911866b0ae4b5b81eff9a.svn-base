package com.gouhai.baoshan.entity.business.ggfw.agws;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 卫生干部、健康教育专兼职人员
 * 
 * @author 徐舟
 * 
 *         填报周期，每年一月十五号 不需要审核，与人口无关
 */
@Entity
@Table(name = "bs_business_jkjyry")
public class Jkjyry extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "age")
	private int age;// 年龄
	@Column(name = "xl")
	private String xl;// 学历
	@Column(name = "dw")
	private String dw;// 所属村民小组或单位
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getXl() {
		return xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
