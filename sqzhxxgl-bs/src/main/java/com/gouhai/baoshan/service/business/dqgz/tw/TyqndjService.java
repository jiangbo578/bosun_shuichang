/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tw;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tw.TyqndjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tw.Tyqndj;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author cgw
 *
 */
@Service
public class TyqndjService {

	@Autowired
	private TyqndjDao tyqndjDao;

	public List<Tyqndj> getTyqndjList(BusinessForm businessForm, int pageNumber) {
		return tyqndjDao.findList("from Tyqndj where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getTyqndjCount(BusinessForm businessForm) {
		return tyqndjDao.findCount("from Tyqndj where businessForm=?", businessForm);
	}
	
	public void insert(Tyqndj tyqndj) {
		tyqndjDao.insert(tyqndj);
	}

	public void delete(String id, String businessFormId) {
		Tyqndj tyqndj = findOne(id);
		if (tyqndj.getBusinessForm().getId().equals(businessFormId)) {
			tyqndjDao.delete(tyqndj);
		}
	}

	public Tyqndj findOne(String id) {
		return tyqndjDao.findOne(id);
	}
	
	public void update(Tyqndj tyqndj, String businessFormId) {
		Tyqndj findTyqndj = findOne(tyqndj.getId());
		if (findTyqndj.getBusinessForm().getId().equals(businessFormId)) {
			findTyqndj.setXm(tyqndj.getXm());
			findTyqndj.setXb(tyqndj.getXb());
			findTyqndj.setCsny(tyqndj.getCsny());
			findTyqndj.setJtzz(tyqndj.getJtzz());
			findTyqndj.setMz(tyqndj.getMz());
			findTyqndj.setNote(tyqndj.getNote());
			findTyqndj.setPhone(tyqndj.getPhone());
			findTyqndj.setWhcd(tyqndj.getWhcd());
			findTyqndj.setUpdateDate(new Date());
			tyqndjDao.update(findTyqndj);
		}
	}

}
