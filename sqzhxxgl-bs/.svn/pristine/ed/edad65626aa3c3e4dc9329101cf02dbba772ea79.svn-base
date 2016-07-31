package com.gouhai.baoshan.service.business.shgl.nchjzl.head;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.head.WptzbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Wptz;

@Service
public class WptzbtService {
	@Autowired
	private WptzbtDao wptzDao;
	final static String hql = "from Wptz where businessForm=?";

	public void insert(Wptz t) {
		wptzDao.insert(t);
	}

	// 查询
	public Wptz findOne(BusinessForm businessForm) {
		return wptzDao.findOne(hql, businessForm);
	}

	// 查询
	public Wptz findOne(String id) {
		return wptzDao.findOne(id);
	}

	// 更新
	public void update(Wptz tzwp) {
		wptzDao.update(tzwp);
	}
	public List<Wptz> getAll(BusinessForm businessForm){
		return wptzDao.findAll(hql, businessForm);
	}
}
