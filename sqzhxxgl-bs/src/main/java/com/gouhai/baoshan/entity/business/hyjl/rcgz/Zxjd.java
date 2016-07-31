package com.gouhai.baoshan.entity.business.hyjl.rcgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 咨询接待记录
 * 
 * @author 徐舟
 * 
 *         没有填报周期，及时更新，与人口无关，无需审核
 */
@Entity
@Table(name = "bs_business_zxjd")
public class Zxjd extends BaseEntity {
	@Column(name = "rq")
	private String rq;// 日期
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "age")
	private String age;// 年龄
	@Column(name = "address")
	private String address;// 地址
	@Column(name = "phone")
	private String phone;// 电话
	@Column(name = "type")
	private String type;// 类型
	@Column(name = "nr", length = 1000)
	private String nr;// 内容
	@Column(name = "nrqk", length = 1000)
	private String nrqk;// 内容情况
	@Column(name = "jdr")
	private String jdr;// 接待人
	@Column(name = "cljg")
	private String cljg;// 处理结果
	@OneToOne
	@JoinColumn(name = "USER_ID", unique = true)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getNrqk() {
		return nrqk;
	}

	public void setNrqk(String nrqk) {
		this.nrqk = nrqk;
	}

	public String getJdr() {
		return jdr;
	}

	public void setJdr(String jdr) {
		this.jdr = jdr;
	}

	public String getCljg() {
		return cljg;
	}

	public void setCljg(String cljg) {
		this.cljg = cljg;
	}

}
