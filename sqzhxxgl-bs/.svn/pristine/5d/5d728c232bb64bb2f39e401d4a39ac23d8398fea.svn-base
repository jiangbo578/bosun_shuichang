/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.shzz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.shzz.WarningnetworkerDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanrepresent;
import com.gouhai.baoshan.entity.business.dqgz.shzz.Warningnetworker;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class WarningnetworkerService {

	@Autowired
	private WarningnetworkerDao warningnetworkerDao;

	public List<Warningnetworker> getBeanList(BusinessForm businessForm, int pageNumber) {
		return warningnetworkerDao.findList("from Warningnetworker where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return warningnetworkerDao.findCount("from Warningnetworker where businessForm=?", businessForm);
	}
	
	public void insert(Warningnetworker allowance) {
		warningnetworkerDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Warningnetworker allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			warningnetworkerDao.delete(allowance);
		}
	}

	public Warningnetworker findOne(String id) {
		return warningnetworkerDao.findOne(id);
	}
	
	public void update(Warningnetworker allowance, String businessFormId) {
		Warningnetworker findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setMz(allowance.getMz());
			findTwjrhmc.setIdcard(allowance.getIdcard());
			findTwjrhmc.setWorkUnit(allowance.getWorkUnit());
			findTwjrhmc.setMobile(allowance.getMobile());
			findTwjrhmc.setEmail(allowance.getEmail());
			findTwjrhmc.setCunwei(allowance.getCunwei());
			findTwjrhmc.setWhcd(allowance.getWhcd());
			findTwjrhmc.setZzmm(allowance.getZzmm());
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setPhone(allowance.getPhone());
			findTwjrhmc.setUpdateDate(new Date());
			warningnetworkerDao.update(findTwjrhmc);
		}
	}

}
