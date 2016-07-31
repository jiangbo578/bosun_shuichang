package com.gouhai.baoshan.entity.business.hyjl.rcgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 捐款（捐物）情况记录
 * 
 * @author 徐舟
 * 
 *         与人口无关，无需审核，及时更新
 */
@Entity
@Table(name = "bs_business_jkqk")
public class Jkqk extends BaseEntity {
	@Column(name = "rq")
	private String rq;// 日期
	@Column(name = "dw")
	private String dw;// 捐款单位或者个人
	@Column(name = "dz")
	private String dz;// 地址
	@Column(name = "phone")
	private String phone;// 电话
	@Column(name = "price")
	private String price;// 金额
	@Column(name = "wpmc")
	private String wpmc;// 物品名称
	@Column(name = "wp")
	private String wp;// 物品件
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

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getWpmc() {
		return wpmc;
	}

	public void setWpmc(String wpmc) {
		this.wpmc = wpmc;
	}

	public String getWp() {
		return wp;
	}

	public void setWp(String wp) {
		this.wp = wp;
	}

}
