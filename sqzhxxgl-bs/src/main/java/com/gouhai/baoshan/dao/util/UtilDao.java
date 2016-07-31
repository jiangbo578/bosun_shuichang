package com.gouhai.baoshan.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class UtilDao 
{
	public static Connection getConnection(String name, String pass) {
		Connection c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://222.73.85.29/baoshan_test", name, pass);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (SQLException s)
		{
			s.printStackTrace();
		}
		return c;
	}

}
