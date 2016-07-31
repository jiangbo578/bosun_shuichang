/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.SxsbsfwomanhzsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbsfwomanhzs;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-07
 *
 */
@Service
public class SxsbsfwomanhzsService {

	@Autowired
	private SxsbsfwomanhzsDao sxsbsfwomanhzsDao;

	public List<Sxsbsfwomanhzs> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  sxsbsfwomanhzsDao.findList("from Sxsbsfwomanhzs where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return sxsbsfwomanhzsDao.findCount("from Sxsbsfwomanhzs where businessForm=?", businessForm);
	}
	
	public void insert(Sxsbsfwomanhzs allowance) {
		sxsbsfwomanhzsDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Sxsbsfwomanhzs allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			sxsbsfwomanhzsDao.delete(allowance);
		}
	}

	public Sxsbsfwomanhzs findOne(String id) {
		return sxsbsfwomanhzsDao.findOne(id);
	}
	
	public void update(Sxsbsfwomanhzs allowance, String businessFormId) {
		Sxsbsfwomanhzs findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setAllCount(allowance.getAllCount());
			findTwjrhmc.setBrand(allowance.getBrand());
			
			findTwjrhmc.setHost(allowance.getHost());
			findTwjrhmc.setIncomeOfPersonOfYear(allowance.getIncomeOfPersonOfYear());
			findTwjrhmc.setJdPerson(allowance.getJdPerson());
			findTwjrhmc.setMainFeature(allowance.getMainFeature());
			findTwjrhmc.setName(allowance.getName());
			findTwjrhmc.setWomanCount(allowance.getWomanCount());
			findTwjrhmc.setUpdateDate(new Date());
			sxsbsfwomanhzsDao.update(findTwjrhmc);
		}
	}

}
