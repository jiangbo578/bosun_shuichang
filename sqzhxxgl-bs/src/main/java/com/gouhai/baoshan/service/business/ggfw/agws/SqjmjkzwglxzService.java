package com.gouhai.baoshan.service.business.ggfw.agws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.agws.SqjmjkzwglxzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Jkjyry;
import com.gouhai.baoshan.entity.business.ggfw.agws.Sqjmjkzwglxz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 社区居民健康自我管理小组统计表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class SqjmjkzwglxzService {
	@Autowired
	private SqjmjkzwglxzDao sqjmjkzwglxzDao;
	// 查询
	final static String hql = "from Sqjmjkzwglxz where businessForm=? order by updateDate";

	public List<Sqjmjkzwglxz> getObjList(int pageNumber,
			BusinessForm businessForm) {
		return sqjmjkzwglxzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return sqjmjkzwglxzDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Sqjmjkzwglxz t) {
		sqjmjkzwglxzDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		sqjmjkzwglxzDao.delete(id);
	}

	// 修改
	public void update(Sqjmjkzwglxz t) {
		sqjmjkzwglxzDao.update(t);
	}

	public Sqjmjkzwglxz findOne(String id) {
		return sqjmjkzwglxzDao.findOne(id);
	}
}
