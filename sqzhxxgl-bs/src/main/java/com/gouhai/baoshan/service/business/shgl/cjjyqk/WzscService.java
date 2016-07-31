package com.gouhai.baoshan.service.business.shgl.cjjyqk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.cjjyqk.WzscDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Wzsc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 无照市场业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class WzscService {
	@Autowired
	private WzscDao wzscDao;
	final static String hql = "from Wzsc where businessForm=? order by updateDate";

	// 增加
	public void insert(Wzsc t) {
		wzscDao.insert(t);
	}

	// 查询
	public Wzsc findOne(String id) {
		return wzscDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		wzscDao.delete(id);
	}

	// 查询

	public List<Wzsc> getObjList(int pageNumber, BusinessForm businessForm) {
		return wzscDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return wzscDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Wzsc t) {
		wzscDao.update(t);
	}
}
