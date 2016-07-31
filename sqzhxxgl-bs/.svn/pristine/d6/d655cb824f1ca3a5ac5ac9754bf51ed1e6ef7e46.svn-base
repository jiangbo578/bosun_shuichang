package com.gouhai.baoshan.service.business.ggfw.whtygz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.whtygz.TyssqcDao;
import com.gouhai.baoshan.dao.business.ggfw.whtygz.TyssqclbDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.whtygz.Tyssqc;
import com.gouhai.baoshan.entity.business.ggfw.whtygz.head.Tyssqclb;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 68、上海市社区公共体育设施器材（场地）详细情况登记表
 * 
 * @author 徐舟
 * 
 */
@Service
public class TyssqclbService {
	@Autowired
	private TyssqclbDao tyssqclbDao;
	@Autowired
	private TyssqcDao tyssqcDao;
	final static String hql = "from Tyssqclb where businessForm=? order by updateDate";

	// 增加
	public void insert(Tyssqclb t) {
		tyssqclbDao.saveOrUpdate(t);

	}

	// 查询
	public Tyssqclb findOne(BusinessForm businessForm) {
		return tyssqclbDao.findOne(hql, businessForm);
	}

	public Tyssqclb findOne(String id) {
		return tyssqclbDao.findOne(id);
	}

	// 查询子类
	public Tyssqc findMany(String id) {
		return tyssqcDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		tyssqclbDao.delete(id);
	}

	// 删除子类
	public void deleteNo(String id) {
		tyssqcDao.delete(id);
	}

	// 查询

	public List<Tyssqc> getObjList(int pageNumber, Tyssqclb tyssqclb) {

		return tyssqcDao.findList(
				"from Tyssqc where tyssqclb=? order by updateDate", pageNumber,
				PageableController.PAGE_SIZE, tyssqclb);
	}

	public long getObjCount(Tyssqclb tyssqclb) {
		return tyssqclbDao.findCount(
				"from Tyssqc where tyssqclb=? order by updateDate", tyssqclb);
	}

	// 修改
	public void update(Tyssqclb t) {
		tyssqclbDao.update(t);
	}

	// 修改子类
	public void updateMany(Tyssqc t) {
		tyssqcDao.saveOrUpdate(t);
	}
}
