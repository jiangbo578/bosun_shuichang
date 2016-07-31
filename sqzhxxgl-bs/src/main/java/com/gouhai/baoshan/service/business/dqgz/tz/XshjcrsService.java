/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.tz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.tz.XshjcrsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.tz.Xshjcrs;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author Rui
 *
 */
@Service
public class XshjcrsService {

	@Autowired
	private XshjcrsDao xshjcrsDao;

	public List<Xshjcrs> getXshjcrsList(BusinessForm businessForm, int pageNumber) {
		return xshjcrsDao.findList("from Xshjcrs where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getXshjcrsCount(BusinessForm businessForm) {
		return xshjcrsDao.findCount("from Xshjcrs where businessForm=?", businessForm);
	}
	
	public void insert(Xshjcrs xshjcrs) {
		xshjcrsDao.insert(xshjcrs);
	}

	public void delete(String id, String businessFormId) {
		Xshjcrs xshjcrs = findOne(id);
		if (xshjcrs.getBusinessForm().getId().equals(businessFormId)) {
			xshjcrsDao.delete(xshjcrs);
		}
	}

	public Xshjcrs findOne(String id) {
		return xshjcrsDao.findOne(id);
	}
	
	public void update(Xshjcrs xshjcrs, String businessFormId) {
		Xshjcrs findXshjcrs = findOne(xshjcrs.getId());
		if (findXshjcrs.getBusinessForm().getId().equals(businessFormId)) {
			findXshjcrs.setXm(xshjcrs.getXm());
			findXshjcrs.setXb(xshjcrs.getXb());
			findXshjcrs.setCsny(xshjcrs.getCsny());
			findXshjcrs.setIdcard(xshjcrs.getIdcard());
			findXshjcrs.setWhcd(xshjcrs.getWhcd());
			findXshjcrs.setJtzz(xshjcrs.getJtzz());
			findXshjcrs.setMz(xshjcrs.getMz());
			findXshjcrs.setRydw(xshjcrs.getRydw());
			findXshjcrs.setZwzc(xshjcrs.getZwzc());
			findXshjcrs.setGzdw(xshjcrs.getGzdw());
			findXshjcrs.setPhone(xshjcrs.getPhone());
			findXshjcrs.setUpdateDate(new Date());
			xshjcrsDao.update(findXshjcrs);
		}
	}

}
