package com.gouhai.baoshan.entity.business.ggfw.llgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.ggfw.llgz.head.Lnxx;

/**
 * 老年学校在册人员名册
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_lnxxry")
public class Lnxxry extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;//
	@Column(name = "age")
	private String age;// 年龄
	@ManyToOne
	@JoinColumn(name = "lnxx_id")
	private Lnxx lnxx;

	public Lnxx getLnxx() {
		return lnxx;
	}

	public void setLnxx(Lnxx lnxx) {
		this.lnxx = lnxx;
	}

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

}
