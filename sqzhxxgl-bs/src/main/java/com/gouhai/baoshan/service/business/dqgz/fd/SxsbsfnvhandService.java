/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.SxsbsfnvhandDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbsfnvhand;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteeractivity;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-07
 *
 */
@Service
public class SxsbsfnvhandService {

	@Autowired
	private SxsbsfnvhandDao sxsbsfnvhandDao;

	public List<Sxsbsfnvhand> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  sxsbsfnvhandDao.findList("from Sxsbsfnvhand where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return sxsbsfnvhandDao.findCount("from Sxsbsfnvhand where businessForm=?", businessForm);
	}
	
	public void insert(Sxsbsfnvhand allowance) {
		sxsbsfnvhandDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Sxsbsfnvhand allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			sxsbsfnvhandDao.delete(allowance);
		}
	}

	public Sxsbsfnvhand findOne(String id) {
		return sxsbsfnvhandDao.findOne(id);
	}
	
	public void update(Sxsbsfnvhand allowance, String businessFormId) {
		Sxsbsfnvhand findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			
			findTwjrhmc.setBirthday(allowance.getBirthday());
			findTwjrhmc.setGrowFeature(allowance.getGrowFeature());
			findTwjrhmc.setName(allowance.getName());
			findTwjrhmc.setPhone(allowance.getPhone());
			findTwjrhmc.setWhcd(allowance.getWhcd());
			findTwjrhmc.setZzmm(allowance.getZzmm());
			findTwjrhmc.setUpdateDate(new Date());
			sxsbsfnvhandDao.update(findTwjrhmc);
		}
	}

}
