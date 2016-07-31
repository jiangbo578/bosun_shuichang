package com.gouhai.baoshan.entity.business.ggfw.agws;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 卫生自查情况记录表
 * 
 * @author 徐舟
 * 
 *         填报周期，每季度五号，与人口无关，无需审核
 */
@Entity
@Table(name = "bs_business_wszcqk")
public class Wszcqk extends BaseEntity {
	@Column(name = "jcsj")
	private String jcsj;// 检查时间
	@Column(name = "xqhj", length = 1000)
	private String xqhj;// 小区环境
	@Column(name = "ljxf", length = 1000)
	private String ljxf;// 垃圾箱房
	@Column(name = "gc", length = 1000)
	private String gc;// 公测
	@Column(name = "gybw", length = 1000)
	private String gybw;// g共用部位
	@Column(name = "sjfz", length = 1000)
	private String shfz;// 四害防治
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	public String getJcsj() {
		return jcsj;
	}

	public void setJcsj(String jcsj) {
		this.jcsj = jcsj;
	}

	public String getXqhj() {
		return xqhj;
	}

	public void setXqhj(String xqhj) {
		this.xqhj = xqhj;
	}

	public String getLjxf() {
		return ljxf;
	}

	public void setLjxf(String ljxf) {
		this.ljxf = ljxf;
	}

	public String getGc() {
		return gc;
	}

	public void setGc(String gc) {
		this.gc = gc;
	}

	public String getGybw() {
		return gybw;
	}

	public void setGybw(String gybw) {
		this.gybw = gybw;
	}

	public String getShfz() {
		return shfz;
	}

	public void setShfz(String shfz) {
		this.shfz = shfz;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
