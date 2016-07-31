package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.LxfwgzsjwtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Lxfwgzsjwt;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 联系服务工作收集问题提交单业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class LxfwgzsjwtService {
	@Autowired
	private LxfwgzsjwtDao lxfwgzsjwtDao;

	// 增加
	public void insert(Lxfwgzsjwt t) {
		lxfwgzsjwtDao.insert(t);
	}

	// 查询
	public Lxfwgzsjwt findOne(String id) {
		return lxfwgzsjwtDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		lxfwgzsjwtDao.delete(id);
	}

	// 查询
	final static String hql = "from Lxfwgzsjwt where businessForm=? order by updateDate";

	public List<Lxfwgzsjwt> getobjList(int pageNumber, BusinessForm businessForm) {
		return lxfwgzsjwtDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getobjCount(BusinessForm businessForm) {
		return lxfwgzsjwtDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Lxfwgzsjwt t) {
		lxfwgzsjwtDao.update(t);
	}
}
