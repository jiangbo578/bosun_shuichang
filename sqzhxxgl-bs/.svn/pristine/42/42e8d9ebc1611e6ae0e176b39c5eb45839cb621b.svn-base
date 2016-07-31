package com.gouhai.baoshan.service.business.jcqk.rymd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.rymd.XqzydwDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.rymd.Xqzydw;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 居民村民代表名单
 * 
 * @author MedivhQ
 * 
 */
@Service
public class XqzydwService {
	@Autowired
	private XqzydwDao xqzydwDao;

	// 增加
	public void insert(Xqzydw Xqzydw) {
		xqzydwDao.insert(Xqzydw);
	}

	// 查询
	public Xqzydw findOne(String id) {
		return xqzydwDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		xqzydwDao.delete(id);
	}

	// 查询
	final static String hql = "from Xqzydw where businessForm=? order by updateDate";

	public List<Xqzydw> getLzzList(int pageNumber, BusinessForm businessForm) {
		return xqzydwDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return xqzydwDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Xqzydw t) {
		xqzydwDao.update(t);
	}
}
