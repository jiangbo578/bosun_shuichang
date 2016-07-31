package com.gouhai.baoshan.entity.business.hyjl.rcgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 志愿者服务记录
 * 
 * @author 徐舟
 * 
 *         没有填报周期，及时更新 。与人口无关，不需要审核
 */
@Entity
@Table(name = "bs_business_zyzfw")
public class Zyzfw extends BaseEntity {
	@Column(name = "rq")
	private String rq;// 日期
	@Column(name = "zyzxm")
	private String zyzxm;// 志愿者姓名
	@Column(name = "nr")
	private String nr;// 内容
	@Column(name = "fwrc")
	private String fwrc;// 服务人次
	@Column(name = "qzmyd")
	private String qzmyd;// 群众满意度
	@Column(name = "bz")
	private String bz;// 备注
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

	public String getZyzxm() {
		return zyzxm;
	}

	public void setZyzxm(String zyzxm) {
		this.zyzxm = zyzxm;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getFwrc() {
		return fwrc;
	}

	public void setFwrc(String fwrc) {
		this.fwrc = fwrc;
	}

	public String getQzmyd() {
		return qzmyd;
	}

	public void setQzmyd(String qzmyd) {
		this.qzmyd = qzmyd;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}
