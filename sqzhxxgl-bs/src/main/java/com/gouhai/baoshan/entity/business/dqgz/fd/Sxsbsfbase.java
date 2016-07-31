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
 * 双学双比活动情况-示范基地
 * @author sun 2014-08-18
 * 
 */
@Entity
@Table(name = "bs_business_sxsbsfbase")
public class Sxsbsfbase extends BaseEntity{
	/**
	 *名称	□全国   □市级   □区级	负责人姓名	规模(亩)	基地人数	女性人数	初创时间	获评时间	主要  特色
	 */
	@Column(name = "name")
	private String name; // 名 称
	
	@Column(name = "level")
	private String level; // 市级  区级
	
	@Column(name = "host")
	private String host; // 负责人
	

	@Column(name = "scale")
	private String scale; // 规模(亩)
	
	@Column(name = "base_count")
	private Integer baseCount; // 基地人数

	
	@Column(name = "womanjy_count")
	private Integer womanjyCount; // 女性人数

	@Temporal(TemporalType.DATE)
	@Column(name = "create_time")
	private Date createTime; // 初创时间
	
	@Temporal(TemporalType.DATE)
	@Column(name = "crowned_time")
	private Date crownedTime; // 获评时间
	
	
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

	
	public String getScale()
	{
		return scale;
	}

	public void setScale(String scale)
	{
		this.scale = scale;
	}

	public Integer getBaseCount()
	{
		return baseCount;
	}

	public void setBaseCount(Integer baseCount)
	{
		this.baseCount = baseCount;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
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
