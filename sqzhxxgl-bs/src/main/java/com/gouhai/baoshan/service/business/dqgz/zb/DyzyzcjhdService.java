package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.DyzyzcjhdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dyzyzcjhd;
import com.gouhai.baoshan.entity.business.dqgz.zb.Kzdyzyz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 党员志愿者参与活动情况业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class DyzyzcjhdService {
	@Autowired
	private DyzyzcjhdDao dyzyzcjhdDao;

	// 增加
	public void insert(Dyzyzcjhd t) {
		dyzyzcjhdDao.insert(t);
	}

	// 查询
	public Dyzyzcjhd findOne(String id) {
		return dyzyzcjhdDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		dyzyzcjhdDao.delete(id);
	}

	// 查询
	final static String hql = "from Dyzyzcjhd where businessForm=? order by updateDate";

	public List<Dyzyzcjhd> getobjList(int pageNumber, BusinessForm businessForm) {
		return dyzyzcjhdDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getobjCount(BusinessForm businessForm) {
		return dyzyzcjhdDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Dyzyzcjhd t) {
		dyzyzcjhdDao.update(t);
	}
}
