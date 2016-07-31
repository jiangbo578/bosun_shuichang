package com.gouhai.baoshan.entity.business.jcqk.rymd;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 实有房屋信息
 * 
 * @author MedivhQ 需要审核 与人口无关
 * 
 */
@Entity
@Table(name = "bs_business_syfwxx")
public class Syfwxx extends BaseEntity {
	@Column(name = "ssjz")
	private String ssjz;
	@Column(name = "zhs")
	private String zhs;
	@Column(name = "zjs")
	private String zjs;
	@Column(name = "zmj")
	private String zmj;
	@Column(name = "sfczjs")
	private String sfczjs;
	@Column(name = "sfczmj")
	private String sfczmj;
	@Column(name = "yzczjs")
	private String yzczjs;
	@Column(name = "yzczmj")
	private String yzczmj;
	@Column(name = "wzczjs")
	private String wzczjs;
	@Column(name = "wzczmj")
	private String wzczmj;
	@Column(name = "qzjs")
	private String qzjs;
	@Column(name = "jgfjs")
	private String jgfjs;
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	
	public String getSsjz() {
		return ssjz;
	}

	public void setSsjz(String ssjz) {
		this.ssjz = ssjz;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getZhs() {
		return zhs;
	}

	public void setZhs(String zhs) {
		this.zhs = zhs;
	}

	public String getZjs() {
		return zjs;
	}

	public void setZjs(String zjs) {
		this.zjs = zjs;
	}

	public String getZmj() {
		return zmj;
	}

	public void setZmj(String zmj) {
		this.zmj = zmj;
	}

	public String getSfczjs() {
		return sfczjs;
	}

	public void setSfczjs(String sfczjs) {
		this.sfczjs = sfczjs;
	}

	public String getSfczmj() {
		return sfczmj;
	}

	public void setSfczmj(String sfczmj) {
		this.sfczmj = sfczmj;
	}

	public String getYzczjs() {
		return yzczjs;
	}

	public void setYzczjs(String yzczjs) {
		this.yzczjs = yzczjs;
	}


	public String getYzczmj() {
		return yzczmj;
	}

	public void setYzczmj(String yzczmj) {
		this.yzczmj = yzczmj;
	}

	public String getWzczjs() {
		return wzczjs;
	}

	public void setWzczjs(String wzczjs) {
		this.wzczjs = wzczjs;
	}

	public String getWzczmj() {
		return wzczmj;
	}

	public void setWzczmj(String wzczmj) {
		this.wzczmj = wzczmj;
	}

	public String getQzjs() {
		return qzjs;
	}

	public void setQzjs(String qzjs) {
		this.qzjs = qzjs;
	}

	public String getJgfjs() {
		return jgfjs;
	}

	public void setJgfjs(String jgfjs) {
		this.jgfjs = jgfjs;
	}

	


}
