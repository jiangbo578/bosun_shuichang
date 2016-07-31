package com.gouhai.baoshan.service.business.ggfw.cjrgz.head;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.head.FcbkjdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.head.Fcbkjd;

/**
 * 
 * @author 徐舟
 * 
 */
@Service
public class FcbkjdService {

	@Autowired
	private FcbkjdDao fcbkjdDao;
	// 增加
	final static String hql = "from Fcbkjd where businessForm=?";

	public void insert(Fcbkjd t) {
		fcbkjdDao.insert(t);
	}

	// 查询
	public Fcbkjd findOne(BusinessForm businessForm) {
		return fcbkjdDao.findOne(hql, businessForm);
	}

	// 查询
	public Fcbkjd findOne(String id) {
		return fcbkjdDao.findOne(id);
	}

	// 修改
	public void update(Fcbkjd t) {
		fcbkjdDao.update(t);
	}
}
