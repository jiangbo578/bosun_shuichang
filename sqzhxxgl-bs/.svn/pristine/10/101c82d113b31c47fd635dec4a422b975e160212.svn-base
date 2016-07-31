package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.DyzzgxzcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dyzzgxzc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 党员组织关系转出业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class DyzzgxzcService {
	@Autowired
	private DyzzgxzcDao dyzzgxzcDao;

	// 增加
	public void insert(Dyzzgxzc gcldw) {
		dyzzgxzcDao.insert(gcldw);
	}

	// 查询
	public Dyzzgxzc findOne(String id) {
		return dyzzgxzcDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		dyzzgxzcDao.delete(id);
	}

	// 查询
	final static String hql = "from Dyzzgxzc where businessForm=? order by updateDate";

	public List<Dyzzgxzc> getLzzList(int pageNumber, BusinessForm businessForm) {
		return dyzzgxzcDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return dyzzgxzcDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Dyzzgxzc t) {
		dyzzgxzcDao.update(t);
	}
}
