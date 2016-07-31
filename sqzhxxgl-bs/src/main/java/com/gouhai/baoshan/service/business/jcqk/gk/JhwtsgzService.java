package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.JwhtsgzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Jwhtsgz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居委特色工作
 * 
 * @author 徐舟
 */
@Service
public class JhwtsgzService {
	@Autowired
	private JwhtsgzDao jwhtsgzDao;
	// 查询
	final static String hql = "from Jwhtsgz where businessForm=? order by updateDate";

	public List<Jwhtsgz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jwhtsgzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jwhtsgzDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Jwhtsgz Jwhtsgz) {
		jwhtsgzDao.insert(Jwhtsgz);
	}

	// 根据主键删除
	public void delete(String id) {
		jwhtsgzDao.delete(id);
	}

	// 修改
	public void update(Jwhtsgz Jwhtsgz) {
		jwhtsgzDao.update(Jwhtsgz);
	}

	public Jwhtsgz findOne(String id) {
		return jwhtsgzDao.findOne(id);
	}
}
