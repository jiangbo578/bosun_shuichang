/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.BusinessRemindDao;
import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.business.BusinessRemind;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class BusinessRemindService {

	@Autowired
	private BusinessRemindDao businessRemindDao;

	public void insert(BusinessRemind businessRemind) {
		businessRemindDao.insert(businessRemind);
	}

	public void delete(String id, String businessId) {
		BusinessRemind businessRemind = businessRemindDao.findOne(id);
		if (businessRemind.getBusiness().getId().equals(businessId)) {
			businessRemindDao.delete(businessRemind);
		}
	}

	public List<BusinessRemind> getBusinessRemindList(Business business, int pageNumber) {
		return businessRemindDao.findList("from BusinessRemind where business=? order by remindDate", pageNumber, PageableController.PAGE_SIZE, business);
	}
	
	public long getBusinessRemindCount(Business business) {
		return businessRemindDao.findCount("from BusinessRemind where business=?", business);
	}
}
