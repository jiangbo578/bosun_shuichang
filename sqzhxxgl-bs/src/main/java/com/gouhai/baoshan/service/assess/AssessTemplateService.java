/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.assess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.assess.AssessBaseEntityDao;
import com.gouhai.baoshan.dao.assess.AssessRemindDao;
import com.gouhai.baoshan.dao.assess.AssessTemplateDao;
import com.gouhai.baoshan.dao.assess.AssessTemplateInstanceDao;
import com.gouhai.baoshan.entity.assess.AssessBaseEntity;
import com.gouhai.baoshan.entity.assess.AssessRemind;
import com.gouhai.baoshan.entity.assess.AssessTemplate;
import com.gouhai.baoshan.entity.assess.AssessTemplateInstance;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.spring.PageableController;

/**
 * @author sun 2014-09-04
 * 
 */
@Service
public class AssessTemplateService {

	@Autowired
	private AssessTemplateDao assessTemplateDao;
	@Autowired
	private AssessBaseEntityDao assessBaseEntityDao;

	public List<AssessTemplate> getBeanList(int pageNumber,
			AssessBaseEntity assess, Integer level) {
		return assessTemplateDao.findList("from AssessTemplate where assessBaseEntity=? and level=? order by updateDate",
						pageNumber, PageableController.PAGE_SIZE, assess, level);
	}

	public List<AssessTemplate> getBeanListByTemplate(int pageNumber,
			AssessTemplate assessTemplate) {
		return assessTemplateDao
				.findList(
						"from AssessTemplate where assessTemplate=? order by updateDate",
						pageNumber, PageableController.PAGE_SIZE,
						assessTemplate);
	}

	public long getBeanCountByTemplate(AssessTemplate assessTemplate) {
		return assessTemplateDao.findCount(
				"from AssessTemplate where assessTemplate=?", assessTemplate);
	}

	public long getBeanCount(AssessBaseEntity assess, Integer level) {
		return assessTemplateDao.findCount(
				"from AssessTemplate where assessBaseEntity=? and level=?",
				assess, level);
	}

	public List<AssessTemplate> getBeanList(String assessId) {
		return assessTemplateDao
				.findAll(
						"from AssessTemplate where assessBaseEntity.id=? order by updateDate",
						assessId);
	}

	public List<AssessTemplate> getBeanList(String assessId, Integer level) {
		return assessTemplateDao
				.findAll(
						"from AssessTemplate where assessBaseEntity.id=? and  level=? order by updateDate",
						assessId, level);
	}

	// 根据父类ID查询三级
	public List<AssessTemplate> getBeanListByparentid(String parentid,
			Integer level) {
		return assessTemplateDao
				.findAll(
						"from AssessTemplate where assessTemplate.id=? and  level=? order by updateDate",
						parentid, level);
	}

	public void insert(AssessTemplate allowance) {
		assessTemplateDao.insert(allowance);
	}

	public void delete(String id) {
		AssessTemplate allowance = findOne(id);
		assessTemplateDao.delete(allowance);
	}

	public AssessTemplate findOne(String id) {
		return assessTemplateDao.findOne(id);
	}

	public void update(AssessTemplate allowance) {
		assessTemplateDao.update(allowance);
	}

	// 根据考核类别ID查出考核类别
	public AssessTemplate getKhlb(String parentid) {
		String sql = "from AssessTemplate where pid=? order by updateDate";
		return assessTemplateDao.findOne(sql, parentid);
	}

	// 根据考核类别的ID查询考核项目
	public AssessTemplate getKhxm(String parentid) {
		String sql = "from AssessTemplate where pid=? order by updateDate";
		return assessTemplateDao.findOne(sql, parentid);
	}

	// 增加考评提醒日
	@Autowired
	private AssessRemindDao assessRemindDao;

	public void insertAssessRemind(AssessRemind t) {
		assessRemindDao.insert(t);
	}
	//查询考评提醒日
	public AssessRemind findAssessRemind(){
		List<AssessRemind> list=assessRemindDao.findAll();
		AssessRemind a=null;
		if(list!=null&&list.size()>0){
			a=list.get(0);
		}
		return  a;
	}
	//删除
	public void deleteRemind(String id){
		assessRemindDao.delete(id);
	}

}
