package com.gouhai.baoshan.service.business.shgl.xfgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.xfgz.DwdcmanyDao;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Dwdc;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Dwdcmany;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class DwdcmanyService {
	@Autowired
	private DwdcmanyDao dwdcmanyDao;
	final static String hql = "from Dwdcmany where dwdc=? order by updateDate";

	// 增加
	public void insert(Dwdcmany t) {
		dwdcmanyDao.insert(t);
	}

	// 查询
	public Dwdcmany findOne(String id) {
		return dwdcmanyDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		dwdcmanyDao.delete(id);
	}

	// 查询

	public List<Dwdcmany> getObjList(int pageNumber, Dwdc xqdc) {
		return dwdcmanyDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, xqdc);
	}

	public long getObjCount(Dwdc xqdc) {
		return dwdcmanyDao.findCount(hql, xqdc);
	}

	// 修改
	public void update(Dwdcmany t) {
		dwdcmanyDao.update(t);
	}
}
