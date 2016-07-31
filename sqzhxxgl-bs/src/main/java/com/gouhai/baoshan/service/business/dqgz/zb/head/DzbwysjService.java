package com.gouhai.baoshan.service.business.dqgz.zb.head;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.DzbwysjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dzbwysj;

/**
 * 党支部委员及党小组长名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class DzbwysjService {
	@Autowired
	private DzbwysjDao dzbwysjDao;
	// 增加
	final static String hql = "from Dzbwysj where businessForm=?";

	public void insert(Dzbwysj t) {
		dzbwysjDao.insert(t);
	}

	// 查询
	public Dzbwysj findOne(BusinessForm businessForm) {
		return dzbwysjDao.findOne(hql, businessForm);
	}

	// 查询
	public Dzbwysj findOne(String id) {
		return dzbwysjDao.findOne(id);
	}

	// 修改
	public void update(Dzbwysj t) {
		dzbwysjDao.update(t);
	}
}
