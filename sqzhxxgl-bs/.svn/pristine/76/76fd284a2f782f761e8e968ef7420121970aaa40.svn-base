package com.gouhai.baoshan.entity.business.shgl.xfgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;

/**
 * c
 * 
 * @author 徐舟
 * 
 *         2014-9-17
 */
@Entity
@Table(name = "bs_business_dwdcmany")
public class Dwdcmany extends BaseEntity {
	@Column(name = "cs")
	private String cs;// 层数
	@Column(name = "mj")
	private String mj;// 面积
	@Column(name = "xz")
	private String xz;// 性质
	@ManyToOne
	@JoinColumn(name = "xqdc_id")
	private Dwdc dwdc;

	public String getCs() {
		return cs;
	}

	public void setCs(String cs) {
		this.cs = cs;
	}

	public String getMj() {
		return mj;
	}

	public void setMj(String mj) {
		this.mj = mj;
	}

	public String getXz() {
		return xz;
	}

	public void setXz(String xz) {
		this.xz = xz;
	}

	public Dwdc getDwdc() {
		return dwdc;
	}

	public void setDwdc(Dwdc dwdc) {
		this.dwdc = dwdc;
	}

}
