package com.gouhai.baoshan.dao.split;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gouhai.baoshan.dao.BaseDao;
import com.gouhai.baoshan.entity.spilt.Split;

@Repository
public class SplitDao extends BaseDao<Split, String> {
	@Autowired
	private SessionFactory sessionFactory;

	public String insertSplit(Split split) {
		return (String) getCurrentSession().save(split);
	}

	public void updateSplit(Split split) {
		getCurrentSession().update(split);
	}

	public Split getByPid(String pid) {
		String hql = "from Split where pid  = '" + pid
				+ "' order by realDate desc ";

		Query query = getCurrentSession().createQuery(hql);

		return (Split) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<Split> getSplitByStreetId(String streetId) {
		String hql = "from Split where streetId = '" + streetId
				+ "' order by realDate desc ";

		Query query = getCurrentSession().createQuery(hql);
		List<Split> list = query.list();

		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Split> getSplitByCommitteeId(String committeeId) {
		String hql = "from Split where committeeId = '" + committeeId
				+ "' order by realDate desc ";

		Query query = getCurrentSession().createQuery(hql);
		List<Split> list = query.list();

		return list;
	}

	public void deleteSplit(Split split) {
		getCurrentSession().delete(split);
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
