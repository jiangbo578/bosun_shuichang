/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.ZdyfdxhmcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Zdyfdxhmc;
import com.gouhai.baoshan.entity.business.dqgz.tw.Tyqndj;
import com.gouhai.baoshan.entity.business.dqgz.tz.Mzdprs;
import com.gouhai.baoshan.service.BaseService;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun
 *
 */
@Service
public class ZdyfdxhmcService {

	@Autowired
	private ZdyfdxhmcDao zdyfdxhmcDao;

	public List<Zdyfdxhmc> getZdyfdxhmcList(BusinessForm businessForm, int pageNumber) {
		return zdyfdxhmcDao.findList("from Zdyfdxhmc where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getZdyfdxhmcCount(BusinessForm businessForm) {
		return zdyfdxhmcDao.findCount("from Zdyfdxhmc where businessForm=?", businessForm);
	}
	
	public void insert(Zdyfdxhmc zdyfdxhmc) {
		zdyfdxhmcDao.insert(zdyfdxhmc);
	}

	public void delete(String id, String businessFormId) {
		Zdyfdxhmc zdyfdxhmc = findOne(id);
		if (zdyfdxhmc.getBusinessForm().getId().equals(businessFormId)) {
			zdyfdxhmcDao.delete(zdyfdxhmc);
		}
	}

	public Zdyfdxhmc findOne(String id) {
		return zdyfdxhmcDao.findOne(id);
	}
	
	public void update(Zdyfdxhmc zdyfdxhmc, String businessFormId) {
		Zdyfdxhmc findZdyfdxhmc = findOne(zdyfdxhmc.getId());
		if (findZdyfdxhmc.getBusinessForm().getId().equals(businessFormId)) {
			findZdyfdxhmc.setXm(zdyfdxhmc.getXm());
			findZdyfdxhmc.setXb(zdyfdxhmc.getXb());
			findZdyfdxhmc.setCsny(zdyfdxhmc.getCsny());
			findZdyfdxhmc.setJtzz(zdyfdxhmc.getJtzz());
			findZdyfdxhmc.setHjdz(zdyfdxhmc.getHjdz());
			findZdyfdxhmc.setPhone(zdyfdxhmc.getPhone());
			findZdyfdxhmc.setUpdateDate(new Date());
			zdyfdxhmcDao.update(findZdyfdxhmc);
		}
	}

}
