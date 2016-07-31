package com.gouhai.baoshan.entity.business.shgl.cjjyqk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * + 无证无照经营户
 * 
 * @author 徐舟
 * 
 *         y 有填报周期，需审核
 */
@Entity
@Table(name = "bs_business_wzwzjyh")
public class Wzwzjyh extends BaseEntity {
@Column(name="yz")
private String yz;//业主
@Column(name="hj")
private String hj;//户籍
@Column(name="phone")
private String phone;//联系电话
@Column(name="jydz")
private String jydz;//经营地址
@Column(name="jynr")
private String jynr;//经营内容
@Column(name="sshy")
private String sshyp;//所属行业
@Column(name="fwxz")
private String fwxz;//房屋性质
@Column(name="cqsy")
private String cqsy;//产群所有
@Column(name="remark")
private String remark;//备注
@OneToOne
@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
private BusinessForm businessForm;
public String getYz() {
	return yz;
}
public void setYz(String yz) {
	this.yz = yz;
}
public String getHj() {
	return hj;
}
public void setHj(String hj) {
	this.hj = hj;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getJydz() {
	return jydz;
}
public void setJydz(String jydz) {
	this.jydz = jydz;
}
public String getJynr() {
	return jynr;
}
public void setJynr(String jynr) {
	this.jynr = jynr;
}
public String getSshyp() {
	return sshyp;
}
public void setSshyp(String sshyp) {
	this.sshyp = sshyp;
}
public String getFwxz() {
	return fwxz;
}
public void setFwxz(String fwxz) {
	this.fwxz = fwxz;
}
public String getCqsy() {
	return cqsy;
}
public void setCqsy(String cqsy) {
	this.cqsy = cqsy;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public BusinessForm getBusinessForm() {
	return businessForm;
}
public void setBusinessForm(BusinessForm businessForm) {
	this.businessForm = businessForm;
}

}
