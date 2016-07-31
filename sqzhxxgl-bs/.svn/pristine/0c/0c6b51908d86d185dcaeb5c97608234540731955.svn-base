/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tz.AbroadStudentDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tz.Abroadstudent;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class AbroadStudentService {

	@Autowired
	private AbroadStudentDao abroadStudentDao;

	public List<Abroadstudent> getBeanList(BusinessForm businessForm, int pageNumber) {
		return abroadStudentDao.findList("from Abroadstudent where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return abroadStudentDao.findCount("from Abroadstudent where businessForm=?", businessForm);
	}
	
	public void insert(Abroadstudent xqAbroadStudent) {
		abroadStudentDao.insert(xqAbroadStudent);
	}

	public void delete(String id, String businessFormId) {
		Abroadstudent allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			abroadStudentDao.delete(allowance);
		}
	}

	public Abroadstudent findOne(String id) {
		return abroadStudentDao.findOne(id);
	}
	
	public void update(Abroadstudent allowance, String businessFormId) {
		Abroadstudent findTwjrhmc = findOne(allowance.getId());
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
			abroadStudentDao.update(findTwjrhmc);
		}
	}

}
