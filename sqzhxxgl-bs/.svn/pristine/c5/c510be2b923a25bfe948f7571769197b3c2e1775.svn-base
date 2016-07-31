/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.assess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.assess.AssessBaseEntityDao;
import com.gouhai.baoshan.entity.assess.AssessBaseEntity;
import com.gouhai.baoshan.spring.PageableController;
/**
 * @author sun 2014-09-04
 *
 */
@Service
public class AssessBaseEntityService {

	@Autowired
	private AssessBaseEntityDao assessBaseEntityDao;

	public List<AssessBaseEntity> getBeanList( int pageNumber) {
		return  assessBaseEntityDao.findList("from AssessBaseEntity order by  identity  asc, des asc", pageNumber, PageableController.PAGE_SIZE);
	}
	
	//根据 居委  或 村委 及  可用性 查找
	public List<AssessBaseEntity> getBeanListByFlag(int flag) {
		return  assessBaseEntityDao.findAll("from AssessBaseEntity where identity = ? and enableFlag = true order by des asc ",flag);
	}
	
	
	public long getBeanCount() {
		return assessBaseEntityDao.findCount("from AssessBaseEntity ");
	}
	
	public void insert(AssessBaseEntity allowance) {
		assessBaseEntityDao.insert(allowance);
	}

	public void delete(String id) {
		AssessBaseEntity allowance = findOne(id);
			assessBaseEntityDao.delete(allowance);
	}

	public AssessBaseEntity findOne(String id) {
		return assessBaseEntityDao.findOne(id);
	}
	
	public void update(AssessBaseEntity allowance) {
			assessBaseEntityDao.merge(allowance);
	}

}
