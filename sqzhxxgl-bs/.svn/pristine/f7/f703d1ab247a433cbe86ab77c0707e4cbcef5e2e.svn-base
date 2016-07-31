package com.gouhai.baoshan.entity.business.dqgz.fd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
/**
 * 家庭志愿者队伍名册
 * @author sun 2014-08-06
 * 
 */
@Entity
@Table(name = "bs_business_volunteerteam")
public class Volunteer extends BaseEntity{
	/**
	 * 家庭志愿者队伍名  称	总人数	中共s
		党员数	负责人姓名	负责人
		联系电话
	 */
	@Column(name = "XM")
	private String xm; // 家庭志愿者队伍名 称
	@Column(name = "COUNT")
	private Integer count; // 总人数
	
	@Column(name = "PARTY_COUNT")
	private Integer partyCount; // 中共党员数

	@Column(name = "principal")
	private String principal; // 负责人

	@Column(name = "principal_phone")
	private String principalPhone; // 负责人联系电话
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}
	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public Integer getCount()
	{
		return count;
	}

	public void setCount(Integer count)
	{
		this.count = count;
	}

	public Integer getPartyCount()
	{
		return partyCount;
	}

	public void setPartyCount(Integer partyCount)
	{
		this.partyCount = partyCount;
	}

	public String getPrincipal()
	{
		return principal;
	}

	public void setPrincipal(String principal)
	{
		this.principal = principal;
	}

	public String getPrincipalPhone()
	{
		return principalPhone;
	}

	public void setPrincipalPhone(String principalPhone)
	{
		this.principalPhone = principalPhone;
	}
	
}
