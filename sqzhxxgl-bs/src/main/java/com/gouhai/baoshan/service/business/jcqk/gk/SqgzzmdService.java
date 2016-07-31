package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.SqgzzmdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Sqgzzmd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 社区工作者名单
 * 
 * @author MedivhQ
 * 
 */
@Service
public class SqgzzmdService {
	@Autowired
	private SqgzzmdDao sqgzzmdDao;

	// 增加
	public void insert(Sqgzzmd sqgzzmd) {
		sqgzzmdDao.insert(sqgzzmd);
	}

	// 查询
	public Sqgzzmd findOne(String id) {
		return sqgzzmdDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		sqgzzmdDao.delete(id);
	}

	// 查询
	final static String hql = "from Sqgzzmd where businessForm=? order by updateDate";

	public List<Sqgzzmd> getLzzList(int pageNumber, BusinessForm businessForm) {
		return sqgzzmdDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return sqgzzmdDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Sqgzzmd t) {
		sqgzzmdDao.update(t);
	}
}
