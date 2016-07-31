package com.gouhai.baoshan.service.business.ggfw.cjrgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.CjrjbqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Cjrjbqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 残疾人协会基本情况业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class CjrJbqkService {
	@Autowired
	private CjrjbqkDao cjrjbqkDao;
	// 查询
	final static String hql = "from Cjrjbqk where businessForm=? order by updateDate";

	public List<Cjrjbqk> getObjList(int pageNumber, BusinessForm businessForm) {
		return cjrjbqkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return cjrjbqkDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Cjrjbqk t) {
		cjrjbqkDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		cjrjbqkDao.delete(id);
	}

	// 修改
	public void update(Cjrjbqk t) {
		cjrjbqkDao.update(t);
	}

	public Cjrjbqk findOne(String id) {
		return cjrjbqkDao.findOne(id);
	}
}
