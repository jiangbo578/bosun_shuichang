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
 * 双学双比活动情况-女性专业合作社
 * @author sun 2014-08-18
 * 
 */
@Entity
@Table(name = "bs_business_sxsbsfwomanhzs")
public class Sxsbsfwomanhzs extends BaseEntity{
	/**
	 *名称	负责人姓名	总   人数	女性人数	品牌	人均年收入	科技结对人员	主要  特色
	 */
	@Column(name = "name")
	private String name; // 名 称
	
	@Column(name = "host")
	private String host; // 负责人
	
	@Column(name = "all_count")
	private Integer allCount; // 总   人数
	
	@Column(name = "woman_count")
	private Integer womanCount; // 女性人数
	
	@Column(name = "brand")
	private String brand; // 品牌
	
	
	@Column(name = "income_p_year")
	private Float incomeOfPersonOfYear; // 人均年收入
	
	@Column(name = "kj_double_person")
	private String jdPerson; // 科技结对人员
	
	
	@Column(name = "main_feature")
	private String mainFeature; // 主要特色
	
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


	public String getHost()
	{
		return host;
	}

	public void setHost(String host)
	{
		this.host = host;
	}
	public String getMainFeature()
	{
		return mainFeature;
	}

	public void setMainFeature(String mainFeature)
	{
		this.mainFeature = mainFeature;
	}

	public Integer getAllCount()
	{
		return allCount;
	}

	public void setAllCount(Integer allCount)
	{
		this.allCount = allCount;
	}

	public Integer getWomanCount()
	{
		return womanCount;
	}

	public void setWomanCount(Integer womanCount)
	{
		this.womanCount = womanCount;
	}

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public Float getIncomeOfPersonOfYear()
	{
		return incomeOfPersonOfYear;
	}

	public void setIncomeOfPersonOfYear(Float incomeOfPersonOfYear)
	{
		this.incomeOfPersonOfYear = incomeOfPersonOfYear;
	}

	public String getJdPerson()
	{
		return jdPerson;
	}

	public void setJdPerson(String jdPerson)
	{
		this.jdPerson = jdPerson;
	}
	
}
