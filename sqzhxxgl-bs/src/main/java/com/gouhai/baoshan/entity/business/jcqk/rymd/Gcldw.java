package com.gouhai.baoshan.entity.business.jcqk.rymd;

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
 * 共建、创建、联建单位
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_gclwd")
public class Gcldw extends BaseEntity {
	@Column(name = "dwname")
	private String dwname;// 单位名称
	@Column(name = "address")
	private String address;// 地址
	@Column(name = "dwxz")
	private String dwxz;// 单位性质
	@Column(name = "lxr")
	private String lxr;// 联系人
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "gjsj")
	@Temporal(TemporalType.DATE)
	private Date gjsj;// 共建时间
	@Column(name = "type")
	private String type;// 类别
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getDwname() {
		return dwname;
	}

	public void setDwname(String dwname) {
		this.dwname = dwname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDwxz() {
		return dwxz;
	}

	public void setDwxz(String dwxz) {
		this.dwxz = dwxz;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getGjsj() {
		return gjsj;
	}

	public void setGjsj(Date gjsj) {
		this.gjsj = gjsj;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
