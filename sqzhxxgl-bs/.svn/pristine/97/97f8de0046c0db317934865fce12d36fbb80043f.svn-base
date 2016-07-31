package com.gouhai.baoshan.entity.business.shgl.nchjzl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Wptz;

/**
 * 田间（经济林）窝棚台帐
 * 
 * @author 徐舟
 * 
 *         有填报周期，需审核
 */
@Entity
@Table(name = "bs_business_wptzbt")
public class Wptzbt extends BaseEntity {

	@Column(name = "hzs")
	private String hzs;// 合作社

	@Column(name = "wpwz")
	private String wpwz;// 窝棚位置

	@Column(name = "mj")
	private double mj;// 面积

	@Column(name = "jzrs")
	private int jzrs;// 居住人数

	@Column(name = "ly")
	private String ly;// 生成领域

	@Column(name = "gm")
	private double gm;// 涉及的生产规模（亩）

	@Column(name = "djr")
	private String djr;// 搭建人

	@Column(name = "tdqx")
	private String tdqx;// 土地租赁期限

	@Column(name = "tdxz")
	private String tdxz;// 土地性质

	@Column(name = "lxfs")
	private String lxfs;// 主要居住人姓名及联系方式

	@Column(name = "zzqk")
	private String zzqk;// 田间（经济林）窝棚整治情况

	@ManyToOne
	@JoinColumn(name = "wptz_id")
	private Wptz wptz;

	public String getHzs() {
		return hzs;
	}

	public void setHzs(String hzs) {
		this.hzs = hzs;
	}

	public String getWpwz() {
		return wpwz;
	}

	public void setWpwz(String wpwz) {
		this.wpwz = wpwz;
	}

	public String getLy() {
		return ly;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}

	public String getDjr() {
		return djr;
	}

	public void setDjr(String djr) {
		this.djr = djr;
	}

	public String getTdqx() {
		return tdqx;
	}

	public void setTdqx(String tdqx) {
		this.tdqx = tdqx;
	}

	public String getTdxz() {
		return tdxz;
	}

	public void setTdxz(String tdxz) {
		this.tdxz = tdxz;
	}

	public String getLxfs() {
		return lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}

	public String getZzqk() {
		return zzqk;
	}

	public void setZzqk(String zzqk) {
		this.zzqk = zzqk;
	}

	public Wptz getWptz() {
		return wptz;
	}

	public void setWptz(Wptz wptz) {
		this.wptz = wptz;
	}

	public double getMj() {
		return mj;
	}

	public void setMj(double mj) {
		this.mj = mj;
	}

	public int getJzrs() {
		return jzrs;
	}

	public void setJzrs(int jzrs) {
		this.jzrs = jzrs;
	}

	public double getGm() {
		return gm;
	}

	public void setGm(double gm) {
		this.gm = gm;
	}

}
