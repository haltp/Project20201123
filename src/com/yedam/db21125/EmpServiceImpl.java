package com.yedam.db21125;

import java.util.List;

public class EmpServiceImpl implements EmpService {

	EmpDAO dao = new EmpDAO();

	@Override
	public List getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public EmployeeVO getEmp(int empId) {
		return dao.getEmp(empId);
	}

	@Override
	public void insertEmp(EmployeeVO empVO) {
		dao.insertEmp(empVO);
	}

	@Override
	public void updateEmp(EmployeeVO empVO) {
		dao.updateEmp(empVO);
	}

	@Override
	public void deleteEmp(EmployeeVO empVO) {
		dao.deleteEmp(empVO);
	}

}
