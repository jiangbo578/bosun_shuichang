/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.fd;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.fd.SxsbmhsfcActivityDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Sxsbmhsfc;
import com.gouhai.baoshan.entity.business.dqgz.fd.SxsbmhsfcActivity;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-19
 *
 */
@Service
public class SxsbmhsfcActivityService { 

	@Autowired
	private SxsbmhsfcActivityDao sxsbmhsfcActivityDao;

	public List<SxsbmhsfcActivity> getBeanList(String id, int pageNumber) {
		return  sxsbmhsfcActivityDao.findList("from SxsbmhsfcActivity where sxsbmhsfc.id=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, id);
	}
	
	public long getBeanCount(String id) {
		return sxsbmhsfcActivityDao.findCount("from SxsbmhsfcActivity where sxsbmhsfc.id=?", id);
	}
	
	public void insert(SxsbmhsfcActivity allowance) {
		sxsbmhsfcActivityDao.insert(allowance);
	}

	public void delete(String id) {
		SxsbmhsfcActivity allowance = findOne(id);
			sxsbmhsfcActivityDao.delete(allowance);
		}

	public SxsbmhsfcActivity findOne(String id) {
		return sxsbmhsfcActivityDao.findOne(id);
	}
	
	public void update(SxsbmhsfcActivity allowance) {
		SxsbmhsfcActivity findTwjrhmc = findOne(allowance.getId());
		findTwjrhmc.setContent(allowance.getContent());
		findTwjrhmc.setCount(allowance.getCount());
		findTwjrhmc.setTime(allowance.getTime());
		findTwjrhmc.setUpdateDate(new Date());
			sxsbmhsfcActivityDao.update(findTwjrhmc);
	}

}
