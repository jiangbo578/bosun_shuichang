package com.gouhai.baoshan.entity.business.dqgz.sygz;

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
 * 优抚对象临时性困难补助情况登记表
 * @author sun 2014-08-04
 * 
 */
@Entity
@Table(name = "bs_business_allowance")
public class Allowance extends BaseEntity{

	/**
	 * 姓名	性别	     临 时 补 助 事 由      村（居）委补助 金额（元）
	 */
	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "allowance_time")
	@Temporal(TemporalType.DATE)
	private Date allowanceTime; // 时间
	
	@Column(name = "REASON")
	private String reason; // 临 时 补 助 事 由
	
	@Column(name = "money")
	private Long money; // 村（居）委补助 金额（元）
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public Date getAllowanceTime() {
		return allowanceTime;
	}

	public void setAllowanceTime(Date allowanceTime) {
		this.allowanceTime = allowanceTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getMoney() {
		return money;
	}

	public void setMoney(Long money) {
		this.money = money;
	}
	
}
