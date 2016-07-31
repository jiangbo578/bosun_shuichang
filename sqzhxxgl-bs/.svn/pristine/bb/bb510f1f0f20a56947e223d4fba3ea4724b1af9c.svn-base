/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.WmjiansheDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Educationtrain;
import com.gouhai.baoshan.entity.business.dqgz.fd.Wmjianshe;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-07
 *
 */
@Service
public class WmjiansheService {

	@Autowired
	private WmjiansheDao wmjiansheDao;

	public List<Wmjianshe> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  wmjiansheDao.findList("from Wmjianshe where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return wmjiansheDao.findCount("from Wmjianshe where businessForm=?", businessForm);
	}
	
	public void insert(Wmjianshe allowance) {
		wmjiansheDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Wmjianshe allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			wmjiansheDao.delete(allowance);
		}
	}

	public Wmjianshe findOne(String id) {
		return wmjiansheDao.findOne(id);
	}
	
	public void update(Wmjianshe allowance, String businessFormId) {
		Wmjianshe findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setContent(allowance.getContent());
			findTwjrhmc.setCount(allowance.getCount());
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setResult(allowance.getResult());
			findTwjrhmc.setUpdateDate(new Date());
			wmjiansheDao.update(findTwjrhmc);
		}
	}

}
