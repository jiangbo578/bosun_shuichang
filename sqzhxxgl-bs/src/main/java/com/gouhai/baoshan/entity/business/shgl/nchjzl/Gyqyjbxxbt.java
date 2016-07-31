package com.gouhai.baoshan.entity.business.shgl.nchjzl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Gyqyjbxx;

/**
 * 工业企业基本信息
 * 
 * @author 徐舟
 * 
 *         有填报周期，需审核，每年十五号
 */
@Entity
@Table(name = "bs_business_gyqyjbxxbt")
public class Gyqyjbxxbt extends BaseEntity {
	@Column(name = "jgdm")
	private String jgdm;// 组织机构代码
	@Column(name = "pwmc")
	private String pwmc;// 排污名称
	@Column(name = "xz")
	private String xz;// 新增
	@Column(name = "dz")
	private String dz;// 地址
	@Column(name = "lxr")
	private String lxr;// 联系人
	@Column(name = "lxdh")
	private String lxhd;// 联系电话
	@Column(name = "hylb")
	private String hylb;// 行业类别
	@Column(name = "zg")
	private String zg;// 直观
	@Column(name = "ng")
	private String ng;// 纳管
	@Column(name = "ysl")
	private String ysl;// 用水量
	@Column(name = "mtl")
	private String mtl;// 煤炭量
	@Column(name = "zyl")
	private String zyl;// 重油量
	@Column(name = "cyl")
	private String cyl;// 柴油量
	@Column(name = "jjrql")
	private String jjrql;// 洁净软凄凉
	@Column(name = "gls")
	private String gls;// 锅炉书
	@Column(name = "wsss")
	private String wsss;// 治理污水设施数量
	@Column(name = "fqsl")
	private String fqsl;// 治理废气设施数量
	@Column(name = "wxwsl")
	private String wxwsl;// 危险物数量
	@Column(name = "bz")
	private String bz;// 备注
	@ManyToOne
	@JoinColumn(name = "gyqyjbxx_id")
	private Gyqyjbxx gyqyjbxx;

	public Gyqyjbxx getGyqyjbxx() {
		return gyqyjbxx;
	}

	public void setGyqyjbxx(Gyqyjbxx gyqyjbxx) {
		this.gyqyjbxx = gyqyjbxx;
	}

	public String getJgdm() {
		return jgdm;
	}

	public void setJgdm(String jgdm) {
		this.jgdm = jgdm;
	}

	public String getPwmc() {
		return pwmc;
	}

	public void setPwmc(String pwmc) {
		this.pwmc = pwmc;
	}

	public String getXz() {
		return xz;
	}

	public void setXz(String xz) {
		this.xz = xz;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getLxhd() {
		return lxhd;
	}

	public void setLxhd(String lxhd) {
		this.lxhd = lxhd;
	}

	public String getHylb() {
		return hylb;
	}

	public void setHylb(String hylb) {
		this.hylb = hylb;
	}

	public String getZg() {
		return zg;
	}

	public void setZg(String zg) {
		this.zg = zg;
	}

	public String getNg() {
		return ng;
	}

	public void setNg(String ng) {
		this.ng = ng;
	}

	public String getYsl() {
		return ysl;
	}

	public void setYsl(String ysl) {
		this.ysl = ysl;
	}

	public String getMtl() {
		return mtl;
	}

	public void setMtl(String mtl) {
		this.mtl = mtl;
	}

	public String getZyl() {
		return zyl;
	}

	public void setZyl(String zyl) {
		this.zyl = zyl;
	}

	public String getCyl() {
		return cyl;
	}

	public void setCyl(String cyl) {
		this.cyl = cyl;
	}

	public String getJjrql() {
		return jjrql;
	}

	public void setJjrql(String jjrql) {
		this.jjrql = jjrql;
	}

	public String getGls() {
		return gls;
	}

	public void setGls(String gls) {
		this.gls = gls;
	}

	public String getWsss() {
		return wsss;
	}

	public void setWsss(String wsss) {
		this.wsss = wsss;
	}

	public String getFqsl() {
		return fqsl;
	}

	public void setFqsl(String fqsl) {
		this.fqsl = fqsl;
	}

	public String getWxwsl() {
		return wxwsl;
	}

	public void setWxwsl(String wxwsl) {
		this.wxwsl = wxwsl;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}
