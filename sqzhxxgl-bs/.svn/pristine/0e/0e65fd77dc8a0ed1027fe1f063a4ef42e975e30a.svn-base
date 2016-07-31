package com.gouhai.baoshan.entity.business.ggfw.shjz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 街镇助学结对统计表（单位版）
 * 
 * @author 徐舟
 * 
 *         有填报周期，需审核，与人口无关
 */
@Entity
@Table(name = "bs_business_zxtjb_dwb")
public class Zxtjbdwb extends BaseEntity {
	@Column(name = "zzdw")
	private String zzdw;// 自助单位
	@Column(name = "dz")
	private String dz;// 地址
	@Column(name = "lxr")
	private String lxr;// 联系人
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "dwxz")
	private String dwxz;// 单位性质
	@Column(name = "ssjz")
	private String ssjz;// 所属街镇
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "sfz")
	private String sfz;// 身份证
	@Column(name = "address")
	private String address;// 家庭住址
	@Column(name = "cwh")
	private String cwh;// 所属村、居委
	@Column(name = "hjxz")
	private String hjxz;// 户籍性质
	@Column(name = "jtxz")
	private String jtxz;// 家庭性质
	@Column(name = "jdxx")
	private String jdxx;// 就读学校
	@Column(name = "xznx")
	private String xznx;// 学制年限
	@Column(name = "xxjd")
	private String xxjd;// 学习阶段
	@Column(name = "xxnj")
	private String xxnj;// 学习年纪
	@Column(name = "zzje")
	private String zzje;// 全年资助金额
	@Column(name = "ljje")
	private String ljje;// 全年至今累计已享受资助金额（元）
	@Column(name = "zzqsnx")
	private String zzqsnx;// 资助起始年限
	@Column(name="bz")
	private String bz;//备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getZzdw() {
		return zzdw;
	}

	public void setZzdw(String zzdw) {
		this.zzdw = zzdw;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
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

	public String getDwxz() {
		return dwxz;
	}

	public void setDwxz(String dwxz) {
		this.dwxz = dwxz;
	}

	public String getSsjz() {
		return ssjz;
	}

	public void setSsjz(String ssjz) {
		this.ssjz = ssjz;
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

	public String getSfz() {
		return sfz;
	}

	public void setSfz(String sfz) {
		this.sfz = sfz;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCwh() {
		return cwh;
	}

	public void setCwh(String cwh) {
		this.cwh = cwh;
	}

	public String getHjxz() {
		return hjxz;
	}

	public void setHjxz(String hjxz) {
		this.hjxz = hjxz;
	}

	public String getJtxz() {
		return jtxz;
	}

	public void setJtxz(String jtxz) {
		this.jtxz = jtxz;
	}

	public String getJdxx() {
		return jdxx;
	}

	public void setJdxx(String jdxx) {
		this.jdxx = jdxx;
	}

	public String getXznx() {
		return xznx;
	}

	public void setXznx(String xznx) {
		this.xznx = xznx;
	}

	public String getXxjd() {
		return xxjd;
	}

	public void setXxjd(String xxjd) {
		this.xxjd = xxjd;
	}

	public String getXxnj() {
		return xxnj;
	}

	public void setXxnj(String xxnj) {
		this.xxnj = xxnj;
	}

	public String getZzje() {
		return zzje;
	}

	public void setZzje(String zzje) {
		this.zzje = zzje;
	}

	public String getLjje() {
		return ljje;
	}

	public void setLjje(String ljje) {
		this.ljje = ljje;
	}

	public String getZzqsnx() {
		return zzqsnx;
	}

	public void setZzqsnx(String zzqsnx) {
		this.zzqsnx = zzqsnx;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
