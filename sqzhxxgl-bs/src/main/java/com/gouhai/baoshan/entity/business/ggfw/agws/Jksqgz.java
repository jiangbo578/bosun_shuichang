package com.gouhai.baoshan.entity.business.ggfw.agws;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 健康社区工作统计表
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_jksqgz")
public class Jksqgz extends BaseEntity {
	@Column(name = "jkrcs")
	private String jkrcs;// 健康日宣传活动 次数
	@Column(name = "jkrrs")
	private String jkrrs;// 健康日宣传活动 人数
	@Column(name = "jkrfs")
	private String jkrfs;// 健康日宣传活动 份数
	@Column(name = "jkrsl")
	private String jkrsl;// 健康日宣传活动 数量

	@Column(name = "lsgs")
	private String lsgs;// 落实工间操制度的单位 个数
	@Column(name = "lszgs")
	private String lszgs;// 落实工间操制度的单位 职工数

	@Column(name = "kzdws")
	private String kzdws;// 开展控油控盐等合理膳食工作的单位食堂 单位数
	@Column(name = "kzzgs")
	private String kzzgs;// 开展控油控盐等合理膳食工作的单位食堂 职工数

	@Column(name = "jkts")
	private String jkts;// 健康步道 条数
	@Column(name = "jkcd")
	private String jkcd;// 健康步道 长度
	@Column(name = "jkzs")
	private String jkzs;// 健康步道 总数
	@Column(name = "jkzc")
	private String jkzc;// 健康步道 总长
	@Column(name = "jkhd")
	private String jkhd;// 健康步道 健身走活动（人次）

	@Column(name = "jkjzcs")
	private String jkjzcs;// 健康讲座 次数
	@Column(name = "jkjzrs")
	private String jkjzrs;// 健康讲座 单位数

	@Column(name = "jsjt")
	private String jsjt;// 参与建设健康家庭（户）
	@Column(name = "jsdws")
	private String jsdws;// 参与建设健康单位数（个）

	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getJkrcs() {
		return jkrcs;
	}

	public String getJsjt() {
		return jsjt;
	}

	public void setJsjt(String jsjt) {
		this.jsjt = jsjt;
	}

	public String getJsdws() {
		return jsdws;
	}

	public void setJsdws(String jsdws) {
		this.jsdws = jsdws;
	}

	public void setJkrcs(String jkrcs) {
		this.jkrcs = jkrcs;
	}

	public String getJkrrs() {
		return jkrrs;
	}

	public void setJkrrs(String jkrrs) {
		this.jkrrs = jkrrs;
	}

	public String getJkrfs() {
		return jkrfs;
	}

	public void setJkrfs(String jkrfs) {
		this.jkrfs = jkrfs;
	}

	public String getJkrsl() {
		return jkrsl;
	}

	public void setJkrsl(String jkrsl) {
		this.jkrsl = jkrsl;
	}

	public String getLsgs() {
		return lsgs;
	}

	public void setLsgs(String lsgs) {
		this.lsgs = lsgs;
	}

	public String getLszgs() {
		return lszgs;
	}

	public void setLszgs(String lszgs) {
		this.lszgs = lszgs;
	}

	public String getKzdws() {
		return kzdws;
	}

	public void setKzdws(String kzdws) {
		this.kzdws = kzdws;
	}

	public String getKzzgs() {
		return kzzgs;
	}

	public void setKzzgs(String kzzgs) {
		this.kzzgs = kzzgs;
	}

	public String getJkts() {
		return jkts;
	}

	public void setJkts(String jkts) {
		this.jkts = jkts;
	}

	public String getJkcd() {
		return jkcd;
	}

	public void setJkcd(String jkcd) {
		this.jkcd = jkcd;
	}

	public String getJkzs() {
		return jkzs;
	}

	public void setJkzs(String jkzs) {
		this.jkzs = jkzs;
	}

	public String getJkzc() {
		return jkzc;
	}

	public void setJkzc(String jkzc) {
		this.jkzc = jkzc;
	}

	public String getJkhd() {
		return jkhd;
	}

	public void setJkhd(String jkhd) {
		this.jkhd = jkhd;
	}

	public String getJkjzcs() {
		return jkjzcs;
	}

	public void setJkjzcs(String jkjzcs) {
		this.jkjzcs = jkjzcs;
	}

	public String getJkjzrs() {
		return jkjzrs;
	}

	public void setJkjzrs(String jkjzrs) {
		this.jkjzrs = jkjzrs;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
