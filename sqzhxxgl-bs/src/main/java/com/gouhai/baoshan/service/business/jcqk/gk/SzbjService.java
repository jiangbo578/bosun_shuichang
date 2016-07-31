package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.SzbjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Szbj;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 四至边界业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class SzbjService {
	@Autowired
	private SzbjDao szbjDao;
	// 查询
	final static String hql = "from Szbj where businessForm=? order by updateDate";

	public List<Szbj> getLzzList(int pageNumber, BusinessForm businessForm) {
		return szbjDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return szbjDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Szbj szbj) {
		szbjDao.insert(szbj);
	}

	// 根据主键删除
	public void delete(String id) {
		szbjDao.delete(id);
	}

	// 修改
	public void update(Szbj szbj) {
		szbjDao.update(szbj);
	}

	public Szbj findOne(String id) {
		return szbjDao.findOne(id);
	}
}
