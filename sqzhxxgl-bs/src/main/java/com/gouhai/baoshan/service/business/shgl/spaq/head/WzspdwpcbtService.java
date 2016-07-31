package com.gouhai.baoshan.service.business.shgl.spaq.head;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.spaq.head.WzspdwpcbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Wzspdwpc;

@Service
public class WzspdwpcbtService {
	@Autowired
	private WzspdwpcbtDao wzspdwpcbtDao;
	final static String hql = "from Wzspdwpc where businessForm=?";

	public void insert(Wzspdwpc t) {
		wzspdwpcbtDao.insert(t);
	}

	// 查询
	public Wzspdwpc findOne(BusinessForm businessForm) {
		return wzspdwpcbtDao.findOne(hql, businessForm);
	}

	// 查询
	public Wzspdwpc findOne(String id) {
		return wzspdwpcbtDao.findOne(id);
	}

	// 更新
	public void update(Wzspdwpc t) {
		wzspdwpcbtDao.update(t);
	}
}
