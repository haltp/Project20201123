package com.yedam.address;

public class UnivFriend extends Friend{
	private String univ;
	private String major;
	//source에 from superclass 누르면 자동 super 만들어준다	
	public UnivFriend(String name, String phone) {
		super(name, phone);
	}
	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override //Override는 부모형식을 재정의 하겠다는 의미
	public void showFriendInfo() {
//		super.showFriendInfo();
		System.out.println("이름: "+super.getName()+", 연락처: "+super.getPhone()+", 학교: "+this.univ+", 전공: "+this.major);
	}
	
	
	
	
	
}
