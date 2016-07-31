/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.assess;

import java.text.DecimalFormat;
import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.assess.AssessTemplateInstanceDao;
import com.gouhai.baoshan.entity.assess.AssessTemplate;
import com.gouhai.baoshan.entity.assess.AssessTemplateInstance;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.service.user.OrganizationService;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.DateTimeUtil;
import com.gouhai.baoshan.utils.StringUtil;
/**
 * @author sun 2014-09-04
 *
 */
@Service
public class AssessTemplateInstanceService {

	@Autowired
	private AssessTemplateInstanceDao assessTemplateInstanceDao;

	public List<AssessTemplateInstance> getBeanList( int pageNumber) {
		return  assessTemplateInstanceDao.findList("from AssessTemplateInstance order by updateDate", pageNumber, PageableController.PAGE_SIZE);
	}
	//根据当年时间，特定村居，考核类别查询
	public List<AssessTemplateInstance> getBeanListByZZ(String date,Organization oz,String assessBaseEntityId,Integer hold,Integer level,Integer breakCount,String znbmid) {
		StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 ");
		if(null!=date && !"".equals(date)){
			sql.append(" and INSERT_DATE like '%"+date+"%' ");
		}
		if(null!=hold){ 
			sql.append(" and hold = '"+hold+"' ");
		}
		if(level!=null){
		sql.append(" and level = '"+level+"' ");
		}
		if(breakCount!=null){
			sql.append(" and breakcount = '"+breakCount+"' ");
		}
		if(znbmid!=null&&level!=1){
			sql.append(" and znbm_id='"+znbmid+"'");
		}
		sql.append(" and ORGANIZATION_ID = '"+oz.getId()+"'");
		sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityId+"' order by des asc");
      System.out.println(sql.toString());
		Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);		
		if(query.list()==null || query.list().size()==0)	{
			return null;
		}
		return  query.list();
	}
	//查询状态为1或者2的考评
	public List<AssessTemplateInstance>  getListByStatus(String date,Organization oz,String assessBaseEntityId,Integer hold,Integer level){
		StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 ");
		if(null!=date && !"".equals(date)){
			sql.append(" and INSERT_DATE like '%"+date+"%' ");
		}
		if(hold!=null){
		sql.append(" and hold in(1,2)");
		}
		if(level!=null){
		sql.append(" and level = '"+level+"' ");
		}
		sql.append(" and ORGANIZATION_ID = '"+oz.getId()+"'");
		sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityId+"' order by des asc");
       System.out.println(sql.toString());
		Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);		
		if(query.list()==null || query.list().size()==0)	{
			return null;
		}
		return  query.list();
	}
	//查询全部的状态的考评
	public List<AssessTemplateInstance> getList(String date,Organization oz,String assessBaseEntityId){
		StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 ");
		if(null!=date && !"".equals(date)){
			sql.append(" and INSERT_DATE like '%"+date+"%' ");
		}
		sql.append(" and ORGANIZATION_ID = '"+oz.getId()+"'");
		sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityId+"' order by des asc");
        System.out.println(sql.toString());
		Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);		
		if(query.list()==null || query.list().size()==0)	{
			return null;
		}
		return  query.list();
	}
	//两办查询所有表单
	public List<AssessTemplateInstance> getListByLb(String date,Organization oz,String assessBaseEntityId,Integer level){
		StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 ");
		if(null!=date && !"".equals(date)){
			sql.append(" and INSERT_DATE like '%"+date+"%' ");
		}
		if(level!=null){
		sql.append(" and level = '"+level+"' ");
		}
		sql.append(" and ORGANIZATION_ID = '"+oz.getId()+"'");
		sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityId+"' order by des asc");
        System.out.println(sql.toString());
		Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);		
		if(query.list()==null || query.list().size()==0)	{
			return null;
		}
		return  query.list();
	}
	//查询已经提交的考评
	public  List<AssessTemplateInstance> getBeanSubmit(String date,Organization oz,String assessBaseEntityId,Integer hold,Integer level){
		StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 ");
		if(null!=date && !"".equals(date)){
			sql.append(" and INSERT_DATE like '%"+date+"%' ");
		}
		if(null!=hold){ 
			sql.append(" and hold != '"+hold+"' and hold!=3 ");
		}
		if(level!=null){
		sql.append(" and level = '"+level+"' ");
		}
		sql.append(" and ORGANIZATION_ID = '"+oz.getId()+"'");
		sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityId+"'");
		//System.out.println(sql.toString());
		Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);		
		if(query.list()==null || query.list().size()==0)	{
			return null;
		}
		return  query.list();
	}
	    //查询被驳回的考评
		public  List<AssessTemplateInstance> getBeanBreak(String date,Organization oz,String assessBaseEntityId,Integer hold,Integer level){
			StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 and BreakCount >0");
			if(null!=date && !"".equals(date)){
				sql.append(" and INSERT_DATE like '%"+date+"%' ");
			}
			if(null!=hold){ 
				sql.append(" and hold = '"+hold+"' ");
			}
			if(level!=null){
			sql.append(" and level = '"+level+"' ");
			}
			sql.append(" and ORGANIZATION_ID = '"+oz.getId()+"'");
			if(StringUtil.isNotEmpty(assessBaseEntityId)){
			sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityId+"'");
			}
		//	System.out.println(sql.toString());
			Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);		
			if(query.list()==null || query.list().size()==0)	{
				return null;
			}
			return  query.list();
		}
		//查询被驳回的考评，1或者0
		public  List<AssessTemplateInstance> getBeanBreakOr(String date,Organization oz,String assessBaseEntityId,Integer hold,Integer level){
			StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 and BreakCount >0");
			if(null!=date && !"".equals(date)){
				sql.append(" and INSERT_DATE like '%"+date+"%' ");
			}
			if(null!=hold){ 
				sql.append(" and hold in(0,1,2,3) ");
			}
			if(level!=null){
			sql.append(" and level = '"+level+"' ");
			}
			sql.append(" and ORGANIZATION_ID = '"+oz.getId()+"'");
			sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityId+"'");
			//System.out.println(sql.toString());
			Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);		
			if(query.list()==null || query.list().size()==0)	{
				return null;
			}
			return  query.list();
		}
	//根据类别的编码查特定村居上一年的数据
	public AssessTemplateInstance getInstanceBycode(String code,String date,Organization organization){
		AssessTemplateInstance aInstance=null;
		String sql="select * from bs_business_assess_template_instance where code=? and ORGANIZATION_ID=? and  INSERT_DATE like '%"+date+"%'";
		Query query=assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql).addEntity(AssessTemplateInstance.class);
		query.setParameter(0, code);
		query.setParameter(1, organization.getId());
		aInstance=(AssessTemplateInstance) query.uniqueResult();
		return aInstance;
	}
	//根据考核项目的id查询考核类别，计算出总分
	public List<AssessTemplateInstance> getKhlbScore(String id,String orgid,String date){
		StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 ");
		if(null!=date && !"".equals(date)){
			sql.append(" and INSERT_DATE like '%"+date+"%' ");
		}
		sql.append(" and ORGANIZATION_ID = '"+orgid+"'");
		sql.append(" and parent_id='"+id+"'");
       //  System.out.println(sql.toString());
		Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);		
		if(query.list()==null || query.list().size()==0)	{
			return null;
		}
		return  query.list();
	}
	//根据当年时间，特定村居，考核类别查询
	public AssessTemplateInstance getBeanUniqueByType(String date,Organization oz,String assessBaseEntityId,String type) {
		
		StringBuffer sql = new StringBuffer("select * from bs_business_assess_template_instance where 1=1 ");
		if(null!=date && !"".equals(date)){
			sql.append(" and INSERT_DATE like '%"+date+"%' ");
		}
		sql.append(" and ORGANIZATION_ID = '"+oz.getId()+"'");
		sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityId+"'");
		sql.append(" and TYPE = '"+type+"'");
		sql.append("  order by pid desc");
		Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString()).addEntity(AssessTemplateInstance.class);
		return  (AssessTemplateInstance) query.uniqueResult();
	}
	
	//复制模版中的一系列记录
	public void insertCopy(List<AssessTemplate> assessTemplates,Organization organization){
	String	selectDate = DateTimeUtil.getDateToString(new java.util.Date(), "yyyy");// 为空则默认当前时间年份
	selectDate = String.valueOf((Integer.valueOf(selectDate) - 1));
	  DecimalFormat df = new DecimalFormat("#.00");
	AssessTemplateInstance template=null;
		if(null != assessTemplates){
			for(AssessTemplate assessTemplate : assessTemplates)	{
				AssessTemplateInstance instance = new AssessTemplateInstance();				
				instance.setAssessBaseEntity(assessTemplate.getAssessBaseEntity());
				instance.setId(assessTemplate.getId());
				instance.setDescription(assessTemplate.getDescription());
				instance.setZn(assessTemplate.getZn());
				instance.setType(assessTemplate.getType());
				instance.setZnbmId(assessTemplate.getZnbmId());
				instance.setOrganization(organization);
				instance.setAllScore(assessTemplate.getAllScore());
				instance.setLevel(assessTemplate.getLevel());
				instance.setProject(assessTemplate.getProject());
				instance.setProjectScore(assessTemplate.getProjectScore());
				instance.setAssessTemplate(assessTemplate.getAssessTemplate());
				instance.setMbid(assessTemplate.getId());
				instance.setCode(assessTemplate.getCode());			
				instance.setVag(assessTemplate.getVag());
				instance.setDes(assessTemplate.getDes());
				instance.setKfxz(assessTemplate.getKfxz());
				instance.setSfxy(assessTemplate.getSfxy());
//				//如果该条目需要计算去年的平均值，就根据code取去年的数据
//				if(assessTemplate.isEnableFlag()){
//				   double i=	getVag(assessTemplate.getCode(),selectDate);
//			       instance.setVag(Double.parseDouble(df.format(i)));
//				}
				//查询去年的，插入到今年的数据里面
				template=getInstanceBycode(assessTemplate.getCode()	, selectDate, organization);					
					if(template!=null){
					instance.setOldCount(template.getCount());
					}
				instance.setKhgz(assessTemplate.getKhgz());
				assessTemplateInstanceDao.insert(instance);
				
			}
		}
	}
	@Autowired
	private OrganizationService organizationService;
	//根据编码查询去年全区的平均值
	public Double getVag(String code,String selectDate){
	String sql="select * from bs_business_assess_template_instance  where code=? and insert_Date like '%"+selectDate+"%'";
	List<AssessTemplateInstance>	a=null;
	Query query=	assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql).addEntity(AssessTemplateInstance.class);
	query.setParameter(0, code);
	a=query.list();
	double vag=0.0;
	for (int i = 0; i < a.size(); i++) {
		//System.out.println(a.get(i));
		vag+=Double.parseDouble(a.get(i).getCount());
	}
	int org=organizationService.getOrgCount();
	//System.out.println(org);
	return vag/org;
	}
