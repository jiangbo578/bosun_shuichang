package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.JwhqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Jwhqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居委会情况业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class JwhqkService {
	@Autowired
	private JwhqkDao jwhqkDao;
	// 查询
	final static String hql = "from Jwhqk where businessForm=? order by updateDate";

	public List<Jwhqk> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jwhqkDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jwhqkDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Jwhqk szbj) {
		jwhqkDao.insert(szbj);
	}

	// 根据主键删除
	public void delete(String id) {
		jwhqkDao.delete(id);
	}

	// 修改
	public void update(Jwhqk szbj) {
		jwhqkDao.update(szbj);
	}

	public Jwhqk findOne(String id) {
		return jwhqkDao.findOne(id);
	}
}
