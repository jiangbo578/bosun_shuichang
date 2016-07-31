/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.shgl.xfgz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.shgl.xfgz.XfqcwhDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfgz.Xfqcwh;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
@Service
public class XfqcwhService {

	@Autowired
	private XfqcwhDao xfqcwhDao;
			

	public List<Xfqcwh> getXfqcwhList(BusinessForm businessForm, int pageNumber) {
		return xfqcwhDao.findList("from Xfqcwh where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getXfqcwhCount(BusinessForm businessForm) {
		return xfqcwhDao.findCount("from Xfqcwh where businessForm=?", businessForm);
	}
	
	public void insert(Xfqcwh xfqcwh) {
		xfqcwhDao.insert(xfqcwh);
	}

	public void delete(String id, String businessFormId) {
		Xfqcwh xfqcwh = findOne(id);
		if (xfqcwh.getBusinessForm().getId().equals(businessFormId)) {
			xfqcwhDao.delete(xfqcwh);
		}
	}

	public Xfqcwh findOne(String id) {
		return xfqcwhDao.findOne(id);
	}
	
	public void update(Xfqcwh xfqcwh, String businessFormId) {
		Xfqcwh findXfqcwh = findOne(xfqcwh.getId());
		if (findXfqcwh.getBusinessForm().getId().equals(businessFormId)) {
			findXfqcwh.setMc(xfqcwh.getMc());
			findXfqcwh.setSl(xfqcwh.getSl());
			findXfqcwh.setRq(xfqcwh.getRq());
			findXfqcwh.setJc(xfqcwh.getJc());
			findXfqcwh.setQk(xfqcwh.getQk());
			findXfqcwh.setCjc(xfqcwh.getCjc());
			findXfqcwh.setBz(xfqcwh.getBz());
			findXfqcwh.setUpdateDate(new Date());
			xfqcwhDao.update(findXfqcwh);
		}
	}

}
