package com.gouhai.baoshan.entity.business.dqgz.fd;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 妇女儿童帮困工作情况记录
 * @author sun 2014-08-08
 * 
 */
@Entity
@Table(name = "bs_business_aiding_record")
public class Aidingrecord extends BaseEntity{

	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date date; // 日期
	
	@Column(name="TAG")
	private String tag;//困难情况
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="aid_id")
	private Aidingwork aidingwork;
	
	
	public Aidingwork getAidingwork()
	{
		return aidingwork;
	}

	public void setAidingwork(Aidingwork aidingwork)
	{
		this.aidingwork = aidingwork;
	}

	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
	
}
