/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.dqgz.zb;

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
 * 党员（群众）评议党支部工作情况表
 * 
 * @author sun 2014-08-14
 * 
 */
@Entity
@Table(name = "bs_business_pydzbgz")
public class Pydzbgz extends BaseEntity {

	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date date; // 评议日期
	@Column(name = "LOCALE")
	private String locale; //评议地点
	@Column(name = "HOST")
	private String host; // 主持人
	@Column(name = "SUM")
	private String sum; // 参加人数
	
	@Column(name = "GOOD_COUNT")
	private Integer goodCount; // 满意人数
	
	@Column(name = "BASE_GOOD_COUNT")
	private Integer baseGoodCount; // 基本满意人数
	
	@Column(name = "COMMON_COUNT")
	private Integer commonCount; // 一般人数
	
	@Column(name = "BAD_COUNT")
	private Integer badCount; // 差人数
	@Column(name = "SUMMARY_")
	private String summary; // 总体评价   满意度
	
	@Column(name = "_result")
	private String result; // 评议结果分析
	
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public Date getDate()
	{
		return date;
	}


	public void setDate(Date date)
	{
		this.date = date;
	}


	public String getLocale()
	{
		return locale;
	}


	public void setLocale(String locale)
	{
		this.locale = locale;
	}


	public String getHost()
	{
		return host;
	}


	public void setHost(String host)
	{
		this.host = host;
	}


	public String getSum()
	{
		return sum;
	}


	public void setSum(String sum)
	{
		this.sum = sum;
	}


	public Integer getGoodCount()
	{
		return goodCount;
	}


	public void setGoodCount(Integer goodCount)
	{
		this.goodCount = goodCount;
	}


	public Integer getBaseGoodCount()
	{
		return baseGoodCount;
	}


	public void setBaseGoodCount(Integer baseGoodCount)
	{
		this.baseGoodCount = baseGoodCount;
	}


	public Integer getCommonCount()
	{
		return commonCount;
	}


	public void setCommonCount(Integer commonCount)
	{
		this.commonCount = commonCount;
	}


	public Integer getBadCount()
	{
		return badCount;
	}


	public void setBadCount(Integer badCount)
	{
		this.badCount = badCount;
	}


	public String getSummary()
	{
		return summary;
	}


	public void setSummary(String summary)
	{
		this.summary = summary;
	}


	public String getResult()
	{
		return result;
	}


	public void setResult(String result)
	{
		this.result = result;
	}


	public BusinessForm getBusinessForm()
	{
		return businessForm;
	}


	public void setBusinessForm(BusinessForm businessForm)
	{
		this.businessForm = businessForm;
	}
}
