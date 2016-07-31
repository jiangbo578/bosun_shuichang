package com.gouhai.baoshan.service.business.hyjl.rcgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.rcgz.JkqkDao;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Jkqk;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 捐款（捐物）情况记录业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class JkqkService {
	@Autowired
	private JkqkDao jkqkDao;
	// 查询
	final static String hql = "from Jkqk   where user=? order by updateDate";

	public List<Jkqk> getObjList(int pageNumber, User user) {
		return jkqkDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				user);
	}

	public List<Jkqk> getObjList(User user) {
		return jkqkDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return jkqkDao.findCount(hql, user);
	}

	// 增加
	public void insert(Jkqk t) {
		jkqkDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		jkqkDao.delete(id);
	}

	// 修改
	public void update(Jkqk t) {
		jkqkDao.update(t);
	}

	public Jkqk findOne(String id) {
		return jkqkDao.findOne(id);
	}
}
