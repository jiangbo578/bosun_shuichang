package com.gouhai.baoshan.service.business.ggfw.cjrgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.ZcwycjrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Zcwycjr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 重残无业残疾人名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class ZcwycjrService {
	@Autowired
	private ZcwycjrDao zcwycjrDao;
	// 查询
	final static String hql = "from Zcwycjr where businessForm=? order by updateDate";

	public List<Zcwycjr> getObjList(int pageNumber, BusinessForm businessForm) {
		return zcwycjrDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return zcwycjrDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Zcwycjr t) {
		zcwycjrDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		zcwycjrDao.delete(id);
	}

	// 修改
	public void update(Zcwycjr t) {
		zcwycjrDao.update(t);
	}

	public Zcwycjr findOne(String id) {
		return zcwycjrDao.findOne(id);
	}
}
