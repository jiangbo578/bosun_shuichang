package com.gouhai.baoshan.service.business.ggfw.hszh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.hszh.HszfwztkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwztk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 红十字服务站特困家庭名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HszfwztkService {
	@Autowired
	private HszfwztkDao hszfwztkDao;
	// 查询
	final static String hql = "from Hszfwztk where businessForm=? order by updateDate";

	public List<Hszfwztk> getObjList(int pageNumber, BusinessForm businessForm) {
		return hszfwztkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return hszfwztkDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Hszfwztk t) {
		hszfwztkDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hszfwztkDao.delete(id);
	}

	// 修改
	public void update(Hszfwztk t) {
		hszfwztkDao.update(t);
	}

	public Hszfwztk findOne(String id) {
		return hszfwztkDao.findOne(id);
	}
}
