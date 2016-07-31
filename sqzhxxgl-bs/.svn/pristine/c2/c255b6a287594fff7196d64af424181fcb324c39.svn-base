package com.gouhai.baoshan.service.business.ggfw.kpgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.kpgz.JcxxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.kpgz.Jcxx;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 基础信息业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class JcxxService {
	@Autowired
	private JcxxDao jcxxDao;
	// 查询
	final static String hql = "from Jcxx where businessForm=? order by updateDate";

	public List<Jcxx> getObjList(int pageNumber, BusinessForm businessForm) {
		return jcxxDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return jcxxDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Jcxx t) {
		jcxxDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		jcxxDao.delete(id);
	}

	// 修改
	public void update(Jcxx t) {
		jcxxDao.update(t);
	}

	public Jcxx findOne(String id) {
		return jcxxDao.findOne(id);
	}
}
