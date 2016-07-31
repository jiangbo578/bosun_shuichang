package com.gouhai.baoshan.entity.business.ggfw.llgz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 为老服务设施与项目
 * 
 * @author 徐舟
 * 
 *         与人口无关，需审核，有填报周期
 */
@Entity
@Table(name = "bs_business_fwssyxm")
public class Fwssyxm extends BaseEntity {
	@Column(name = "ssmc")
	private String ssmc;// 设施名称
	@Column(name = "gg")
	private String gg;// 规格
	@Column(name = "xmmc")
	private String xmmc;// 项目名称
	@Column(name = "nr", length = 100000)
	private String nr;// 内容
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getSsmc() {
		return ssmc;
	}

	public void setSsmc(String ssmc) {
		this.ssmc = ssmc;
	}

	public String getGg() {
		return gg;
	}

	public void setGg(String gg) {
		this.gg = gg;
	}

	public String getXmmc() {
		return xmmc;
	}

	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
