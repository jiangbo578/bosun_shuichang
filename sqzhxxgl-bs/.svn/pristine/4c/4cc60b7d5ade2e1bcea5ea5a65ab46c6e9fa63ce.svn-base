package com.gouhai.baoshan.service.business.hyjl.hyhd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.hyhd.GzzjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Gzzj;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 工作总结业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class GzzjService {
	@Autowired
	private GzzjDao gzzjDao;
	// 查询
	final static String hql = "from Gzzj where businessForm=? order by updateDate";

	public List<Gzzj> getObjList(int pageNumber, BusinessForm businessForm) {
		return gzzjDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return gzzjDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Gzzj t) {
		gzzjDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		gzzjDao.delete(id);
	}

	// 修改
	public void update(Gzzj t) {
		gzzjDao.update(t);
	}

	public Gzzj findOne(String id) {
		return gzzjDao.findOne(id);
	}
}
