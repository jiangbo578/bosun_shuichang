package com.gouhai.baoshan.entity.business.dqgz.zb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 开展党员志愿者服务活动情况
 * 
 * @author 徐舟
 * 
 *         每年一月十五号填报，与人口审核无关
 */
@Entity
@Table(name = "bs_business_kzdyzyz")
public class Kzdyzyz extends BaseEntity {

	@Column(name = "hdzt")
	private String hdzt;// 活动主题
	@Column(name = "hdsj")
	private String hdsj;// 活动时间
	@Column(name = "cjrs")
	private String cjrs;// 参加人数
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getHdzt() {
		return hdzt;
	}

	public void setHdzt(String hdzt) {
		this.hdzt = hdzt;
	}

	public String getHdsj() {
		return hdsj;
	}

	public void setHdsj(String hdsj) {
		this.hdsj = hdsj;
	}

	public String getCjrs() {
		return cjrs;
	}

	public void setCjrs(String cjrs) {
		this.cjrs = cjrs;
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
