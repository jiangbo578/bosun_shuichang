package com.gouhai.baoshan.service.mould;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.mould.DemoDao;
import com.gouhai.baoshan.entity.mould.Demo;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class DemoService {
	@Autowired
	private DemoDao demoDao;

	// 增加
	public void insert(Demo demo) {
		demoDao.insert(demo);
	}

	// 删除
	public void delete(Demo id) {
		demoDao.delete(id);
	}

	// 查询
	private final static String hql = "from Demo  order by updateDate";

	public List<Demo> getObjList(int pageNumber) {
		return demoDao.findList(hql, pageNumber, PageableController.PAGE_SIZE);
	}

	public long getObjCount() {
		return demoDao.findCount(hql);
	}
	public Demo findOne(String id){
		return demoDao.findOne(id);
	}
}
