package com.gouhai.baoshan.entity.business.ggfw.hszh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 红十字服务站物资出借明细
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_hszfwzwzjc")
public class Hszfwzwzjc extends BaseEntity {
	@Column(name = "wzmc")
	private String wzmc;// 物资名称
	@Column(name = "cjrq")
	private String cjrq;// 出借日期
	@Column(name = "qm")
	private String qm;// 签名
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "ghrq")
	private String ghrq;// 归还日期
	@Column(name = "bz")
	private String bz;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getWzmc() {
		return wzmc;
	}

	public void setWzmc(String wzmc) {
		this.wzmc = wzmc;
	}

	public String getCjrq() {
		return cjrq;
	}

	public void setCjrq(String cjrq) {
		this.cjrq = cjrq;
	}

	public String getQm() {
		return qm;
	}

	public void setQm(String qm) {
		this.qm = qm;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGhrq() {
		return ghrq;
	}

	public void setGhrq(String ghrq) {
		this.ghrq = ghrq;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
