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
 *关工委工作
 * @author sun 2014-08-15
 * 
 */
@Entity
@Table(name = "bs_business_ggwgz")
public class Ggwgz extends BaseEntity{

	/**
	 *日 期	活 动 内 容	参加人数	活动效果
	 */
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date; // 日 期
	
	@Column(name = "CONTENT")
	private String content; // 活动内容
	
	@Column(name = "old_count")
	private Integer oldCount; // 老干部参加人数
	
	@Column(name = "new_count")
	private Integer newCount; // 青少年参加人数
	
	@Column(name = "tag",length=512)
	private String tag; // 备注
	
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

	public Integer getOldCount()
	{
		return oldCount;
	}

	public void setOldCount(Integer oldCount)
	{
		this.oldCount = oldCount;
	}

	public Integer getNewCount()
	{
		return newCount;
	}

	public void setNewCount(Integer newCount)
	{
		this.newCount = newCount;
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
