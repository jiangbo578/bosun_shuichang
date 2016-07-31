package com.gouhai.baoshan.entity.business.hyjl.rcgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.User;

/**
 * 社区治安、安全排摸、矛盾纠纷排查记录
 * 
 * @author 徐舟
 * 
 *         及时更新，没有填报周期，与人口无关，无需审核
 */
@Entity
@Table(name = "bs_business_sqzamp")
public class Sqzamp extends BaseEntity {
	@Column(name = "sj")
	private String sj;// 时间
	@Column(name = "cjry")
	private String cjry;// 参加人员
	@Column(name = "dz")
	private String dz;// 地点
	@Column(name = "fzr")
	private String fzr;// 负责人
	@Column(name = "zb")
	private String zb;// 质保
	@Column(name = "mj")
	private String mj;// 民警
	@Column(name = "tjy")
	private String tjy;// 调解员
	@Column(name = "wy")
	private String wy;// 物业
	@Column(name = "xg")
	private String xg;// 协管
	@Column(name = "qt")
	private String qt;// 其他
	@Column(name = "nr", length = 1000)
	private String nr;// 内容
	@Column(name = "czwt")
	private String czwt;// 存在问题
	@Column(name = "zgcs")
	private String zgcs;// 整改措施
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

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getCjry() {
		return cjry;
	}

	public void setCjry(String cjry) {
		this.cjry = cjry;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getFzr() {
		return fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getZb() {
		return zb;
	}

	public void setZb(String zb) {
		this.zb = zb;
	}

	public String getMj() {
		return mj;
	}

	public void setMj(String mj) {
		this.mj = mj;
	}

	public String getTjy() {
		return tjy;
	}

	public void setTjy(String tjy) {
		this.tjy = tjy;
	}

	public String getWy() {
		return wy;
	}

	public void setWy(String wy) {
		this.wy = wy;
	}

	public String getXg() {
		return xg;
	}

	public void setXg(String xg) {
		this.xg = xg;
	}

	public String getQt() {
		return qt;
	}

	public void setQt(String qt) {
		this.qt = qt;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getCzwt() {
		return czwt;
	}

	public void setCzwt(String czwt) {
		this.czwt = czwt;
	}

	public String getZgcs() {
		return zgcs;
	}

	public void setZgcs(String zgcs) {
		this.zgcs = zgcs;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}
