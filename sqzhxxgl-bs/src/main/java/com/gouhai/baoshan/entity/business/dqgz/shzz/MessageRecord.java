package com.gouhai.baoshan.entity.business.dqgz.shzz;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingrecord;
/**
 * 信息报送记录
 * @author sun 2014-08-11
 * 
 */
@Entity
@Table(name = "bs_business_message_record")
public class MessageRecord extends BaseEntity{

	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date date; // 日期
	
	@Column(name="SENT_COUNT")
	private Long count;//报送条数
	
	
	@Column(name="Content",length=512)
	private String content;//报送条数
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="aid_id")
	private Warningnetworker networker;
	
	public Warningnetworker getNetworker()
	{
		return networker;
	}

	public void setNetworker(Warningnetworker networker)
	{
		this.networker = networker;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Long getCount()
	{
		return count;
	}

	public void setCount(Long count)
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
	
}
