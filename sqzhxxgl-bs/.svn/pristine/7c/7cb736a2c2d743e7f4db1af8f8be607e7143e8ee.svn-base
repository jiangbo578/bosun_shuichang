package com.gouhai.baoshan.service.business.shgl.nchjzl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.TzwpDao;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Tzwpbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Tzwp;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class TzwpService {
	@Autowired
	private TzwpDao tzwpDao;
	private final static String hql = "from Tzwpbt where tzwp=? order by updateDate";

	// 增加
	public void insert(Tzwpbt t) {
		tzwpDao.insert(t);
	}

	// 查询
	public Tzwpbt findOne(String id) {
		return tzwpDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		tzwpDao.delete(id);
	}

	// 查询

	public List<Tzwpbt> getObjList(int pageNumber, Tzwp tzwp) {
		return tzwpDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				tzwp);
	}

	// 查询全部
	public List<Tzwpbt> getAll(Tzwp tzwp) {
		return tzwpDao.findAll(hql, tzwp);
	}

	public long getObjCount(Tzwp tzwp) {

		return tzwpDao.findCount(hql, tzwp);
	}

	// 修改
	public void update(Tzwpbt t) {
		tzwpDao.update(t);
	}
}
