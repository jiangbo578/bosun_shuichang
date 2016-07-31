package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.JmcmdbDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Jmcmdb;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居民村民代表名单
 * 
 * @author MedivhQ
 * 
 */
@Service
public class JmcmdbService {
	@Autowired
	private JmcmdbDao jmcmdbDao;

	// 增加
	public void insert(Jmcmdb jmcmdb) {
		jmcmdbDao.insert(jmcmdb);
	}

	// 查询
	public Jmcmdb findOne(String id) {
		return jmcmdbDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		jmcmdbDao.delete(id);
	}

	// 查询
	final static String hql = "from Jmcmdb where businessForm=? order by updateDate";

	public List<Jmcmdb> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jmcmdbDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jmcmdbDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Jmcmdb t) {
		jmcmdbDao.update(t);
	}
}
