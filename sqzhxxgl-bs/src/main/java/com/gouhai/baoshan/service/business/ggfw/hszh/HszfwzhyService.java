package com.gouhai.baoshan.service.business.ggfw.hszh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.hszh.HszfwzhyDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzhy;
import com.gouhai.baoshan.entity.business.jcqk.gk.Gxfw;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 红十字服务站会员名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HszfwzhyService {
	@Autowired
	private HszfwzhyDao hszfwzhyDao;

	// 查询
	final static String hql = "from Hszfwzhy where businessForm=? order by updateDate";

	public List<Hszfwzhy> getObjList(int pageNumber, BusinessForm businessForm) {
		return hszfwzhyDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return hszfwzhyDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Hszfwzhy t) {
		hszfwzhyDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hszfwzhyDao.delete(id);
	}

	// 修改
	public void update(Hszfwzhy t) {
		hszfwzhyDao.update(t);
	}

	public Hszfwzhy findOne(String id) {
		return hszfwzhyDao.findOne(id);
	}
}
