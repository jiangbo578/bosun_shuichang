package com.gouhai.baoshan.entity.business.shgl.xfzsx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 投诉举报咨询台账目录
 * @author Administrator
 *
 */
//TsjbzxController
@Entity
@Table(name = "bs_business_tsjbzx")
public class Tsjbzx extends BaseEntity  {
	@Column(name = "sy", length = 100000)
	private String sy;// 事由
	
	@Column(name = "ly" )
	private String ly;// 来源 来电 来访 来信  其他
	
	@Column(name = "cljg" )
	private String cljg;// 处理结果  已处理 未处理 提交
	
	@Column(name = "lx" )
	private String lx;//类型  投诉 举报 咨询 

	public String getSy() {
		return sy;
	}
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	
	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public void setSy(String sy) {
		this.sy = sy;
	}

	public String getLy() {
		return ly;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}

	public String getCljg() {
		return cljg;
	}

	public void setCljg(String cljg) {
		this.cljg = cljg;
	}

	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}
	
	
}
