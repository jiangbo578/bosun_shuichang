package com.gouhai.baoshan.entity.business.shgl.mfgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 社区民防应急箱管理记录
 * 
 * @author 徐舟
 * 
 *         有填报周期，需审核
 */
@Entity
@Table(name = "bs_business_sqmfyjx")
public class Sqmfyjx extends BaseEntity {
	@Column(name = "glr")
	private String glr;// 管理人
	@Column(name = "glsj")
	private String glsj;// 管理时间
	@Column(name = "gljl")
	private String gljl;// 管理记录
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getGlr() {
		return glr;
	}

	public void setGlr(String glr) {
		this.glr = glr;
	}

	public String getGlsj() {
		return glsj;
	}

	public void setGlsj(String glsj) {
		this.glsj = glsj;
	}

	public String getGljl() {
		return gljl;
	}

	public void setGljl(String gljl) {
		this.gljl = gljl;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
