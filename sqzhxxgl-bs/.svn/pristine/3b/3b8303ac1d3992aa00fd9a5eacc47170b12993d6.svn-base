package com.gouhai.baoshan.service.business.ggfw.hszh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.hszh.HszfwzjzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzjz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 红十字服务站救灾联络员名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HszfwzjzService {
	@Autowired
	private HszfwzjzDao hszfwzjzDao;
	// 查询
	final static String hql = "from Hszfwzjz where businessForm=? order by updateDate";

	public List<Hszfwzjz> getObjList(int pageNumber, BusinessForm businessForm) {
		return hszfwzjzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return hszfwzjzDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Hszfwzjz t) {
		hszfwzjzDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hszfwzjzDao.delete(id);
	}

	// 修改
	public void update(Hszfwzjz t) {
		hszfwzjzDao.update(t);
	}

	public Hszfwzjz findOne(String id) {
		return hszfwzjzDao.findOne(id);
	}
}
