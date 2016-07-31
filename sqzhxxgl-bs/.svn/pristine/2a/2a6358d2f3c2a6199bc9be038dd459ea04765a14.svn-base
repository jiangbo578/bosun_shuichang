package com.gouhai.baoshan.service.business.hyjl.rcgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.rcgz.ZyzfwDao;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Zyzfw;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 志愿者服务记录服务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class ZyzfwService {
	@Autowired
	private ZyzfwDao zyzfwDao;
	// 查询
	final static String hql = "from Zyzfw  where user=? order by updateDate";

	public List<Zyzfw> getObjList(int pageNumber, User user) {
		return zyzfwDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				user);
	}

	public List<Zyzfw> getObjList(User user) {
		return zyzfwDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return zyzfwDao.findCount(hql, user);
	}

	// 增加
	public void insert(Zyzfw t) {
		zyzfwDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		zyzfwDao.delete(id);
	}

	// 修改
	public void update(Zyzfw t) {
		zyzfwDao.update(t);
	}

	public Zyzfw findOne(String id) {
		return zyzfwDao.findOne(id);
	}
}
