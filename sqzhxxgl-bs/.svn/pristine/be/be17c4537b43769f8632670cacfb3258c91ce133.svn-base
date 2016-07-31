package com.gouhai.baoshan.service.business.hyjl.rcgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.rcgz.ZfqkDao;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Zfqk;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 走访情况记录 业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class ZfqkService {
	@Autowired
	private ZfqkDao zfqkDao;
	// 查询
	final static String hql = "from Zfqk  where user=? order by updateDate";

	public List<Zfqk> getObjList(int pageNumber, User user) {
		return zfqkDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				user);
	}

	public List<Zfqk> getObjList(User user) {
		return zfqkDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return zfqkDao.findCount(hql, user);
	}

	// 增加
	public void insert(Zfqk t) {
		zfqkDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		zfqkDao.delete(id);
	}

	// 修改
	public void update(Zfqk t) {
		zfqkDao.update(t);
	}

	public Zfqk findOne(String id) {
		return zfqkDao.findOne(id);
	}
}
