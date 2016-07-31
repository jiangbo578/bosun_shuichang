package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.JmcmxzzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Jmcmxzz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居民村民小组长
 * 
 * @author MedivhQ
 * 
 */
@Service
public class JmcmxzzService {
	@Autowired
	private JmcmxzzDao jmcmxzzDao;

	// 增加
	public void insert(Jmcmxzz jmcmxzz) {
		jmcmxzzDao.insert(jmcmxzz);
	}

	// 查询
	public Jmcmxzz findOne(String id) {
		return jmcmxzzDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		jmcmxzzDao.delete(id);
	}

	// 查询
	final static String hql = "from Jmcmxzz where businessForm=? order by updateDate";

	public List<Jmcmxzz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jmcmxzzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jmcmxzzDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Jmcmxzz t) {
		jmcmxzzDao.update(t);
	}
}

