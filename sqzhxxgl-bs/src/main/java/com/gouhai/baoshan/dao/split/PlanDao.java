package com.gouhai.baoshan.dao.split;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gouhai.baoshan.entity.spilt.Plan;

@Repository
public class PlanDao
{
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * 获取某个联系单的流程详情
	 * @param id
	 * @return
	 */
	public Plan getPlan(String id)
	{
		String hql = "from Plan where id = '"+id+"'";
		Query query = getCurrentSession().createQuery(hql);
		return (Plan) query.uniqueResult();
	}
	/**
	 * 更新流程
	 * @param plan
	 */
	public void updatePlan(Plan plan)
	{
		getCurrentSession().update(plan);
	}
	/**
	 * 插入一条流程
	 * @param plan
	 */
	public void insertPlan(Plan plan)
	{
		getCurrentSession().save(plan);
	}
	
	public Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
}
