/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.KndyqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Kndyqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author Rui
 *
 */
@Service
public class KndyqkService {

	@Autowired
	private KndyqkDao kndyqkDao;

	public List<Kndyqk> getKndyqkList(BusinessForm businessForm, int pageNumber) {
		return kndyqkDao.findList("from Kndyqk where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getKndyqkCount(BusinessForm businessForm) {
		return kndyqkDao.findCount("from Kndyqk where businessForm=?", businessForm);
	}
	
	public void insert(Kndyqk kndyqk) {
		kndyqkDao.insert(kndyqk);
	}

	public void delete(String id, String businessFormId) {
		Kndyqk kndyqk = findOne(id);
		if (kndyqk.getBusinessForm().getId().equals(businessFormId)) {
			kndyqkDao.delete(kndyqk);
		}
	}

	public Kndyqk findOne(String id) {
		return kndyqkDao.findOne(id);
	}
	
	public void update(Kndyqk kndyqk, String businessFormId) {
		Kndyqk findKndyqk = findOne(kndyqk.getId());
		if (findKndyqk.getBusinessForm().getId().equals(businessFormId)) {
			findKndyqk.setXm(kndyqk.getXm());
			findKndyqk.setXb(kndyqk.getXb());
			findKndyqk.setCsny(kndyqk.getCsny());
			findKndyqk.setWhcd(kndyqk.getWhcd());
			findKndyqk.setJtzz(kndyqk.getJtzz());
			findKndyqk.setUpdateDate(new Date());
			findKndyqk.setJddyxm(kndyqk.getJddyxm());
			findKndyqk.setJdphone(kndyqk.getJdphone());
			findKndyqk.setJdsj(kndyqk.getJdsj());
			findKndyqk.setKnqk(kndyqk.getKnqk());
			kndyqkDao.update(findKndyqk);
		}
	}

}
