package com.gouhai.baoshan.entity.business.ggfw.kpgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 基础信息
 * 
 * @author 徐舟
 * 
 *         有填报周期，需审核
 */
@Entity
@Table(name = "bs_business_jcxx")
public class Jcxx extends BaseEntity {
	@Column(name = "zzkpry")
	private String zzkpry;// 专职科普工作人员
	@Column(name = "jzkpry")
	private String jzkpyr;// 兼职科普工作人员
	@Column(name = "zyzrs")
	private String zyzrs;// 村（居）民担任科普志愿者人数
	@Column(name = "bl")
	private String bl;// 科普志愿者占居民人数比例

	@Column(name = "hdcs")
	private String hdcs;// 科普活动场所
	@Column(name = "sn")
	private String sn;// 室内
	@Column(name = "sw")
	private String sw;// 室外
	@Column(name = "kpxcl")
	private String kpxcl;// 科普功宣传栏
	@Column(name = "ghpl")
	private String ghpl;// 内容更换平率

	@Column(name = "kpts")
	private String kpts;// 科普图书
	@Column(name = "kpgp")
	private String kpgp;// 科普光盘
	@Column(name = "kpzb")
	private String kpzb;// 科普展板
	@Column(name = "kpzp")
	private String kpzp;// 科普展品
	@Column(name = "kpsbmc")
	private String kpsbmc;// 科普设施名称
	@Column(name = "sl")
	private String sl;// 数量
	@Column(name = "qt")
	private String qt;// 其他

	@Column(name = "ndkpjf")
	private String ndkpjf;// 年度科普经费
	@Column(name = "zcjf")
	private String zcjf;// 自筹经费
	@Column(name = "bkjf")
	private String bkjf;// 拨款经费
	@Column(name = "jfbl")
	private String jfbl;// 经费比例
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getZzkpry() {
		return zzkpry;
	}

	public void setZzkpry(String zzkpry) {
		this.zzkpry = zzkpry;
	}

	public String getJzkpyr() {
		return jzkpyr;
	}

	public void setJzkpyr(String jzkpyr) {
		this.jzkpyr = jzkpyr;
	}

	public String getZyzrs() {
		return zyzrs;
	}

	public void setZyzrs(String zyzrs) {
		this.zyzrs = zyzrs;
	}

	public String getBl() {
		return bl;
	}

	public void setBl(String bl) {
		this.bl = bl;
	}

	public String getHdcs() {
		return hdcs;
	}

	public void setHdcs(String hdcs) {
		this.hdcs = hdcs;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSw() {
		return sw;
	}

	public void setSw(String sw) {
		this.sw = sw;
	}

	public String getKpxcl() {
		return kpxcl;
	}

	public void setKpxcl(String kpxcl) {
		this.kpxcl = kpxcl;
	}

	public String getGhpl() {
		return ghpl;
	}

	public void setGhpl(String ghpl) {
		this.ghpl = ghpl;
	}

	public String getKpts() {
		return kpts;
	}

	public void setKpts(String kpts) {
		this.kpts = kpts;
	}

	public String getKpgp() {
		return kpgp;
	}

	public void setKpgp(String kpgp) {
		this.kpgp = kpgp;
	}

	public String getKpzb() {
		return kpzb;
	}

	public void setKpzb(String kpzb) {
		this.kpzb = kpzb;
	}

	public String getKpzp() {
		return kpzp;
	}

	public void setKpzp(String kpzp) {
		this.kpzp = kpzp;
	}

	public String getKpsbmc() {
		return kpsbmc;
	}

	public void setKpsbmc(String kpsbmc) {
		this.kpsbmc = kpsbmc;
	}

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

	public String getQt() {
		return qt;
	}

	public void setQt(String qt) {
		this.qt = qt;
	}

	public String getNdkpjf() {
		return ndkpjf;
	}

	public void setNdkpjf(String ndkpjf) {
		this.ndkpjf = ndkpjf;
	}

	public String getZcjf() {
		return zcjf;
	}

	public void setZcjf(String zcjf) {
		this.zcjf = zcjf;
	}

	public String getBkjf() {
		return bkjf;
	}

	public void setBkjf(String bkjf) {
		this.bkjf = bkjf;
	}

	public String getJfbl() {
		return jfbl;
	}

	public void setJfbl(String jfbl) {
		this.jfbl = jfbl;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
