package com.gouhai.baoshan.service.business.ggfw.llgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.llgz.FwssyxmDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Fwssyxm;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 为老服务设施与项目业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class FwssyxmService {
	@Autowired
	private FwssyxmDao fwssyxmDao;
	// 查询
	final static String hql = "from Fwssyxm where businessForm=? order by updateDate";

	public List<Fwssyxm> getObjList(int pageNumber, BusinessForm businessForm) {
		return fwssyxmDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return fwssyxmDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Fwssyxm t) {
		fwssyxmDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		fwssyxmDao.delete(id);
	}

	// 修改
	public void update(Fwssyxm t) {
		fwssyxmDao.update(t);
	}

	public Fwssyxm findOne(String id) {
		return fwssyxmDao.findOne(id);
	}
}
