/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tz.SsmzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tz.Ssmz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author Rui
 *
 */
@Service
public class SsmzService {

	@Autowired
	private SsmzDao ssmzDao;

	public List<Ssmz> getSsmzList(BusinessForm businessForm, int pageNumber) {
		return ssmzDao.findList("from Ssmz where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getSsmzCount(BusinessForm businessForm) {
		return ssmzDao.findCount("from Ssmz where businessForm=?", businessForm);
	}
	
	public void insert(Ssmz ssmz) {
		ssmzDao.insert(ssmz);
	}

	public void delete(String id, String businessFormId) {
		Ssmz ssmz = findOne(id);
		if (ssmz.getBusinessForm().getId().equals(businessFormId)) {
			ssmzDao.delete(ssmz);
		}
	}

	public Ssmz findOne(String id) {
		return ssmzDao.findOne(id);
	}
	
	public void update(Ssmz ssmz, String businessFormId) {
		Ssmz findSsmz = findOne(ssmz.getId());
		if (findSsmz.getBusinessForm().getId().equals(businessFormId)) {
			findSsmz.setXm(ssmz.getXm());
			findSsmz.setXb(ssmz.getXb());
			findSsmz.setCsny(ssmz.getCsny());
			findSsmz.setIdcard(ssmz.getIdcard());
			findSsmz.setWhcd(ssmz.getWhcd());
			findSsmz.setJtzz(ssmz.getJtzz());
			findSsmz.setMz(ssmz.getMz());
			findSsmz.setStatus(ssmz.getStatus());
			findSsmz.setHjd(ssmz.getHjd());
			findSsmz.setGzdw(ssmz.getGzdw());
			findSsmz.setPhone(ssmz.getPhone());
			findSsmz.setUpdateDate(new Date());
			ssmzDao.update(findSsmz);
		}
	}

}
