package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.CwjdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Cwjd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 村务监督委员会成员名单业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class CwjdService {
	@Autowired
	private CwjdDao cwjdDao;

	// 增加
	public void insert(Cwjd Cwjd) {
		cwjdDao.insert(Cwjd);
	}

	// 查询
	public Cwjd findOne(String id) {
		return cwjdDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		cwjdDao.delete(id);
	}

	// 查询
	final static String hql = "from Cwjd where businessForm=? order by updateDate";

	public List<Cwjd> getLzzList(int pageNumber, BusinessForm businessForm) {
		return cwjdDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return cwjdDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Cwjd t) {
		cwjdDao.update(t);
	}
}
