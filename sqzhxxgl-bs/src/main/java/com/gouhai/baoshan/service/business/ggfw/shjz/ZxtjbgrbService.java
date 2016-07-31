package com.gouhai.baoshan.service.business.ggfw.shjz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.shjz.ZxtjbgrbDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.shjz.Zxtjbgrb;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 街镇助学结对统计表（个人版）业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class ZxtjbgrbService {
	@Autowired
	private ZxtjbgrbDao zxtjbgrbDao;// 查询
	final static String hql = "from Zxtjbgrb where businessForm=? order by updateDate";

	public List<Zxtjbgrb> getObjList(int pageNumber, BusinessForm businessForm) {
		return zxtjbgrbDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return zxtjbgrbDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Zxtjbgrb t) {
		zxtjbgrbDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		zxtjbgrbDao.delete(id);
	}

	// 修改
	public void update(Zxtjbgrb t) {
		zxtjbgrbDao.update(t);
	}

	public Zxtjbgrb findOne(String id) {
		return zxtjbgrbDao.findOne(id);
	}
}
