/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.ZzdygkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Zzdygk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
@Service
public class ZzdygkService {

	@Autowired
	private ZzdygkDao zzdygkDao;

	public List<Zzdygk> getZcdygkList(BusinessForm businessForm, int pageNumber) {
		return zzdygkDao.findList("from Zzdygk where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getZcdygkCount(BusinessForm businessForm) {
		return zzdygkDao.findCount("from Zzdygk where businessForm=?", businessForm);
	}
	
	public void insert(Zzdygk zcdygk) {
		zzdygkDao.insert(zcdygk);
	}

	public void delete(String id, String businessFormId) {
		Zzdygk zcdygk = findOne(id);
		if (zcdygk.getBusinessForm().getId().equals(businessFormId)) {
			zzdygkDao.delete(zcdygk);
		}
	}

	public Zzdygk findOne(String id) {
		return zzdygkDao.findOne(id);
	}
	
	public void update(Zzdygk zcdygk, String businessFormId) {
		Zzdygk findZcdygk = findOne(zcdygk.getId());
		if (findZcdygk.getBusinessForm().getId().equals(businessFormId)) {
			findZcdygk.setXm(zcdygk.getXm());
			findZcdygk.setXb(zcdygk.getXb());
			findZcdygk.setCsny(zcdygk.getCsny());
			findZcdygk.setIdcard(zcdygk.getIdcard());
			findZcdygk.setWhcd(zcdygk.getWhcd());
			findZcdygk.setJtzz(zcdygk.getJtzz());
			findZcdygk.setRdny(zcdygk.getRdny());
			findZcdygk.setTc(zcdygk.getTc());
			findZcdygk.setType(zcdygk.getType());
			findZcdygk.setPhone(zcdygk.getPhone());
			findZcdygk.setRegister(zcdygk.getRegister());
			findZcdygk.setWorkUnit(zcdygk.getWorkUnit());
			findZcdygk.setUpdateDate(new Date());
			zzdygkDao.update(findZcdygk);
		}
	}

}
