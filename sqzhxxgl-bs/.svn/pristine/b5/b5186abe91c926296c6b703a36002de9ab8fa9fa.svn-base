package com.gouhai.baoshan.service.business.jcqk.ncjz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.ncjz.GdzctzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.ncjz.Gdzctz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 固定资产台账
 * 
 * @author MedivhQ
 * 
 */
@Service
public class GdzctzService {
	@Autowired
	private GdzctzDao gdzctzDao;

	// 增加
	public void insert(Gdzctz gdzctz) {
		gdzctzDao.insert(gdzctz);
	}

	// 查询
	public Gdzctz findOne(String id) {
		return gdzctzDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		gdzctzDao.delete(id);
	}

	// 查询
	final static String hql = "from Gdzctz where businessForm=? order by updateDate";

	public List<Gdzctz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return gdzctzDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return gdzctzDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Gdzctz t) {
		gdzctzDao.update(t);
	}
}
