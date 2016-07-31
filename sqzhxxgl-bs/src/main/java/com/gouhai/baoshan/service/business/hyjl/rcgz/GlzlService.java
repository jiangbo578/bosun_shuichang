package com.gouhai.baoshan.service.business.hyjl.rcgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.rcgz.GlzlDao;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Glzl;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 各类资料发放记录业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class GlzlService {
	@Autowired
	private GlzlDao glzlDao;
	// 查询
	final static String hql = "from Glzl where user=? order by updateDate";

	public List<Glzl> getObjList(int pageNumber, User user) {
		return glzlDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				user);
	}

	public List<Glzl> getObjList(User user) {
		return glzlDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return glzlDao.findCount(hql, user);
	}

	// 增加
	public void insert(Glzl t) {
		glzlDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		glzlDao.delete(id);
	}

	// 修改
	public void update(Glzl t) {
		glzlDao.update(t);
	}

	public Glzl findOne(String id) {
		return glzlDao.findOne(id);
	}
}
