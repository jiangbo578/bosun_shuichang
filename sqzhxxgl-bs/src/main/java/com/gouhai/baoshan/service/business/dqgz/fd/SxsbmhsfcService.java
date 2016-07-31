/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.SxsbmhsfcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbmhsfc;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteeractivity;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-18
 *
 */
@Service
public class SxsbmhsfcService { 

	@Autowired
	private SxsbmhsfcDao sxsbmhsfcDao;

	public List<Sxsbmhsfc> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  sxsbmhsfcDao.findList("from Sxsbmhsfc where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return sxsbmhsfcDao.findCount("from Sxsbmhsfc where businessForm=?", businessForm);
	}
	
	public void insert(Sxsbmhsfc allowance) {
		sxsbmhsfcDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Sxsbmhsfc allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			sxsbmhsfcDao.delete(allowance);
		}
	}

	public Sxsbmhsfc findOne(String id) {
		return sxsbmhsfcDao.findOne(id);
	}
	
	public void update(Sxsbmhsfc allowance, String businessFormId) {
		Sxsbmhsfc findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			
			findTwjrhmc.setCrownedTime(allowance.getCrownedTime());
			findTwjrhmc.setLevel(allowance.getLevel());
			findTwjrhmc.setMainFeature(allowance.getMainFeature());
			findTwjrhmc.setName(allowance.getName());
			findTwjrhmc.setUpdateDate(new Date());
			sxsbmhsfcDao.update(findTwjrhmc);
		}
	}

}
