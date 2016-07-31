package com.gouhai.baoshan.service.business.ggfw.xxxsq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.xxxsq.SqyjjsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.xxxsq.Sqyjjs;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 学习型社区硬件建设业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class SqyjjsService {
	@Autowired
	private SqyjjsDao sqyjjsDao;
	// 查询
	final static String hql = "from Sqyjjs where businessForm=? order by updateDate";

	public List<Sqyjjs> getObjList(int pageNumber, BusinessForm businessForm) {
		return sqyjjsDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return sqyjjsDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Sqyjjs t) {
		sqyjjsDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		sqyjjsDao.delete(id);
	}

	// 修改
	public void update(Sqyjjs t) {
		sqyjjsDao.update(t);
	}

	public Sqyjjs findOne(String id) {
		return sqyjjsDao.findOne(id);
	}
}
