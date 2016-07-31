package com.gouhai.baoshan.service.business.shgl.nchjzl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.WptzDao;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Wptzbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Wptz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 田间（经济林）窝棚台帐业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class WptzService {
	@Autowired
	private WptzDao wptzDao;
	private final static String hql = "from Wptzbt where wptz=? order by updateDate";

	// 增加
	public void insert(Wptzbt t) {
		wptzDao.insert(t);
	}

	// 查询
	public Wptzbt findOne(String id) {
		return wptzDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		wptzDao.delete(id);
	}

	// 查询

	public List<Wptzbt> getObjList(int pageNumber, Wptz wptz) {
		return wptzDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				wptz);
	}

	public List<Wptzbt> getAll(Wptz wptz) {
		return wptzDao.findAll(hql, wptz);
	}

	public long getObjCount(Wptz wptz) {

		return wptzDao.findCount(hql, wptz);
	}

	// 修改
	public void update(Wptzbt t) {
		wptzDao.update(t);
	}
}
