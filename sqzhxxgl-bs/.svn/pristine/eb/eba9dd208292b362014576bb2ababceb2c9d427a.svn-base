/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.GgwgzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Allowance;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Ggwgz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class GgwgzService {

	@Autowired
	private GgwgzDao ggwgzDao;

	public List<Ggwgz> getBeanList(BusinessForm businessForm, int pageNumber) {
		return ggwgzDao.findList("from Ggwgz where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return ggwgzDao.findCount("from Ggwgz where businessForm=?", businessForm);
	}
	
	public void insert(Ggwgz allowance) {
		ggwgzDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Ggwgz allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			ggwgzDao.delete(allowance);
		}
	}
	public Ggwgz findOne(String id) {
		return ggwgzDao.findOne(id);
	}
	public void update(Ggwgz allowance, String businessFormId) {
		Ggwgz findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setContent(allowance.getContent());
			findTwjrhmc.setOldCount(allowance.getOldCount());
			findTwjrhmc.setNewCount(allowance.getNewCount());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setUpdateDate(new Date());
			ggwgzDao.update(findTwjrhmc);
		}
	}

}
