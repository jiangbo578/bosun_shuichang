package com.gouhai.baoshan.service.business.shgl.spaq.head;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.spaq.head.ZbjshsbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Zbjshs;

@Service
public class ZbjshsbtService {
	@Autowired
	private ZbjshsbtDao zbjshsbtDao;
	final static String hql = "from Zbjshs where businessForm=?";

	public void insert(Zbjshs t) {
		zbjshsbtDao.insert(t);
	}

	// 查询
	public Zbjshs findOne(BusinessForm businessForm) {
		return zbjshsbtDao.findOne(hql, businessForm);
	}

	// 查询
	public Zbjshs findOne(String id) {
		return zbjshsbtDao.findOne(id);
	}

	// 更新
	public void update(Zbjshs t) {
		zbjshsbtDao.update(t);
	}
}
