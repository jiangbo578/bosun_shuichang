package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.WtqsnDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Wtqsn;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 问题青少年信息统计
 * 
 * @author MedivhQ
 * 
 */
@Service
public class WtqsnService {
	@Autowired
	private WtqsnDao wtqsnDao;

	// 增加
	public void insert(Wtqsn wtqsn) {
		wtqsnDao.insert(wtqsn);
	}

	// 查询
	public Wtqsn findOne(String id) {
		return wtqsnDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		wtqsnDao.delete(id);
	}

	// 查询
	final static String hql = "from Wtqsn where businessForm=? order by updateDate";

	public List<Wtqsn> getLzzList(int pageNumber, BusinessForm businessForm) {
		return wtqsnDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return wtqsnDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Wtqsn t) {
		wtqsnDao.update(t);
	}
}

