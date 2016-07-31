package com.gouhai.baoshan.service.business.ggfw.cjrgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.CjrjtDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Cjrjt;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 低保及一户多残残疾人家庭名册
 * 
 * @author 徐舟
 * 
 */
@Service
public class CjrjtService {
	@Autowired
	private CjrjtDao cjrjtDao;
	// 查询
	final static String hql = "from Cjrjt where businessForm=? order by updateDate";

	public List<Cjrjt> getObjList(int pageNumber, BusinessForm businessForm) {
		return cjrjtDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return cjrjtDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Cjrjt t) {
		cjrjtDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		cjrjtDao.delete(id);
	}

	// 修改
	public void update(Cjrjt t) {
		cjrjtDao.update(t);
	}

	public Cjrjt findOne(String id) {
		return cjrjtDao.findOne(id);
	}
}
