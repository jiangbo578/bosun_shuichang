/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.WomanbsctjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanbscdj;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanbsctj;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-18
 *
 */
@Service
public class WomanbsctjService {

	@Autowired
	private WomanbsctjDao womanbsctjDao;

	public List<Womanbsctj> getBeanList(BusinessForm businessForm, int pageNumber) {
		return womanbsctjDao.findList("from Womanbsctj where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return womanbsctjDao.findCount("from Womanbsctj where businessForm=?", businessForm);
	}
	
	public void insert(Womanbsctj allowance) {
		womanbsctjDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Womanbsctj allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			womanbsctjDao.delete(allowance);
		}
	}

	public Womanbsctj findOne(String id) {
		return womanbsctjDao.findOne(id);
	}
	
	public void update(Womanbsctj allowance, String businessFormId) {
		Womanbsctj findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			
			findTwjrhmc.setAllCount(allowance.getAllCount());
			findTwjrhmc.setJcrq(allowance.getJcrq());
			findTwjrhmc.setRealCount(allowance.getRealCount());
			findTwjrhmc.setSummary(allowance.getSummary());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setUpdateDate(new Date());
			womanbsctjDao.update(findTwjrhmc);
		}
	}

}
