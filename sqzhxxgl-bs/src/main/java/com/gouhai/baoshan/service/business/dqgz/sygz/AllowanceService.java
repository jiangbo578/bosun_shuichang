/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.AllowanceDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Allowance;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Allowance;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class AllowanceService {

	@Autowired
	private AllowanceDao allowanceDao;

	public List<Allowance> getBeanList(BusinessForm businessForm, int pageNumber) {
		return allowanceDao.findList("from Allowance where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return allowanceDao.findCount("from Allowance where businessForm=?", businessForm);
	}
	
	public void insert(Allowance allowance) {
		allowance.setAllowanceTime(new Date());
		allowanceDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Allowance allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			allowanceDao.delete(allowance);
		}
	}

	public Allowance findOne(String id) {
		return allowanceDao.findOne(id);
	}
	
	public void update(Allowance allowance, String businessFormId) {
		Allowance findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			
			findTwjrhmc.setMoney(allowance.getMoney());
			findTwjrhmc.setReason(allowance.getReason());
			findTwjrhmc.setUpdateDate(new Date());
			allowanceDao.update(findTwjrhmc);
		}
	}

}
