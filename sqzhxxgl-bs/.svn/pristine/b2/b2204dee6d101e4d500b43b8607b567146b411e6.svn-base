package com.gouhai.baoshan.entity.business.ggfw.cjrgz.head;

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
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Fcbkjdry;

/**
 * 党员干部扶残帮困结对记录主类
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_fcbkjd")
public class Fcbkjd extends BaseEntity {
	@Column(name = "sj")
	private String sj;// 时间
	@Column(name = "address")
	private String address;// 地点
	@Column(name = "zjr")
	private String zjr;// 召集人
	@Column(name = "jd")
	private String jd;// 季度
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	// 名单 一对多
	@OneToMany(mappedBy = "fcbkjd", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Fcbkjdry> fcbkjdrylist;

	public List<Fcbkjdry> getFcbkjdrylist() {
		return fcbkjdrylist;
	}

	public void setFcbkjdrylist(List<Fcbkjdry> fcbkjdrylist) {
		this.fcbkjdrylist = fcbkjdrylist;
	}

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZjr() {
		return zjr;
	}

	public void setZjr(String zjr) {
		this.zjr = zjr;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public Fcbkjd() {

	}

	public Fcbkjd(String id) {
		this.id = id;
	}
}
