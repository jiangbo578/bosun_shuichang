package com.gouhai.baoshan.service.business.hyjl.hyhd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.hyhd.GzjhDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Gzjh;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * @author 徐舟
 * 
 *         2014-10-13
 */
@Service
public class GzjhService {
	@Autowired
	private GzjhDao gzjhDao;
	// 查询
	final static String hql = "from Gzjh where businessForm=? order by updateDate";

	public List<Gzjh> getObjList(int pageNumber, BusinessForm businessForm) {
		return gzjhDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return gzjhDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Gzjh t) {
		gzjhDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		gzjhDao.delete(id);
	}

	// 修改
	public void update(Gzjh t) {
		gzjhDao.update(t);
	}

	public Gzjh findOne(String id) {
		return gzjhDao.findOne(id);
	}
}
