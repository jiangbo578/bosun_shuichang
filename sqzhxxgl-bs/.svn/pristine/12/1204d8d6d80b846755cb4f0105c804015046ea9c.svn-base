package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.QzwhtdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Qzwhtd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 群众文化团队业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class QzwhtdService {
	@Autowired
	private QzwhtdDao qzwhtdDao;

	// 增加
	public void insert(Qzwhtd qzwhtd) {
		qzwhtdDao.insert(qzwhtd);
	}

	// 删除
	public void delete(String id) {
		qzwhtdDao.delete(id);
	}

	// 修改
	public void update(Qzwhtd t) {
		qzwhtdDao.update(t);
	}

	// 查询
	public Qzwhtd findOne(String id) {
		return qzwhtdDao.findOne(id);
	}

	final static String hql = "from Qzwhtd where businessForm=? order by updateDate";

	public List<Qzwhtd> getTdmcList(BusinessForm businessForm, int pageNumber) {
		return qzwhtdDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getTdmcCount(BusinessForm businessForm) {
		return qzwhtdDao.findCount(hql, businessForm);
	}
}
