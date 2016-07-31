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
 * 离休干部基本情况表
 * @author sun 2014-08-15
 * 
 */
@Entity
@Table(name = "bs_business_lxgbjbqk")
public class Lxgbjbqk extends BaseEntity{
	/**
	 * 原单位名称   姓名  性别	民族	出生年月 家庭住址	电话	
	 */
	@Column(name = "old_work_name")
	private String oldWorkName; //原单位名称
	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "PHONE")
	private String phone; // 联系电话
	
	@Column(name = "kinsfolk_phone")
	private String kinsfolkPhone; // 亲属联系电话
	
	@Column(name = "TAG",length=512)
	private String tag; // 备注
	
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

	public Date getCsny() {
		return csny;
	}

	public void setCsny(Date csny) {
		this.csny = csny;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
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

	public String getOldWorkName()
	{
		return oldWorkName;
	}

	public void setOldWorkName(String oldWorkName)
	{
		this.oldWorkName = oldWorkName;
	}

	public String getKinsfolkPhone()
	{
		return kinsfolkPhone;
	}

	public void setKinsfolkPhone(String kinsfolkPhone)
	{
		this.kinsfolkPhone = kinsfolkPhone;
	}

	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}
}
