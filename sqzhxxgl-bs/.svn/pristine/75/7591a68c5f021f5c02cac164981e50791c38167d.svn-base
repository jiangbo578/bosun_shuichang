package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.JwhcyDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Jwhcy;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居委会成员 服务层
 * 
 * @author xuzhou
 * 
 */
@Service
public class JwhcyService {
	@Autowired
	private JwhcyDao jwhcyDao;

	// 增加
	public void insert(Jwhcy jwhcy) {
		jwhcyDao.insert(jwhcy);
	}

	// 查询
	public Jwhcy findOne(String id) {
		return jwhcyDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		jwhcyDao.delete(id);
	}

	// 查询
	final static String hql = "from Jwhcy where businessForm=? order by updateDate";

	public List<Jwhcy> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jwhcyDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jwhcyDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Jwhcy t) {
		jwhcyDao.update(t);
	}
}
