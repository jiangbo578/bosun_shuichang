package com.gouhai.baoshan.dao.split;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.entity.user.Role;

@Repository
public class OrganDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Organization> getTownFunctions(String parent_id) {
		String hql = "from Organization where level = 2 and parent_id = '"
				+ parent_id + "' ";

		Query query = getCurrentSession().createQuery(hql);

		List<Organization> list = query.list();

		return list;
	}

	public Organization getOrg(String pid) {
		String hql = "from Organization where pid =  '" + pid + "' ";

		Query query = getCurrentSession().createQuery(hql);

		return (Organization) query.uniqueResult();
	}

	public String getRoleCode(String userid) {
		String sql = "select * from bs_role where pid = (select role_id from bs_user_role where user_id='"
				+ userid + "')";
		Query query = getCurrentSession().createSQLQuery(sql).addEntity(
				Role.class);
		Role role = (Role) query.uniqueResult();
		// PreparedStatement ps = null;
		// ResultSet rs = null;
		// Connection conn = getConnection();
		// try {
		// ps = conn.prepareStatement(sql);
		// rs = ps.executeQuery();
		// while (rs.next()) {
		// return rs.getString("code");
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		return role.getCode();
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	// public static Connection getConnection() {
	// Connection c = null;
	// try {
	// Class.forName("com.mysql.jdbc.Driver");
	// c = DriverManager.getConnection(
	// "jdbc:mysql://222.73.85.29/baoshan_test", "develop",
	// "123456");
	// } catch (ClassNotFoundException e) {
	// e.printStackTrace();
	// } catch (SQLException s) {
	// s.printStackTrace();
	// }
	// return c;
	// }

}
