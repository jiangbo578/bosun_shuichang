package com.gouhai.baoshan.service.business.shgl.cjjyqk.head;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.cjjyqk.head.FfbxdbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffbxd;

@Service
public class FfbxdbtService {
	@Autowired
	private FfbxdbtDao ffbxdbtDao;
	final static String hql = "from Ffbxd where businessForm=?";

	public void insert(Ffbxd t) {
		ffbxdbtDao.insert(t);
	}

	// 查询
	public Ffbxd findOne(BusinessForm businessForm) {
		return ffbxdbtDao.findOne(hql, businessForm);
	}

	// 查询
	public Ffbxd findOne(String id) {
		return ffbxdbtDao.findOne(id);
	}

	// 更新
	public void update(Ffbxd t) {
		ffbxdbtDao.update(t);
	}

	public List<Ffbxd> getAll(BusinessForm businessForm) {
		return ffbxdbtDao.findAll(hql, businessForm);
	}
}
