package com.gouhai.baoshan.service.business.shgl.spaq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.spaq.ZbjshsDao;
import com.gouhai.baoshan.entity.business.shgl.spaq.Zbjshsbt;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Zbjshs;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 自办酒会所情况表 业务
 * 
 * @author 徐舟
 * 
 */
@Service
public class ZbjshsService {
	@Autowired
	private ZbjshsDao zbjshsDao;

	// 增加
	public void insert(Zbjshsbt t) {
		zbjshsDao.insert(t);
	}

	// 查询
	public Zbjshsbt findOne(String id) {
		return zbjshsDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		zbjshsDao.delete(id);
	}

	// 查询
	final static String hql = "from Zbjshsbt where zbjshs=? order by updateDate";

	public List<Zbjshsbt> getObjList(int pageNumber, Zbjshs businessForm) {
		return zbjshsDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(Zbjshs businessForm) {
		return zbjshsDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Zbjshsbt t) {
		zbjshsDao.update(t);
	}
}
