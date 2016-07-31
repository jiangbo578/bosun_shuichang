package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.CwhcyDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Cwhcy;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 村委会成员名单
 * 
 * @author 徐舟
 * 
 */
@Service
public class CwhcyService {
	@Autowired
	private CwhcyDao cwhcyDao;

	// 增加
	public void insert(Cwhcy t) {
		cwhcyDao.insert(t);
	}

	// 查询
	public Cwhcy findOne(String id) {
		return cwhcyDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		cwhcyDao.delete(id);
	}

	// 查询
	final static String hql = "from Cwhcy where businessForm=? order by updateDate";

	public List<Cwhcy> getLzzList(int pageNumber, BusinessForm businessForm) {
		return cwhcyDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return cwhcyDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Cwhcy t) {
		cwhcyDao.update(t);
	}
}
