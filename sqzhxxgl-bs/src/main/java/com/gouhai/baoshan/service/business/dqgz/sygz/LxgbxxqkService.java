/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.LxgbxxqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Lxgbxxqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-15
 *
 */
@Service
public class LxgbxxqkService {

	@Autowired
	private LxgbxxqkDao lxgbxxqkDao;

	public List<Lxgbxxqk> getBeanList(BusinessForm businessForm, int pageNumber) {
		return lxgbxxqkDao.findList("from Lxgbxxqk where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return lxgbxxqkDao.findCount("from Lxgbxxqk where businessForm=?", businessForm);
	}
	
	public void insert(Lxgbxxqk allowance) {
		lxgbxxqkDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Lxgbxxqk allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			lxgbxxqkDao.delete(allowance);
		}
	}

	public Lxgbxxqk findOne(String id) {
		return lxgbxxqkDao.findOne(id);
	}
	
	public void update(Lxgbxxqk allowance, String businessFormId) {
		Lxgbxxqk findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setContent(allowance.getContent());
			
			findTwjrhmc.setCount(allowance.getCount());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setUpdateDate(new Date());
			lxgbxxqkDao.update(findTwjrhmc);
		}
	}

}
