package com.gouhai.baoshan.entity.business.ggfw.hszh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 红十字服务站会员名册
 * 
 * @author 徐舟
 * 
 *         填报周期，每年一月十五号 与人口无关，无需审核
 */
@Entity
@Table(name = "bs_business_hszfwzhy")
public class Hszfwzhy extends BaseEntity {
	@Column(name = "name")
	private String name;// 姓名
	@Column(name = "sex")
	private String sex;// 性别
	@Column(name = "birthday")
	private String birthday;// 出生年月
	@Column(name = "address")
	private String address;// 家庭住址
	@Column(name = "gzdw")
	private String gzdw;// 工作单位
	@Column(name = "phone")
	private String phone;// 联系电话
	@Column(name = "djsj")
	private String djsj;// 等级时间
	@Column(name = "remark")
	private String remark;// 备注
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGzdw() {
		return gzdw;
	}

	public void setGzdw(String gzdw) {
		this.gzdw = gzdw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDjsj() {
		return djsj;
	}

	public void setDjsj(String djsj) {
		this.djsj = djsj;
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
