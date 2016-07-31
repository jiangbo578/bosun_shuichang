/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.VolunteerteamDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteerteam;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class VolunteerteamService {

	@Autowired
	private VolunteerteamDao volunteerteamDao;

	public List<Volunteerteam> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  volunteerteamDao.findList("from Volunteerteam where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return volunteerteamDao.findCount("from Volunteerteam where businessForm=?", businessForm);
	}
	
	public void insert(Volunteerteam allowance) {
		volunteerteamDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Volunteerteam allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			volunteerteamDao.delete(allowance);
		}
	}

	public Volunteerteam findOne(String id) {
		return volunteerteamDao.findOne(id);
	}
	
	public void update(Volunteerteam allowance, String businessFormId) {
		Volunteerteam findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(allowance.getXm());
			findTwjrhmc.setCount(allowance.getCount());
			findTwjrhmc.setPartyCount(allowance.getPartyCount());
			findTwjrhmc.setPrincipal(allowance.getPrincipal());
			findTwjrhmc.setPrincipalPhone(allowance.getPrincipalPhone());
			findTwjrhmc.setUpdateDate(new Date());
			volunteerteamDao.update(findTwjrhmc);
		}
	}

}
