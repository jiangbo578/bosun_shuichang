package com.gouhai.baoshan.service.business.ggfw.agws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.agws.WszcqkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.agws.Jkjyry;
import com.gouhai.baoshan.entity.business.ggfw.agws.Wszcqk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 卫生自查情况记录表业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class WszcqkService {
	@Autowired
	private WszcqkDao wszcqkDao;
	// 查询
	final static String hql = "from Wszcqk where businessForm=? order by updateDate";

	public List<Wszcqk> getObjList(int pageNumber, BusinessForm businessForm) {
		return wszcqkDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return wszcqkDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Wszcqk t) {
		wszcqkDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		wszcqkDao.delete(id);
	}

	// 修改
	public void update(Wszcqk t) {
		wszcqkDao.update(t);
	}

	public Wszcqk findOne(String id) {
		return wszcqkDao.findOne(id);
	}
}
