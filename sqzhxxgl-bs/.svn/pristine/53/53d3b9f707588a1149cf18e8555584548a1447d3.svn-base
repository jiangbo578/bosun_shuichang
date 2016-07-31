package com.gouhai.baoshan.service.business.shgl.mfgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.mfgz.SqmfyjxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.mfgz.Sqmfyjx;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 社区民防应急箱管理记录业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class SqmfyjxService {
	@Autowired
	private SqmfyjxDao sqmfyjxDao;
	private final static String hql = "from Sqmfyjx where businessForm=? order by updateDate";

	// 增加
	public void insert(Sqmfyjx t) {
		sqmfyjxDao.insert(t);
	}

	// 查询
	public Sqmfyjx findOne(String id) {
		return sqmfyjxDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		sqmfyjxDao.delete(id);
	}

	// 查询

	public List<Sqmfyjx> getObjList(int pageNumber, BusinessForm businessForm) {
		return sqmfyjxDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {

		return sqmfyjxDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Sqmfyjx t) {
		sqmfyjxDao.update(t);
	}
}
