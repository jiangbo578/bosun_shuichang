package com.gouhai.baoshan.service.business.shgl.nchjzl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.nchjzl.BgfyzcDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.Bgfyzcbt;
import com.gouhai.baoshan.entity.business.shgl.nchjzl.head.Bgfyzc;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 不规范生猪养殖场（户）整治推进情况统计业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class BgfyzcService {
	@Autowired
	private BgfyzcDao bgfyzcDao;
	private final static String hql = "from Bgfyzcbt where bgfyzc=? order by updateDate";

	// 增加
	public void insert(Bgfyzcbt t) {
		bgfyzcDao.insert(t);
	}

	// 查询
	public Bgfyzcbt findOne(String id) {
		return bgfyzcDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		bgfyzcDao.delete(id);
	}

	// 查询

	public List<Bgfyzcbt> getObjList(int pageNumber, Bgfyzc businessForm) {
		return bgfyzcDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	// 查询全部的
	public List<Bgfyzcbt> getAll(Bgfyzc businessForm) {
		return bgfyzcDao.findAll(hql, businessForm);
	}

	public long getObjCount(Bgfyzc businessForm) {

		return bgfyzcDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Bgfyzcbt t) {
		bgfyzcDao.update(t);
	}
	public List<Bgfyzcbt> getAll(BusinessForm businessForm){
		return bgfyzcDao.findAll(hql, businessForm);
	}
}
