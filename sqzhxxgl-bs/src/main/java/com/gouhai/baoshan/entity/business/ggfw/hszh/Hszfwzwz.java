package com.gouhai.baoshan.entity.business.ggfw.hszh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 红十字服务站物资登记册
 * 
 * @author 徐舟
 * 
 *         填报周期 每年 一月十五 无需审核 ，与人口无关
 */
@Entity
@Table(name = "bs_business_hszfwzwz")
public class Hszfwzwz extends BaseEntity {
	@Column(name = "wzname")
	private String wzname;// 物资名称
	@Column(name = "jsdate")
	private String jsdate;// 接收时间
	@Column(name = "jsname")
	private String jsname;// 接收人
	@Column(name = "bfwz")
	private String bfwz;// 摆放位置
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getWzname() {
		return wzname;
	}

	public void setWzname(String wzname) {
		this.wzname = wzname;
	}

	public String getJsdate() {
		return jsdate;
	}

	public void setJsdate(String jsdate) {
		this.jsdate = jsdate;
	}

	public String getJsname() {
		return jsname;
	}

	public void setJsname(String jsname) {
		this.jsname = jsname;
	}

	public String getBfwz() {
		return bfwz;
	}

	public void setBfwz(String bfwz) {
		this.bfwz = bfwz;
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
