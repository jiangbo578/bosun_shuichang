package com.gouhai.baoshan.service.business.ggfw.agws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.agws.JkjyryDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Jkjyry;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzwz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 生干部、健康教育专兼职人员业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class JkjyryService {
	@Autowired
	private JkjyryDao jkjyryDao;
	// 查询
	final static String hql = "from Jkjyry where businessForm=? order by updateDate";

	public List<Jkjyry> getObjList(int pageNumber, BusinessForm businessForm) {
		return jkjyryDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return jkjyryDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Jkjyry t) {
		jkjyryDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		jkjyryDao.delete(id);
	}

	// 修改
	public void update(Jkjyry t) {
		jkjyryDao.update(t);
	}

	public Jkjyry findOne(String id) {
		return jkjyryDao.findOne(id);
	}
}
