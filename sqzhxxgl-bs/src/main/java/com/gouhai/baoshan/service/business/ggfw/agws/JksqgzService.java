package com.gouhai.baoshan.service.business.ggfw.agws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.agws.JksqgzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Jksqgz;
import com.gouhai.baoshan.entity.business.ggfw.agws.Kzxqsag;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 健康社区工作统计表 业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class JksqgzService {
	@Autowired
	private JksqgzDao jksqgzDao;
	// 查询
	final static String hql = "from Jksqgz where businessForm=? order by updateDate";

	public List<Jksqgz> getObjList(int pageNumber, BusinessForm businessForm) {
		return jksqgzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return jksqgzDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Jksqgz t) {
		jksqgzDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		jksqgzDao.delete(id);
	}

	// 修改
	public void update(Jksqgz t) {
		jksqgzDao.update(t);
	}

	public Jksqgz findOne(String id) {
		return jksqgzDao.findOne(id);
	}
}
