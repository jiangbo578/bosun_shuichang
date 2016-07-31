package com.gouhai.baoshan.entity.business.dqgz.zb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * 联系服务群众走访团队名册_走访人
 * 
 * @author Rui
 */
@Entity
@Table(name = "bs_business_lxfwqzzf_zfr")
public class LxfwqzzfZfr extends BaseEntity {

	// 走访人
	@Column(name = "XM")
	private String xm;
	@Column(name = "ZW")
	private String zw;
	@Column(name = "LXFS")
	private String lxfs;
	@Column(name = "BZ")
	private String bz;

	@ManyToOne
	@JoinColumn(name = "ZRR_ID")
	private Lxfwqzzf lxfwqzzf;

	public Lxfwqzzf getLxfwqzzf() {
		return lxfwqzzf;
	}

	public void setLxfwqzzf(Lxfwqzzf lxfwqzzf) {
		this.lxfwqzzf = lxfwqzzf;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getZw() {
		return zw;
	}

	public void setZw(String zw) {
		this.zw = zw;
	}

	public String getLxfs() {
		return lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}
