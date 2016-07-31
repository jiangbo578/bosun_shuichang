package com.gouhai.baoshan.service.business.shgl.cjjyqk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.cjjyqk.WzwzjyhDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Wzwzjyh;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 无证无照经营户业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class WzwzjyhService {
	@Autowired
	private WzwzjyhDao wzwzjyhDao;
	final static String hql = "from Wzwzjyh where businessForm=? order by updateDate";

	// 增加
	public void insert(Wzwzjyh t) {
		wzwzjyhDao.insert(t);
	}

	// 查询
	public Wzwzjyh findOne(String id) {
		return wzwzjyhDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		wzwzjyhDao.delete(id);
	}

	// 查询

	public List<Wzwzjyh> getObjList(int pageNumber, BusinessForm businessForm) {
		return wzwzjyhDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return wzwzjyhDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Wzwzjyh t) {
		wzwzjyhDao.update(t);
	}
	public List<Wzwzjyh> getAll(BusinessForm businessForm){
		return wzwzjyhDao.findAll(hql, businessForm);
	}
}
