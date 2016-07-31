package com.gouhai.baoshan.service.business.hyjl.rcgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.rcgz.XftjDao;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Xftj;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 信访调解记录 业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class XftjService {
	@Autowired
	private XftjDao xftjDao;
	// 查询
	final static String hql = "from Xftj where user=? order by updateDate";

	public List<Xftj> getObjList(int pageNumber, User user) {
		return xftjDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				user);
	}

	public List<Xftj> getObjList(User user) {
		return xftjDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return xftjDao.findCount(hql, user);
	}

	// 增加
	public void insert(Xftj t) {
		xftjDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		xftjDao.delete(id);
	}

	// 修改
	public void update(Xftj t) {
		xftjDao.update(t);
	}

	public Xftj findOne(String id) {
		return xftjDao.findOne(id);
	}
}
