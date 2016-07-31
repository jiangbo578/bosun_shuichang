package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.XzpmtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Xzpmt;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class XzpmtService {
	@Autowired
	private XzpmtDao xzpmtDao;

	// 增加
	public void insert(Xzpmt pmt) {
		xzpmtDao.insert(pmt);
	}

	// 查询
	public Xzpmt findOne(String id) {
		return xzpmtDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		xzpmtDao.delete(id);
	}

	// 查询
	final static String hql = "from Xzpmt where businessForm=? order by updateDate";

	public List<Xzpmt> getLzzList(int pageNumber, BusinessForm businessForm) {
		return xzpmtDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return xzpmtDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Xzpmt t) {
		xzpmtDao.update(t);
	}
}
