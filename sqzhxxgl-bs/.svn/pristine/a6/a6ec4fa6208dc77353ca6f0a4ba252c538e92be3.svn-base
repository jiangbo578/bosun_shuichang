package com.gouhai.baoshan.service.business.shgl.xfzsx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.xfzsx.TsjbzxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfzsx.Tsjbzx;
import com.gouhai.baoshan.spring.PageableController;


/**
 * 投诉举报咨询台账目录 
 * @author Administrator
 *
 */
@Service
public class TsjbzxService {
	@Autowired
	private TsjbzxDao tsjbzxDao;  
	// 增加
	public void insert(Tsjbzx Tsjbzx) {
		tsjbzxDao.insert(Tsjbzx);
	}

	// 查询
	public Tsjbzx findOne(String id) {
		return tsjbzxDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		tsjbzxDao.delete(id);
	}

	// 查询
	final static String hql = "from Tsjbzx where businessForm=? order by updateDate";

	public List<Tsjbzx> getLzzList(int pageNumber, BusinessForm businessForm) {
		return tsjbzxDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return tsjbzxDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Tsjbzx t) {
		tsjbzxDao.update(t);
	}
}
