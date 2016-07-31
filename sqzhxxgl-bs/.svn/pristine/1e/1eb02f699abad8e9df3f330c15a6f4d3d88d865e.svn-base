package com.gouhai.baoshan.service.business.ggfw.xxxsq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.xxxsq.ZdsjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.xxxsq.Jdkhqk;
import com.gouhai.baoshan.entity.business.ggfw.xxxsq.Zdsj;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 52、重大事件记载业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class ZdsjService {
	@Autowired
	private ZdsjDao zdsjDao;
	// 查询
	final static String hql = "from Zdsj where businessForm=? order by updateDate";

	public List<Zdsj> getObjList(int pageNumber, BusinessForm businessForm) {
		return zdsjDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return zdsjDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Zdsj t) {
		zdsjDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		zdsjDao.delete(id);
	}

	// 修改
	public void update(Zdsj t) {
		zdsjDao.update(t);
	}

	public Zdsj findOne(String id) {
		return zdsjDao.findOne(id);
	}
}
