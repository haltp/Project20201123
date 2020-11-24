package com.yedam.address;

public class Friend { //필드
	private String name;
	private String phone;
	
	public Friend(String name, String phone) { //생성자
		this.name = name;
		this.phone = phone;
	}

	public String getName() { //메소드
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void showFriendInfo() {
		System.out.println("이름: "+this.name+", 연락처: "+this.phone);
	}
	
}
