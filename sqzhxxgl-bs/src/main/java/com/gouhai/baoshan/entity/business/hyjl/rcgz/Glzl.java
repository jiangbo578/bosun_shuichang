package com.gouhai.baoshan.entity.business.hyjl.rcgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 各类资料发放记录
 * 
 * @author 徐舟
 * 
 *         及时更新，无需审核，与人口无关，没有填报周期
 */
@Entity
@Table(name = "bs_business_glzl")
public class Glzl extends BaseEntity {
	@Column(name = "dw")
	private String dw;// 单位
	@Column(name = "nr")
	private String nr;// 内容
	@Column(name = "qs")
	private String qs;// 签收
	@Column(name = "sl")
	private String sl;// 数量
	@OneToOne
	@JoinColumn(name = "USER_ID", unique = true)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getQs() {
		return qs;
	}

	public void setQs(String qs) {
		this.qs = qs;
	}

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

}
