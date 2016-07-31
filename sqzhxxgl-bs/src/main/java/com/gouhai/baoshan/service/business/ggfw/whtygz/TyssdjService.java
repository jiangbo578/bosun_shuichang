package com.gouhai.baoshan.service.business.ggfw.whtygz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.whtygz.TyssdjDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Jkjyry;
import com.gouhai.baoshan.entity.business.ggfw.whtygz.Tyssdj;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 上海市社区公共体育设施各类人员登记表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class TyssdjService {
	@Autowired
	private TyssdjDao tyssdjDao;
	// 查询
	final static String hql = "from Tyssdj where businessForm=? order by updateDate";

	public List<Tyssdj> getObjList(int pageNumber, BusinessForm businessForm) {
		return tyssdjDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return tyssdjDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Tyssdj t) {
		tyssdjDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		tyssdjDao.delete(id);
	}

	// 修改
	public void update(Tyssdj t) {
		tyssdjDao.update(t);
	}

	public Tyssdj findOne(String id) {
		return tyssdjDao.findOne(id);
	}
}
