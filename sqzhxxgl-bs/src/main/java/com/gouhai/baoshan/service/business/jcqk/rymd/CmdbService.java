package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.CmdbDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Cmdb;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 村民代表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class CmdbService {
	@Autowired
	private CmdbDao cmdbDao;
	// 增加
	public void insert(Cmdb Cmdb) {
		cmdbDao.insert(Cmdb);
	}

	// 查询
	public Cmdb findOne(String id) {
		return cmdbDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		cmdbDao.delete(id);
	}

	// 查询
	final static String hql = "from Cmdb where businessForm=? order by updateDate";

	public List<Cmdb> getLzzList(int pageNumber, BusinessForm businessForm) {
		return cmdbDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return cmdbDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Cmdb t) {
		cmdbDao.update(t);
	}
}
