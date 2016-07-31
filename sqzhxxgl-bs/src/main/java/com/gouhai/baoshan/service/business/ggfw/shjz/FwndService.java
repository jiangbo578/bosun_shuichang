package com.gouhai.baoshan.service.business.ggfw.shjz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.shjz.FwndDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.shjz.Fwnd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 公益性社区服务劳动参加对象汇总表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class FwndService {
	@Autowired
	private FwndDao fwndDao;
	// 查询
	final static String hql = "from Fwnd where businessForm=? order by updateDate";

	public List<Fwnd> getObjList(int pageNumber, BusinessForm businessForm) {
		return fwndDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return fwndDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Fwnd t) {
		fwndDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		fwndDao.delete(id);
	}

	// 修改
	public void update(Fwnd t) {
		fwndDao.update(t);
	}

	public Fwnd findOne(String id) {
		return fwndDao.findOne(id);
	}
}
