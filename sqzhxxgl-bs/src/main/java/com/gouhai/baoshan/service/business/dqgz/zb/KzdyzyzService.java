package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.KzdyzyzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Dyzzgxzc;
import com.gouhai.baoshan.entity.business.dqgz.zb.Kzdyzyz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 开展党员志愿者服务活动情况 业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class KzdyzyzService {
	@Autowired
	private KzdyzyzDao kzdyzyzDao;

	// 增加
	public void insert(Kzdyzyz t) {
		kzdyzyzDao.insert(t);
	}

	// 查询
	public Kzdyzyz findOne(String id) {
		return kzdyzyzDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		kzdyzyzDao.delete(id);
	}

	// 查询
	final static String hql = "from Kzdyzyz where businessForm=? order by updateDate";

	public List<Kzdyzyz> getobjList(int pageNumber, BusinessForm businessForm) {
		return kzdyzyzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getobjCount(BusinessForm businessForm) {
		return kzdyzyzDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Kzdyzyz t) {
		kzdyzyzDao.update(t);
	}
}
