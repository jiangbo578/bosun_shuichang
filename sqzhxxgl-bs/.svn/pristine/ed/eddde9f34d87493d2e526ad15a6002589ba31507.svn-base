package com.gouhai.baoshan.service.business.shgl.xfgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.xfgz.XqdcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xqdc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居（村）委社会单位场所、住宅小区底册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class XqdcService {
	@Autowired
	private XqdcDao xqdcDao;
	
	final static String hql = "from Xqdc where businessForm=? order by updateDate";

	// 增加
	public void insert(Xqdc t) {
		xqdcDao.insert(t);
	}

	// 查询
	public Xqdc findOne(String id) {
		return xqdcDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		xqdcDao.delete(id);
	}

	// 查询

	public List<Xqdc> getObjList(int pageNumber, BusinessForm businessForm) {
		return xqdcDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return xqdcDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Xqdc t) {
		xqdcDao.update(t);
	}
}
