package com.gouhai.baoshan.service.business.ggfw.cjrgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.TyhdcjrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Tyhdcjr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 参加社区体育活动的残疾人名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class TyhdcjrService {
	@Autowired
	private TyhdcjrDao tyhdcjrDao;
	// 查询
	final static String hql = "from Tyhdcjr where businessForm=? order by updateDate";

	public List<Tyhdcjr> getObjList(int pageNumber, BusinessForm businessForm) {
		return tyhdcjrDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return tyhdcjrDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Tyhdcjr t) {
		tyhdcjrDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		tyhdcjrDao.delete(id);
	}

	// 修改
	public void update(Tyhdcjr t) {
		tyhdcjrDao.update(t);
	}

	public Tyhdcjr findOne(String id) {
		return tyhdcjrDao.findOne(id);
	}
}
