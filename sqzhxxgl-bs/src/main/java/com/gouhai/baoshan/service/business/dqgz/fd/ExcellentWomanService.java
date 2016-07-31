/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.ExcellentWomanDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Excellentwoman;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteerteam;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class ExcellentWomanService {

	@Autowired
	private ExcellentWomanDao excellentWomanDao;

	public List<Excellentwoman> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  excellentWomanDao.findList("from Excellentwoman where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return excellentWomanDao.findCount("from Excellentwoman where businessForm=?", businessForm);
	}
	
	public void insert(Excellentwoman allowance) {
		excellentWomanDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Excellentwoman allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			excellentWomanDao.delete(allowance);
		}
	}

	public Excellentwoman findOne(String id) {
		return excellentWomanDao.findOne(id);
	}
	
	public void update(Excellentwoman allowance, String businessFormId) {
		Excellentwoman findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setReward(allowance.getReward());
			findTwjrhmc.setMz(allowance.getMz());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setPhone(allowance.getPhone());
			findTwjrhmc.setXb(allowance.getXb());
			findTwjrhmc.setUpdateDate(new Date());
			excellentWomanDao.update(findTwjrhmc);
		}
	}

}
