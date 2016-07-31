package com.gouhai.baoshan.entity.spilt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 联系单流程进度
 * @author MedivhQ
 *
 */
@Entity
@Table(name = "bs_split_plan")
public class Plan
{
	@Id
	@Column(name = "pid")
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	private String pid;
	@Column(name = "id")//联系单主id
	private String id;
	@Column(name = "plan",length=100000)//流程进度
	private String plan;
	
	public String getPid()
	{
		return pid;
	}
	public void setPid(String pid)
	{
		this.pid = pid;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getPlan()
	{
		return plan;
	}
	public void setPlan(String plan)
	{
		this.plan = plan;
	}
}
