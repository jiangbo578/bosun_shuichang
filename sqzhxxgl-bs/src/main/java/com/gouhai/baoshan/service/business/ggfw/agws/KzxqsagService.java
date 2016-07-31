package com.gouhai.baoshan.service.business.ggfw.agws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.agws.KzxqsagDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Kzxqsag;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 开展星期四爱国卫生义务劳动情况记录表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class KzxqsagService {
	@Autowired
	private KzxqsagDao kzxqsagDao;
	// 查询
	final static String hql = "from Kzxqsag where businessForm=? order by updateDate";

	public List<Kzxqsag> getObjList(int pageNumber, BusinessForm businessForm) {
		return kzxqsagDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return kzxqsagDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Kzxqsag t) {
		kzxqsagDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		kzxqsagDao.delete(id);
	}

	// 修改
	public void update(Kzxqsag t) {
		kzxqsagDao.update(t);
	}

	public Kzxqsag findOne(String id) {
		return kzxqsagDao.findOne(id);
	}
}
