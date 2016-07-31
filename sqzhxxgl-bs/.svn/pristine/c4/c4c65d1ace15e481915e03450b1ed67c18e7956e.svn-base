/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.jcqk.rymd;

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
 * 团队名册
 * @author cgw
 * 
 */
@Entity
@Table(name = "bs_business_tdmc")
public class Tdmc extends BaseEntity {
	/**
	 * 队伍名称	人数	负责人或党建指导员	性别	联系电话	成立时间
	 */
	@Column(name = "DWMC")
	private String dwmc; // 队伍名称
	@Column(name = "RS")
	private String rs; // 人数
	@Column(name = "FZR")
	private String fzr; // 负责人或党建指导员
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "LXDH")
	private String phone; // 联系电话
	@Column(name = "CLNY")
	@Temporal(TemporalType.DATE)
	private Date clny; // 成立年月
	@Column(name = "TAG",length=512)
	private String tag;//备注
	
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getRs() {
		return rs;
	}

	public void setRs(String rs) {
		this.rs = rs;
	}

	public String getFzr() {
		return fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getClny() {
		return clny;
	}

	public void setClny(Date clny) {
		this.clny = clny;
	}

	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
