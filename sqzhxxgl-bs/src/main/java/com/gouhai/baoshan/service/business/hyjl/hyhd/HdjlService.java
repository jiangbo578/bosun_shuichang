package com.gouhai.baoshan.service.business.hyjl.hyhd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.hyhd.HdjlDao;
import com.gouhai.baoshan.entity.business.hyjl.hyhd.Hdjl;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 活动记录业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HdjlService {
	@Autowired
	private HdjlDao hdjlDao;
	// 查询
	final static String hql = "from Hdjl where user=? order by updateDate";

	public List<Hdjl> getObjList(int pageNumber, User user) {
		return hdjlDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				user);
	}

	public List<Hdjl> getObjList(User user) {
		return hdjlDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return hdjlDao.findCount(hql, user);
	}

	// 增加
	public void insert(Hdjl t) {
		hdjlDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hdjlDao.delete(id);
	}

	// 修改
	public void update(Hdjl t) {
		hdjlDao.update(t);
	}

	public Hdjl findOne(String id) {
		return hdjlDao.findOne(id);
	}
}
