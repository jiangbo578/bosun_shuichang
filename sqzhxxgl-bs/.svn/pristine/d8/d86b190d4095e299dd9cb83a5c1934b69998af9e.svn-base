/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tw;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tw.TzbgkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tw.tzbgk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author cgw
 *
 */
@Service
public class TzbgkService {

	@Autowired
	private TzbgkDao tzbgkDao;

	public List<tzbgk> getTqjrsList(BusinessForm businessForm, int pageNumber) {
		return tzbgkDao.findList("from tzbgk where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getTqjrsCount(BusinessForm businessForm) {
		return tzbgkDao.findCount("from tzbgk where businessForm=?", businessForm);
	}
	
	public void insert(tzbgk tqjrs) {
		tzbgkDao.insert(tqjrs);
	}

	public void delete(String id, String businessFormId) {
		tzbgk tqjrs = findOne(id);
		if (tqjrs.getBusinessForm().getId().equals(businessFormId)) {
			tzbgkDao.delete(tqjrs);
		}
	}

	public tzbgk findOne(String id) {
		return tzbgkDao.findOne(id);
	}
	
	public void update(tzbgk tzbgk, String businessFormId) {
		tzbgk findTzbgk = findOne(tzbgk.getId());
		if (findTzbgk.getBusinessForm().getId().equals(businessFormId)) {
			findTzbgk.setXm(tzbgk.getXm());
			findTzbgk.setXb(tzbgk.getXb());
			findTzbgk.setCsny(tzbgk.getCsny());
			findTzbgk.setJtzz(tzbgk.getJtzz());
			findTzbgk.setMz(tzbgk.getMz());
			findTzbgk.setZzmm(tzbgk.getZzmm());
			findTzbgk.setTnzw(tzbgk.getTnzw());
			findTzbgk.setGzdw(tzbgk.getGzdw());
			findTzbgk.setUpdateDate(new Date());
			tzbgkDao.update(findTzbgk);
		}
	}

}
