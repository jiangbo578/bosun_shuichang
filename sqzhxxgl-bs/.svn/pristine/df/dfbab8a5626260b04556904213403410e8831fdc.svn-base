package com.gouhai.baoshan.entity.business.shgl.cjjyqk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffxymp;

/**
 * 非法行医情况排摸信息表
 * 
 * @author 徐舟
 * 
 *         需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_ffxympbt")
public class Ffxympbt extends BaseEntity {
	@Column(name = "cwh")
	private String cwh;// 村居委会
	@Column(name = "dz")
	private String dz;// 地址
	@Column(name = "fwxz")
	private String fwxz;// 房屋性质
	@Column(name = "xyrxm")
	private String xyrxm;// 行医人姓名
	@Column(name = "xyrsfz")
	private String xyrsfz;// 行医人身份证
	@Column(name = "xynr")
	private String xynr;// 行医内容
	@Column(name = "xybz")
	private String xybz;// 行医标志
	@Column(name = "fdxm")
	private String fdxm;// 房东姓名
	@Column(name = "mprxm")
	private String mprxm;// 摸排人姓名
	@Column(name = "rq")
	private String rq;// 日期
	@Column(name = "sfxz")
	private String sfxz;// 是否新增
	@ManyToOne
	@JoinColumn(name = "ffxymp_id")
	private Ffxymp ffxymp;

	public String getCwh() {
		return cwh;
	}

	public void setCwh(String cwh) {
		this.cwh = cwh;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getFwxz() {
		return fwxz;
	}

	public void setFwxz(String fwxz) {
		this.fwxz = fwxz;
	}

	public String getXyrxm() {
		return xyrxm;
	}

	public void setXyrxm(String xyrxm) {
		this.xyrxm = xyrxm;
	}

	public String getXyrsfz() {
		return xyrsfz;
	}

	public void setXyrsfz(String xyrsfz) {
		this.xyrsfz = xyrsfz;
	}

	public String getXynr() {
		return xynr;
	}

	public void setXynr(String xynr) {
		this.xynr = xynr;
	}

	public String getXybz() {
		return xybz;
	}

	public void setXybz(String xybz) {
		this.xybz = xybz;
	}

	public String getFdxm() {
		return fdxm;
	}

	public void setFdxm(String fdxm) {
		this.fdxm = fdxm;
	}

	public String getMprxm() {
		return mprxm;
	}

	public void setMprxm(String mprxm) {
		this.mprxm = mprxm;
	}

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
	}

	public String getSfxz() {
		return sfxz;
	}

	public void setSfxz(String sfxz) {
		this.sfxz = sfxz;
	}

	public Ffxymp getFfxymp() {
		return ffxymp;
	}

	public void setFfxymp(Ffxymp ffxymp) {
		this.ffxymp = ffxymp;
	}

}
