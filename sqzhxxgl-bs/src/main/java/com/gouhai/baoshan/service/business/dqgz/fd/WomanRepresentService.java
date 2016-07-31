/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.WomanRepresentDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Fudaiwy;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanrepresent;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class WomanRepresentService {

	@Autowired
	private WomanRepresentDao womanRepresentDao;

	public List<Womanrepresent> getBeanList(BusinessForm businessForm, int pageNumber) {
		return womanRepresentDao.findList("from Womanrepresent where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return womanRepresentDao.findCount("from Womanrepresent where businessForm=?", businessForm);
	}
	
	public void insert(Womanrepresent allowance) {
		womanRepresentDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Womanrepresent allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			womanRepresentDao.delete(allowance);
		}
	}

	public Womanrepresent findOne(String id) {
		return womanRepresentDao.findOne(id);
	}
	
	public void update(Womanrepresent allowance, String businessFormId) {
		Womanrepresent findTwjrhmc = findOne(allowance.getId());
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
			findTwjrhmc.setMz(allowance.getMz());
			womanRepresentDao.update(findTwjrhmc);
		}
	}

}
