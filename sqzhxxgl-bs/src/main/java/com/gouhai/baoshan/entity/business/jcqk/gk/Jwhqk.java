package com.gouhai.baoshan.entity.business.jcqk.gk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 居委会情况
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_jwhqk")
public class Jwhqk extends BaseEntity {
	@Column(name = "jwhqc")
	private String jwhqc;// 居委会全称
	@Column(name = "dzbclrq")
	private String dzbclrq;// 党支部成立时间
	@Column(name = "jwhclrq")
	private String jwhclrq;// 居委会成立时间
	@Column(name = "dzbrs")
	private Integer dzbrs;// 党支部人数
	@Column(name = "dzbsj")
	private Integer dzbsj;// 党支部书记人数
	@Column(name = "dzbfsj")
	private Integer dzbfsj;// 党支部副书记人数
	@Column(name = "dzbwy")
	private Integer dzbwy;// 党支部委员人数
	@Column(name = "jwhrs")
	private Integer jwhrs;// 居委会人数
	@Column(name = "jwhzr")
	private Integer jwhzr;// 居委会主任人数
	@Column(name = "jwhfzr")
	private Integer jwhfzr;// 居委会副主任人数
	@Column(name = "jwhwy")
	private Integer jwhwy;// 居委会委员人数
	@Column(name = "jd")
	private String jd;// 所属街道
	@Column(name = "bgdz")
	private String bgdz;// 办公地址
	@Column(name = "phone")
	private String phone;// 电话
	@Column(name = "emall")
	private String emall;// 邮件
	@Column(name = "code")
	private String code;// 邮政编码
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getJwhqc() {
		return jwhqc;
	}

	public void setJwhqc(String jwhqc) {
		this.jwhqc = jwhqc;
	}

	public String getDzbclrq() {
		return dzbclrq;
	}

	public void setDzbclrq(String dzbclrq) {
		this.dzbclrq = dzbclrq;
	}

	public String getJwhclrq() {
		return jwhclrq;
	}

	public void setJwhclrq(String jwhclrq) {
		this.jwhclrq = jwhclrq;
	}

	public Integer getDzbrs() {
		return dzbrs;
	}

	public void setDzbrs(Integer dzbrs) {
		this.dzbrs = dzbrs;
	}

	public Integer getDzbsj() {
		return dzbsj;
	}

	public void setDzbsj(Integer dzbsj) {
		this.dzbsj = dzbsj;
	}

	public Integer getDzbfsj() {
		return dzbfsj;
	}

	public void setDzbfsj(Integer dzbfsj) {
		this.dzbfsj = dzbfsj;
	}

	public Integer getDzbwy() {
		return dzbwy;
	}

	public void setDzbwy(Integer dzbwy) {
		this.dzbwy = dzbwy;
	}

	public Integer getJwhrs() {
		return jwhrs;
	}

	public void setJwhrs(Integer jwhrs) {
		this.jwhrs = jwhrs;
	}

	public Integer getJwhzr() {
		return jwhzr;
	}

	public void setJwhzr(Integer jwhzr) {
		this.jwhzr = jwhzr;
	}

	public Integer getJwhfzr() {
		return jwhfzr;
	}

	public void setJwhfzr(Integer jwhfzr) {
		this.jwhfzr = jwhfzr;
	}

	public Integer getJwhwy() {
		return jwhwy;
	}

	public void setJwhwy(Integer jwhwy) {
		this.jwhwy = jwhwy;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
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

	public String getEmall() {
		return emall;
	}

	public void setEmall(String emall) {
		this.emall = emall;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
