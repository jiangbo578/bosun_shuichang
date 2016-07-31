package com.gouhai.baoshan.service.business.shgl.nchjzl.head;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.head.GyqyjbxxbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Gyqyjbxx;

@Service
public class GyqyjbxxbtService {
	@Autowired
	private GyqyjbxxbtDao gyqyjbxxbtDao;
	final static String hql = "from Gyqyjbxx where businessForm=?";

	public void insert(Gyqyjbxx t) {
		gyqyjbxxbtDao.insert(t);
	}

	// 查询
	public Gyqyjbxx findOne(BusinessForm businessForm) {
		return gyqyjbxxbtDao.findOne(hql, businessForm);
	}

	// 查询
	public Gyqyjbxx findOne(String id) {
		return gyqyjbxxbtDao.findOne(id);
	}

	// 更新
	public void update(Gyqyjbxx t) {
		gyqyjbxxbtDao.update(t);
	}
}
