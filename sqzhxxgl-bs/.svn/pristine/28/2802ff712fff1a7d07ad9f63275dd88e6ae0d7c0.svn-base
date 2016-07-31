package com.gouhai.baoshan.entity.business.dqgz.zb;

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
 * 联系服务群众走访团队名册_责任人 填报周期一月15号 不需要审核
 * 
 * @author Rui
 */
@Entity
@Table(name = "bs_business_lxfwqzzf_zrr")
public class Lxfwqzzf extends BaseEntity {

	@Column(name = "ZRQ")
	private String zrq;// 责任区

	// 责任区域
	@Column(name = "ZHS")
	private Integer zhs;// 总户数
	@Column(name = "MPHH")
	private String mphh;// 门牌号码

	// 责任人
	@Column(name = "XM")
	private String xm;
	@Column(name = "ZW")
	private String zw;
	@Column(name = "LXFS")
	private String lxfs;
	@Column(name = "BZ")
	private String bz;

	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	// 走访人
	@OneToMany(mappedBy = "lxfwqzzf", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	private List<LxfwqzzfZfr> lxfwqzzfZfr;

	public List<LxfwqzzfZfr> getLxfwqzzfZfr() {
		return lxfwqzzfZfr;
	}

	public void setLxfwqzzfZfr(List<LxfwqzzfZfr> lxfwqzzfZfr) {
		this.lxfwqzzfZfr = lxfwqzzfZfr;
	}

	public String getZrq() {
		return zrq;
	}

	public void setZrq(String zrq) {
		this.zrq = zrq;
	}

	public Integer getZhs() {
		return zhs;
	}

	public void setZhs(Integer zhs) {
		this.zhs = zhs;
	}

	public String getMphh() {
		return mphh;
	}

	public void setMphh(String mphh) {
		this.mphh = mphh;
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

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
