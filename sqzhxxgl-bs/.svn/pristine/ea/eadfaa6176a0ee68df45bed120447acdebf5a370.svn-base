/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.SxsbsfbaseDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbsfbase;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteeractivity;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-07
 *
 */
@Service
public class SxsbsfbaseService {

	@Autowired
	private SxsbsfbaseDao sxsbsfbaseDao;

	public List<Sxsbsfbase> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  sxsbsfbaseDao.findList("from Sxsbsfbase where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return sxsbsfbaseDao.findCount("from Sxsbsfbase where businessForm=?", businessForm);
	}
	
	public void insert(Sxsbsfbase allowance) {
		sxsbsfbaseDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Sxsbsfbase allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			sxsbsfbaseDao.delete(allowance);
		}
	}

	public Sxsbsfbase findOne(String id) {
		return sxsbsfbaseDao.findOne(id);
	}
	
	public void update(Sxsbsfbase allowance, String businessFormId) {
		Sxsbsfbase findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			
			findTwjrhmc.setBaseCount(allowance.getBaseCount());
			findTwjrhmc.setCreateTime(allowance.getCreateTime());
			findTwjrhmc.setCrownedTime(allowance.getCrownedTime());
			findTwjrhmc.setHost(allowance.getHost());
			findTwjrhmc.setLevel(allowance.getLevel());
			findTwjrhmc.setMainFeature(allowance.getMainFeature());
			findTwjrhmc.setName(allowance.getName());
			findTwjrhmc.setScale(allowance.getScale());
			findTwjrhmc.setWomanjyCount(allowance.getWomanjyCount());
			findTwjrhmc.setUpdateDate(new Date());
			sxsbsfbaseDao.update(findTwjrhmc);
		}
	}

}
