/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.TdmcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Tdmc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author cgw
 *
 */
@Service
public class TdmcService {

	@Autowired
	private TdmcDao tdmcDao;

	public List<Tdmc> getTdmcList(BusinessForm businessForm, int pageNumber) {
		return tdmcDao.findList("from Tdmc where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getTdmcCount(BusinessForm businessForm) {
		return tdmcDao.findCount("from Tdmc where businessForm=?", businessForm);
	}
	
	public void insert(Tdmc tdmc) {
		tdmcDao.insert(tdmc);
	}

	public void delete(String id, String businessFormId) {
		Tdmc tdmc = findOne(id);
		if (tdmc.getBusinessForm().getId().equals(businessFormId)) {
			tdmcDao.delete(tdmc);
		}
	}

	public Tdmc findOne(String id) {
		return tdmcDao.findOne(id);
	}
	
	public void update(Tdmc tdmc, String businessFormId) {
		Tdmc findTdmc = findOne(tdmc.getId());
		if (findTdmc.getBusinessForm().getId().equals(businessFormId)) {
			findTdmc.setXb(tdmc.getXb());
			findTdmc.setPhone(tdmc.getPhone());
			findTdmc.setUpdateDate(new Date());
			findTdmc.setDwmc(tdmc.getDwmc());
			findTdmc.setRs(tdmc.getRs());
			findTdmc.setClny(tdmc.getClny());
			findTdmc.setTag(tdmc.getTag());
			tdmcDao.update(findTdmc);
		}
	}

}
