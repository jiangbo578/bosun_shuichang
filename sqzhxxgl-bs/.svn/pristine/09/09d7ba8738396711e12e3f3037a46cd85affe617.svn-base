/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.zb.head;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.head.ZzdygkHeadDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Zzdygk;
import com.gouhai.baoshan.entity.business.dqgz.zb.head.ZzdygkHead;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
@Service
public class ZzdygkHeadService {

	@Autowired
	private ZzdygkHeadDao  zzdygHeadkDao;

	
	public void insert(ZzdygkHead zcdygk) {
		zzdygHeadkDao.insert(zcdygk);
	}


	public ZzdygkHead findOne( Object... params) {
		return zzdygHeadkDao.findOne("from ZzdygkHead where businessForm.id = ?",params);
	}
	public ZzdygkHead findOneById( String id) {
		return zzdygHeadkDao.findOne(id);
	}
	public void update(ZzdygkHead zcdygk, String businessFormId) {
			zzdygHeadkDao.update(zcdygk);
	}

}
