package com.gouhai.baoshan.service.business.ggfw.cjrgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.WycjrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Wycjr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 无业残疾人名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class WycjrService {
	@Autowired
	private WycjrDao wycjrDao;
	// 查询
	final static String hql = "from Wycjr where businessForm=? order by updateDate";

	public List<Wycjr> getObjList(int pageNumber, BusinessForm businessForm) {
		return wycjrDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return wycjrDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Wycjr t) {
		wycjrDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		wycjrDao.delete(id);
	}

	// 修改
	public void update(Wycjr t) {
		wycjrDao.update(t);
	}

	public Wycjr findOne(String id) {
		return wycjrDao.findOne(id);
	}
}
