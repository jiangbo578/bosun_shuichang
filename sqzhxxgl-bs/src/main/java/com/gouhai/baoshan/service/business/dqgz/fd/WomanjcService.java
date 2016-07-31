/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.WomanjcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanjc;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanrepresent;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class WomanjcService {

	@Autowired
	private WomanjcDao womanjcDao;

	public List<Womanjc> getBeanList(BusinessForm businessForm, int pageNumber) {
		return womanjcDao.findList("from Womanjc where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return womanjcDao.findCount("from Womanjc where businessForm=?", businessForm);
	}
	
	public void insert(Womanjc allowance) {
		womanjcDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Womanjc allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			womanjcDao.delete(allowance);
		}
	}

	public Womanjc findOne(String id) {
		return womanjcDao.findOne(id);
	}
	
	public void update(Womanjc allowance, String businessFormId) {
		Womanjc findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			findTwjrhmc.setAge(allowance.getAge());
			findTwjrhmc.setWorkName(allowance.getWorkName());
			
			findTwjrhmc.setMonthIncome(allowance.getMonthIncome());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setDuty(allowance.getDuty());
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setWhcd(allowance.getWhcd());
			findTwjrhmc.setZzmm(allowance.getZzmm());
			findTwjrhmc.setRzsj(allowance.getRzsj());
			findTwjrhmc.setJzqk(allowance.getJzqk());
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setPhone(allowance.getPhone());
			findTwjrhmc.setUpdateDate(new Date());
			womanjcDao.update(findTwjrhmc);
		}
	}

}
