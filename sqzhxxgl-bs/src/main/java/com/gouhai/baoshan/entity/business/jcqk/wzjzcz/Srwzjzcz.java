package com.gouhai.baoshan.entity.business.jcqk.wzjzcz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 私人违章建筑处置
 * 
 * @author MedivhQ 需要审核 与人口无关
 * 
 */
@Entity
@Table(name = "bs_business_srwzjzcz")
public class Srwzjzcz extends BaseEntity {
	@Column(name = "slsj")
	private String slsj;
	@Column(name = "ly")
	private String ly;
	@Column(name = "wzdz")
	private String wzdz;
	@Column(name = "wzmj")
	private String wzmj;
	@Column(name = "wzqk")
	private String wzqk;
	@Column(name = "wzbw")
	private String wzbw;
	@Column(name = "czqk")
	private String czqk;
	@Column(name = "czdw")
	private String czdw;
	@Column(name = "bz")
	private String bz;
	@Column(name = "zzqimg")
	private String zzqimg;
	@Column(name = "zzhimg")
	private String zzhimg;

	public String getZzqimg() {
		return zzqimg;
	}

	public void setZzqimg(String zzqimg) {
		this.zzqimg = zzqimg;
	}

	public String getZzhimg() {
		return zzhimg;
	}

	public void setZzhimg(String zzhimg) {
		this.zzhimg = zzhimg;
	}

	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getSlsj() {
		return slsj;
	}

	public void setSlsj(String slsj) {
		this.slsj = slsj;
	}

	public String getLy() {
		return ly;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}

	public String getWzdz() {
		return wzdz;
	}

	public void setWzdz(String wzdz) {
		this.wzdz = wzdz;
	}

	public String getWzmj() {
		return wzmj;
	}

	public void setWzmj(String wzmj) {
		this.wzmj = wzmj;
	}

	public String getWzqk() {
		return wzqk;
	}

	public void setWzqk(String wzqk) {
		this.wzqk = wzqk;
	}

	public String getWzbw() {
		return wzbw;
	}

	public void setWzbw(String wzbw) {
		this.wzbw = wzbw;
	}

	public String getCzqk() {
		return czqk;
	}

	public void setCzqk(String czqk) {
		this.czqk = czqk;
	}

	public String getCzdw() {
		return czdw;
	}

	public void setCzdw(String czdw) {
		this.czdw = czdw;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}
