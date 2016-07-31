package com.gouhai.baoshan.service.business.shgl.cjjyqk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.cjjyqk.FfXympDao;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.Ffxympbt;
import com.gouhai.baoshan.entity.business.shgl.cjjyqk.head.Ffxymp;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 非法行医情况排摸信息表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class FfxympService {
	@Autowired
	private FfXympDao ffXympDao;
	private final static String hql = "from Ffxympbt where ffxymp=? order by updateDate";

	// 增加
	public void insert(Ffxympbt t) {
		ffXympDao.insert(t);
	}

	// 查询
	public Ffxympbt findOne(String id) {
		return ffXympDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		ffXympDao.delete(id);
	}

	// 查询

	public List<Ffxympbt> getObjList(int pageNumber, Ffxymp businessForm) {
		return ffXympDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(Ffxymp businessForm) {
		return ffXympDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(Ffxympbt t) {
		ffXympDao.update(t);
	}
	public List<Ffxympbt> getAll(Ffxymp businessForm){
		return ffXympDao.findAll(hql, businessForm);
	}
}
