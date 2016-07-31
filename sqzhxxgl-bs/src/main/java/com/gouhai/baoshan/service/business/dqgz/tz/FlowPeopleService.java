/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tz.FlowPeopleDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tz.Flowpeople;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-06
 * 
 */
@Service
public class FlowPeopleService {

	@Autowired
	private FlowPeopleDao flowPeopleDao;

	public List<Flowpeople> getBeanList(BusinessForm businessForm,
			int pageNumber) {
		return flowPeopleDao.findList(
				"from Flowpeople where businessForm=? order by updateDate",
				pageNumber, PageableController.PAGE_SIZE, businessForm);
	}

	public long getBeanCount(BusinessForm businessForm) {
		return flowPeopleDao.findCount("from Flowpeople where businessForm=?",
				businessForm);
	}

	public void insert(Flowpeople xqAbroadStudent) {
		flowPeopleDao.insert(xqAbroadStudent);
	}

	public void delete(String id, String businessFormId) {
		Flowpeople allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			flowPeopleDao.delete(allowance);
		}
	}

	public Flowpeople findOne(String id) {
		return flowPeopleDao.findOne(id);
	}

	public void update(Flowpeople allowance, String businessFormId) {
		Flowpeople findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());

			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setMz(allowance.getMz());

			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setPhone(allowance.getPhone());

			findTwjrhmc.setIsMarry(allowance.getIsMarry());
			findTwjrhmc.setTag(allowance.getTag());

			findTwjrhmc.setUpdateDate(new Date());
			flowPeopleDao.update(findTwjrhmc);
		}
	}

}
