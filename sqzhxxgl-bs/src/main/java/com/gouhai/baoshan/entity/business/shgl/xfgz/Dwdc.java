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
 * 村委社会单位(场所)底册
 * 
 * @author 徐舟
 * 
 *         2014-9-17
 */
@Entity
@Table(name = "bs_business_dwdc")
public class Dwdc extends BaseEntity {
	@Column(name = "xqmc")
	private String xqmc;// 小区名称
	@Column(name = "dwdz")
	private String dwdz;// 单位地址
	@Column(name = "lxf")
	private String lxr;// 单位联系人
	@Column(name = "lxfs")
	private String lxfs;// 联系方式
	@Column(name = "djnf")
	private String djnf;// 等级年份
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	@OneToMany(mappedBy = "dwdc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Dwdcmany> dwdcmanylist;

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

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
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

	public List<Dwdcmany> getDwdcmanylist() {
		return dwdcmanylist;
	}

	public void setDwdcmanylist(List<Dwdcmany> dwdcmanylist) {
		this.dwdcmanylist = dwdcmanylist;
	}

}
