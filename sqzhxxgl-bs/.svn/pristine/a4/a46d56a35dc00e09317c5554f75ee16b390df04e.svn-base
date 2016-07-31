package com.gouhai.baoshan.service.business.ggfw.hszh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.hszh.HszfwzwzjcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzwzjc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 红十字服务站物资出借明细业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HszfwzwzjcService {
	@Autowired
	private HszfwzwzjcDao hszfwzwzjcDao;
	// 查询
	final static String hql = "from Hszfwzwzjc where businessForm=? order by updateDate";

	public List<Hszfwzwzjc> getObjList(int pageNumber, BusinessForm businessForm) {
		return hszfwzwzjcDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return hszfwzwzjcDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Hszfwzwzjc t) {
		hszfwzwzjcDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hszfwzwzjcDao.delete(id);
	}

	// 修改
	public void update(Hszfwzwzjc t) {
		hszfwzwzjcDao.update(t);
	}

	public Hszfwzwzjc findOne(String id) {
		return hszfwzwzjcDao.findOne(id);
	}
}
