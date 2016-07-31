package com.gouhai.baoshan.entity.business.ggfw.agws;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 开展星期四爱国卫生义务劳动情况记录表
 * 
 * @author 徐舟
 * 
 *         与人口无关，不需审核，填报周期，每年一月十五号
 * 
 */
@Entity
@Table(name = "bs_business_kzxqsag")
public class Kzxqsag extends BaseEntity {
	@Column(name = "rq")
	private String rq;// 日期
	@Column(name = "nr", length = 100000)
	private String nr;// 内容
	@Column(name = "cjxqs")
	private String cjxqs;// 参加居民小区数
	@Column(name = "cjdws")
	private String cjdws;// 参加单位数
	@Column(name = "cjrs")
	private String cjrs;// 参加人数
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getCjxqs() {
		return cjxqs;
	}

	public void setCjxqs(String cjxqs) {
		this.cjxqs = cjxqs;
	}

	public String getCjdws() {
		return cjdws;
	}

	public void setCjdws(String cjdws) {
		this.cjdws = cjdws;
	}

	public String getCjrs() {
		return cjrs;
	}

	public void setCjrs(String cjrs) {
		this.cjrs = cjrs;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
