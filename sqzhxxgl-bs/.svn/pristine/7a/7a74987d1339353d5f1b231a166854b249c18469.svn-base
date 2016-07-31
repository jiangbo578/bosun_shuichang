package com.gouhai.baoshan.entity.business.hyjl.hyhd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 宣传记录
 * 
 * @author 徐舟
 * 
 *         没有填报周期，及时更新，无需审核，与人口无关
 */
@Entity
@Table(name = "bs_business_Xcjl")
public class Xcjl extends BaseEntity {
	@Column(name = "sj")
	private String sj;// 时间
	@Column(name = "address")
	private String address;// 地点
	@Column(name = "xcry")
	private String xcry;// 宣传人员
	@Column(name = "xcxs")
	private String xcxs;// 宣传形式
	@Column(name = "xczt")
	private String xczt;// 宣传主题
	@Column(name = "nr", length = 100000)
	private String nr;// 内容
	@Column(name = "jlr", length = 20)
	private String jlr;// 记录人
	@OneToOne
	@JoinColumn(name = "USER_ID", unique = true)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getXcry() {
		return xcry;
	}

	public void setXcry(String xcry) {
		this.xcry = xcry;
	}

	public String getXcxs() {
		return xcxs;
	}

	public void setXcxs(String xcxs) {
		this.xcxs = xcxs;
	}

	public String getXczt() {
		return xczt;
	}

	public void setXczt(String xczt) {
		this.xczt = xczt;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getJlr() {
		return jlr;
	}

	public void setJlr(String jlr) {
		this.jlr = jlr;
	}

}
