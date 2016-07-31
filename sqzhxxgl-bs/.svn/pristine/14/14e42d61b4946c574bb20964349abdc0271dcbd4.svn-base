package com.gouhai.baoshan.service.business.ggfw.llgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.llgz.LnxxryDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Lnxxry;
import com.gouhai.baoshan.entity.business.ggfw.llgz.head.Lnxx;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class LnxxryService {
	@Autowired
	private LnxxryDao lnxxryDao;
	// 查询
	final static String hql = "from Lnxxry where lnxx=? order by updateDate";

	public List<Lnxxry> getObjList(int pageNumber, Lnxx lnxx) {
		return lnxxryDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, lnxx);
	}

	public long getObjCount(Lnxx lnxx) {
		return lnxxryDao.findCount(hql, lnxx);
	}

	// 增加
	public void insert(Lnxxry t) {
		lnxxryDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		lnxxryDao.delete(id);
	}

	// 修改
	public void update(Lnxxry t) {
		lnxxryDao.update(t);
	}

	public Lnxxry findOne(String id) {
		return lnxxryDao.findOne(id);
	}
}
