package com.yedam.db21125;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select * from emp1 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setLastName(rs.getString("email"));
				vo.setLastName(rs.getString("phone_number"));
				vo.setLastName(rs.getString("hire_date"));

				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select * from emp1 where Employee_id = ?";
		EmployeeVO vo = new EmployeeVO();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		String sql = "insert into emp1(employee_id, first_name, last_name, email, hire_date, job_id) values(?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getEmployeeId());
			psmt.setString(2, vo.getFirstName());
			psmt.setString(3, vo.getLastName());
			psmt.setString(4, vo.getEmail());
			psmt.setString(5, vo.getHireDate());
			psmt.setString(6, vo.getJobId());
			int r = psmt.executeUpdate(); // insert, update, delete 쓸때 execute쓴다
			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {

		if (vo.getSalary() != 0) {
			sql = "update emp1 " + "set email = nvl('" + vo.getEmail() + "',email)" + "   ,phone_number =nvl('"
					+ vo.getPhoneNumber() + "',phone_number)" + "   ,salary =nvl('" + vo.getSalary() + "',salary)"
					+ " where employee_id =?";
		} else {
			sql = "update emp1 " + "set email = nvl('" + vo.getEmail() + "',email)" + "   ,phone_number =nvl('"
					+ vo.getPhoneNumber() + "',phone_number)" + " where employee_id =?";
		}
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 한건삭제
	public void deleteEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		String sql = "delete from emp1 where employee_id =?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			int r = pstmt.executeUpdate(); // insert, update, delete 쓸때 execute쓴다
			System.out.println(r + "건이 삭제됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 부서별 조회
	public List<EmployeeVO> getDeptList(String dept) {
		conn = DAO.getConnection();
		sql = "select * from emp1 e, departments d where e.department_id = d.department_id and d.department_name=?";
//		sql = "select * from emp1 where department_id = (select DEPARTMENT_ID from DEPARTMENTS where department_name = ?;
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
