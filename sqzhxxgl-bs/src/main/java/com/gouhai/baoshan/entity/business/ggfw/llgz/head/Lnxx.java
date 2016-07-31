package com.gouhai.baoshan.entity.business.ggfw.llgz.head;

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
import com.gouhai.baoshan.entity.business.ggfw.llgz.Lnxxry;

/**
 * 老年学校在册人员名册主类
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_lnxx")
public class Lnxx extends BaseEntity {
	@Column(name = "xxmc")
	private String xxmc;// 学校名称
	@Column(name = "jlsj")
	private String jlsj;// 建立时间
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	// 名单 一对多
	@OneToMany(mappedBy = "lnxx", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Lnxxry> lnxxrylist;

	public String getXxmc() {
		return xxmc;
	}

	public void setXxmc(String xxmc) {
		this.xxmc = xxmc;
	}

	public String getJlsj() {
		return jlsj;
	}

	public void setJlsj(String jlsj) {
		this.jlsj = jlsj;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public List<Lnxxry> getLnxxrylist() {
		return lnxxrylist;
	}

	public void setLnxxrylist(List<Lnxxry> lnxxrylist) {
		this.lnxxrylist = lnxxrylist;
	}

	public Lnxx(String id) {
		this.id = id;
	}

	public Lnxx() {

	}
}
