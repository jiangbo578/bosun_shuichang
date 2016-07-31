/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.sygz;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.sygz.TwjrhmcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.sygz.Twjrhmc;
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
public class TwjrhmcService {

	@Autowired
	private TwjrhmcDao twjrhmcDao;

	public List<Twjrhmc> getBeanList(BusinessForm businessForm, int pageNumber) {
		return twjrhmcDao.findList("from Twjrhmc where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return twjrhmcDao.findCount("from Twjrhmc where businessForm=?", businessForm);
	}
	
	public void insert(Twjrhmc zdyfdxhmc) {
		twjrhmcDao.insert(zdyfdxhmc);
	}

	public void delete(String id, String businessFormId) {
		Twjrhmc zdyfdxhmc = findOne(id);
		if (zdyfdxhmc.getBusinessForm().getId().equals(businessFormId)) {
			twjrhmcDao.delete(zdyfdxhmc);
		}
	}

	public Twjrhmc findOne(String id) {
		return twjrhmcDao.findOne(id);
	}
	
	public void update(Twjrhmc twjrhmc, String businessFormId) {
		Twjrhmc findTwjrhmc = findOne(twjrhmc.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setXm(twjrhmc.getXm());
			findTwjrhmc.setXb(twjrhmc.getXb());
			findTwjrhmc.setRwsj(twjrhmc.getRwsj());
			findTwjrhmc.setCsny(twjrhmc.getCsny());
			findTwjrhmc.setJtzz(twjrhmc.getJtzz());
			findTwjrhmc.setHjdz(twjrhmc.getHjdz());
			findTwjrhmc.setPhone(twjrhmc.getPhone());
			findTwjrhmc.setUpdateDate(new Date());
			twjrhmcDao.update(findTwjrhmc);
		}
	}

}
