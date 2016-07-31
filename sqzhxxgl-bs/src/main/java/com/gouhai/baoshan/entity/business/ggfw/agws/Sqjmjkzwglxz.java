package com.gouhai.baoshan.entity.business.ggfw.agws;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 社区居民健康自我管理小组统计表
 * 
 * @author 徐舟
 * 
 *         填报周期 7月10日、12月25日 ，与人口无关，无需审核
 */
@Entity
@Table(name = "bs_business_sqjmjkzwglxz")
public class Sqjmjkzwglxz extends BaseEntity {
	@Column(name = "xzgs")
	private String xzgs;// 当年新增小组个数
	@Column(name = "xzzy")
	private String xzzy;// 当年新增小组组员
	@Column(name = "xzhdcs")
	private String xzhdcs;// 当年新增小组活动次数
	@Column(name = "xzcjrc")
	private String xzcjrc;// 当年新增小组参加人次

	@Column(name = "hdgs")
	private String hdgs;// 当年仍在活动的小组
	@Column(name = "hdzy")
	private String hdzy;// 当年仍在活动小组组员
	@Column(name = "hdhdcs")
	private String hdhdcs;// 当年仍在活动小组活动次数
	@Column(name = "hdcjrc")
	private String hdcjrc;// 当年仍在活动小组参加人次

	@Column(name = "jdgs")
	private String jdgs;// 结队文体小组数(个）
	@Column(name = "jdrs")
	private String jdrs;// 结队文体小组人数（人）
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getXzgs() {
		return xzgs;
	}

	public void setXzgs(String xzgs) {
		this.xzgs = xzgs;
	}

	public String getXzzy() {
		return xzzy;
	}

	public void setXzzy(String xzzy) {
		this.xzzy = xzzy;
	}

	public String getXzhdcs() {
		return xzhdcs;
	}

	public void setXzhdcs(String xzhdcs) {
		this.xzhdcs = xzhdcs;
	}

	public String getXzcjrc() {
		return xzcjrc;
	}

	public void setXzcjrc(String xzcjrc) {
		this.xzcjrc = xzcjrc;
	}

	public String getHdgs() {
		return hdgs;
	}

	public void setHdgs(String hdgs) {
		this.hdgs = hdgs;
	}

	public String getHdzy() {
		return hdzy;
	}

	public void setHdzy(String hdzy) {
		this.hdzy = hdzy;
	}

	public String getHdhdcs() {
		return hdhdcs;
	}

	public void setHdhdcs(String hdhdcs) {
		this.hdhdcs = hdhdcs;
	}

	public String getHdcjrc() {
		return hdcjrc;
	}

	public void setHdcjrc(String hdcjrc) {
		this.hdcjrc = hdcjrc;
	}

	public String getJdgs() {
		return jdgs;
	}

	public void setJdgs(String jdgs) {
		this.jdgs = jdgs;
	}

	public String getJdrs() {
		return jdrs;
	}

	public void setJdrs(String jdrs) {
		this.jdrs = jdrs;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}
}
