package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.ZyzmdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Zyzmd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 志愿者名单
 * 
 * @author MedivhQ
 * 
 */
@Service
public class ZyzmdService {
	@Autowired
	private ZyzmdDao zyzmdDao;

	// 增加
	public void insert(Zyzmd zyzmd) {
		zyzmdDao.insert(zyzmd);
	}

	// 查询
	public Zyzmd findOne(String id) {
		return zyzmdDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		zyzmdDao.delete(id);
	}

	// 查询
	final static String hql = "from Zyzmd where businessForm=? order by updateDate";

	public List<Zyzmd> getLzzList(int pageNumber, BusinessForm businessForm) {
		return zyzmdDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return zyzmdDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Zyzmd t) {
		zyzmdDao.update(t);
	}
}
