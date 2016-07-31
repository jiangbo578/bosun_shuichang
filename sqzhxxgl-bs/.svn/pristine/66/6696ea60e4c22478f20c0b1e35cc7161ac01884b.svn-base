package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.RdjjfzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Rdjjfz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 年度发展党员工作情况表:入党积极分子
 * 
 * @author 徐舟
 * 
 */
@Service
public class RdjjfzService {
	@Autowired
	private RdjjfzDao rdjjfzDao;

	// 增加
	public void insert(Rdjjfz t) {
		rdjjfzDao.insert(t);
	}

	// 查询
	public Rdjjfz findOne(String id) {
		return rdjjfzDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		rdjjfzDao.delete(id);
	}

	// 查询
	final static String hql = "from Rdjjfz where businessForm=? order by updateDate";

	public List<Rdjjfz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return rdjjfzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return rdjjfzDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Rdjjfz t) {
		rdjjfzDao.update(t);
	}
}
