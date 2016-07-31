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
 *社区（家庭）文明建设活动情况
 * @author sun 2014-08-07
 * 
 */
@Entity
@Table(name = "bs_business_wmjianshe")
public class Wmjianshe extends BaseEntity{
	/**
	 *日 期	活 动 内 容	参加人数	活动效果
	 */
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date; // 日 期
	
	@Column(name = "CONTENT")
	private String content; // 活动内容
	
	@Column(name = "count",length=512)
	private Integer count; // 参加人数
	@Column(name = "result",length=512)
	private String result; // 家庭住址
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Integer getCount()
	{
		return count;
	}

	public void setCount(Integer count)
	{
		this.count = count;
	}

	public String getResult()
	{
		return result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}
	
}
