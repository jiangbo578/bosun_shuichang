/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.WomanbscdjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingwork;
import com.gouhai.baoshan.entity.business.dqgz.fd.Womanbscdj;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-18
 *
 */
@Service
public class WomanbscdjService {

	@Autowired
	private WomanbscdjDao womanbscdjDao;

	public List<Womanbscdj> getBeanList(BusinessForm businessForm, int pageNumber) {
		return womanbscdjDao.findList("from Womanbscdj where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return womanbscdjDao.findCount("from Womanbscdj where businessForm=?", businessForm);
	}
	
	public void insert(Womanbscdj allowance) {
		womanbscdjDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Womanbscdj allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			womanbscdjDao.delete(allowance);
		}
	}

	public Womanbscdj findOne(String id) {
		return womanbscdjDao.findOne(id);
	}
	
	public void update(Womanbscdj allowance, String businessFormId) {
		Womanbscdj findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			
			
			findTwjrhmc.setAge(allowance.getAge());
			findTwjrhmc.setCsny(allowance.getCsny());
			findTwjrhmc.setDjsj(allowance.getDjsj());
			findTwjrhmc.setHjdz(allowance.getHjdz());
			findTwjrhmc.setIdcard(allowance.getIdcard());
			findTwjrhmc.setIsAnothorCheck(allowance.getIsAnothorCheck());
			findTwjrhmc.setIsCheckCancer(allowance.getIsCheckCancer());
			findTwjrhmc.setIsSc(allowance.getIsSc());
			findTwjrhmc.setJtzz(allowance.getJtzz());
			findTwjrhmc.setMz(allowance.getMz());
			findTwjrhmc.setPhone(allowance.getPhone());
			findTwjrhmc.setScjg(allowance.getScjg());
			findTwjrhmc.setScsj(allowance.getScsj());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setType(allowance.getType());
			findTwjrhmc.setUpdateDate(new Date());
			findTwjrhmc.setWhcd(allowance.getWhcd());
			findTwjrhmc.setXb(allowance.getXb());
			findTwjrhmc.setXm(allowance.getXm());
			
			womanbscdjDao.update(findTwjrhmc);
		}
	}

}
