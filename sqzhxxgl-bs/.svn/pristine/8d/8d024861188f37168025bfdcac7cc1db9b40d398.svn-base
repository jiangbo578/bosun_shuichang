package com.gouhai.baoshan.entity.business.hyjl.hyhd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 工作总结
 * 
 * @author 徐舟
 * 
 *         填报周期，每年十二月25号，需审核，和人口无关
 */
@Entity
@Table(name = "bs_business_gzzj")
public class Gzzj extends BaseEntity {
	@Column(name = "nr", length = 500)
	private String nr;// 内容
	@Column(name = "jlr")
	private String jlr;// 记录人
	@Column(name = "type")
	private String type;// 类型
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getJlr() {
		return jlr;
	}

	public void setJlr(String jlr) {
		this.jlr = jlr;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
