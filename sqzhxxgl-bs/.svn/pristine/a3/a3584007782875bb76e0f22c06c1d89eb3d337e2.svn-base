package com.gouhai.baoshan.service.business.ggfw.llgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.llgz.GllrDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Fwssyxm;
import com.gouhai.baoshan.entity.business.ggfw.llgz.Gllr;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 80岁以上高龄老人名册业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class GllrService {
	@Autowired
	private GllrDao gllrDao;
	// 查询
	final static String hql = "from Gllr where businessForm=? order by updateDate";

	public List<Gllr> getObjList(int pageNumber, BusinessForm businessForm) {
		return gllrDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				businessForm);
	}

	public long getObjCount(BusinessForm businessForm) {
		return gllrDao.findCount(hql, businessForm);
	}

	// 增加
	public void insert(Gllr t) {
		gllrDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		gllrDao.delete(id);
	}

	// 修改
	public void update(Gllr t) {
		gllrDao.update(t);
	}

	public Gllr findOne(String id) {
		return gllrDao.findOne(id);
	}
	//根据出生日期和姓名来性别来判断
	public int getGllr(String date,String name,String sex){
		return (int) gllrDao.findCount("from Gllr where birthday=? and name=? and sex=?  ", date,name,sex);
	}
}
