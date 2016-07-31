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
 * 群众文化团队
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_qzwhtd")
public class Qzwhtd extends BaseEntity {
	@Column(name = "tdname")
	private String tdname;// 团队名称
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	private Date birthday;// 出生年月
	@Column(name = "rdny")
	private String rdny;// 入党年月
	@Column(name = "ydwrole")
	private String ydwrole;// 原单位职务
	@Column(name = "tdrole")
	private String tdrole;// 团队职位
	@Column(name = "address")
	private String address;// 地址
	@Column(name = "phone")
	private String phone;// 电话
	@Column(name = "clsj")
	private String clsj;// 成立时间
	@Column(name = "hdsj")
	private String hdsj;// 活动时间
	@Column(name = "hdaddress")
	private String hdaddress;// 活动地点
	@Column(name = "type")
	private String type;//群文和群体
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getTdname() {
		return tdname;
	}

	public void setTdname(String tdname) {
		this.tdname = tdname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getRdny() {
		return rdny;
	}

	public void setRdny(String rdny) {
		this.rdny = rdny;
	}

	public String getYdwrole() {
		return ydwrole;
	}

	public void setYdwrole(String ydwrole) {
		this.ydwrole = ydwrole;
	}

	public String getTdrole() {
		return tdrole;
	}

	public void setTdrole(String tdrole) {
		this.tdrole = tdrole;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getClsj() {
		return clsj;
	}

	public void setClsj(String clsj) {
		this.clsj = clsj;
	}

	public String getHdsj() {
		return hdsj;
	}

	public void setHdsj(String hdsj) {
		this.hdsj = hdsj;
	}

	public String getHdaddress() {
		return hdaddress;
	}

	public void setHdaddress(String hdaddress) {
		this.hdaddress = hdaddress;
	}

}
