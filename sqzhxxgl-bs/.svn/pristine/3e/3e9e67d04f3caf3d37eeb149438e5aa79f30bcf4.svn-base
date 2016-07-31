/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.ZcdygkDao;
import com.gouhai.baoshan.entity.business.dqgz.zb.Zcdygkbt;
import com.gouhai.baoshan.entity.business.dqgz.zb.head.Zcdygk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class ZcdygkService {

	@Autowired
	private ZcdygkDao zcdygkDao;
	private final static String hql = "from Zcdygkbt where zcdygk=? order by updateDate";

	public List<Zcdygkbt> getZcdygkList(Zcdygk businessForm, int pageNumber) {
		return zcdygkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getZcdygkCount(Zcdygk businessForm) {
		return zcdygkDao.findCount(hql, businessForm);
	}

	public void insert(Zcdygkbt zcdygk) {
		zcdygkDao.insert(zcdygk);
	}

	public void delete(String id){
	
			zcdygkDao.delete(id);
		
	}

	public Zcdygkbt findOne(String id) {
		return zcdygkDao.findOne(id);
	}

	public void update(Zcdygkbt zcdygk, String zcdygkbtid) {
		Zcdygkbt findZcdygk = findOne(zcdygk.getId());
		if (findZcdygk.getZcdygk().getId().equals(zcdygkbtid)) {
			findZcdygk.setXm(zcdygk.getXm());
			findZcdygk.setXb(zcdygk.getXb());
			findZcdygk.setCsny(zcdygk.getCsny());
			findZcdygk.setIdcard(zcdygk.getIdcard());
			findZcdygk.setWhcd(zcdygk.getWhcd());
			findZcdygk.setJtzz(zcdygk.getJtzz());
			findZcdygk.setRdny(zcdygk.getRdny());
			findZcdygk.setBz(zcdygk.getBz());
			findZcdygk.setPhone(zcdygk.getPhone());
			findZcdygk.setUpdateDate(new Date());
			zcdygkDao.update(findZcdygk);
		}
	}

}
