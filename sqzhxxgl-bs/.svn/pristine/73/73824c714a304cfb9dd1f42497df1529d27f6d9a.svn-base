package com.gouhai.baoshan.entity.business.ggfw.cjrgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 残疾人协会基本情况
 * 
 * @author 徐舟
 * 
 *         需审核，有填报周期，与人口无关
 */
@Entity
@Table(name = "bs_business_cjrjbqk")
public class Cjrjbqk extends BaseEntity {
	@Column(name = "xhqc")
	private String xhqc;// 协会全称
	@Column(name = "bgdz")
	private String bgdz;// 办公地址
	@Column(name = "phone")
	private String phone;// 电话
	@Column(name = "zrs")
	private String zrs;// 总人数
	@Column(name = "sl")
	private String sl;// 视力残疾
	@Column(name = "tl")
	private String tl;// 听力
	@Column(name = "yy")
	private String yy;// 言语
	@Column(name = "zl")
	private String zl;// 智力
	@Column(name = "zt")
	private String zt;// 肢体
	@Column(name = "js")
	private String js;// 精神
	@Column(name = "wy")
	private String wy;// 无业
	@Column(name = "zcwy")
	private String zcwy;// 重残无业
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getXhqc() {
		return xhqc;
	}

	public void setXhqc(String xhqc) {
		this.xhqc = xhqc;
	}

	public String getBgdz() {
		return bgdz;
	}

	public void setBgdz(String bgdz) {
		this.bgdz = bgdz;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZrs() {
		return zrs;
	}

	public void setZrs(String zrs) {
		this.zrs = zrs;
	}

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

	public String getTl() {
		return tl;
	}

	public void setTl(String tl) {
		this.tl = tl;
	}

	public String getYy() {
		return yy;
	}

	public void setYy(String yy) {
		this.yy = yy;
	}

	public String getZl() {
		return zl;
	}

	public void setZl(String zl) {
		this.zl = zl;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getJs() {
		return js;
	}

	public void setJs(String js) {
		this.js = js;
	}

	public String getWy() {
		return wy;
	}

	public void setWy(String wy) {
		this.wy = wy;
	}

	public String getZcwy() {
		return zcwy;
	}

	public void setZcwy(String zcwy) {
		this.zcwy = zcwy;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
