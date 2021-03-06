package com.yedam.address;

import java.util.Scanner;

public class FriendAddress {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	// 주소 생성 프로그램...
	public static void main(String[] args) {

		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.검색(이름) 6.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				addFriend();
			} else if (selectNo == 2) {
				addUnivFriend();
			} else if (selectNo == 3) {
				addCompFriend();
			} else if (selectNo == 4) {
				showFriendList();
			} else if (selectNo == 5) {
				searchFriend();
			} else if (selectNo == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	} // end of main()

	// 1. 친구등록
	public static void addFriend() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);
		insertFriend(frnd);
	}

	// 2. 학교친구
	public static void addUnivFriend() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("학교이름: ");
		String univ = scn.nextLine();
		System.out.println("전공정보: ");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);
		insertFriend(frnd);
	}

	// 3.회사친구
	public static void addCompFriend() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("회사이름: ");
		String company = scn.nextLine();
		System.out.println("부서정보: ");
		String department = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(company);
		frnd.setDepartment(department);
		insertFriend(frnd);
	}

	// 4. 리스트
	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();
			}
		}
	}

	// 5. 한건 조회
	public static void searchFriend() {
		System.out.print("이름 선택> ");
		String name = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && name.equals(friends[i].getName()))
				friends[i].showFriendInfo();
		}
	}

	// 7. 한건 입력
	public static void insertFriend(Friend Friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = Friend;
				break;
			}
		}
	}

} // end of class
