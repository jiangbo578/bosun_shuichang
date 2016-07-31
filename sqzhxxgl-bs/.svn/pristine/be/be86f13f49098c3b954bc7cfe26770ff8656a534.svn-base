package com.gouhai.baoshan.entity.business.hyjl.rcgz;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 业务培训记录
 * 
 * @author Medivh
 * 
 *         每月25号 为一周期 无需审核 与人口无关
 */
@Entity
@Table(name = "bs_business_ywpx")
public class Ywpx extends BaseEntity {
	@Column(name = "sj")
	@Temporal(TemporalType.DATE)
	private Date sj;// 时间
	@Column(name = "dd")
	private String dd;// 地点
	@Column(name = "pxnr")
	private String pxnr;// 培训内容
	@Column(name = "zjr")
	private String zjr;// 主讲人或召集人
	@Column(name = "cxfw")
	private String cxfw;// 出席范围
	@Column(name = "rs")
	private String rs;// 人数
	@Column(name = "bbmc")
	private String bbmc;//办班名称
	@Column(name = "jxks")
	private String jxks;// 教学课时
	@Column(name = "bzrs")
	private String bzrs;// 标准人数
	@Column(name = "pxqx")
	private String pxqx;//培训期限
	@Column(name = "type")
	private String type;//类别
	@Column(name = "ssywx")
	private String ssywx;//所属业务线条
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public String getDd() {
		return dd;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}

	public String getPxnr() {
		return pxnr;
	}

	public void setPxnr(String pxnr) {
		this.pxnr = pxnr;
	}

	public String getZjr() {
		return zjr;
	}

	public void setZjr(String zjr) {
		this.zjr = zjr;
	}

	public String getCxfw() {
		return cxfw;
	}

	public void setCxfw(String cxfw) {
		this.cxfw = cxfw;
	}

	public String getRs() {
		return rs;
	}

	public void setRs(String rs) {
		this.rs = rs;
	}

	public String getBbmc() {
		return bbmc;
	}

	public void setBbmc(String bbmc) {
		this.bbmc = bbmc;
	}

	public String getJxks() {
		return jxks;
	}

	public void setJxks(String jxks) {
		this.jxks = jxks;
	}

	public String getBzrs() {
		return bzrs;
	}

	public void setBzrs(String bzrs) {
		this.bzrs = bzrs;
	}

	public String getPxqx() {
		return pxqx;
	}

	public void setPxqx(String pxqx) {
		this.pxqx = pxqx;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSsywx() {
		return ssywx;
	}

	public void setSsywx(String ssywx) {
		this.ssywx = ssywx;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}
	public Date getSj() {
		return sj;
	}
	public void setSj(Date sj) {
		this.sj = sj;
	}
	
	
}
