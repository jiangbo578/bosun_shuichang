/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.LxgbjbdrggqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Lxgbjbdrggqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class LxgbjbdrggqkService {

	@Autowired
	private LxgbjbdrggqkDao lxgbjbdrggqkDao;

	public List<Lxgbjbdrggqk> getBeanList(BusinessForm businessForm, int pageNumber) {
		return lxgbjbdrggqkDao.findList("from Lxgbjbdrggqk where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return lxgbjbdrggqkDao.findCount("from Lxgbjbdrggqk where businessForm=?", businessForm);
	}
	
	public void insert(Lxgbjbdrggqk allowance) {
		lxgbjbdrggqkDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Lxgbjbdrggqk allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			lxgbjbdrggqkDao.delete(allowance);
		}
	}

	public Lxgbjbdrggqk findOne(String id) {
		return lxgbjbdrggqkDao.findOne(id);
	}
	public void update(Lxgbjbdrggqk allowance, String businessFormId) {
		Lxgbjbdrggqk findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			findTwjrhmc.setOldWorkName(allowance.getOldWorkName());
			findTwjrhmc.setTc(allowance.getTc());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setUpdateDate(new Date());
			lxgbjbdrggqkDao.update(findTwjrhmc);
		}
	}

}
