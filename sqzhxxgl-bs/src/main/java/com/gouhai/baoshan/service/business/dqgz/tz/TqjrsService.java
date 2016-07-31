/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tz.TqjrsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tz.Tqjrs;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author Rui
 *
 */
@Service
public class TqjrsService {

	@Autowired
	private TqjrsDao tqjrsDao;

	public List<Tqjrs> getTqjrsList(BusinessForm businessForm, int pageNumber) {
		return tqjrsDao.findList("from Tqjrs where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getTqjrsCount(BusinessForm businessForm) {
		return tqjrsDao.findCount("from Tqjrs where businessForm=?", businessForm);
	}
	
	public void insert(Tqjrs tqjrs) {
		tqjrsDao.insert(tqjrs);
	}

	public void delete(String id, String businessFormId) {
		Tqjrs tqjrs = findOne(id);
		if (tqjrs.getBusinessForm().getId().equals(businessFormId)) {
			tqjrsDao.delete(tqjrs);
		}
	}

	public Tqjrs findOne(String id) {
		return tqjrsDao.findOne(id);
	}
	
	public void update(Tqjrs xqtqjrs, String businessFormId) {
		Tqjrs findTqjrs = findOne(xqtqjrs.getId());
		if (findTqjrs.getBusinessForm().getId().equals(businessFormId)) {
			findTqjrs.setXm(xqtqjrs.getXm());
			findTqjrs.setXb(xqtqjrs.getXb());
			findTqjrs.setCsny(xqtqjrs.getCsny());
			findTqjrs.setIdcard(xqtqjrs.getIdcard());
			findTqjrs.setWhcd(xqtqjrs.getWhcd());
			findTqjrs.setJtzz(xqtqjrs.getJtzz());
			findTqjrs.setMz(xqtqjrs.getMz());
			findTqjrs.setSf(xqtqjrs.getSf());
			findTqjrs.setGzdw(xqtqjrs.getGzdw());
			findTqjrs.setPhone(xqtqjrs.getPhone());
			findTqjrs.setRelationName(xqtqjrs.getRelationName());
			findTqjrs.setQinqi(xqtqjrs.getQinqi());
			findTqjrs.setType(xqtqjrs.getType());
			findTqjrs.setUpdateDate(new Date());
			tqjrsDao.update(findTqjrs);
		}
	}

}
