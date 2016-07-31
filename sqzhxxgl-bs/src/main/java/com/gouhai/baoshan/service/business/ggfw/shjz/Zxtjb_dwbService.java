package com.gouhai.baoshan.service.business.ggfw.shjz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.shjz.Zxtjb_dwbDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.shjz.Zxtjbdwb;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * @author 徐舟
 * 
 *         街镇助学结对统计表（单位版）
 */
@Service
public class Zxtjb_dwbService {
	@Autowired
	private Zxtjb_dwbDao dwbDao;
	// 查询
	final static String hql = "from Zxtjbdwb where businessForm=? order by updateDate";

	public List<Zxtjbdwb> getObjList(int pageNumber, BusinessForm businessForm) {
		return dwbDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return dwbDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Zxtjbdwb t) {
		dwbDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		dwbDao.delete(id);
	}

	// 修改
	public void update(Zxtjbdwb t) {
		dwbDao.update(t);
	}

	public Zxtjbdwb findOne(String id) {
		return dwbDao.findOne(id);
	}
}
