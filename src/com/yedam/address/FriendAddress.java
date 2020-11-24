package com.yedam.address;

import java.util.Scanner;

public class FriendAddress {
	// 주소 생성 프로그램...
	public static void main(String[] args) {
		Friend[] friends = new Friend[100];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.검색(이름) 6.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				System.out.println("친구이름: ");
				String name = scn.nextLine();
				System.out.println("전화번호: ");
				String phone = scn.nextLine();
				Friend frnd = new Friend(name, phone);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}

			} else if (selectNo == 2) {
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
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}

			} else if (selectNo == 3) {
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
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						friends[i].showFriendInfo();
					}
				}
			} else if (selectNo == 5) {
				System.out.print("번호 선택> ");
				String name = scn.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && name.equals(friends[i].getName())) // if 실행구문이 한줄밖에 없으면 {}없어도 된다
						friends[i].showFriendInfo();
				}
			} else if (selectNo == 6) {
				break;

			}
		}

		System.out.println("프로그램 종료.");
	}
}
