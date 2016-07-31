package com.gouhai.baoshan.entity.business.jcqk.gk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 四址边界
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_szbj")
public class Szbj extends BaseEntity {
	@Column(name = "dong")
	private String dong;// 东
	@Column(name = "dongyu")
	private String dongyu;// 东与
	@Column(name = "nan")
	private String nan;// 南
	@Column(name = "nanyu")
	private String nanyu;// 南与
	@Column(name = "xi")
	private String xi;// 西
	@Column(name = "xiyu")
	private String xiyu;// 西与
	@Column(name = "bei")
	private String bei;// 北
	@Column(name = "beiyu")
	private String beiyu;// 北与
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getDongyu() {
		return dongyu;
	}

	public void setDongyu(String dongyu) {
		this.dongyu = dongyu;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getNanyu() {
		return nanyu;
	}

	public void setNanyu(String nanyu) {
		this.nanyu = nanyu;
	}

	public String getXi() {
		return xi;
	}

	public void setXi(String xi) {
		this.xi = xi;
	}

	public String getXiyu() {
		return xiyu;
	}

	public void setXiyu(String xiyu) {
		this.xiyu = xiyu;
	}

	public String getBei() {
		return bei;
	}

	public void setBei(String bei) {
		this.bei = bei;
	}

	public String getBeiyu() {
		return beiyu;
	}

	public void setBeiyu(String beiyu) {
		this.beiyu = beiyu;
	}

}
