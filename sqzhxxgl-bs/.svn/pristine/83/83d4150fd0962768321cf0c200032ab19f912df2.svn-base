package com.gouhai.baoshan.service.business.shgl.nchjzl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.SrhwqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Srhwqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 嘉定区镇村市容环卫情况调查表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class SrhwqkService {
	@Autowired
	private SrhwqkDao srhwqkDao;
	private final static String hql = "from Srhwqk where businessForm=? order by updateDate";

	// 增加
	public void insert(Srhwqk t) {
		srhwqkDao.insert(t);
	}

	// 查询
	public Srhwqk findOne(String id) {
		return srhwqkDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		srhwqkDao.delete(id);
	}

	// 查询

	public List<Srhwqk> getObjList(int pageNumber, BusinessForm businessForm) {
		return srhwqkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {

		return srhwqkDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Srhwqk t) {
		srhwqkDao.update(t);
	}
	public List<Srhwqk> getAll(BusinessForm businessForm){
		return srhwqkDao.findAll(hql, businessForm);
	}
}
