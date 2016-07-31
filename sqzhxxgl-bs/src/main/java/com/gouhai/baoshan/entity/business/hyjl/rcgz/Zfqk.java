package com.gouhai.baoshan.entity.business.hyjl.rcgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 走访情况记录
 * 
 * @author 徐舟
 * 
 *         及时更新，没有填报周期，与人口无关，不需要审核
 * 
 */
@Entity
@Table(name = "bs_business_zfqk")
public class Zfqk extends BaseEntity {
	@Column(name = "xh")
	private String xh;// 序号
	@Column(name = "sj")
	private String sj;// 时间
	@Column(name = "bfzxm")
	private String bfzxm;// 被访者姓名
	@Column(name = "bfzlx")
	private String bfzlx;// 被访者类型
	@Column(name = "bfzdz")
	private String bfzdz;// 被访者地址
	@Column(name = "jtjbqk")
	private String jtjbqk;// 家庭基本情况
	@Column(name = "bfzdh")
	private String bfzdh;// 被访者联系电话
	@Column(name = "zfz")
	private String zfz;// 走访者
	@Column(name = "xq", length = 100000)
	private String xq;// 反映的需求、问题和建议
	@Column(name = "dc", length = 100000)
	private String dc;// 采取的对策和措施
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

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getBfzxm() {
		return bfzxm;
	}

	public void setBfzxm(String bfzxm) {
		this.bfzxm = bfzxm;
	}

	public String getBfzlx() {
		return bfzlx;
	}

	public void setBfzlx(String bfzlx) {
		this.bfzlx = bfzlx;
	}

	public String getBfzdz() {
		return bfzdz;
	}

	public void setBfzdz(String bfzdz) {
		this.bfzdz = bfzdz;
	}

	public String getJtjbqk() {
		return jtjbqk;
	}

	public void setJtjbqk(String jtjbqk) {
		this.jtjbqk = jtjbqk;
	}

	public String getBfzdh() {
		return bfzdh;
	}

	public void setBfzdh(String bfzdh) {
		this.bfzdh = bfzdh;
	}

	public String getZfz() {
		return zfz;
	}

	public void setZfz(String zfz) {
		this.zfz = zfz;
	}

	public String getXq() {
		return xq;
	}

	public void setXq(String xq) {
		this.xq = xq;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public String getCljg() {
		return cljg;
	}

	public void setCljg(String cljg) {
		this.cljg = cljg;
	}

}
