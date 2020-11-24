package com.yedam.db;

public class Department {
	private String departmentId;
	private String departmentName;
	private int managerId;
	private int locationId;
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public void showDepInfo() {
		System.out.println("부서번호: " +departmentId +", 부서이름: "+departmentName+", managerId: "+ managerId+", locationId: "+ locationId);
	}
	
}
