package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.PmtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Pmt;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 平面图
 * 
 * @author MedivhQ
 * 
 */
@Service
public class PmtService {
	@Autowired
	private PmtDao pmtDao;

	// 增加
	public void insert(Pmt pmt) {
		pmtDao.insert(pmt);
	}

	// 查询
	public Pmt findOne(String id) {
		return pmtDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		pmtDao.delete(id);
	}

	// 查询
	final static String hql = "from Pmt where businessForm=? order by updateDate";

	public List<Pmt> getLzzList(int pageNumber, BusinessForm businessForm) {
		return pmtDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return pmtDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Pmt t) {
		pmtDao.update(t);
	}

	public List<Pmt> gteAll(BusinessForm businessForm) {
		return pmtDao.findAll(hql, businessForm);
	}
}
