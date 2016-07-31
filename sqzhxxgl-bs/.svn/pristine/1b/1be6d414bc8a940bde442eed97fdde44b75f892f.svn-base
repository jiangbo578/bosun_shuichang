package com.gouhai.baoshan.service.business.ggfw.llgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.llgz.TklrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Gllr;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Tklr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 特困老人名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class TklrService {
	@Autowired
	private TklrDao tklrDao;
	// 查询
	final static String hql = "from Tklr where businessForm=? order by updateDate";

	public List<Tklr> getObjList(int pageNumber, BusinessForm businessForm) {
		return tklrDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return tklrDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Tklr t) {
		tklrDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		tklrDao.delete(id);
	}

	// 修改
	public void update(Tklr t) {
		tklrDao.update(t);
	}

	public Tklr findOne(String id) {
		return tklrDao.findOne(id);
	}
}
