package com.gouhai.baoshan.service.business.shgl.nchjzl.head;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.head.BgfyzcbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Bgfyzc;

@Service
public class BgfyzcbtService {
	@Autowired
	private BgfyzcbtDao bgfyzcDao;
	final static String hql = "from Bgfyzc where businessForm=?";

	public void insert(Bgfyzc t) {
		bgfyzcDao.insert(t);
	}

	// 查询
	public Bgfyzc findOne(BusinessForm businessForm) {
		return bgfyzcDao.findOne(hql, businessForm);
	}

	// 查询
	public Bgfyzc findOne(String id) {
		return bgfyzcDao.findOne(id);
	}

	// 更新
	public void update(Bgfyzc t) {
		bgfyzcDao.update(t);
	}
	public List<Bgfyzc> getAll(BusinessForm businessForm){
		return bgfyzcDao.findAll(hql, businessForm);
	}
}
