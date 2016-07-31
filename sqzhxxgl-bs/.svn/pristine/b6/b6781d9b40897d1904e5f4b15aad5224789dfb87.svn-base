package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.DyzzgxzrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dyzzgxzr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 党员组织关系转入业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class DyzzgxzrService {
	@Autowired
	private DyzzgxzrDao dyzzgxzrDao;

	// 增加
	public void insert(Dyzzgxzr gcldw) {
		dyzzgxzrDao.insert(gcldw);
	}

	// 查询
	public Dyzzgxzr findOne(String id) {
		return dyzzgxzrDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		dyzzgxzrDao.delete(id);
	}

	// 查询
	final static String hql = "from Dyzzgxzr where businessForm=? order by updateDate";

	public List<Dyzzgxzr> getLzzList(int pageNumber, BusinessForm businessForm) {
		return dyzzgxzrDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return dyzzgxzrDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Dyzzgxzr t) {
		dyzzgxzrDao.update(t);
	}
}
