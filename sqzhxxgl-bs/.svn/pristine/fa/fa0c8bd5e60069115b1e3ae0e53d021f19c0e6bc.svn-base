package com.gouhai.baoshan.service.business.shgl.xfgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.xfgz.XfanwghDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xfanwgh;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * @author 徐舟
 * 
 */
@Service
public class XfanwghService {
	@Autowired
	private XfanwghDao xfanwghDao;
	final static String hql = "from Xfanwgh where businessForm=? order by updateDate";

	// 增加
	public void insert(Xfanwgh t) {
		xfanwghDao.insert(t);
	}

	// 查询
	public Xfanwgh findOne(String id) {
		return xfanwghDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		xfanwghDao.delete(id);
	}

	// 查询

	public List<Xfanwgh> getObjList(int pageNumber, BusinessForm businessForm) {
		return xfanwghDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return xfanwghDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Xfanwgh t) {
		xfanwghDao.update(t);
	}
}
