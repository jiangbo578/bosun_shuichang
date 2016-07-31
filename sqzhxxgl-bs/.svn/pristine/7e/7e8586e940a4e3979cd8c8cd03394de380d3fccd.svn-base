package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.SyfwxxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Syfwxx;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 实有房屋信息
 * 
 * @author MedivhQ
 * 
 */
@Service
public class SyfwxxService {
	@Autowired
	private SyfwxxDao syfwxxDao;

	// 增加
	public void insert(Syfwxx syfwxx) {
		syfwxxDao.insert(syfwxx);
	}

	// 查询
	public Syfwxx findOne(String id) {
		return syfwxxDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		syfwxxDao.delete(id);
	}

	// 查询
	final static String hql = "from Syfwxx where businessForm=? order by updateDate";

	public List<Syfwxx> getLzzList(int pageNumber, BusinessForm businessForm) {
		return syfwxxDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return syfwxxDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Syfwxx t) {
		syfwxxDao.update(t);
	}
}
