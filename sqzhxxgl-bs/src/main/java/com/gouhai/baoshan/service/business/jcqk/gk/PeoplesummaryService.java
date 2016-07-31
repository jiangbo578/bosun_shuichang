package com.gouhai.baoshan.service.business.jcqk.gk;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.jcqk.gk.PeoplesummaryDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.jcqk.gk.Peoplesummary;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.spring.PageableController;
import com.gouhai.baoshan.utils.DateTimeUtil;

/**
 * 人口情况表
 * 
 * @author sun 2014-08-27 11:00
 * 
 */
@Service
public class PeoplesummaryService {

	@Autowired
	private PeoplesummaryDao peoplesummaryDao;

	public List<Peoplesummary> getBeanList(BusinessForm businessForm,
			int pageNumber) {
		return peoplesummaryDao.findList(
				"from Peoplesummary where businessForm=? order by updateDate",
				pageNumber, PageableController.PAGE_SIZE, businessForm);
	}

	public List<Peoplesummary> getAll(BusinessForm businessForm,
			Organization organization) {
		return peoplesummaryDao
				.findAll(
						"from Peoplesummary where businessForm=? and organization=?  order by updateDate",
						businessForm, organization);
	}

	public List<Peoplesummary> getAll(BusinessForm businessForm) {
		return peoplesummaryDao.findAll(
				"from Peoplesummary where businessForm=? order by updateDate",
				businessForm);
	}

	public long getBeanCount(BusinessForm businessForm) {
		return peoplesummaryDao.findCount(
				"from Peoplesummary where businessForm=?", businessForm);
	}

	public void insert(Peoplesummary allowance) {
		peoplesummaryDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Peoplesummary allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			peoplesummaryDao.delete(allowance);
		}
	}

	public Peoplesummary findOne(String id) {
		return peoplesummaryDao.findOne(id);
	}

	public Peoplesummary findOneByDesc(Organization organization) {
		return peoplesummaryDao.findTopOne(
				"from Peoplesummary where organization=? ", organization);
	}

	// /镇统计全镇的人口
	public Peoplesummary findListByID(String id) {
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		String sql = "SELECT sum(hjrkhs),sum(outcome),sum(lhzlfwrs),sum(syrkzs),sum(zjfwhs) FROM bs_business_people_summary  "
				+ "WHERE organization_id in(SELECT pid FROM bs_organization WHERE PARENT_ID='"
				+ id + "') AND INSERT_DATE like '%" + date + "%'";
		// System.out.println(sql);
		Peoplesummary peoplesummary = new Peoplesummary();
		Query query = peoplesummaryDao.getCurrentSession().createSQLQuery(sql);
		Object[] list = (Object[]) query.uniqueResult();
		peoplesummary.setHjrks(list[0] + "");
		peoplesummary.setOutcome(list[1] + "");
		peoplesummary.setLhzlfwrs(list[2] + "");
		peoplesummary.setSyrkzs(list[3] + "");
		peoplesummary.setZjfwhs(list[4] + "");
		return peoplesummary;
	}

	// 统计全区的人口
	public Peoplesummary findListByID() {
		String date = DateTimeUtil.getDateToString(new Date(), "yyyy");
		String sql = "SELECT sum(hjrkhs),sum(outcome),sum(lhzlfwrs),sum(syrkzs),sum(zjfwhs) FROM bs_business_people_summary "
				+ " WHERE INSERT_DATE like '%" + date + "%'";
		// System.out.println(sql);
		Peoplesummary peoplesummary = new Peoplesummary();
		Query query = peoplesummaryDao.getCurrentSession().createSQLQuery(sql);
		Object[] list = (Object[]) query.uniqueResult();
		peoplesummary.setHjrks(list[0] + "");
		peoplesummary.setOutcome(list[1] + "");
		peoplesummary.setLhzlfwrs(list[2] + "");
		peoplesummary.setSyrkzs(list[3] + "");
		peoplesummary.setZjfwhs(list[4] + "");
		return peoplesummary;
	}

	public Peoplesummary findOneSqlByDesc(Organization organization, String date) {

		StringBuffer sql = new StringBuffer(
				"select * from bs_business_people_summary where 1=1 ");
		if (null != date && !"".equals(date)) {
			sql.append(" and INSERT_DATE like '%" + date + "%' ");
		}
		sql.append(" and organization_id = '" + organization.getId() + "'");
		Query query = peoplesummaryDao.getCurrentSession()
				.createSQLQuery(sql.toString()).addEntity(Peoplesummary.class);

		if (query.list() == null || query.list().size() == 0) {
			return null;
		}
		return (Peoplesummary) query.setFirstResult(0).setMaxResults(1)
				.uniqueResult();

	}

	public void update(Peoplesummary allowance, String businessFormId) {
		Peoplesummary findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			allowance.setBusinessForm(findTwjrhmc.getBusinessForm());
			allowance.setInsertDate(findTwjrhmc.getInsertDate());
			allowance.setUpdateDate(new Date());
			peoplesummaryDao.merge(allowance);
		}
	}

}
