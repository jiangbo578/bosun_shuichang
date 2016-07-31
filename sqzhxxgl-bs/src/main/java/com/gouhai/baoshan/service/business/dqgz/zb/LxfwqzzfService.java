/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.LxfwqzzfDao;
import com.gouhai.baoshan.dao.business.dqgz.zb.LxfwqzzfZfrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Lxfwqzzf;
import com.gouhai.baoshan.entity.business.dqgz.zb.LxfwqzzfZfr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author Rui
 * 
 */
@Service
public class LxfwqzzfService {

	@Autowired
	private LxfwqzzfZfrDao lxfwqzzfZfrDao;

	@Autowired
	private LxfwqzzfDao lxfwqzzfDao;

	public List<Lxfwqzzf> getLxfwqzzfList(BusinessForm businessForm,
			int pageNumber) {
		return lxfwqzzfDao.findList(
				"from Lxfwqzzf where businessForm=? order by updateDate",
				pageNumber, PageableController.PAGE_SIZE, businessForm);
	}

	public long getLxfwqzzfCount(BusinessForm businessForm) {
		return lxfwqzzfDao.findCount("from Lxfwqzzf where businessForm=?",
				businessForm);
	}

	public void insert(Lxfwqzzf lxfwqzzf) {
		lxfwqzzfDao.insert(lxfwqzzf);
	}

	public void delete(String id, String businessFormId) {
		Lxfwqzzf lxfwqzzf = findOne(id);
		if (lxfwqzzf.getBusinessForm().getId().equals(businessFormId)) {
			lxfwqzzfDao.delete(lxfwqzzf);
		}
	}

	public Lxfwqzzf findOne(String id) {
		return lxfwqzzfDao.findOne(id);
	}

	public LxfwqzzfZfr findOneZl(String id) {
		return lxfwqzzfZfrDao.findOne(id);
	}

	public void update(Lxfwqzzf t) {
		lxfwqzzfDao.update(t);
	}

	// 增加子类
	public void insert(LxfwqzzfZfr lxfwqzzfZfr) {
		lxfwqzzfZfrDao.insert(lxfwqzzfZfr);
	}

	// 查询子类
	public List<LxfwqzzfZfr> getObjOne(Lxfwqzzf lxfwqzzf, int pageNumber) {
		return lxfwqzzfZfrDao.findList(
				"from LxfwqzzfZfr where lxfwqzzf=? order by updateDate",
				pageNumber, PageableController.PAGE_SIZE, lxfwqzzf);
	}

	public long getObjOneCount(Lxfwqzzf lxfwqzzf) {
		return lxfwqzzfDao.findCount("from LxfwqzzfZfr where lxfwqzzf=?",
				lxfwqzzf);
	}
//更新子类
	public void updateZl(LxfwqzzfZfr t){
		lxfwqzzfZfrDao.update(t);
	}
	public void deleteZl(String id){
		lxfwqzzfZfrDao.delete(id);
	}
}
