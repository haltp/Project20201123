package com.yedam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepDAO {
	Connection conn = getConnection();

	public Department[] getDepList() {
		String sql = "select * from departments";
		Department[] deps = new Department[100];
		try {
			PreparedStatement dsmt = conn.prepareStatement(sql);
			ResultSet rs = dsmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department dep = new Department();
				dep.setDepartmentId(rs.getString("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
				deps[i++] = dep;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return deps;
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}
}
