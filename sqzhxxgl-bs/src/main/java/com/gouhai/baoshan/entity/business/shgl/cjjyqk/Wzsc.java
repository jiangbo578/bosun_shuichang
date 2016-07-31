package com.gouhai.baoshan.entity.business.shgl.cjjyqk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 无照市场
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_wzsc")
public class Wzsc extends BaseEntity {
	@Column(name = "scmc")
	private String scmc;// 业主
	@Column(name = "zbf")
	private String zbf;// 户籍
	@Column(name = "fzr")
	private String fzr;// 负责人
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "jydz")
	private String jydz;// 经营地址
	@Column(name = "jynr")
	private String jynr;// 经营内容
	@Column(name = "jyhs")
	private String jyhs;// 所属行业
	@Column(name = "fwxz")
	private String fwxz;// 房屋性质
	@Column(name = "cqsy")
	private String cqsy;// 产群所有
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	public String getScmc() {
		return scmc;
	}
	public void setScmc(String scmc) {
		this.scmc = scmc;
	}
	public String getZbf() {
		return zbf;
	}
	public void setZbf(String zbf) {
		this.zbf = zbf;
	}
	public String getFzr() {
		return fzr;
	}
	public void setFzr(String fzr) {
		this.fzr = fzr;
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
	public String getJyhs() {
		return jyhs;
	}
	public void setJyhs(String jyhs) {
		this.jyhs = jyhs;
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
