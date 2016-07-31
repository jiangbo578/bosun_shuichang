package com.gouhai.baoshan.service.business.ggfw.xxxsq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.xxxsq.JdkhqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.xxxsq.Jdkhqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 季度考核情况业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class JdkhqkService {
	@Autowired
	private JdkhqkDao jdkhqkDao;
	// 查询
	final static String hql = "from Jdkhqk where businessForm=? order by updateDate";

	public List<Jdkhqk> getObjList(int pageNumber, BusinessForm businessForm) {
		return jdkhqkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return jdkhqkDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Jdkhqk t) {
		jdkhqkDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		jdkhqkDao.delete(id);
	}

	// 修改
	public void update(Jdkhqk t) {
		jdkhqkDao.update(t);
	}

	public Jdkhqk findOne(String id) {
		return jdkhqkDao.findOne(id);
	}
}
