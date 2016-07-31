package com.gouhai.baoshan.entity.business.dqgz.fd;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 双学双比活动情况-美好家园示范村 -活动情况
 * @author sun 2014-08-19
 * 
 */
@Entity
@Table(name = "bs_business_sxsbmhsfc_activity")
public class SxsbmhsfcActivity extends BaseEntity{
	/**
	 *时间	参与人数	活动内容
	 */
	
	@Temporal(TemporalType.DATE)
	@Column(name = "time")
	private Date time; // 时间
	
	@Column(name = "count")
	private String count; // 参与人数
	@Column(name = "content",length=512)
	private String content; // 活动内容
	
	@ManyToOne
	@JoinColumn(name="_sxsbmhsfcId")
	private Sxsbmhsfc sxsbmhsfc;

	public Date getTime()
	{
		return time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

	public String getCount()
	{
		return count;
	}

	public void setCount(String count)
	{
		this.count = count;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Sxsbmhsfc getSxsbmhsfc()
	{
		return sxsbmhsfc;
	}

	public void setSxsbmhsfc(Sxsbmhsfc sxsbmhsfc)
	{
		this.sxsbmhsfc = sxsbmhsfc;
	}
	
	
}
