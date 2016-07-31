   package com.gouhai.baoshan.service.business.jcqk.tdgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.tdgl.TdglrcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.tdgl.Tdglrc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 土地管理日程
 * 
 * @author MedivhQ
 * 
 */
@Service
public class TdglrcService {
	@Autowired
	private TdglrcDao tdglrcDao;

	// 增加
	public void insert(Tdglrc Tdglrc) {
		tdglrcDao.insert(Tdglrc);
	}

	// 查询
	public Tdglrc findOne(String id) {
		return tdglrcDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		tdglrcDao.delete(id);
	}

	// 查询
	final static String hql = "from Tdglrc where businessForm=? order by updateDate";

	public List<Tdglrc> getLzzList(int pageNumber, BusinessForm businessForm) {
		return tdglrcDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return tdglrcDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Tdglrc t) {
		tdglrcDao.update(t);
	}
}
