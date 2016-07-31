package com.gouhai.baoshan.entity.business.hyjl.rcgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 信访调解记录
 * 
 * @author 徐舟
 * 
 *         及时更新，没有填报周期，无需审核，与人口无关
 */
@Entity
@Table(name = "bs_business_xftj")
public class Xftj extends BaseEntity {
	@Column(name = "xh")
	private String xh;// 序号
	@Column(name = "jflb")
	private String jflb;// 纠纷类别
	@Column(name = "slsj")
	private String slsj;// 受理时间
	@Column(name = "tjry")
	private String tjry;// 调节人员
	@Column(name = "ywtjxy")
	private String ywtjxy;// 有无调解协议
	@Column(name = "dsrgk")
	private String dsrgk;// 当事人概况
	@Column(name = "jfgk")
	private String jfgk;// 纠纷概况
	@Column(name = "tcjg")
	private String tcjg;// 调处结果
	@Column(name = "gzfkqk")
	private String gzfkqk;// 跟踪反馈情况
	@OneToOne
	@JoinColumn(name = "USER_ID", unique = true)
	private User user;

	public String getXh() {
		return xh;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getJflb() {
		return jflb;
	}

	public void setJflb(String jflb) {
		this.jflb = jflb;
	}

	public String getSlsj() {
		return slsj;
	}

	public void setSlsj(String slsj) {
		this.slsj = slsj;
	}

	public String getTjry() {
		return tjry;
	}

	public void setTjry(String tjry) {
		this.tjry = tjry;
	}

	public String getYwtjxy() {
		return ywtjxy;
	}

	public void setYwtjxy(String ywtjxy) {
		this.ywtjxy = ywtjxy;
	}

	public String getDsrgk() {
		return dsrgk;
	}

	public void setDsrgk(String dsrgk) {
		this.dsrgk = dsrgk;
	}

	public String getJfgk() {
		return jfgk;
	}

	public void setJfgk(String jfgk) {
		this.jfgk = jfgk;
	}

	public String getTcjg() {
		return tcjg;
	}

	public void setTcjg(String tcjg) {
		this.tcjg = tcjg;
	}

	public String getGzfkqk() {
		return gzfkqk;
	}

	public void setGzfkqk(String gzfkqk) {
		this.gzfkqk = gzfkqk;
	}

}
