/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tz.GqrsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tz.Gqrs;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class GqrsService {

	@Autowired
	private GqrsDao gqrsDao;

	public List<Gqrs> getBeanList(BusinessForm businessForm, int pageNumber) {
		return gqrsDao.findList("from Gqrs where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return gqrsDao.findCount("from Gqrs where businessForm=?", businessForm);
	}
	
	public void insert(Gqrs xqGqrs) {
		gqrsDao.insert(xqGqrs);
	}

	public void delete(String id, String businessFormId) {
		Gqrs allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			gqrsDao.delete(allowance);
		}
	}

	public Gqrs findOne(String id) {
		return gqrsDao.findOne(id);
	}
	
	public void update(Gqrs allowance, String businessFormId) {
		Gqrs findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setMz(allowance.getMz());
			
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setPhone(allowance.getPhone());
			
			findTwjrhmc.setRelationName(allowance.getRelationName());
			findTwjrhmc.setLiveCountry(allowance.getLiveCountry());
			findTwjrhmc.setUpdateDate(new Date());
			gqrsDao.update(findTwjrhmc);
		}
	}

}
