package com.gouhai.baoshan.entity.business.jcqk.rymd;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 村务公开小组成员名单
 * 
 * @author MedivhQ
 * 
 */
@Entity
@Table(name = "bs_business_cwgkxz")
public class Cwgkxz extends BaseEntity {
	@Column(name = "zw")
	private String zw;// 职务
	@Column(name = "xm")
	private String xm;// 姓名
	@Column(name = "xb")
	private String xb;// 性别
	@Column(name = "nl")
	private String nl;// 年龄
	@Column(name = "whcd")
	private String whcd;// 文化程度
	@Column(name = "zzmm")
	private String zzmm;// 政治面貌
	@Column(name = "xrzw")
	private String xrzw;
	@Column(name = "lxdh")
	private String lxdh;
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	
	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getZw()
	{
		return zw;
	}

	public void setZw(String zw)
	{
		this.zw = zw;
	}

	public String getXm()
	{
		return xm;
	}

	public void setXm(String xm)
	{
		this.xm = xm;
	}

	public String getXb()
	{
		return xb;
	}

	public void setXb(String xb)
	{
		this.xb = xb;
	}

	public String getNl()
	{
		return nl;
	}

	public void setNl(String nl)
	{
		this.nl = nl;
	}

	public String getWhcd()
	{
		return whcd;
	}

	public void setWhcd(String whcd)
	{
		this.whcd = whcd;
	}

	public String getZzmm()
	{
		return zzmm;
	}

	public void setZzmm(String zzmm)
	{
		this.zzmm = zzmm;
	}

	public String getXrzw()
	{
		return xrzw;
	}

	public void setXrzw(String xrzw)
	{
		this.xrzw = xrzw;
	}

	public String getLxdh()
	{
		return lxdh;
	}

	public void setLxdh(String lxdh)
	{
		this.lxdh = lxdh;
	}
	
}
