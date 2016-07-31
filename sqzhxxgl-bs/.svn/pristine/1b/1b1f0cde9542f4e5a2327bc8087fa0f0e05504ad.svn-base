package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.DzbwyDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dzbwy;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * @author 徐舟
 * 
 */
@Service
public class DzbwyService {
	@Autowired
	private DzbwyDao dzbwyDao;
	// 增加
	public void insert(Dzbwy t) {
		dzbwyDao.insert(t);
	}

	// 查询
	public Dzbwy findOne(String id) {
		return dzbwyDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		dzbwyDao.delete(id);
	}

	// 查询
	final static String hql = "from Dzbwy where businessForm=? order by updateDate";

	public List<Dzbwy> getObjList(int pageNumber, BusinessForm businessForm) {
		return dzbwyDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return dzbwyDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Dzbwy t) {
		dzbwyDao.update(t);
	}
}
