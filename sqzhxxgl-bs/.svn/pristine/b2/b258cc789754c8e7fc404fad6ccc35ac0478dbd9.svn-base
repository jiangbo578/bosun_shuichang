/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.SxsbssproDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbsspro;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteeractivity;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-07
 *
 */
@Service
public class SxsbssproService {

	@Autowired
	private SxsbssproDao sxsbssproDao;

	public List<Sxsbsspro> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  sxsbssproDao.findList("from Sxsbsspro where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return sxsbssproDao.findCount("from Sxsbsspro where businessForm=?", businessForm);
	}
	
	public void insert(Sxsbsspro allowance) {
		sxsbssproDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Sxsbsspro allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			sxsbssproDao.delete(allowance);
		}
	}

	public Sxsbsspro findOne(String id) {
		return sxsbssproDao.findOne(id);
	}
	
	public void update(Sxsbsspro allowance, String businessFormId) {
		Sxsbsspro findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			
			findTwjrhmc.setCrownedTime(allowance.getCrownedTime());
			findTwjrhmc.setHost(allowance.getHost());
			findTwjrhmc.setIncomeOfPerson(allowance.getIncomeOfPerson());
			findTwjrhmc.setLevel(allowance.getLevel());
			findTwjrhmc.setMainFeature(allowance.getMainFeature());
			findTwjrhmc.setName(allowance.getName());
			findTwjrhmc.setWomanjyCount(allowance.getWomanjyCount());
			findTwjrhmc.setUpdateDate(new Date());
			sxsbssproDao.update(findTwjrhmc);
		}
	}

}
