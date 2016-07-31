package com.gouhai.baoshan.service.business.ggfw.cjrgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.CjrhdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Cjrhd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 参加残疾人睦邻点活动人员名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class CjrhdService {
	@Autowired
	private CjrhdDao cjrhdDao;
	// 查询
	final static String hql = "from Cjrhd where businessForm=? order by updateDate";

	public List<Cjrhd> getObjList(int pageNumber, BusinessForm businessForm) {
		return cjrhdDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return cjrhdDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Cjrhd t) {
		cjrhdDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		cjrhdDao.delete(id);
	}

	// 修改
	public void update(Cjrhd t) {
		cjrhdDao.update(t);
	}

	public Cjrhd findOne(String id) {
		return cjrhdDao.findOne(id);
	}
}
