package com.gouhai.baoshan.entity.business.ggfw.shjz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 公益性社区服务劳动参加对象汇总表
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_fwnd")
public class Fwnd extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "address")
	private String address;// 家庭住址
	@Column(name = "phone")
	private String phone;// 电话号码
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
