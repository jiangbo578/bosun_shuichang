package com.gouhai.baoshan.service.business.ggfw.hszh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.hszh.HszyjjhdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzbk;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszyjjhd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 、红十字应急救护队名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HszyjjhdService {
	@Autowired
	private HszyjjhdDao hszyjjhdDao;
	// 查询
	final static String hql = "from Hszyjjhd where businessForm=? order by updateDate";

	public List<Hszyjjhd> getObjList(int pageNumber, BusinessForm businessForm) {
		return hszyjjhdDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return hszyjjhdDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Hszyjjhd t) {
		hszyjjhdDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hszyjjhdDao.delete(id);
	}

	// 修改
	public void update(Hszyjjhd t) {
		hszyjjhdDao.update(t);
	}

	public Hszyjjhd findOne(String id) {
		return hszyjjhdDao.findOne(id);
	}
}
