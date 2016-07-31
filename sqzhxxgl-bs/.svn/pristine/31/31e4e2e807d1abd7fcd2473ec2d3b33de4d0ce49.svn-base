/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.entity.business.dqgz.zb.head;

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
 * 在职党员概况及名册表头
 * 
 * @author sun
 * 
 */
@Entity
@Table(name = "bs_business_zzdygk_head")
public class ZzdygkHead extends BaseEntity {
	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date date; // 截至日期
	@Column(name = "ZZ_COUNT")//在职党员数量
	private Long zzCount;
	
	@Column(name = "ZS_COUNT")//正式党员数量
	private Long zsCount;
	@Column(name = "YB_COUNT")//预备党员数量
	private Long ybCount;  
	
	@Column(name = "REGISTER_COUNT")//已经报到党员数量
	private Long registerCount;  
	
	@Column(name = "TC_COUNT")//有特长党员数量
	private Long tcCount;
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public BusinessForm getBusinessForm()
	{
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm)
	{
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

	public Long getZzCount()
	{
		return zzCount;
	}

	public void setZzCount(Long zzCount)
	{
		this.zzCount = zzCount;
	}

	public Long getZsCount()
	{
		return zsCount;
	}

	public void setZsCount(Long zsCount)
	{
		this.zsCount = zsCount;
	}

	public Long getYbCount()
	{
		return ybCount;
	}

	public void setYbCount(Long ybCount)
	{
		this.ybCount = ybCount;
	}

	public Long getRegisterCount()
	{
		return registerCount;
	}

	public void setRegisterCount(Long registerCount)
	{
		this.registerCount = registerCount;
	}

	public Long getTcCount()
	{
		return tcCount;
	}

	public void setTcCount(Long tcCount)
	{
		this.tcCount = tcCount;
	}  
	
}
