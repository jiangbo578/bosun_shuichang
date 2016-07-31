package com.gouhai.baoshan.entity.business.shgl.cjjyqk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffbxd;

/**
 * 、村、居非法办学点情况表
 * 
 * @author 徐舟
 * 
 *         需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_ffbxdbt")
public class Ffbxdbt extends BaseEntity {
	@Column(name = "ssjd")
	private String ssjd;// 所属街道
	@Column(name = "sscwh")
	private String sscwh;// 所属村委会
	@Column(name = "bxmc")
	private String bxmc;// 办学名称
	@Column(name = "xm")
	private String xm;// 姓名
	@Column(name = "jg")
	private String jg;// 籍贯
	@Column(name = "sfz")
	private String sfz;// 身份证
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "bxdz")
	private String bxdz;// 办学地址
	@Column(name = "bjs")
	private String bjs;// 班级数
	@Column(name = "yrs")
	private String yrs;// 幼儿数
	@Column(name = "fwxz")
	private String fwxz;// 房屋性质
	@Column(name = "wz")
	private String wz;// 是否违章搭建
	@Column(name = "jbsj")
	private String jbsj;// 举办时间
	@ManyToOne
	@JoinColumn(name = "ffbxd_id")
	private Ffbxd ffbxd;

	public String getSsjd() {
		return ssjd;
	}

	public void setSsjd(String ssjd) {
		this.ssjd = ssjd;
	}

	public String getSscwh() {
		return sscwh;
	}

	public void setSscwh(String sscwh) {
		this.sscwh = sscwh;
	}

	public String getBxmc() {
		return bxmc;
	}

	public void setBxmc(String bxmc) {
		this.bxmc = bxmc;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getJg() {
		return jg;
	}

	public void setJg(String jg) {
		this.jg = jg;
	}

	public String getSfz() {
		return sfz;
	}

	public void setSfz(String sfz) {
		this.sfz = sfz;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBxdz() {
		return bxdz;
	}

	public void setBxdz(String bxdz) {
		this.bxdz = bxdz;
	}

	public String getBjs() {
		return bjs;
	}

	public void setBjs(String bjs) {
		this.bjs = bjs;
	}

	public String getYrs() {
		return yrs;
	}

	public void setYrs(String yrs) {
		this.yrs = yrs;
	}

	public String getFwxz() {
		return fwxz;
	}

	public void setFwxz(String fwxz) {
		this.fwxz = fwxz;
	}

	public String getWz() {
		return wz;
	}

	public void setWz(String wz) {
		this.wz = wz;
	}

	public String getJbsj() {
		return jbsj;
	}

	public void setJbsj(String jbsj) {
		this.jbsj = jbsj;
	}

	public Ffbxd getFfbxd() {
		return ffbxd;
	}

	public void setFfbxd(Ffbxd ffbxd) {
		this.ffbxd = ffbxd;
	}

}
