package com.gouhai.baoshan.service.business.ggfw.hszh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.hszh.HszfwzbkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzbk;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzhy;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 红十字服务站帮困救助情况记录业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HszfwzbkService {
	@Autowired
	private HszfwzbkDao hszfwzbkDao;
	// 查询
	final static String hql = "from Hszfwzbk where businessForm=? order by updateDate";

	public List<Hszfwzbk> getObjList(int pageNumber, BusinessForm businessForm) {
		return hszfwzbkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return hszfwzbkDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Hszfwzbk t) {
		hszfwzbkDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hszfwzbkDao.delete(id);
	}

	// 修改
	public void update(Hszfwzbk t) {
		hszfwzbkDao.update(t);
	}

	public Hszfwzbk findOne(String id) {
		return hszfwzbkDao.findOne(id);
	}
}
