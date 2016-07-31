package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.NdfzdxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Ndfzdx;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 年度发展对象业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class NdfzdxService {
	@Autowired
	private NdfzdxDao ndfzdxDao;

	// 增加
	public void insert(Ndfzdx t) {
		ndfzdxDao.insert(t);
	}

	// 查询
	public Ndfzdx findOne(String id) {
		return ndfzdxDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		ndfzdxDao.delete(id);
	}

	// 查询
	final static String hql = "from Ndfzdx where businessForm=? order by updateDate";

	public List<Ndfzdx> getLzzList(int pageNumber, BusinessForm businessForm) {
		return ndfzdxDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return ndfzdxDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Ndfzdx t) {
		ndfzdxDao.update(t);
	}
}
