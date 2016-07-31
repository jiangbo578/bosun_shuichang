package com.gouhai.baoshan.service.business.shgl.spaq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.spaq.WzspdwpcDao;
import com.gouhai.baoshan.entity.business.shgl.spaq.Wzspdwpcbt;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Wzspdwpc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 无证食品单位季度隐患排查表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class WzspdwpcServce {
	@Autowired
	private WzspdwpcDao wzspdwpcDao;

	// 增加
	public void insert(Wzspdwpcbt t) {
		wzspdwpcDao.insert(t);
	}

	// 查询
	public Wzspdwpcbt findOne(String id) {
		return wzspdwpcDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		wzspdwpcDao.delete(id);
	}

	// 查询
	final static String hql = "from Wzspdwpcbt where wzspdwpc=? order by updateDate";

	public List<Wzspdwpcbt> getObjList(int pageNumber, Wzspdwpc businessForm) {
		return wzspdwpcDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(Wzspdwpc businessForm) {
		return wzspdwpcDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Wzspdwpcbt t) {
		wzspdwpcDao.update(t);
	}

}
