package com.gouhai.baoshan.service.business.ggfw.hszh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.hszh.HszfwzrypxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzjz;
import com.gouhai.baoshan.entity.business.ggfw.hszh.Hszfwzrypx;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 红十字服务站人员培训名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class HszfwzrypxService {
	@Autowired
	private HszfwzrypxDao hszfwzrypxDao;
	// 查询
	final static String hql = "from Hszfwzrypx where businessForm=? order by updateDate";

	public List<Hszfwzrypx> getObjList(int pageNumber, BusinessForm businessForm) {
		return hszfwzrypxDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return hszfwzrypxDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Hszfwzrypx t) {
		hszfwzrypxDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		hszfwzrypxDao.delete(id);
	}

	// 修改
	public void update(Hszfwzrypx t) {
		hszfwzrypxDao.update(t);
	}

	public Hszfwzrypx findOne(String id) {
		return hszfwzrypxDao.findOne(id);
	}
}
