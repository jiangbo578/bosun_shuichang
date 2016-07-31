package com.gouhai.baoshan.entity.business.ggfw.cjrgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.head.Fcbkjd;

/**
 * 党员干部扶残帮困结对记录人员
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_fcbkjdry")
public class Fcbkjdry extends BaseEntity {
	@Column(name = "gbxm")
	private String gbxm;// 干部姓名
	@Column(name = "role")
	private String role;// 职务
	@Column(name = "jdsj")
	private String jdsj;// 结对时间
	@Column(name = "jdxm")
	private String jdxm;// 结对姓名
	@Column(name = "cjlb")
	private String cjlb;// 残疾类别
	@ManyToOne
	@JoinColumn(name = "fcbkjd_id")
	private Fcbkjd fcbkjd;

	public String getGbxm() {
		return gbxm;
	}

	public void setGbxm(String gbxm) {
		this.gbxm = gbxm;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getJdsj() {
		return jdsj;
	}

	public void setJdsj(String jdsj) {
		this.jdsj = jdsj;
	}

	public String getJdxm() {
		return jdxm;
	}

	public void setJdxm(String jdxm) {
		this.jdxm = jdxm;
	}

	public String getCjlb() {
		return cjlb;
	}

	public void setCjlb(String cjlb) {
		this.cjlb = cjlb;
	}

	public Fcbkjd getFcbkjd() {
		return fcbkjd;
	}

	public void setFcbkjd(Fcbkjd fcbkjd) {
		this.fcbkjd = fcbkjd;
	}

}
