package com.gouhai.baoshan.service.business.ggfw.shjz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.shjz.DbdxcjndDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.shjz.Dbdxcjnd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 低保对象参加公益性社区服务劳动情况季度登记表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class DbdxcjndService {
	@Autowired
	private DbdxcjndDao dbdxcjndDao;
	// 查询
	final static String hql = "from Dbdxcjnd where businessForm=? order by updateDate";

	public List<Dbdxcjnd> getObjList(int pageNumber, BusinessForm businessForm) {
		return dbdxcjndDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return dbdxcjndDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Dbdxcjnd t) {
		dbdxcjndDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		dbdxcjndDao.delete(id);
	}

	// 修改
	public void update(Dbdxcjnd t) {
		dbdxcjndDao.update(t);
	}

	public Dbdxcjnd findOne(String id) {
		return dbdxcjndDao.findOne(id);
	}
}
