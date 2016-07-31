package com.gouhai.baoshan.entity.business.ggfw.whtygz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 上海市社区公共体育设施各类人员登记表
 * 
 * @author 徐舟
 * 
 * @与人口无关，无需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_tyssdj")
public class Tyssdj extends BaseEntity {
	@Column(name = "rylb")
	private String rylb;// 人员类别
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "ryxz")
	private String ryxz;// 人员性质
	@Column(name = "tel")
	private String tel;// 固定电话
	@Column(name = "phone")
	private String phone;// 手机
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getRylb() {
		return rylb;
	}

	public void setRylb(String rylb) {
		this.rylb = rylb;
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

	public String getRyxz() {
		return ryxz;
	}

	public void setRyxz(String ryxz) {
		this.ryxz = ryxz;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

}
