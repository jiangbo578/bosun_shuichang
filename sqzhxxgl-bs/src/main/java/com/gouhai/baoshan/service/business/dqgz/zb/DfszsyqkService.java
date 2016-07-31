/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.DfszsyqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dfszsyqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author Rui
 *
 */
@Service
public class DfszsyqkService {

	@Autowired
	private DfszsyqkDao dfszsyqkDao;

	public List<Dfszsyqk> getDfszsyqkList(BusinessForm businessForm, int pageNumber) {
		return dfszsyqkDao.findList("from Dfszsyqk where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getDfszsyqkCount(BusinessForm businessForm) {
		return dfszsyqkDao.findCount("from Dfszsyqk where businessForm=?", businessForm);
	}
	
	public void insert(Dfszsyqk dfszsyqk) {
		dfszsyqkDao.insert(dfszsyqk);
	}

	public void delete(String id, String businessFormId) {
		Dfszsyqk dfszsyqk = findOne(id);
		if (dfszsyqk.getBusinessForm().getId().equals(businessFormId)) {
			dfszsyqkDao.delete(dfszsyqk);
		}
	}

	public Dfszsyqk findOne(String id) {
		return dfszsyqkDao.findOne(id);
	}
	
	public void update(Dfszsyqk dfszsyqk, String businessFormId) {
		Dfszsyqk findDfszsyqk = findOne(dfszsyqk.getId());
		if (findDfszsyqk.getBusinessForm().getId().equals(businessFormId)) {
			/*
			 * 更新字段值      @author sun  2014-08-12
			 */
			findDfszsyqk.setJndf(dfszsyqk.getJndf());
			findDfszsyqk.setKydflj(dfszsyqk.getKydflj());
			findDfszsyqk.setSrdffh(dfszsyqk.getSrdffh());
			findDfszsyqk.setSrjz(dfszsyqk.getSrjz());
			findDfszsyqk.setSrsjxb(dfszsyqk.getSrsjxb());
			findDfszsyqk.setZcdffh(dfszsyqk.getZcdffh());
			findDfszsyqk.setZcjz(dfszsyqk.getZcjz());
			findDfszsyqk.setZcsjxb(dfszsyqk.getZcsjxb());
			
			findDfszsyqk.setUpdateDate(new Date());
			dfszsyqkDao.update(findDfszsyqk);
		}
	}

}
