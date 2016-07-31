   package com.gouhai.baoshan.service.business.jcqk.wzjzcz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.wzjzcz.SrwzjzczDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.wzjzcz.Srwzjzcz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 私人违章建筑处置
 * 
 * @author MedivhQ
 * 
 */
@Service
public class SrwzjzczService {
	@Autowired
	private SrwzjzczDao srwzjzczDao;

	// 增加
	public void insert(Srwzjzcz srwzjzcz) {
		srwzjzczDao.insert(srwzjzcz);
	}

	// 查询
	public Srwzjzcz findOne(String id) {
		return srwzjzczDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		srwzjzczDao.delete(id);
	}

	// 查询
	final static String hql = "from Srwzjzcz where businessForm=? order by updateDate";

	public List<Srwzjzcz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return srwzjzczDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return srwzjzczDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Srwzjzcz t) {
		srwzjzczDao.update(t);
	}
	public List<Srwzjzcz> getAll(BusinessForm businessForm){
		return srwzjzczDao.findAll(hql, businessForm);
	}
}
