package com.yedam.address;

import java.util.Scanner;

public class FriendAddress1124understand {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	// 주소 생성 프로그램...
	public static void main(String[] args) {

		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("11.친구등록 22.학교친구 33.회사친구 44.전체리스트 55.검색(이름) 66.종료");
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
		String name1 = scn.nextLine();
		System.out.println("전화번호: ");
		String phone1 = scn.nextLine();
		Friend frnd1 = new Friend(name1, phone1);
		insertFriend(frnd1);
	}

	// 2. 학교친구
	public static void addUnivFriend() {
		System.out.println("친구이름: ");
		String name2 = scn.nextLine();
		System.out.println("전화번호: ");
		String phone2 = scn.nextLine();
		System.out.println("학교이름: ");
		String univ2 = scn.nextLine();
		System.out.println("전공정보: ");
		String major2 = scn.nextLine();
		UnivFriend frnd2 = new UnivFriend(name2, phone2);
		frnd2.setUniv(univ2);
		frnd2.setMajor(major2);
		insertFriend(frnd2);
	}

	// 3.회사친구
	public static void addCompFriend() {
		System.out.println("친구이름: ");
		String name3 = scn.nextLine();
		System.out.println("전화번호: ");
		String phone3 = scn.nextLine();
		System.out.println("회사이름: ");
		String company3 = scn.nextLine();
		System.out.println("부서정보: ");
		String department3 = scn.nextLine();
		CompFriend frnd3 = new CompFriend(name3, phone3);
		frnd3.setCompany(company3);
		frnd3.setDepartment(department3);
		insertFriend(frnd3);
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
		String name5 = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && name5.equals(friends[i].getName()))
				friends[i].showFriendInfo();
		}
	}

	// 7. 한건 입력
	public static void insertFriend(Friend Friend7) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = Friend7;
				break;
			}
		}
	}

} // end of classpackage com.yedam.address;