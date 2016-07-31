/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.XyjrjsdjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Allowance;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Xyjrjsdj;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-18
 *
 */
@Service
public class XyjrjsdjService {

	@Autowired
	private XyjrjsdjDao xyjrjsdjDao;

	public List<Xyjrjsdj> getBeanList(BusinessForm businessForm, int pageNumber) {
		return xyjrjsdjDao.findList("from Xyjrjsdj where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return xyjrjsdjDao.findCount("from Xyjrjsdj where businessForm=?", businessForm);
	}
	
	public void insert(Xyjrjsdj allowance) {
		xyjrjsdjDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Xyjrjsdj allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			xyjrjsdjDao.delete(allowance);
		}
	}

	public Xyjrjsdj findOne(String id) {
		return xyjrjsdjDao.findOne(id);
	}
	
	public void update(Xyjrjsdj allowance, String businessFormId) {
		Xyjrjsdj findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			
			
			findTwjrhmc.setFatherName(allowance.getFatherName());
			findTwjrhmc.setFatherPhone(allowance.getFatherPhone());
			findTwjrhmc.setFatherWork(allowance.getFatherWork());
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setMotherName(allowance.getMotherName());
			findTwjrhmc.setMotherPhone(allowance.getMotherPhone());
			findTwjrhmc.setMotherWork(allowance.getMotherWork());
			findTwjrhmc.setTag(allowance.getTag());
			
			findTwjrhmc.setUpdateDate(new Date());
			xyjrjsdjDao.update(findTwjrhmc);
		}
	}

}
