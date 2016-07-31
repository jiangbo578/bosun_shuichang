/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tz.QjrsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tz.Qjrs;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class QjrsService {

	@Autowired
	private QjrsDao qjrsDao;

	public List<Qjrs> getBeanList(BusinessForm businessForm, int pageNumber) {
		return qjrsDao.findList("from Qjrs where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return qjrsDao.findCount("from Qjrs where businessForm=?", businessForm);
	}
	
	public void insert(Qjrs xqqjrs) {
		qjrsDao.insert(xqqjrs);
	}

	public void delete(String id, String businessFormId) {
		Qjrs allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			qjrsDao.delete(allowance);
		}
	}

	public Qjrs findOne(String id) {
		return qjrsDao.findOne(id);
	}
	
	public void update(Qjrs allowance, String businessFormId) {
		Qjrs findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setMz(allowance.getMz());
			
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setPhone(allowance.getPhone());
			
			findTwjrhmc.setRelationName(allowance.getRelationName());
			findTwjrhmc.setRelation(allowance.getRelation());
			findTwjrhmc.setLiveCountry(allowance.getLiveCountry());
			findTwjrhmc.setUpdateDate(new Date());
			qjrsDao.update(findTwjrhmc);
		}
	}

}