//根据考核类别的父ID去查询考核项目
	public AssessTemplateInstance getLbByID(String id){
		return assessTemplateInstanceDao.findAll("from  AssessTemplateInstance where mbid=?", id).get(0);
	}
	public long getBeanCount() {
		return assessTemplateInstanceDao.findCount("from AssessTemplateInstance ");
	}
	
	public void insert(AssessTemplateInstance allowance) {
		assessTemplateInstanceDao.insert(allowance);
	}

	public void delete(String id) {
		AssessTemplateInstance allowance = findOne(id);
			assessTemplateInstanceDao.delete(allowance);
	}

	public AssessTemplateInstance findOne(String id) {
		return assessTemplateInstanceDao.findOne(id);
	}
	
	public void update(AssessTemplateInstance allowance) {
			assessTemplateInstanceDao.update(allowance);
	}
	
	public List<Object[]> findgroupByZn(String assessBaseEntityID) {
		StringBuffer sql = new StringBuffer("select assessBaseEntity_ID, ZN_ID from bs_business_assess_template_instance where 1=1");
		sql.append(" and assessBaseEntity_ID = '"+assessBaseEntityID+"'");
		sql.append(" and zn_id  is NOT NULL");
		sql.append(" GROUP BY assessBaseEntity_ID,ZN_ID");
	//	System.out.println(sql.toString());
		Query query = assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql.toString());
		return (List<Object[]>)query.list();
}
	//根据提醒日期查询
	public long getCountByDate(Object... params){
		String hql="from  AssessTemplateInstance  where organization=? and insertDate>=? ";
		return assessTemplateInstanceDao.findCount(hql, params);
	}
	//查询已经提交的600分考评
	public Long getSubmitKpCount(String date,Organization organization){
		String sql="SELECT COUNT(DISTINCT assessBaseEntity_ID) FROM bs_business_assess_template_instance WHERE hold in(1,2) and INSERT_DATE like '%"+date+"%' and  ORGANIZATION_ID=?";
		Query query=assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql);
		query.setParameter(0, organization);
	
		return Long.parseLong(query.list().get(0).toString());
	}
	//查询已经保存的600分考评
	public Long getSaveKpCount(String date ,Organization organization){
		String sql="SELECT COUNT(DISTINCT assessBaseEntity_ID) FROM bs_business_assess_template_instance WHERE hold =3 and INSERT_DATE like '%"+date+"%' and  ORGANIZATION_ID=?";
		Query query=assessTemplateInstanceDao.getCurrentSession().createSQLQuery(sql);
		query.setParameter(0, organization);
	
		return Long.parseLong(query.list().get(0).toString());
	}
	
}
