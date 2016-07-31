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
 * 结包对象联系登记表
 * @author sun 2014-08-04
 * 
 */
@Entity
@Table(name = "bs_business_jdbhlx")
public class Jdbhlx extends BaseEntity{

	/**
	 * 姓名	性别	民族	出生年月 家庭住址	电话	
	 */
	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	
	@Column(name = "CONTACT")
	private String contact; // 联系人（单位）
	
	@Column(name = "DUTY")
	private String duty; // 工作单位及职务（负责人）

	@Column(name = "PHONE")
	private String phone; // 联系电话
	
	@Column(name = "CONTENT")
	private String content; // 结对包户内容
	
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


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
