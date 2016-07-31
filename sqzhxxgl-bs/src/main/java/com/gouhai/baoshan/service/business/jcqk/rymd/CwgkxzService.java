package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.CwgkxzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Cwgkxz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 村务公开小组成员
 * 
 * @author MedivhQ
 * 
 */
@Service
public class CwgkxzService {
	@Autowired
	private CwgkxzDao cwgkxzDao;

	// 增加
	public void insert(Cwgkxz cwgkxz) {
		cwgkxzDao.insert(cwgkxz);
	}

	// 查询
	public Cwgkxz findOne(String id) {
		return cwgkxzDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		cwgkxzDao.delete(id);
	}

	// 查询
	final static String hql = "from Cwgkxz where businessForm=? order by updateDate";

	public List<Cwgkxz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return cwgkxzDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return cwgkxzDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Cwgkxz t) {
		cwgkxzDao.update(t);
	}
}
