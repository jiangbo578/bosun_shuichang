package com.gouhai.baoshan.entity.business.dqgz.fd;

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
 * 双学双比活动情况-女能手名册
 * @author sun 2014-08-18
 * 
 */
@Entity
@Table(name = "bs_business_sxsbsfnvhand")
public class Sxsbsfnvhand extends BaseEntity{
	/**
	 *  姓名	出生年月	文化程度	政治面貌	种植专长	联系方式
	 */
	@Column(name = "name")
	private String name; // 名 称
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	private Date birthday; // 出生年月
	
	@Column(name = "WHCD")
	private String whcd; // 文化程度

	@Column(name = "ZZMM")
	private String zzmm; //政治面貌
	
	@Column(name = "grow_feature")
	private String growFeature; // 种植专长
	
	@Column(name = "phone")
	private String phone; // 联系方式
	
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getBirthday()
	{
		return birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public String getWhcd()
	{
		return whcd;
	}

	public void setWhcd(String whcd)
	{
		this.whcd = whcd;
	}

	public String getZzmm()
	{
		return zzmm;
	}

	public void setZzmm(String zzmm)
	{
		this.zzmm = zzmm;
	}

	public String getGrowFeature()
	{
		return growFeature;
	}

	public void setGrowFeature(String growFeature)
	{
		this.growFeature = growFeature;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
}
