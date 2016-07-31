package com.gouhai.baoshan.entity.business.jcqk.fwcz;

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

@Entity
@Table(name = "bs_business_bzcybt")
public class Bzcybt extends BaseEntity {
	@Column(name = "tzbmc")
	private String tzbmc;
	@Column(name = "tzbsjxm")
	private String tzbsjxm;
	@Column(name = "sstzbs")
	private String sstzbs;
	@Column(name = "tys")
	private String tys;
	@Column(name = "fa")
	private String fa;
	@Column(name = "fb")
	private String fb;
	@Column(name = "fc")
	private String fc;
	@Column(name = "fd")
	private String fd;
	@Column(name = "fe")
	private String fe;
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	@OneToMany(mappedBy = "bzcybt", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Bzcy> bzcylist;

	public List<Bzcy> getBzcylist() {
		return bzcylist;
	}

	public void setBzcylist(List<Bzcy> bzcylist) {
		this.bzcylist = bzcylist;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getTzbmc() {
		return tzbmc;
	}

	public void setTzbmc(String tzbmc) {
		this.tzbmc = tzbmc;
	}

	public String getTzbsjxm() {
		return tzbsjxm;
	}

	public void setTzbsjxm(String tzbsjxm) {
		this.tzbsjxm = tzbsjxm;
	}

	public String getSstzbs() {
		return sstzbs;
	}

	public void setSstzbs(String sstzbs) {
		this.sstzbs = sstzbs;
	}

	public String getTys() {
		return tys;
	}

	public void setTys(String tys) {
		this.tys = tys;
	}

	public String getFa() {
		return fa;
	}

	public void setFa(String fa) {
		this.fa = fa;
	}

	public String getFb() {
		return fb;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}

	public String getFc() {
		return fc;
	}

	public void setFc(String fc) {
		this.fc = fc;
	}

	public String getFd() {
		return fd;
	}

	public void setFd(String fd) {
		this.fd = fd;
	}

	public String getFe() {
		return fe;
	}

	public void setFe(String fe) {
		this.fe = fe;
	}

	public Bzcybt() {

		// TODO Auto-generated constructor stub
	}

	public Bzcybt(String id) {
		this.id = id;
	}
}
