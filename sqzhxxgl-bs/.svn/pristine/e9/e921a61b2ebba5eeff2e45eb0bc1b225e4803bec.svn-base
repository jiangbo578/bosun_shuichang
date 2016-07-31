package com.gouhai.baoshan.dao.split;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gouhai.baoshan.entity.spilt.CopyObject;

@Repository
public class CopyObjectDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertCopyObject(CopyObject copyObject)
	{
		getCurrentSession().save(copyObject);
	}
	
	@SuppressWarnings("unchecked")
	public List<CopyObject> getCopyObject(String myId)
	{
		String hql = "from CopyObject where myId =  '"+myId+"' order by copyDate desc ";
		
		Query query = getCurrentSession().createQuery(hql);
		
		List<CopyObject> list = query.list();
		
		return list;
	}
	
	public void updateCopyObject(CopyObject copyObject)
	{
		getCurrentSession().update(copyObject);
	}
	
	public CopyObject getSingleCopyObject(String pid)
	{
		String hql = "from CopyObject where pid =  '"+pid+"' ";
		Query query = getCurrentSession().createQuery(hql);
		return (CopyObject) query.uniqueResult();
	}
	
	public CopyObject getObjectByTwo(String myId,String splitId)
	{
		String hql = "from CopyObject where myId = '"+myId+"' and splitId='"+splitId+"' order by copyDate desc ";
		Query query = getCurrentSession().createQuery(hql);
		return (CopyObject) query.uniqueResult();
	}
	
	public Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	
}
