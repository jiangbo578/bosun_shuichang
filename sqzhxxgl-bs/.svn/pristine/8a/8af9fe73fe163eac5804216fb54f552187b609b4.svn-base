/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.LxgbjbqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Lxgbjbqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-15
 *
 */
@Service
public class LxgbjbqkService {

	@Autowired
	private LxgbjbqkDao lxgbjbqkDao;

	public List<Lxgbjbqk> getBeanList(BusinessForm businessForm, int pageNumber) {
		return lxgbjbqkDao.findList("from Lxgbjbqk where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return lxgbjbqkDao.findCount("from Lxgbjbqk where businessForm=?", businessForm);
	}
	
	public void insert(Lxgbjbqk allowance) {
		lxgbjbqkDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Lxgbjbqk allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			lxgbjbqkDao.delete(allowance);
		}
	}

	public Lxgbjbqk findOne(String id) {
		return lxgbjbqkDao.findOne(id);
	}
	
	public void update(Lxgbjbqk allowance, String businessFormId) {
		Lxgbjbqk findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setXb(allowance.getXb());
			findTwjrhmc.setOldWorkName(allowance.getOldWorkName());
			
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setPhone(allowance.getPhone());
			findTwjrhmc.setKinsfolkPhone(allowance.getKinsfolkPhone());
			findTwjrhmc.setTag(allowance.getTag());
			
			findTwjrhmc.setUpdateDate(new Date());
			lxgbjbqkDao.update(findTwjrhmc);
		}
	}

}
