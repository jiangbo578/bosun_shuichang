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
 * 双学双比活动情况-实事项目
 * @author sun 2014-08-18
 * 
 */
@Entity
@Table(name = "bs_business_sxsbsspro")
public class Sxsbsspro extends BaseEntity{
	/**
	 *名称	□市级   □区级 	负责人姓名	带动妇女就业人数	人均年   收入	获评时间	主要特色
	 */
	@Column(name = "name")
	private String name; // 名 称
	
	@Column(name = "level")
	private String level; // 市级  区级
	
	@Column(name = "host")
	private String host; // 负责人
	
	@Column(name = "womanjy_count")
	private Integer womanjyCount; // 带动妇女就业人数

	@Column(name = "incomeOfPerson")
	private Float incomeOfPerson; // 人均年收入

	@Temporal(TemporalType.DATE)
	@Column(name = "crowned_time")
	private Date crownedTime; // 获评时间
	
	
	@Column(name = "main_feature",length=100000)
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

	public String getLevel()
	{
		return level;
	}

	public void setLevel(String level)
	{
		this.level = level;
	}

	public String getHost()
	{
		return host;
	}

	public void setHost(String host)
	{
		this.host = host;
	}

	public Integer getWomanjyCount()
	{
		return womanjyCount;
	}

	public void setWomanjyCount(Integer womanjyCount)
	{
		this.womanjyCount = womanjyCount;
	}

	public Float getIncomeOfPerson()
	{
		return incomeOfPerson;
	}

	public void setIncomeOfPerson(Float incomeOfPerson)
	{
		this.incomeOfPerson = incomeOfPerson;
	}


	public Date getCrownedTime()
	{
		return crownedTime;
	}

	public void setCrownedTime(Date crownedTime)
	{
		this.crownedTime = crownedTime;
	}

	public String getMainFeature()
	{
		return mainFeature;
	}

	public void setMainFeature(String mainFeature)
	{
		this.mainFeature = mainFeature;
	}
	
}
