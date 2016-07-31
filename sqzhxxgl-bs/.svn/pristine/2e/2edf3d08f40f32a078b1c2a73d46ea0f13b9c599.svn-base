package com.gouhai.baoshan.service.business.shgl.xfzsx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.xfzsx.XfztsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfzsx.Xfzts;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 消费者投诉、举报、咨询记录表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class XfztsService {
	@Autowired
	private XfztsDao xfztsDao;

	// 增加
	public void insert(Xfzts t) {
		xfztsDao.insert(t);
	}

	// 查询
	public Xfzts findOne(String id) {
		return xfztsDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		xfztsDao.delete(id);
	}

	// 查询
	final static String hql = "from Xfzts where businessForm=? order by updateDate";

	public List<Xfzts> getObjList(int pageNumber, BusinessForm businessForm) {
		return xfztsDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return xfztsDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Xfzts t) {
		xfztsDao.update(t);
	}
}
