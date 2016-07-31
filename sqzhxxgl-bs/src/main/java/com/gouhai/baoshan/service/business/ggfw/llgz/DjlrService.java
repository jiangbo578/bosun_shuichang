package com.gouhai.baoshan.service.business.ggfw.llgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.llgz.DjlrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Djlr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 独居老人名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class DjlrService {
	@Autowired
	private DjlrDao djlrDao;
	// 查询
	final static String hql = "from Djlr where businessForm=? order by updateDate";

	public List<Djlr> getObjList(int pageNumber, BusinessForm businessForm) {
		return djlrDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return djlrDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Djlr t) {
		djlrDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		djlrDao.delete(id);
	}

	// 修改
	public void update(Djlr t) {
		djlrDao.update(t);
	}

	public Djlr findOne(String id) {
		return djlrDao.findOne(id);
	}
}
