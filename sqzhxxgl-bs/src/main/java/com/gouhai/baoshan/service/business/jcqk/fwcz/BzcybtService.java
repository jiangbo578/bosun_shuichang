package com.gouhai.baoshan.service.business.jcqk.fwcz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.fwcz.BzcybtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.fwcz.Bzcybt;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 团支部概况及班子成员名单
 * 
 * @author MedivhQ
 * 
 */
@Service
public class BzcybtService {
	@Autowired
	private BzcybtDao bzcybtDao;

	// 增加
	public void insert(Bzcybt bzcybt) {
		bzcybtDao.insert(bzcybt);
	}

	// 查询
	public Bzcybt findOne(String id) {
		return bzcybtDao.findOne(id);
	}
	// 查询
		final static String hql = "from Bzcybt where businessForm=? order by updateDate";
	public Bzcybt findOne(BusinessForm businessForm){
		
		return bzcybtDao.findOne(hql,businessForm);
	}
	// 删除
	public void delete(String id) {
		bzcybtDao.delete(id);
	}

	

	public List<Bzcybt> getLzzList(int pageNumber, BusinessForm businessForm) {
		return bzcybtDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return bzcybtDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Bzcybt t) {
		bzcybtDao.update(t);
	}
}
