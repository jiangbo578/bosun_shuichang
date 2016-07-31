package com.gouhai.baoshan.dao.split;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gouhai.baoshan.dao.BaseDao;
import com.gouhai.baoshan.entity.spilt.LinkMan;

@Repository
public class LinkManDao extends BaseDao<LinkMan, String>
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertLinkMan(LinkMan linkMan)
	{
		getCurrentSession().save(linkMan);
	}
	
	public LinkMan getLink(String pid)
	{
		String hql = "from LinkMan where pid = '"+pid+"' order by sendDate desc  ";
		
		Query query = getCurrentSession().createQuery(hql);
		
		return (LinkMan) query.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<LinkMan> getLinkMan(String myId)
	{
		String hql = "from LinkMan where myId = '"+myId+"' order by sendDate desc ";
		
		Query query = getCurrentSession().createQuery(hql);
		
		List<LinkMan> list = query.list();
		
		return list;
	}
	
	public void updateLinkMan(LinkMan linkMan)
	{
		getCurrentSession().update(linkMan);
	}
	
	public void deleteLinkMan(LinkMan linkMan)
	{
		getCurrentSession().delete(linkMan);
	}
	
	public  Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public LinkMan getByTwo(String myId,String splitId)
	{
		String hql = "from LinkMan where myId = '"+myId+"' and splitId = '"+splitId+"' order by sendDate desc ";
		Query query = getCurrentSession().createQuery(hql);
		return (LinkMan) query.uniqueResult();
	}
}
