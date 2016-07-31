package com.gouhai.baoshan.entity.business.shgl.xfgz;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 居（村）委社会单位场所、住宅小区底册
 * 
 * @author 徐舟
 * 
 *         有填报周期，需审核
 */
@Entity
@Table(name = "bs_business_xqdc")
public class Xqdc extends BaseEntity {
	@Column(name = "xqmc")
	private String xqmc;// 小区名称
	@Column(name = "dwdz")
	private String dwdz;// 单位地址
	@Column(name = "lxr")
	private String lxr;// 单位联系人
	@Column(name = "lxfs")
	private String lxfs;// 和联系方式
	@Column(name = "djnf")
	private String djnf;// 等级年份
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	@OneToMany(mappedBy = "xqdc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Xqdcmany> xqdcmanylist;

	public List<Xqdcmany> getXqdcmanylist() {
		return xqdcmanylist;
	}

	public void setXqdcmanylist(List<Xqdcmany> xqdcmanylist) {
		this.xqdcmanylist = xqdcmanylist;
	}

	public String getXqmc() {
		return xqmc;
	}

	public void setXqmc(String xqmc) {
		this.xqmc = xqmc;
	}

	public String getDwdz() {
		return dwdz;
	}

	public void setDwdz(String dwdz) {
		this.dwdz = dwdz;
	}

	public String getLxfs() {
		return lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}

	public String getDjnf() {
		return djnf;
	}

	public void setDjnf(String djnf) {
		this.djnf = djnf;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

}
