package com.gouhai.baoshan.service.business.dqgz.zb.head;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.head.ZcdygkbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.head.Zcdygk;

/**
 * 在册党员概况及名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class ZcdygkbtService {
	@Autowired
	private ZcdygkbtDao zcdygkbtDao;
	// 增加
	final static String hql = "from Zcdygk where businessForm=?";

	public void insert(Zcdygk t) {
		zcdygkbtDao.insert(t);
	}

	// 查询
	public Zcdygk findOne(BusinessForm businessForm) {
		return zcdygkbtDao.findOne(hql, businessForm);
	}

	// 查询
	public Zcdygk findOne(String id) {
		return zcdygkbtDao.findOne(id);
	}

	// 修改
	public void update(Zcdygk t) {
		zcdygkbtDao.update(t);
	}
}
