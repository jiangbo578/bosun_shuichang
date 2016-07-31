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
 * 重点优抚对象花名册表
 * @author sun 2014-08-04
 * 
 */
@Entity
@Table(name = "bs_business_twjrhmc")
public class Twjrhmc extends BaseEntity{

	/**
	 * 姓名	性别	民族	出生年月 家庭住址	电话	
	 */
	@Column(name = "XM")
	private String xm; // 姓名
	@Column(name = "XB")
	private String xb; // 性别
	@Column(name = "CSNY")
	@Temporal(TemporalType.DATE)
	private Date csny; // 出生年月
	@Column(name = "RWSJ")
	@Temporal(TemporalType.DATE)
	private Date rwsj;//入伍时间
	@Column(name = "TWSJ")
	@Temporal(TemporalType.DATE)
	private Date twsj;//退伍时间
	@Column(name = "JTZZ")
	private String jtzz; // 家庭住址
	@Column(name = "HJDZ")
	private String hjdz; // 户籍地址
	@Column(name = "PHONE")
	private String phone; // 联系电话
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public Date getCsny() {
		return csny;
	}

	public void setCsny(Date csny) {
		this.csny = csny;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getHjdz() {
		return hjdz;
	}

	public void setHjdz(String hjdz) {
		this.hjdz = hjdz;
	}

	public Date getRwsj() {
		return rwsj;
	}

	public void setRwsj(Date rwsj) {
		this.rwsj = rwsj;
	}

	public Date getTwsj() {
		return twsj;
	}

	public void setTwsj(Date twsj) {
		this.twsj = twsj;
	}
	

}
