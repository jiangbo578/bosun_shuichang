package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.JwcwjdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Jwcwjd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居务村务监督委员名单
 * 
 * @author MedivhQ
 * 
 */
@Service
public class JwcwjdService {
	@Autowired
	private JwcwjdDao jwcwjdDao;

	// 增加
	public void insert(Jwcwjd jwcwjd) {
		jwcwjdDao.insert(jwcwjd);
	}

	// 查询
	public Jwcwjd findOne(String id) {
		return jwcwjdDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		jwcwjdDao.delete(id);
	}

	// 查询
	final static String hql = "from Jwcwjd where businessForm=? order by updateDate";

	public List<Jwcwjd> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jwcwjdDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jwcwjdDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Jwcwjd t) {
		jwcwjdDao.update(t);
	}
}
