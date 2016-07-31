package com.gouhai.baoshan.service.business.ggfw.agws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.agws.WsjfDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Wsjf;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 卫生经费使用情况业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class WsjfService {
	@Autowired
	private WsjfDao wsjfDao;
	// 查询
	final static String hql = "from Wsjf where businessForm=? order by updateDate";

	public List<Wsjf> getObjList(int pageNumber, BusinessForm businessForm) {
		return wsjfDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return wsjfDao.findCount(hql, businessForm);
	}

	// 查询全部的
	public double getSum(BusinessForm businessForm) {
		double sum = 0;
		List<Wsjf> list = wsjfDao.findAll(hql, businessForm);
		for (Wsjf wsjf : list) {
			sum = (wsjf.getPrice() + sum);
		}
		return sum;
	}

	// 增加
	public void insert(Wsjf t) {
		wsjfDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		wsjfDao.delete(id);
	}

	// 修改
	public void update(Wsjf t) {
		wsjfDao.update(t);
	}

	public Wsjf findOne(String id) {
		return wsjfDao.findOne(id);
	}
}
