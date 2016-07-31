/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.EducationTrainDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Educationtrain;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-07
 *
 */
@Service
public class EducationTrainService {

	@Autowired
	private EducationTrainDao educationTrainDao;

	public List<Educationtrain> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  educationTrainDao.findList("from Educationtrain where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return educationTrainDao.findCount("from Educationtrain where businessForm=?", businessForm);
	}
	
	public void insert(Educationtrain allowance) {
		educationTrainDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Educationtrain allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			educationTrainDao.delete(allowance);
		}
	}

	public Educationtrain findOne(String id) {
		return educationTrainDao.findOne(id);
	}
	
	public void update(Educationtrain allowance, String businessFormId) {
		Educationtrain findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setContent(allowance.getContent());
			findTwjrhmc.setCount(allowance.getCount());
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setResult(allowance.getResult());
			
			findTwjrhmc.setUpdateDate(new Date());
			educationTrainDao.update(findTwjrhmc);
		}
	}

}
