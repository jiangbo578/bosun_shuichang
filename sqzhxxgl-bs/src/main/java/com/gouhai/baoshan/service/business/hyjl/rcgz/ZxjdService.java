package com.gouhai.baoshan.service.business.hyjl.rcgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.rcgz.ZxjdDao;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Zxjd;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 咨询接待记录业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class ZxjdService {
	@Autowired
	private ZxjdDao zxjdDao;
	// 查询
	final static String hql = "from Zxjd where user=? order by updateDate";

	public List<Zxjd> getObjList(int pageNumber, User user) {
		return zxjdDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				user);
	}

	public List<Zxjd> getObjList(User user) {
		return zxjdDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return zxjdDao.findCount(hql, user);
	}

	// 增加
	public void insert(Zxjd t) {
		zxjdDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		zxjdDao.delete(id);
	}

	// 修改
	public void update(Zxjd t) {
		zxjdDao.update(t);
	}

	public Zxjd findOne(String id) {
		return zxjdDao.findOne(id);
	}
}
