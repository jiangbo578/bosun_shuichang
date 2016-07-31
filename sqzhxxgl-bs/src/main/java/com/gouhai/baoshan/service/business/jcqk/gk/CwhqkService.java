package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.CwhqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Cwhqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 村委会情况
 * 
 * @author MedivhQ
 * 
 */
@Service
public class CwhqkService {
	@Autowired
	private CwhqkDao cwhqkDao;

	// 增加
	public void insert(Cwhqk cwhqk) {
		cwhqkDao.insert(cwhqk);
	}

	// 查询
	public Cwhqk findOne(String id) {
		return cwhqkDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		cwhqkDao.delete(id);
	}

	// 查询
	final static String hql = "from Cwhqk where businessForm=? order by updateDate";

	public List<Cwhqk> getLzzList(int pageNumber, BusinessForm businessForm) {
		return cwhqkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return cwhqkDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Cwhqk t) {
		cwhqkDao.update(t);
	}
}
