package com.yedam.address;

public class FriendAddress1 {
	public static void main(String[] args) {
		Friend[] friends = null;

		Friend f1 = new Friend("친구1", "11-1111");
		CompFriend f2 = new CompFriend("친구2", "22-2222");
		f2.setCompany("네이버");
		f2.setDepartment("개발부서");
		UnivFriend f3 = new UnivFriend("친구3", "33-3333");
		f3.setUniv("서울대학교");
		f3.setMajor("컴퓨터정보");

		f1.showFriendInfo();
		f2.showFriendInfo();
		f3.showFriendInfo();
	}
}
