package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.RdsqrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Rdsqr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 年度发展党员:入党申请人业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class RdsqrService {
	@Autowired
	private RdsqrDao rdsqrDao;

	// 增加
	public void insert(Rdsqr gcldw) {
		rdsqrDao.insert(gcldw);
	}

	// 查询
	public Rdsqr findOne(String id) {
		return rdsqrDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		rdsqrDao.delete(id);
	}

	// 查询
	final static String hql = "from Rdsqr where businessForm=? order by updateDate";

	public List<Rdsqr> getLzzList(int pageNumber, BusinessForm businessForm) {
		return rdsqrDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return rdsqrDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Rdsqr t) {
		rdsqrDao.update(t);
	}
}
