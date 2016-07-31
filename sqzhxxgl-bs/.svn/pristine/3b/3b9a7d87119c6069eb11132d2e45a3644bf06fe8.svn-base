package com.gouhai.baoshan.service.business.dqgz.shzz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.shzz.QzhdtdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.shzz.Qzhdtd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 上海市嘉定区社区群众活动团队备案表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class QzhdtdService {
	@Autowired
	private QzhdtdDao qzhdtdDao;
	// 查询
	final static String hql = "from Qzhdtd where businessForm=? order by updateDate";

	public List<Qzhdtd> getObjList(int pageNumber, BusinessForm businessForm) {
		return qzhdtdDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return qzhdtdDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Qzhdtd t) {
		qzhdtdDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		qzhdtdDao.delete(id);
	}

	// 修改
	public void update(Qzhdtd t) {
		qzhdtdDao.update(t);
	}

	public Qzhdtd findOne(String id) {
		return qzhdtdDao.findOne(id);
	}
}
