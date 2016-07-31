package com.gouhai.baoshan.entity.business.shgl.xfzsx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 消费者投诉、举报、咨询记录表
 * 
 * @author 徐舟
 * 
 *         与人口无关，有填报周期，需审核
 */
@Entity
@Table(name = "bs_business_xfzts")
public class Xfzts extends BaseEntity {
	@Column(name = "rq")
	private String rq;// 日期
	@Column(name = "djbh")
	private String djbh;// 登记编号
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "phone")
	private String phone;// 电话
	@Column(name = "address")
	private String address;// 地址
	@Column(name = "djlx")
	private String djlx;// 登记类型
	@Column(name = "jtnr")
	private String jtnr;// 具体内容
	@Column(name = "zxcljg")
	private String zxcljg;// 自行处理结果
	@Column(name = "clr")
	private String clr;// 处理人
	@Column(name = "sj")
	private String sj;// 时间
	@Column(name = "yjr")
	private String yjr;// 移交人
	@Column(name = "jsr")
	private String jsr;// 接收人
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
	}

	public String getDjbh() {
		return djbh;
	}

	public void setDjbh(String djbh) {
		this.djbh = djbh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDjlx() {
		return djlx;
	}

	public void setDjlx(String djlx) {
		this.djlx = djlx;
	}

	public String getJtnr() {
		return jtnr;
	}

	public void setJtnr(String jtnr) {
		this.jtnr = jtnr;
	}

	public String getZxcljg() {
		return zxcljg;
	}

	public void setZxcljg(String zxcljg) {
		this.zxcljg = zxcljg;
	}

	public String getClr() {
		return clr;
	}

	public void setClr(String clr) {
		this.clr = clr;
	}

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getYjr() {
		return yjr;
	}

	public void setYjr(String yjr) {
		this.yjr = yjr;
	}

	public String getJsr() {
		return jsr;
	}

	public void setJsr(String jsr) {
		this.jsr = jsr;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
