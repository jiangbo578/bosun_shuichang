/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.VolunteerActivityDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteeractivity;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-07
 *
 */
@Service
public class VolunteerActivityService {

	@Autowired
	private VolunteerActivityDao volunteerActivityDao;

	public List<Volunteeractivity> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  volunteerActivityDao.findList("from Volunteeractivity where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return volunteerActivityDao.findCount("from Volunteeractivity where businessForm=?", businessForm);
	}
	
	public void insert(Volunteeractivity allowance) {
		volunteerActivityDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Volunteeractivity allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			volunteerActivityDao.delete(allowance);
		}
	}

	public Volunteeractivity findOne(String id) {
		return volunteerActivityDao.findOne(id);
	}
	
	public void update(Volunteeractivity allowance, String businessFormId) {
		Volunteeractivity findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setContent(allowance.getContent());
			findTwjrhmc.setCount(allowance.getCount());
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setResult(allowance.getResult());
			findTwjrhmc.setUpdateDate(new Date());
			volunteerActivityDao.update(findTwjrhmc);
		}
	}

}
