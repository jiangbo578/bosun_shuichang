package com.gouhai.baoshan.service.assess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.assess.RuleDao;
import com.gouhai.baoshan.entity.assess.AssessTemplate;
import com.gouhai.baoshan.entity.assess.Rule;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 考评规则业务层
 * 
 * @author 徐舟
 * 
 *         2014-9-18
 */
@Service
public class RuleService {
	@Autowired
	private RuleDao ruleDao;
	// 查询
	final static String hql = "from Rule  where assessTemplate=? order by updateDate";

	public List<Rule> getObjList(int pageNumber,AssessTemplate template) {
		return ruleDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,template);
	}
//根据考核类别的ID获取考核规则
	public  List<Rule> getRulelistById(AssessTemplate template){
		return ruleDao.findAll(hql, template);
	}
	//根据考核类别的ID和标示获取考核规则
	public  Rule getRulelistByCode(AssessTemplate template,String code){
			return ruleDao.findOne("from Rule  where assessTemplate=? and  identity=?", template,code);
	}
	public long getObjCount(AssessTemplate template) {
		return ruleDao.findCount(hql,template);
	}

	// 增加
	public void insert(Rule t) {
		ruleDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		ruleDao.delete(id);
	}

	// 修改
	public void update(Rule t) {
		ruleDao.update(t);
	}

	public Rule findOne(String id) {
		return ruleDao.findOne(id);
	}
	//根据ID获取考核规则
	public Rule getRulrByid(String id){
		return ruleDao.findOne("from Rule  where assessTemplate=? ", new AssessTemplate(id));
	}
}
