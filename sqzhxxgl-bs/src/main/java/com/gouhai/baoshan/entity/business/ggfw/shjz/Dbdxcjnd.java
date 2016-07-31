package com.gouhai.baoshan.entity.business.ggfw.shjz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 低保对象参加公益性社区服务劳动情况季度登记表
 * 
 * @author 徐舟
 * 
 *         低保对象参加公益性社区服务劳动情况季度登记表有填报周期，需审核，与人口无关
 */
@Entity
@Table(name = "bs_business_dbdxcjhd")
public class Dbdxcjnd extends BaseEntity {
	@Column(name = "jzbh")
	private String jzdh;// 救助编号
	@Column(name = "cjdxxm")
	private String cjdxxm;// 参加对象姓名
	@Column(name = "ldxm")
	private String ldxm;// 劳动项目
	@Column(name = "rq")
	private String rq;// 日期
	@Column(name = "yue")
	private String yue;// 月份
	@Column(name = "ldsj")
	private String ldsj;// 劳动时间
	@Column(name = "brqm")
	private String brqm;// 本人签名
	@Column(name = "fzrqm")
	private String fzrqm;// 负责人签名
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getYue() {
		return yue;
	}

	public void setYue(String yue) {
		this.yue = yue;
	}

	public String getJzdh() {
		return jzdh;
	}

	public void setJzdh(String jzdh) {
		this.jzdh = jzdh;
	}

	public String getCjdxxm() {
		return cjdxxm;
	}

	public void setCjdxxm(String cjdxxm) {
		this.cjdxxm = cjdxxm;
	}

	public String getLdxm() {
		return ldxm;
	}

	public void setLdxm(String ldxm) {
		this.ldxm = ldxm;
	}

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
	}

	public String getLdsj() {
		return ldsj;
	}

	public void setLdsj(String ldsj) {
		this.ldsj = ldsj;
	}

	public String getBrqm() {
		return brqm;
	}

	public void setBrqm(String brqm) {
		this.brqm = brqm;
	}

	public String getFzrqm() {
		return fzrqm;
	}

	public void setFzrqm(String fzrqm) {
		this.fzrqm = fzrqm;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
