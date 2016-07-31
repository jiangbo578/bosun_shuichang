/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.hyjl.hyhd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.hyhd.HyjlDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Hyjl;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class HyjlService {

	@Autowired
	private HyjlDao hyjlDao;

	public List<Hyjl> getHyjlList(int pageNumber, BusinessForm user) {
		return hyjlDao.findList(
				"from Hyjl where businessForm=? order by updateDate",
				pageNumber, PageableController.PAGE_SIZE, user);
	}

	public List<Hyjl> getHyjlList(BusinessForm user) {
		return hyjlDao.findAll(
				"from Hyjl where businessForm=? order by updateDate", user);
	}

	public long getHyjlCount(BusinessForm user) {
		return hyjlDao.findCount("from Hyjl where businessForm=?", user);
	}

	public void insert(Hyjl hyjl) {
		hyjlDao.insert(hyjl);
	}

	public void delete(String id) {
		hyjlDao.delete(id);
	}

	public Hyjl findOne(String id) {
		return hyjlDao.findOne(id);
	}

	public void update(Hyjl hyjl) {
		hyjlDao.update(hyjl);
	}
}
