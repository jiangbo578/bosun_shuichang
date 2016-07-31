package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.GxfwDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Gxfw;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 管辖范围服务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class GxfwService {
	@Autowired
	private GxfwDao gxfwDao;

	// 查询
	final static String hql = "from Gxfw where businessForm=? order by updateDate";

	public List<Gxfw> getLzzList(int pageNumber, BusinessForm businessForm) {
		return gxfwDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return gxfwDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Gxfw gxfw) {
		gxfwDao.insert(gxfw);
	}

	// 根据主键删除
	public void delete(String id) {
		gxfwDao.delete(id);
	}

	// 修改
	public void update(Gxfw gxfw) {
		gxfwDao.update(gxfw);
	}

	public Gxfw findOne(String id) {
		return gxfwDao.findOne(id);
	}
}
