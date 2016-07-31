/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.FuDaiWYDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Fudaiwy;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Allowance;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class FuDaiWYService {

	@Autowired
	private FuDaiWYDao fuDaiWYDao;

	public List<Fudaiwy> getBeanList(BusinessForm businessForm, int pageNumber) {
		return fuDaiWYDao.findList("from Fudaiwy where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return fuDaiWYDao.findCount("from Fudaiwy where businessForm=?", businessForm);
	}
	
	public void insert(Fudaiwy allowance) {
		fuDaiWYDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Fudaiwy allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			fuDaiWYDao.delete(allowance);
		}
	}

	public Fudaiwy findOne(String id) {
		return fuDaiWYDao.findOne(id);
	}
	
	public void update(Fudaiwy allowance, String businessFormId) {
		Fudaiwy findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			
			findTwjrhmc.setDuty(allowance.getDuty());
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setWhcd(allowance.getWhcd());
			findTwjrhmc.setZzmm(allowance.getZzmm());
			findTwjrhmc.setRzsj(allowance.getRzsj());
			findTwjrhmc.setJzqk(allowance.getJzqk());
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setPhone(allowance.getPhone());
			findTwjrhmc.setUpdateDate(new Date());
			fuDaiWYDao.update(findTwjrhmc);
		}
	}

}
