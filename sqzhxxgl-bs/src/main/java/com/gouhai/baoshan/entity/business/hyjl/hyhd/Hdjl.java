package com.gouhai.baoshan.entity.business.hyjl.hyhd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 活动记录
 * 
 * @author 徐舟
 * 
 *         与人口无关，及时更新，没有填报周期，不需要审核
 */
@Entity
@Table(name = "bs_business_hdjl")
public class Hdjl extends BaseEntity {
	@Column(name = "sj")
	private String sj;// 时间
	@Column(name = "address")
	private String address;// 地点
	@Column(name = "cjrs")
	private String cjrs;// 参加人数
	@Column(name = "fzr")
	private String fzr;// 负责人
	@Column(name = "cjdx")
	private String cjdx;// 参加对象
	@Column(name = "nr", length = 500)
	private String nr;// 活动内容摘要
	@Column(name = "jlr")
	private String jlr;// 记录人
	@Column(name = "type")
	private String type;// 会议类型
	@OneToOne
	@JoinColumn(name = "USER_ID", unique = true)
	private User user;

	public User getUser() {
		return user;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getCjrs() {
		return cjrs;
	}

	public void setCjrs(String cjrs) {
		this.cjrs = cjrs;
	}

	public String getFzr() {
		return fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getCjdx() {
		return cjdx;
	}

	public void setCjdx(String cjdx) {
		this.cjdx = cjdx;
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
