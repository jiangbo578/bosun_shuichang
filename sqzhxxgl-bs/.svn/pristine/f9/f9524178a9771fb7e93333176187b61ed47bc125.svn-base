package com.gouhai.baoshan.entity.business.dqgz.fd;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 双学双比活动情况-美好家园示范村 
 * @author sun 2014-08-18
 * 
 */
@Entity
@Table(name = "bs_business_sxsbmhsfc")
public class Sxsbmhsfc extends BaseEntity{
	/**
	 *名称	  □市级   □区级              获评时间：
	 */
	@Column(name = "name")
	private String name; // 名 称
	
	@Column(name = "level")
	private String level; // 市级  区级
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "crowned_time")
	private Date crownedTime; // 获评时间
	
	@Column(name = "main_feature")
	private String mainFeature; // 主要特色
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	@OneToMany(cascade=CascadeType.REMOVE,fetch=FetchType.LAZY,mappedBy="sxsbmhsfc")
	private Set<SxsbmhsfcActivity> sxsbmhsfcActivities = new HashSet<SxsbmhsfcActivity>();
	
	
	public Set<SxsbmhsfcActivity> getSxsbmhsfcActivities()
	{
		return sxsbmhsfcActivities;
	}

	public void setSxsbmhsfcActivities(Set<SxsbmhsfcActivity> sxsbmhsfcActivities)
	{
		this.sxsbmhsfcActivities = sxsbmhsfcActivities;
	}

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
