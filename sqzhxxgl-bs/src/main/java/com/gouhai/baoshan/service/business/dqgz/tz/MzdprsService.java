/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tz.MzdprsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tz.Mzdprs;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author Rui
 *
 */
@Service
public class MzdprsService {

	@Autowired
	private MzdprsDao mzdprsDao;

	public List<Mzdprs> getMzdprsList(BusinessForm businessForm, int pageNumber) {
		return mzdprsDao.findList("from Mzdprs where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getMzdprsCount(BusinessForm businessForm) {
		return mzdprsDao.findCount("from Mzdprs where businessForm=?", businessForm);
	}
	
	public void insert(Mzdprs mzdprs) {
		mzdprsDao.insert(mzdprs);
	}

	public void delete(String id, String businessFormId) {
		Mzdprs mzdprs = findOne(id);
		if (mzdprs.getBusinessForm().getId().equals(businessFormId)) {
			mzdprsDao.delete(mzdprs);
		}
	}

	public Mzdprs findOne(String id) {
		return mzdprsDao.findOne(id);
	}
	
	public void update(Mzdprs mzdprs, String businessFormId) {
		Mzdprs findMzdprs = findOne(mzdprs.getId());
		if (findMzdprs.getBusinessForm().getId().equals(businessFormId)) {
			findMzdprs.setXm(mzdprs.getXm());
			findMzdprs.setXb(mzdprs.getXb());
			findMzdprs.setCsny(mzdprs.getCsny());
			findMzdprs.setIdcard(mzdprs.getIdcard());
			findMzdprs.setWhcd(mzdprs.getWhcd());
			findMzdprs.setJtzz(mzdprs.getJtzz());
			findMzdprs.setMz(mzdprs.getMz());
			findMzdprs.setDp(mzdprs.getDp());
			findMzdprs.setGzdw(mzdprs.getGzdw());
			findMzdprs.setPhone(mzdprs.getPhone());
			findMzdprs.setUpdateDate(new Date());
			mzdprsDao.update(findMzdprs);
		}
	}

}
