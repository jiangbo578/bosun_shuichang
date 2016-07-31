package com.gouhai.baoshan.service.business.shgl.cjjyqk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.cjjyqk.FfbxdDao;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Ffbxdbt;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffbxd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 、村、居非法办学点情况表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class FfbxdService {
	@Autowired
	private FfbxdDao ffbxdService;
	private final static String hql = "from Ffbxdbt where ffbxd=? order by updateDate";

	// 增加
	public void insert(Ffbxdbt t) {
		ffbxdService.insert(t);
	}

	// 查询
	public Ffbxdbt findOne(String id) {
		return ffbxdService.findOne(id);
	}

	// 删除
	public void delete(String id) {
		ffbxdService.delete(id);
	}

	// 查询

	public List<Ffbxdbt> getObjList(int pageNumber, Ffbxd businessForm) {
		return ffbxdService.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(Ffbxd businessForm) {

		return ffbxdService.findCount(hql, businessForm);
	}

	// 修改
	public void update(Ffbxdbt t) {
		ffbxdService.update(t);
	}

	public List<Ffbxdbt> getAll(Ffbxd businessForm) {
		return ffbxdService.findAll(hql, businessForm);
	}
}
