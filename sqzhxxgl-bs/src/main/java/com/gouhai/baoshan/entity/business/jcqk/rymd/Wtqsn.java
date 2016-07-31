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
@Table(name = "bs_business_wtqsn")
public class Wtqsn extends BaseEntity {
	
	@Column(name = "ahj")
	private String ahj;
	@Column(name = "afhj")
	private String afhj;
	@Column(name = "abz")
	private String abz;
	@Column(name = "bhj")
	private String bhj;
	@Column(name = "bfhj")
	private String bfhj;
	@Column(name = "bbz")
	private String bbz;
	@Column(name = "chj")
	private String chj;
	@Column(name = "cfhj")
	private String cfhj;
	@Column(name = "cbz")
	private String cbz;
	@Column(name = "dhj")
	private String dhj;
	@Column(name = "dfhj")
	private String dfhj;
	@Column(name = "dbz")
	private String dbz;
	@Column(name = "ehj")
	private String ehj;
	@Column(name = "efhj")
	private String efhj;
	@Column(name = "ebz")
	private String ebz;
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	
	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}


	public String getAhj()
	{
		return ahj;
	}

	public void setAhj(String ahj)
	{
		this.ahj = ahj;
	}

	public String getAfhj()
	{
		return afhj;
	}

	public void setAfhj(String afhj)
	{
		this.afhj = afhj;
	}

	public String getAbz()
	{
		return abz;
	}

	public void setAbz(String abz)
	{
		this.abz = abz;
	}

	public String getBhj()
	{
		return bhj;
	}

	public void setBhj(String bhj)
	{
		this.bhj = bhj;
	}

	public String getBfhj()
	{
		return bfhj;
	}

	public void setBfhj(String bfhj)
	{
		this.bfhj = bfhj;
	}

	public String getBbz()
	{
		return bbz;
	}

	public void setBbz(String bbz)
	{
		this.bbz = bbz;
	}

	public String getChj()
	{
		return chj;
	}

	public void setChj(String chj)
	{
		this.chj = chj;
	}

	public String getCfhj()
	{
		return cfhj;
	}

	public void setCfhj(String cfhj)
	{
		this.cfhj = cfhj;
	}

	public String getCbz()
	{
		return cbz;
	}

	public void setCbz(String cbz)
	{
		this.cbz = cbz;
	}

	public String getDhj()
	{
		return dhj;
	}

	public void setDhj(String dhj)
	{
		this.dhj = dhj;
	}

	public String getDfhj()
	{
		return dfhj;
	}

	public void setDfhj(String dfhj)
	{
		this.dfhj = dfhj;
	}

	public String getDbz()
	{
		return dbz;
	}

	public void setDbz(String dbz)
	{
		this.dbz = dbz;
	}

	public String getEhj()
	{
		return ehj;
	}

	public void setEhj(String ehj)
	{
		this.ehj = ehj;
	}

	public String getEfhj()
	{
		return efhj;
	}

	public void setEfhj(String efhj)
	{
		this.efhj = efhj;
	}

	public String getEbz()
	{
		return ebz;
	}

	public void setEbz(String ebz)
	{
		this.ebz = ebz;
	}
	
}

