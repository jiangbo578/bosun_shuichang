package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.CwhjcqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Cwhjcqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 村委会基础情况
 * 
 * @author MedivhQ
 * 
 */
@Service
public class CwhjcqkService {
	@Autowired
	private CwhjcqkDao cwhjcqkDao;

	// 增加
	public void insert(Cwhjcqk cwhjcqk) {
		cwhjcqkDao.insert(cwhjcqk);
	}

	// 查询
	public Cwhjcqk findOne(String id) {
		return cwhjcqkDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		cwhjcqkDao.delete(id);
	}

	// 查询
	final static String hql = "from Cwhjcqk where businessForm=? order by updateDate";

	public List<Cwhjcqk> getLzzList(int pageNumber, BusinessForm businessForm) {
		return cwhjcqkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return cwhjcqkDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Cwhjcqk t) {
		cwhjcqkDao.update(t);
	}
}
