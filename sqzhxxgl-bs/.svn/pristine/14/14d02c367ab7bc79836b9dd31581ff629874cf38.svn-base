/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.AidingWorkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingwork;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanrepresent;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class AidingWorkService {

	@Autowired
	private AidingWorkDao aidingWorkDao;

	public List<Aidingwork> getBeanList(BusinessForm businessForm, int pageNumber) {
		return aidingWorkDao.findList("from Aidingwork where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return aidingWorkDao.findCount("from Aidingwork where businessForm=?", businessForm);
	}
	
	public void insert(Aidingwork allowance) {
		aidingWorkDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Aidingwork allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			aidingWorkDao.delete(allowance);
		}
	}

	public Aidingwork findOne(String id) {
		return aidingWorkDao.findOne(id);
	}
	
	public void update(Aidingwork allowance, String businessFormId) {
		Aidingwork findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			findTwjrhmc.setAge(allowance.getAge());
			findTwjrhmc.setDuty(allowance.getDuty());
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setWhcd(allowance.getWhcd());
			findTwjrhmc.setZzmm(allowance.getZzmm());
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setPhone(allowance.getPhone());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setUpdateDate(new Date());
			aidingWorkDao.update(findTwjrhmc);
		}
	}

}
