package com.gouhai.baoshan.service.business.shgl.xfgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.xfgz.DwdcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Dwdc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 村委社会单位（场所）底册
 * 
 * @author 徐舟
 * 
 *         2014-9-17
 */
@Service
public class DwdcService {
	@Autowired
	private DwdcDao dwdcDao;
	final static String hql = "from Dwdc where businessForm=? order by updateDate";

	// 增加
	public void insert(Dwdc t) {
		dwdcDao.insert(t);
	}

	// 查询
	public Dwdc findOne(String id) {
		return dwdcDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		dwdcDao.delete(id);
	}

	// 查询

	public List<Dwdc> getObjList(int pageNumber, BusinessForm businessForm) {
		return dwdcDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return dwdcDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Dwdc t) {
		dwdcDao.update(t);
	}
}
