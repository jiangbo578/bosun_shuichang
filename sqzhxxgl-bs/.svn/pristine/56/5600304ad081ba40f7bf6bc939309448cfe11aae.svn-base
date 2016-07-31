package com.gouhai.baoshan.service.business.shgl.spaq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.spaq.WzspscdwDao;
import com.gouhai.baoshan.entity.business.shgl.spaq.Wzspscbt;
import com.gouhai.baoshan.entity.business.shgl.spaq.head.Wzspsc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 新增无证食品药品生产经营消费单位情况表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class WzspscdwService {
	@Autowired
	private WzspscdwDao wzspscdwDao;

	// 增加
	public void insert(Wzspscbt t) {
		wzspscdwDao.insert(t);
	}

	// 查询
	public Wzspscbt findOne(String id) {
		return wzspscdwDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		wzspscdwDao.delete(id);
	}

	// 查询
	final static String hql = "from Wzspscbt where wzspsc=? order by updateDate";

	public List<Wzspscbt> getObjList(int pageNumber, Wzspsc businessForm) {
		return wzspscdwDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(Wzspsc businessForm) {
		return wzspscdwDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Wzspscbt t) {
		wzspscdwDao.update(t);
	}

}
