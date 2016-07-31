package com.gouhai.baoshan.service.business.hyjl.hyhd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.hyhd.XcjlDao;
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Xcjl;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 宣传记录业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class XcjlService {
	@Autowired
	private XcjlDao xcjlDao;
	// 查询
	final static String hql = "from Xcjl where user=? order by updateDate";

	public List<Xcjl> getObjList(int pageNumber, User user) {
		return xcjlDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				user);
	}

	public List<Xcjl> getObjList(User user) {
		return xcjlDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return xcjlDao.findCount(hql, user);
	}

	// 增加
	public void insert(Xcjl t) {
		xcjlDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		xcjlDao.delete(id);
	}

	// 修改
	public void update(Xcjl t) {
		xcjlDao.update(t);
	}

	public Xcjl findOne(String id) {
		return xcjlDao.findOne(id);
	}
}
