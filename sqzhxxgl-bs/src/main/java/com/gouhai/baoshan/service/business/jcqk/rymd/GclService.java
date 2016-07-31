package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.GcldwDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Gcldw;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 共建、创建、联建业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class GclService {
	@Autowired
	private GcldwDao gcldwDao;

	// 增加
	public void insert(Gcldw gcldw) {
		gcldwDao.insert(gcldw);
	}

	// 查询
	public Gcldw findOne(String id) {
		return gcldwDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		gcldwDao.delete(id);
	}

	// 查询
	final static String hql = "from Gcldw where businessForm=? order by updateDate";

	public List<Gcldw> getLzzList(int pageNumber, BusinessForm businessForm) {
		return gcldwDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return gcldwDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Gcldw t) {
		gcldwDao.update(t);
	}
}
