package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.JwhjcqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Jwhjcqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居委会基础情况
 * 
 * @author MedivhQ
 * 
 */
@Service
public class JwhjcqkService {
	@Autowired
	private JwhjcqkDao jwhjcqkDao;

	// 增加
	public void insert(Jwhjcqk Jwhjcqk) {
		jwhjcqkDao.insert(Jwhjcqk);
	}

	// 查询
	public Jwhjcqk findOne(String id) {
		return jwhjcqkDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		jwhjcqkDao.delete(id);
	}

	// 查询
	final static String hql = "from Jwhjcqk where businessForm=? order by updateDate";

	public List<Jwhjcqk> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jwhjcqkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jwhjcqkDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Jwhjcqk t) {
		jwhjcqkDao.update(t);
	}
}

