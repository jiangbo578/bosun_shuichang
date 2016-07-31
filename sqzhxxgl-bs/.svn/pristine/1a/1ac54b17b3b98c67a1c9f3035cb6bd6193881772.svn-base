/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.quertz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 更新信息委实有人口库 每周四下午两点半 更新时间字段
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class UpdatePersonTask {
	private static final Logger logger = LoggerFactory
			.getLogger(UpdatePersonTask.class);

	private boolean success = false;

	// @Autowired
	// private PersonSyDao personSyDao;

	@Autowired
	//private PersonConfirmDao personConfirmDao;

	/**
	 * 从信息委实有人口库更新到本地实有人口库里
	 */
	public void update() {
		// logger.info("UpdatePersonTask - update");
		// 获得上个星期有变更的人的集合
		/*
		 * List<PersonSy> personsys =
		 * getPerson(getConnection("bs_project","oracle")); //直接覆盖社区人口镜像库
		 * for(PersonSy ps : personsys){ personSyDao.saveOrUpdate(ps); } //
		 * success = true; addToPersonConfirm(personsys); sendMessageToUser();
		 */
	}

	/**
	 * 社区人口镜像与社区口库比较，有信息变更就插入确认更新表里以便确认更新
	 */
//	private void addToPersonConfirm(List<PersonSy> toConfirm) {
//		for (PersonSy p : toConfirm) {
//			PersonConfirm pc = new PersonConfirm(p);
//			personConfirmDao.saveOrUpdate(pc);
//		}
//	}

	/**
	 * 向各个干事发送人员更新信息
	 */
	private void sendMessageToUser() {

	}

	/**
	 * @param conn
	 *            连接对象
	 * @return List<Person> 实有人口库过去一个星期有更新的人
	 */
//	public static List<PersonSy> getPerson(Connection conn) {
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//		LinkedList<PersonSy> linklist = new LinkedList<PersonSy>();
//		String sql = "select * from ACCOUNT_PERSON where  CQSJ BETWEEN TO_DATE(?, 'yyyy-mm-dd') and TO_DATE(?, 'yyyy-mm-dd') ";
//		PreparedStatement stat = null;
//		ResultSet rs = null;
//		try {
//			stat = conn.prepareStatement(sql);
//			stat.setString(1, getPassWeekTime());
//			stat.setString(2, sf.format(new Date()));
//			rs = stat.executeQuery(sql);
//			while (rs.next()) {
//				PersonSy p = new PersonSy();
//				p.setId(rs.getString("PID"));
//				// p.setAddress(rs.getString("ADDRESS"));
//				// p.setName(rs.getString("NAME"));
//				// p.setSex(rs.getString("SEX"));
//				// p.setBirthday(rs.getString("BIRTHDAY"));
//				// p.setFolk(rs.getString("FOLK"));
//				// p.setEducation(rs.getString("EDUCATION"));
//				// p.setZzmm(rs.getString("ZZMM"));
//				// p.setGzdw(rs.getString("GZDW"));
//				// p.setZw(rs.getString("ZW"));
//				// p.setTel(rs.getString("TEL"));
//				// /p.setEmail(rs.getString("EMAIL"));
//				// p.setHealth(rs.getString("HEALTH"));
//				// p.setHkxz(rs.getString("HKXZ"));
//				// p.setHyzk(rs.getString("HYZK"));
//				// p.setHabit(rs.getString("HABIT"));
//				// p.setSsjw(rs.getString("SSJW"));
//				// p.setXzqh(rs.getString("XZQH"));
//				// p.setCardid(rs.getString("CARDID"));
//				// p.setJiashiid(rs.getString("JIASHIID"));
//				// p.setSftj(rs.getString("SFTJ"));
//				// p.setHjdz(rs.getString("HJDZ"));
//				// p.setJd(rs.getString("JD"));
//				// p.setCqsj(rs.getString("CQSJ"));
//				// p.setHh(rs.getString("HH"));
//				// p.setHjdssjw(rs.getString("HJDSSJW"));
//				// p.setJzdssjw(rs.getString("JZDSSJW"));
//				// p.setWlrk(rs.getString("WLRK"));
//				linklist.add(p);
//			}
//		} catch (SQLException e) {
//			// e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				stat.close();
//				conn.close();
//			} catch (SQLException e) {
//				logger.info("Fail to close resources : {}", e.getMessage());
//			}
//		}
//		return linklist;
//	}

	/**
	 * @param name
	 *            用户名
	 * @param pass
	 *            密码
	 * @return 数据库连接对象 Connection
	 */
	public static Connection getConnection(String name, String pass) {
		Connection c = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", name, pass);
		} catch (ClassNotFoundException e) {
			logger.info("Can not load OracleDriver-ClassNotFound : {}",
					e.getMessage());
		} catch (SQLException s) {
			logger.info("Can not connect Oracle : {}", s.getMessage());
		}
		return c;
	}

	/**
	 * @return 获得一个星期前的日期
	 */
	public static String getPassWeekTime() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cl = Calendar.getInstance();
		cl.setTime(new Date());
		cl.add(Calendar.DATE, -8);
		Date date = cl.getTime();
		return sf.format(date);
	}
}
