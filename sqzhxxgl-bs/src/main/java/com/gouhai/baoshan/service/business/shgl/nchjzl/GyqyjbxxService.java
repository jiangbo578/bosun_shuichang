package com.gouhai.baoshan.service.business.shgl.nchjzl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.GyqyjbxxDao;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Gyqyjbxxbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Gyqyjbxx;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 工业企业基本信息业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class GyqyjbxxService {
	@Autowired
	private GyqyjbxxDao gyqyjbxxDao;
	private final static String hql = "from Gyqyjbxxbt where gyqyjbxx=? order by updateDate";

	// 增加
	public void insert(Gyqyjbxxbt t) {
		gyqyjbxxDao.insert(t);
	}

	// 查询
	public Gyqyjbxxbt findOne(String id) {
		return gyqyjbxxDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		gyqyjbxxDao.delete(id);
	}

	// 查询

	public List<Gyqyjbxxbt> getObjList(int pageNumber, Gyqyjbxx businessForm) {
		return gyqyjbxxDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(Gyqyjbxx businessForm) {

		return gyqyjbxxDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Gyqyjbxxbt t) {
		gyqyjbxxDao.update(t);
	}
}
