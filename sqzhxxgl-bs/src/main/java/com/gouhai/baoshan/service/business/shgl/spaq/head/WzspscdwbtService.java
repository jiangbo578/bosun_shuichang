package com.gouhai.baoshan.service.business.shgl.spaq.head;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.spaq.head.WzspdwscbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Wzspsc;

@Service
public class WzspscdwbtService {
	@Autowired
	private WzspdwscbtDao wzspdwscbtDao;
	final static String hql = "from Wzspsc where businessForm=?";

	public void insert(Wzspsc t) {
		wzspdwscbtDao.insert(t);
	}

	// 查询
	public Wzspsc findOne(BusinessForm businessForm) {
		return wzspdwscbtDao.findOne(hql, businessForm);
	}

	// 查询
	public Wzspsc findOne(String id) {
		return wzspdwscbtDao.findOne(id);
	}

	// 更新
	public void update(Wzspsc t) {
		wzspdwscbtDao.update(t);
	}
}
