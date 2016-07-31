package com.gouhai.baoshan.service.business.ggfw.kpgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.kpgz.ZzjbqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.kpgz.Zzjbqk;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class ZzjbqkService {
	@Autowired
	private ZzjbqkDao zzjbqkDao;
	// 查询
	final static String hql = "from Zzjbqk where businessForm=? order by updateDate";

	public List<Zzjbqk> getObjList(int pageNumber, BusinessForm businessForm) {
		return zzjbqkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return zzjbqkDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Zzjbqk t) {
		zzjbqkDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		zzjbqkDao.delete(id);
	}

	// 修改
	public void update(Zzjbqk t) {
		zzjbqkDao.update(t);
	}
	public Zzjbqk findOne(String id) {
		return zzjbqkDao.findOne(id);
	}
}
