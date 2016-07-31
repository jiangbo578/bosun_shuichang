package com.gouhai.baoshan.service.business.jcqk.wzjzcz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.wzjzcz.DwwzjzczDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.wzjzcz.Dwwzjzcz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 单位违章建筑处置
 * 
 * @author MedivhQ
 * 
 */
@Service
public class DwwzjzczService {
	@Autowired
	private DwwzjzczDao dwwzjzczDao;

	// 增加
	public void insert(Dwwzjzcz Dwwzjzcz) {
		dwwzjzczDao.insert(Dwwzjzcz);
	}

	// 查询
	public Dwwzjzcz findOne(String id) {
		return dwwzjzczDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		dwwzjzczDao.delete(id);
	}

	// 查询
	final static String hql = "from Dwwzjzcz where businessForm=? order by updateDate";

	public List<Dwwzjzcz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return dwwzjzczDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return dwwzjzczDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Dwwzjzcz t) {
		dwwzjzczDao.update(t);
	}
}
