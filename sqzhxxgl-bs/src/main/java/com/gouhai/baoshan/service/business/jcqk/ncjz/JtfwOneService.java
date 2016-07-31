package com.gouhai.baoshan.service.business.jcqk.ncjz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.ncjz.JtfwOneDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.ncjz.Jtfwone;
import com.gouhai.baoshan.spring.PageableController;

/**
 *集体房屋、土地经营（出租）情况台账（表一）
 * 
 * @author MedivhQ
 * 
 */
@Service
public class JtfwOneService {
	@Autowired
	private JtfwOneDao jtfwOneDao;

	// 增加
	public void insert(Jtfwone jtfwOne) {
		jtfwOneDao.insert(jtfwOne);
	}

	// 查询
	public Jtfwone findOne(String id) {
		return jtfwOneDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		jtfwOneDao.delete(id);
	}

	// 查询
	final static String hql = "from Jtfwone where businessForm=? order by updateDate";

	public List<Jtfwone> getLzzList(int pageNumber, BusinessForm businessForm) {
		return jtfwOneDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return jtfwOneDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Jtfwone t) {
		jtfwOneDao.update(t);
	}
}
