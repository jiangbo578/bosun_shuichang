package com.gouhai.baoshan.entity.business.dqgz.sygz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 现役军人家属信息登记表
 * @author sun 2014-08-18
 * 
 */
@Entity
@Table(name = "bs_business_xyjrjsdj")
public class Xyjrjsdj extends BaseEntity{

	/**
	 */
	@Column(name = "fatherName")
	private String fatherName; // 父亲姓名
	@Column(name = "motherName")
	private String motherName; // 母亲姓名
	
	@Column(name = "jtzz")
	private String jtzz;     // 家庭住址（户籍地址）
	
	@Column(name = "fatherWork")
	private String fatherWork; // 父亲工作单位
	@Column(name = "motherWork")
	private String motherWork; // 母亲工作单位
	
	@Column(name = "fatherPhone")
	private String fatherPhone; // 父亲工作单位
	@Column(name = "motherPhone")
	private String motherPhone; // 母亲工作单位
	
	
	@Column(name = "TAG")
	private String tag; // 备注   军人基本情况（含姓名、出生年月、入伍时间、服役部队等）
	
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public String getFatherName()
	{
		return fatherName;
	}


	public void setFatherName(String fatherName)
	{
		this.fatherName = fatherName;
	}


	public String getMotherName()
	{
		return motherName;
	}


	public void setMotherName(String motherName)
	{
		this.motherName = motherName;
	}


	public String getJtzz()
	{
		return jtzz;
	}


	public void setJtzz(String jtzz)
	{
		this.jtzz = jtzz;
	}


	public String getFatherWork()
	{
		return fatherWork;
	}


	public void setFatherWork(String fatherWork)
	{
		this.fatherWork = fatherWork;
	}


	public String getMotherWork()
	{
		return motherWork;
	}


	public void setMotherWork(String motherWork)
	{
		this.motherWork = motherWork;
	}


	public String getFatherPhone()
	{
		return fatherPhone;
	}


	public void setFatherPhone(String fatherPhone)
	{
		this.fatherPhone = fatherPhone;
	}


	public String getMotherPhone()
	{
		return motherPhone;
	}


	public void setMotherPhone(String motherPhone)
	{
		this.motherPhone = motherPhone;
	}


	public String getTag()
	{
		return tag;
	}


	public void setTag(String tag)
	{
		this.tag = tag;
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
