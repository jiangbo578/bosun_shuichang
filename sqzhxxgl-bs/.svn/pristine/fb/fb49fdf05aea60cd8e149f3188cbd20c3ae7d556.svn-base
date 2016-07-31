package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.LzzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Lzz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 楼组长业务层
 * 
 * @author xuzhou
 * 
 */
@Service
public class LzzService {
	@Autowired
	private LzzDao lzzDao;

	// 增加
	public void insert(Lzz lzz) {
		lzzDao.insert(lzz);
	}

	// 删除
	public void delete(String id) {
		lzzDao.delete(id);
	}

	// 查找
	String hql = "from Lzz where businessForm=? order by updateDate";

	public List<Lzz> getLzzList(int pageNumber, BusinessForm businessForm) {
		return lzzDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return lzzDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Lzz t) {
		lzzDao.update(t);
	}

	public Lzz findOne(String id) {
		return lzzDao.findOne(id);
	}

}
