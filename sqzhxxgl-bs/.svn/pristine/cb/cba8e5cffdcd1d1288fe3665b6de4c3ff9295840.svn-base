package com.gouhai.baoshan.service.business.shgl.spaq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.spaq.SuperManDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.spaq.SuperMan;

@Service
public class SuperManService {
	@Autowired
	private SuperManDao manDao;

	// 增加
	public void insert(SuperMan t) {
		manDao.insert(t);
	}

	// 查询
	public SuperMan findOne(String id) {
		return manDao.findOne(id);
	}
	public SuperMan findOne(BusinessForm businessForm) {
		return manDao.findOne("from SuperMan where businessForm=? ",businessForm);
	}

	// 修改
	public void update(SuperMan t) {
		manDao.update(t);
	}
}
