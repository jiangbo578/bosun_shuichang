package com.gouhai.baoshan.entity.business.jcqk.fwcz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;

@Entity
@Table(name = "bs_business_bzcy")
public class Bzcy extends BaseEntity {
	@Column(name = "xm")
	private String xm;
	@Column(name = "csny")
	private String csny;
	@Column(name = "xb")
	private String xb;
	@Column(name = "jtzz")
	private String jtzz;
	@Column(name = "mz")
	private String mz;
	@Column(name = "zzmm")
	private String zzmm;
	@Column(name = "tnzw")
	private String tnzw;
	@Column(name = "gzdw")
	private String gzdw;
	@ManyToOne
	@JoinColumn(name = "bzcybt_id")
	private Bzcybt bzcybt;

	public Bzcybt getBzcybt() {
		return bzcybt;
	}

	public void setBzcybt(Bzcybt bzcybt) {
		this.bzcybt = bzcybt;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getCsny() {
		return csny;
	}

	public void setCsny(String csny) {
		this.csny = csny;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getMz() {
		return mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	public String getZzmm() {
		return zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	public String getTnzw() {
		return tnzw;
	}

	public void setTnzw(String tnzw) {
		this.tnzw = tnzw;
	}

	public String getGzdw() {
		return gzdw;
	}

	public void setGzdw(String gzdw) {
		this.gzdw = gzdw;
	}

}
