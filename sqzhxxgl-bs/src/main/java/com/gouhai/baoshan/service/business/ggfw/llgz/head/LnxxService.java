package com.gouhai.baoshan.service.business.ggfw.llgz.head;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.llgz.LnxxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.head.Lnxx;

/**
 * 老年学校在册人员名册主类业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class LnxxService {
	@Autowired
	private LnxxDao lnxxDao;

	final static String hql = "from Lnxx where businessForm=?";

	public void insert(Lnxx t) {
		lnxxDao.insert(t);
	}

	// 查询
	public Lnxx findOne(BusinessForm businessForm) {
		return lnxxDao.findOne(hql, businessForm);
	}

	// 查询
	public Lnxx findOne(String id) {
		return lnxxDao.findOne(id);
	}

	// 修改
	public void update(Lnxx t) {
		lnxxDao.update(t);
	}
}
