package com.gouhai.baoshan.entity.business.jcqk.gk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 辖区平面图
 * 
 * @author MedivhQ 需要审核 与人口无关
 * 
 */
@Entity
@Table(name = "bs_business_pmt")
public class Pmt extends BaseEntity {
	@Column(name = "mc")
	private String mc;
	@Column(name = "bz",length=1000000)
	private String bz;
	@Column(name = "url")
	private String url;
	@Column(name = "jlr")
	private String jlr;
	
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public String getMc()
	{
		return mc;
	}


	public void setMc(String mc)
	{
		this.mc = mc;
	}


	public String getBz()
	{
		return bz;
	}


	public void setBz(String bz)
	{
		this.bz = bz;
	}


	public String getUrl()
	{
		return url;
	}


	public void setUrl(String url)
	{
		this.url = url;
	}


	public String getJlr()
	{
		return jlr;
	}


	public void setJlr(String jlr)
	{
		this.jlr = jlr;
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
