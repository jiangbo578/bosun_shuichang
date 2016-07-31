package com.gouhai.baoshan.service.split;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.split.PlanDao;
import com.gouhai.baoshan.entity.spilt.Plan;

@Service
public class PlanService
{
	@Autowired
	private PlanDao planDao;
	/**
	 * 获取某个联系单流程
	 * @param id
	 * @return
	 */
	public Plan getPlan(String id)
	{
		return planDao.getPlan(id);
	}
	/**
	 * 更新一条联系单流程
	 * @param plan
	 */
	public void updatePlan(Plan plan)
	{
		planDao.updatePlan(plan);
	}
	/**
	 * 插入一条流程
	 * @param plan
	 */
	public void insertPlan(Plan plan)
	{
		planDao.insertPlan(plan);
	}
}
