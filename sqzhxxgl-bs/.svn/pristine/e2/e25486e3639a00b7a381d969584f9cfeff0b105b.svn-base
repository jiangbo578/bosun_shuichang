package com.gouhai.baoshan.entity.mould;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.Business;

/**
 * 模板表单集合
 * 
 * @author 徐舟
 * 
 *         2014-9-30
 */
@Entity
@Table(name = "bs_mould_gather")
public class Mould_Gather extends BaseEntity {
	@OneToOne
	@JoinColumn(name = "business_ID", unique = true)
	private Business business;
	@OneToOne
	@JoinColumn(name = "mould_id", unique = true)
	private Mould mould;

	public Mould getMould() {
		return mould;
	}

	public void setMould(Mould mould) {
		this.mould = mould;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

}
