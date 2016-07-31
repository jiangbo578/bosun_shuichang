/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import com.gouhai.baoshan.dao.BaseDao;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public abstract class BaseService<T, PK extends Serializable> {

	private BaseDao<T, PK> baseDao;

	@Resource
	public void setDao(BaseDao<T, PK> dao) {
		this.baseDao = dao;
	}

	public void insert(T t) {
		baseDao.insert(t);
	}

	public void update(T t) {
		baseDao.update(t);
	}

	public void saveOrUpdate(T t) {
		baseDao.saveOrUpdate(t);
	}

	public void delete(T t) {
		baseDao.delete(t);
	}

	public void delete(PK id) {
		baseDao.delete(id);
	}

	public T findOne(PK id) {
		return baseDao.findOne(id);
	}

	public List<T> findAll() {
		return baseDao.findAll();
	}

}