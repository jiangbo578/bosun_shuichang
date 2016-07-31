package com.gouhai.baoshan.service.business.ggfw.hszh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.hszh.HszfwzwzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzhy;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzwz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 红十字服务站物资业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HszfwzwzService {
	@Autowired
	private HszfwzwzDao hszfwzwzDao;
	// 查询
	final static String hql = "from Hszfwzwz where businessForm=? order by updateDate";

	public List<Hszfwzwz> getObjList(int pageNumber, BusinessForm businessForm) {
		return hszfwzwzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return hszfwzwzDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Hszfwzwz t) {
		hszfwzwzDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hszfwzwzDao.delete(id);
	}

	// 修改
	public void update(Hszfwzwz t) {
		hszfwzwzDao.update(t);
	}

	public Hszfwzwz findOne(String id) {
		return hszfwzwzDao.findOne(id);
	}
}
