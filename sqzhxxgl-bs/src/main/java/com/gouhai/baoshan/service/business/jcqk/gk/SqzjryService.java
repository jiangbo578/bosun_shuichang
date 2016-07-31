package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.SqzjryDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Sqzjry;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 曾获市、区、镇、街道荣誉业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class SqzjryService {
	@Autowired
	private SqzjryDao sqzjryDao;
	// 查询
	final static String hql = "from Sqzjry where businessForm=? order by updateDate";

	public List<Sqzjry> getLzzList(int pageNumber, BusinessForm businessForm) {
		return sqzjryDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return sqzjryDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Sqzjry sqzjry) {
		sqzjryDao.insert(sqzjry);
	}

	// 根据主键删除
	public void delete(String id) {
		sqzjryDao.delete(id);
	}

	// 修改
	public void update(Sqzjry sqzjry) {
		sqzjryDao.update(sqzjry);
	}

	public Sqzjry findOne(String id) {
		return sqzjryDao.findOne(id);
	}
}
