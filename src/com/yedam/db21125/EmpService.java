package com.yedam.db21125;

import java.util.List;

public interface EmpService {
	public List getEmpList(); // 리스트조회
	public EmployeeVO getEmp(int empId); // 한건조회
	public void insertEmp(EmployeeVO empVO); // 입력
	public void updateEmp(EmployeeVO empVO); // 수정
	public void deleteEmp(EmployeeVO vo); // 수정
}
