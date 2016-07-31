package com.gouhai.baoshan.service.business.shgl.xfgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.xfgz.XqdcmanyDao;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xqdc;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xqdcmany;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class XqdcmanyService {
	@Autowired
	private XqdcmanyDao xqdcmanyDao;
	final static String hql = "from Xqdcmany where xqdc=? order by updateDate";

	// 增加
	public void insert(Xqdcmany t) {
		xqdcmanyDao.insert(t);
	}

	// 查询
	public Xqdcmany findOne(String id) {
		return xqdcmanyDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		xqdcmanyDao.delete(id);
	}

	// 查询

	public List<Xqdcmany> getObjList(int pageNumber, Xqdc xqdc) {
		return xqdcmanyDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, xqdc);
	}

	public long getObjCount(Xqdc xqdc) {
		return xqdcmanyDao.findCount(hql, xqdc);
	}

	// 修改
	public void update(Xqdcmany t) {
		xqdcmanyDao.update(t);
	}
}
