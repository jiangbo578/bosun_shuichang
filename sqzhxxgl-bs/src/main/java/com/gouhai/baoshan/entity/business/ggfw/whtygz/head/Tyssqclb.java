package com.gouhai.baoshan.entity.business.ggfw.whtygz.head;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.whtygz.Tyssqc;

/**
 * 海市社区公共体育设施器材（场地）详细情况登记表类别
 * 
 * @author 徐舟
 * 
 */
@Entity
@Table(name = "bs_business_tyssqclb")
public class Tyssqclb extends BaseEntity {
	@Column(name = "lb")
	private String lb;// 设施类别
	@Column(name = "address")
	private String address;// 地址
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;
	@OneToMany(mappedBy = "tyssqclb", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Tyssqc> tyssqclist;

	public Tyssqclb(String id) {
		this.id = id;
	}

	public List<Tyssqc> getTyssqclist() {
		return tyssqclist;
	}

	public void setTyssqclist(List<Tyssqc> tyssqclist) {
		this.tyssqclist = tyssqclist;
	}

	public Tyssqclb() {

	}

	public String getLb() {
		return lb;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BusinessForm getBusinessForm() {
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm) {
		this.businessForm = businessForm;
	}

}
