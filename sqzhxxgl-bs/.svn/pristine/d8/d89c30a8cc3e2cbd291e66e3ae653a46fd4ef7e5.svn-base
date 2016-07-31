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
 * 年度组织生活情况表
 * 
 * @author sun 2014-08-15
 * 
 */
@Entity
@Table(name = "bs_business_ndzzshgk")
public class Ndzzshgk extends BaseEntity {

	@Column(name = "SUMMARY_RECORD")
	private String summaryRecord; // 摘要记录
	@Column(name = "LOCALE")
	private String locale; //地点
	
	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date date; // 时间
	
	@Column(name = "_topic")
	private String topic; //主题
	
	
	@Column(name = "_type")
	private String type; // 会议活动类型   支部委员会会议	党员大会	组织生活会	党员电化教育	其他活动
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getSummaryRecord()
	{
		return summaryRecord;
	}

	public void setSummaryRecord(String summaryRecord)
	{
		this.summaryRecord = summaryRecord;
	}

	public String getLocale()
	{
		return locale;
	}

	public void setLocale(String locale)
	{
		this.locale = locale;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public String getTopic()
	{
		return topic;
	}

	public void setTopic(String topic)
	{
		this.topic = topic;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
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
