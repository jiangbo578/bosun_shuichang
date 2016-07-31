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
 * 为退休和生活困难妇女安排妇科病、乳腺病筛查工作统计表
 * @author sun 2014-08-18
 * 
 */
@Entity
@Table(name = "bs_business_womanbsctj")
public class Womanbsctj extends BaseEntity{

	/**
	 *检查日期   应检人数（退休+困难+其他） 实检人数 总体情况  备注
	 */
	@Column(name = "JCRQ")
	@Temporal(TemporalType.DATE)
	private Date jcrq; // 检查日期
	
	@Column(name = "ALL_COUNT")
	private int allCount; // 应检人数（退休+困难+其他）
	@Column(name = "REAL_COUNT")
	private int realCount; // 实检人数
	
	@Column(name = "SUMMARY")
	private String summary; // 总体情况

	@Column(name = "TAG")
	private String tag; // 备注
	
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;


	public Date getJcrq()
	{
		return jcrq;
	}


	public void setJcrq(Date jcrq)
	{
		this.jcrq = jcrq;
	}


	public int getAllCount()
	{
		return allCount;
	}


	public void setAllCount(int allCount)
	{
		this.allCount = allCount;
	}


	public int getRealCount()
	{
		return realCount;
	}


	public void setRealCount(int realCount)
	{
		this.realCount = realCount;
	}


	public String getSummary()
	{
		return summary;
	}


	public void setSummary(String summary)
	{
		this.summary = summary;
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
