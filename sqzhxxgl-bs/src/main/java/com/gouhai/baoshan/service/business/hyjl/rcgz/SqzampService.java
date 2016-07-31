package com.gouhai.baoshan.service.business.hyjl.rcgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.rcgz.SqzampDao;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Sqzamp;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 社区治安、安全排摸、矛盾纠纷排查记录
 * 
 * @author 徐舟
 * 
 */
@Service
public class SqzampService {
	@Autowired
	private SqzampDao sqzampDao;
	// 查询
	final static String hql = "from Sqzamp where user=? order by updateDate";

	public List<Sqzamp> getObjList(int pageNumber, User user) {
		return sqzampDao
				.findList(hql, pageNumber, PageableController.PAGE_SIZE,user);
	}

	public List<Sqzamp> getObjList(User user) {
		return sqzampDao.findAll(hql, user);
	}

	public long getObjCount(User user) {
		return sqzampDao.findCount(hql, user);
	}

	// 增加
	public void insert(Sqzamp t) {
		sqzampDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		sqzampDao.delete(id);
	}

	// 修改
	public void update(Sqzamp t) {
		sqzampDao.update(t);
	}

	public Sqzamp findOne(String id) {
		return sqzampDao.findOne(id);
	}
}
