package com.gouhai.baoshan.service.business.jcqk.fwcz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.fwcz.BzcyDao;
import com.gouhai.baoshan.entity.business.jcqk.fwcz.Bzcy;
import com.gouhai.baoshan.entity.business.jcqk.fwcz.Bzcybt;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 团支部概况及班子成员名单
 * 
 * @author MedivhQ
 * 
 */
@Service
public class BzcyService {
	@Autowired
	private BzcyDao bzcyDao;

	// 增加
	public void insert(Bzcy bzcy) {
		bzcyDao.insert(bzcy);
	}

	// 查询
	public Bzcy findOne(String id) {
		return bzcyDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		bzcyDao.delete(id);
	}

	// 查询
	final static String hql = "from Bzcy where bzcybt=? order by updateDate";

	public List<Bzcy> getLzzList(int pageNumber, Bzcybt bzcybt) {
		return bzcyDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				bzcybt);
	}

	public long getLzzCount(Bzcybt bzcybt) {
		return bzcyDao.findCount(hql, bzcybt);
	}

	// 修改
	public void update(Bzcy t) {
		bzcyDao.update(t);
	}
}
