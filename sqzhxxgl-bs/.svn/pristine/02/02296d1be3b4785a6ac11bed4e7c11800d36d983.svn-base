package com.gouhai.baoshan.entity.business.shgl.xfgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_xfanwgh")
public class Xfanwgh extends BaseEntity {
	@Column(name = "jwhzrxm")
	private String jwhzrxm;// 居委会主任
	@Column(name = "jwhfzrxm")
	private String jwhfzrxm;// 居委会副主任
	@Column(name = "wygsjlxm")
	private String wygsjlxm;// 物业公司经理
	@Column(name = "wygsmc")
	private String wygsmc;// 所属物业公司名称
	@Column(name = "wyxqmc")
	private String wyxqmc;// 所属小区名称
	@Column(name = "lzzxm")
	private String lzzxm;// 楼组长
	@Column(name = "lzzxqmc")
	private String lzzxqmc;// 楼组长小区名称
	@Column(name = "jml")
	private String jml;// 所属居民楼
	@Column(name = "cmxzzxm")
	private String cmxzzxm;// 村民小组长
	@Column(name = "cmxqmc")
	private String cmxqmc;// 所属小区名称
	@Column(name = "cmjml")
	private String cmjml;// 所属居民楼
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getJwhzrxm() {
		return jwhzrxm;
	}

	public void setJwhzrxm(String jwhzrxm) {
		this.jwhzrxm = jwhzrxm;
	}

	public String getJwhfzrxm() {
		return jwhfzrxm;
	}

	public void setJwhfzrxm(String jwhfzrxm) {
		this.jwhfzrxm = jwhfzrxm;
	}

	public String getWygsjlxm() {
		return wygsjlxm;
	}

	public void setWygsjlxm(String wygsjlxm) {
		this.wygsjlxm = wygsjlxm;
	}

	public String getWygsmc() {
		return wygsmc;
	}

	public void setWygsmc(String wygsmc) {
		this.wygsmc = wygsmc;
	}

	public String getWyxqmc() {
		return wyxqmc;
	}

	public void setWyxqmc(String wyxqmc) {
		this.wyxqmc = wyxqmc;
	}

	public String getLzzxm() {
		return lzzxm;
	}

	public void setLzzxm(String lzzxm) {
		this.lzzxm = lzzxm;
	}

	public String getLzzxqmc() {
		return lzzxqmc;
	}

	public void setLzzxqmc(String lzzxqmc) {
		this.lzzxqmc = lzzxqmc;
	}

	public String getJml() {
		return jml;
	}

	public void setJml(String jml) {
		this.jml = jml;
	}

	public String getCmxzzxm() {
		return cmxzzxm;
	}

	public void setCmxzzxm(String cmxzzxm) {
		this.cmxzzxm = cmxzzxm;
	}

	public String getCmxqmc() {
		return cmxqmc;
	}

	public void setCmxqmc(String cmxqmc) {
		this.cmxqmc = cmxqmc;
	}

	public String getCmjml() {
		return cmjml;
	}

	public void setCmjml(String cmjml) {
		this.cmjml = cmjml;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
