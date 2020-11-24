package com.yedam.address;

public class CompFriend extends Friend {
	private String company;
	private String department;

	public CompFriend(String name, String phone) {
		super(name, phone);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	//source에 Override 누르면 된다
	@Override //Override는 부모형식을 재정의 하겠다는 의미
	public void showFriendInfo() {
//		super.showFriendInfo();
		System.out.println("이름: "+super.getName()+", 연락처: "+super.getPhone()+", 회사: "+this.company+", 부서: "+this.department);
	}
	
}