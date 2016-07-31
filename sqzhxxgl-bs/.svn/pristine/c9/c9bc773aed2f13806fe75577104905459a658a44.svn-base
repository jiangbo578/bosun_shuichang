package com.gouhai.baoshan.service.business.jcqk.ncjz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.ncjz.JtfwTwoDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.ncjz.Jtfwtwo;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 固定资产台账
 * 
 * @author MedivhQ
 * 
 */
@Service
public class JtfwTwoService {
	@Autowired
	private JtfwTwoDao jtfwTwoDao;

	// 增加
	public void insert(Jtfwtwo jtfwTwo) {
		jtfwTwoDao.insert(jtfwTwo);
	}

	// 查询
	public Jtfwtwo findOne(String id) {
		return jtfwTwoDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		jtfwTwoDao.delete(id);
	}

	// 查询
	final static String hql = "from Jtfwtwo where businessForm=? order by updateDate";

	public List<Jtfwtwo> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jtfwTwoDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jtfwTwoDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Jtfwtwo t) {
		jtfwTwoDao.update(t);
	}
}
