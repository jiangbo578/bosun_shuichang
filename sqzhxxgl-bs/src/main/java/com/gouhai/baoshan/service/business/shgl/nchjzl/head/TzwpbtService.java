package com.gouhai.baoshan.service.business.shgl.nchjzl.head;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.head.TzwpbtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Tzwp;

/**
 * 田间（经济林）窝棚台帐业务层表头
 * 
 * @author 徐舟
 * 
 */
@Service
public class TzwpbtService {
	@Autowired
	private TzwpbtDao tzwpDao;
	final static String hql = "from Tzwp where businessForm=?";

	public void insert(Tzwp t) {
		tzwpDao.insert(t);
	}

	// 查询
	public Tzwp findOne(BusinessForm businessForm) {
		return tzwpDao.findOne(hql, businessForm);
	}
	// 查询
	public Tzwp findOne(String id) {
		return tzwpDao.findOne(id);
	}

	// 更新
	public void update(Tzwp tzwp) {
		tzwpDao.update(tzwp);
	}
	public List<Tzwp> getAll(BusinessForm businessForm){
		return tzwpDao.findAll(hql, businessForm);
	}
}
