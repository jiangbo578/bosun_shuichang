package com.gouhai.baoshan.entity.business.jcqk.gk;

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
 * 曾获市、区、镇、街道荣誉
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_sqzjry")
public class Sqzjry extends BaseEntity {

	@Column(name = "ryname")
	private String ryname;// 荣誉名称
	@Column(name = "hjdate")
	@Temporal(TemporalType.DATE)
	private Date hjdate;// 获奖时间
	@Column(name = "hjz")
	private String hjz;// 获奖者
	@Column(name = "bjdw")
	private String bjdw;// 颁奖单位
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getRyname() {
		return ryname;
	}

	public void setRyname(String ryname) {
		this.ryname = ryname;
	}

	public Date getHjdate() {
		return hjdate;
	}

	public void setHjdate(Date hjdate) {
		this.hjdate = hjdate;
	}

	public String getHjz() {
		return hjz;
	}

	public void setHjz(String hjz) {
		this.hjz = hjz;
	}

	public String getBjdw() {
		return bjdw;
	}

	public void setBjdw(String bjdw) {
		this.bjdw = bjdw;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
