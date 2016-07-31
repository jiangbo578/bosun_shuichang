/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.GzldxzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Gzldxz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
@Service
public class GzldxzService {

	@Autowired
	private GzldxzDao gzldxzDao;

	public List<Gzldxz> getGzldxzList(BusinessForm businessForm, int pageNumber) {
		return gzldxzDao.findList("from Gzldxz where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getGzldxzCount(BusinessForm businessForm) {
		return gzldxzDao.findCount("from Gzldxz where businessForm=?", businessForm);
	}
	
	public void insert(Gzldxz gzldxz) {
		gzldxzDao.insert(gzldxz);
	}

	public void delete(String id, String businessFormId) {
		Gzldxz gzldxz = findOne(id);
		if (gzldxz.getBusinessForm().getId().equals(businessFormId)) {
			gzldxzDao.delete(gzldxz);
		}
	}

	public Gzldxz findOne(String id) {
		return gzldxzDao.findOne(id);
	}
	
	public void update(Gzldxz gzldxz, String businessFormId) {
		Gzldxz findGzldxz = findOne(gzldxz.getId());
		if (findGzldxz.getBusinessForm().getId().equals(businessFormId)) {
			findGzldxz.setXm(gzldxz.getXm());
			findGzldxz.setXb(gzldxz.getXb());
			findGzldxz.setCsny(gzldxz.getCsny());
			findGzldxz.setZzmm(gzldxz.getZzmm());
			findGzldxz.setDz(gzldxz.getDz());
			findGzldxz.setDrzw(gzldxz.getDrzw());
			findGzldxz.setFgzz(gzldxz.getFgzz());
			findGzldxz.setBz(gzldxz.getBz());
			findGzldxz.setUpdateDate(new Date());
			gzldxzDao.update(findGzldxz);
		}
	}

}
