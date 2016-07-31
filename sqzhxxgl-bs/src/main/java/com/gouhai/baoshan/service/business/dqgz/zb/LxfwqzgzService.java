package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.LxfwqzgzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Lxfwqzgz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 联系服务群众工作统计表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class LxfwqzgzService {
	@Autowired
	private LxfwqzgzDao lxfwqzgzDao;

	// 增加
	public void insert(Lxfwqzgz t) {
		lxfwqzgzDao.insert(t);
	}

	// 查询
	public Lxfwqzgz findOne(String id) {
		return lxfwqzgzDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		lxfwqzgzDao.delete(id);
	}

	// 查询
	final static String hql = "from Lxfwqzgz where businessForm=? order by updateDate";

	public List<Lxfwqzgz> getobjList(int pageNumber, BusinessForm businessForm) {
		return lxfwqzgzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getobjCount(BusinessForm businessForm) {
		return lxfwqzgzDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Lxfwqzgz t) {
		lxfwqzgzDao.update(t);
	}
}
