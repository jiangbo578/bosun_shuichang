package com.gouhai.baoshan.entity.business.shgl.nchjzl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Bgfyzc;

/**
 * 不规范生猪养殖场（户）整治推进情况统计
 * 
 * @author 徐舟
 * 
 *         有填报周期，需审核
 */
@Entity
@Table(name = "bs_business_bgfyzcbt")
public class Bgfyzcbt extends BaseEntity {
	@Column(name = "yzh")
	private String yzh;// 养殖户
	@Column(name = "xz")
	private String xz;// 新增
	@Column(name = "wlh")
	private String wlh;// 是否外来户
	@Column(name = "gs")
	private String gs;// 是否使用泔水
	@Column(name = "yzdd")
	private String yzdd;// 养殖地点
	@Column(name = "phone")
	private String phone;// 养殖地点
	@Column(name = "gz")
	private int gz;// 公主
	@Column(name = "mz")
	private int mz;// 母猪
	@Column(name = "sprz")
	private int sprz;// 商品肉猪
	@Column(name = "jhzzs")
	private String jhzzs;// 计划甄正书
	@Column(name = "xzxqzz")
	private String xzxqzz;// 新增需求政治
	@Column(name = "yzzs")
	private String yzzs;// 已经整治数
	@Column(name = "zzjd")
	private String zzjd;// 整治进度
	@ManyToOne
	@JoinColumn(name = "bgfyzc_id")
	private Bgfyzc bgfyzc;

	public String getYzh() {
		return yzh;
	}

	public void setYzh(String yzh) {
		this.yzh = yzh;
	}

	public String getXz() {
		return xz;
	}

	public void setXz(String xz) {
		this.xz = xz;
	}

	public String getWlh() {
		return wlh;
	}

	public void setWlh(String wlh) {
		this.wlh = wlh;
	}

	public String getGs() {
		return gs;
	}

	public void setGs(String gs) {
		this.gs = gs;
	}

	public String getYzdd() {
		return yzdd;
	}

	public void setYzdd(String yzdd) {
		this.yzdd = yzdd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getGz() {
		return gz;
	}

	public void setGz(int gz) {
		this.gz = gz;
	}

	public int getMz() {
		return mz;
	}

	public void setMz(int mz) {
		this.mz = mz;
	}

	public int getSprz() {
		return sprz;
	}

	public void setSprz(int sprz) {
		this.sprz = sprz;
	}

	public String getJhzzs() {
		return jhzzs;
	}

	public void setJhzzs(String jhzzs) {
		this.jhzzs = jhzzs;
	}

	public String getXzxqzz() {
		return xzxqzz;
	}

	public void setXzxqzz(String xzxqzz) {
		this.xzxqzz = xzxqzz;
	}

	public String getYzzs() {
		return yzzs;
	}

	public void setYzzs(String yzzs) {
		this.yzzs = yzzs;
	}

	public String getZzjd() {
		return zzjd;
	}

	public void setZzjd(String zzjd) {
		this.zzjd = zzjd;
	}

	public Bgfyzc getBgfyzc() {
		return bgfyzc;
	}

	public void setBgfyzc(Bgfyzc bgfyzc) {
		this.bgfyzc = bgfyzc;
	}

}
