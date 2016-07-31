package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.CwhtsgzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Cwhtsgz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 村委会特色工作业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class CwhtsgzService {
	@Autowired
	private CwhtsgzDao cwhtsgzDao;
	// 查询
	final static String hql = "from Cwhtsgz where businessForm=? order by updateDate";

	public List<Cwhtsgz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return cwhtsgzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return cwhtsgzDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Cwhtsgz Cwhtsgz) {
		cwhtsgzDao.insert(Cwhtsgz);
	}

	// 根据主键删除
	public void delete(String id) {
		cwhtsgzDao.delete(id);
	}

	// 修改
	public void update(Cwhtsgz Cwhtsgz) {
		cwhtsgzDao.update(Cwhtsgz);
	}

	public Cwhtsgz findOne(String id) {
		return cwhtsgzDao.findOne(id);
	}
}
