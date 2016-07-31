package com.gouhai.baoshan.entity.business.ggfw.xxxsq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 学习型社区硬件建设
 * 
 * @author 徐舟
 * 
 *         需审核，有填报周期 与人口无关
 */
@Entity
@Table(name = "bs_business_sqyjjs")
public class Sqyjjs extends BaseEntity {
	@Column(name = "glxcgj", length = 1000000)
	private String glxcgj;// 各类宣传工具
	@Column(name = "kjwthdzd", length = 1000000)
	private String kjwthdzd;// 科教文体活动征地
	@Column(name = "sqxxbxd", length = 100000)
	private String xqxxbxd;// 社区学校办学点
	@Column(name = "hjjs")
	private String hjjs;// 环境建设
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getGlxcgj() {
		return glxcgj;
	}

	public void setGlxcgj(String glxcgj) {
		this.glxcgj = glxcgj;
	}

	public String getKjwthdzd() {
		return kjwthdzd;
	}

	public void setKjwthdzd(String kjwthdzd) {
		this.kjwthdzd = kjwthdzd;
	}

	public String getXqxxbxd() {
		return xqxxbxd;
	}

	public void setXqxxbxd(String xqxxbxd) {
		this.xqxxbxd = xqxxbxd;
	}

	public String getHjjs() {
		return hjjs;
	}

	public void setHjjs(String hjjs) {
		this.hjjs = hjjs;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
