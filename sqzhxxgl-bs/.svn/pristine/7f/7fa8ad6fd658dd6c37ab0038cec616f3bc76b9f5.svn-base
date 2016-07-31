package com.gouhai.baoshan.service.business.ggfw.cjrgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.CjrmdDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Cjrmd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 残疾人名单业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class CjrmdService {
	@Autowired
	private CjrmdDao cjrmdDao;
	// 查询
	final static String hql = "from Cjrmd where businessForm=? order by updateDate";

	public List<Cjrmd> getObjList(int pageNumber, BusinessForm businessForm) {
		return cjrmdDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return cjrmdDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Cjrmd t) {
		cjrmdDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		cjrmdDao.delete(id);
	}

	// 修改
	public void update(Cjrmd t) {
		cjrmdDao.update(t);
	}

	public Cjrmd findOne(String id) {
		return cjrmdDao.findOne(id);
	}
}
