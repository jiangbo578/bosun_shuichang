package com.gouhai.baoshan.service.business.shgl.cjjyqk.head;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.cjjyqk.head.FfxympbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffxymp;

@Service
public class FfxympbtService {
	@Autowired
	private FfxympbtDao ffxympbtDao;
	final static String hql = "from Ffxymp where businessForm=?";

	public void insert(Ffxymp t) {
		ffxympbtDao.insert(t);
	}

	// 查询
	public Ffxymp findOne(BusinessForm businessForm) {
		return ffxympbtDao.findOne(hql, businessForm);
	}

	// 查询
	public Ffxymp findOne(String id) {
		return ffxympbtDao.findOne(id);
	}

	// 更新
	public void update(Ffxymp t) {
		ffxympbtDao.update(t);
	}

	public List<Ffxymp> getAll(BusinessForm businessForm) {
		return ffxympbtDao.findAll(hql, businessForm);
	}
}
