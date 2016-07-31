/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.AidingrecordDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingrecord;
import com.gouhai.baoshan.entity.business.dqgz.fd.Aidingwork;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-04
 *
 */
@Service
public class AidingRecordService {

	@Autowired
	private AidingrecordDao aidingRecordDao;

	public List<Aidingrecord> getBeanList(String aidingId, int pageNumber) {
		return aidingRecordDao.findList("from Aidingrecord a where a.aidingwork.id = ?  order by updateDate", pageNumber, PageableController.PAGE_SIZE, aidingId);
	}
	
	public long getBeanCount(String aidingId) {
		return aidingRecordDao.findCount("from Aidingrecord a where a.aidingwork.id = ?", aidingId);
	}
	
	public void insert(Aidingrecord allowance) {
		aidingRecordDao.insert(allowance);
	}

	public void delete(String id) {
		Aidingrecord allowance = findOne(id);
		aidingRecordDao.delete(allowance);
	}

	public Aidingrecord findOne(String id) {
		return aidingRecordDao.findOne(id);
	}
	
	public void update(Aidingrecord allowance) {
		Aidingrecord findTwjrhmc = findOne(allowance.getId());
			findTwjrhmc.setTag(allowance.getTag());
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setUpdateDate(new Date());
			aidingRecordDao.update(findTwjrhmc);
	}

}
