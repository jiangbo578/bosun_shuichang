/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.JdbhlxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Jdbhlx;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class JdbhlxService {

	@Autowired
	private JdbhlxDao jdbhlxDao;

	public List<Jdbhlx> getBeanList(BusinessForm businessForm, int pageNumber) {
		return jdbhlxDao.findList("from Jdbhlx where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return jdbhlxDao.findCount("from Jdbhlx where businessForm=?", businessForm);
	}
	
	public void insert(Jdbhlx jdbhlx) {
		jdbhlxDao.insert(jdbhlx);
	}

	public void delete(String id, String businessFormId) {
		Jdbhlx jdbhlx = findOne(id);
		if (jdbhlx.getBusinessForm().getId().equals(businessFormId)) {
			jdbhlxDao.delete(jdbhlx);
		}
	}

	public Jdbhlx findOne(String id) {
		return jdbhlxDao.findOne(id);
	}
	
	public void update(Jdbhlx jdbhlx, String businessFormId) {
		Jdbhlx findTwjrhmc = findOne(jdbhlx.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(jdbhlx.getXm());
			findTwjrhmc.setXb(jdbhlx.getXb());
			findTwjrhmc.setContact(jdbhlx.getContact());
			findTwjrhmc.setDuty(jdbhlx.getDuty());
			findTwjrhmc.setContent(jdbhlx.getContent());
			findTwjrhmc.setPhone(jdbhlx.getPhone());
			findTwjrhmc.setUpdateDate(new Date());
			jdbhlxDao.update(findTwjrhmc);
		}
	}

}
