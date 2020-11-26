package com.ydm;

import java.util.Calendar;

public class CalenderExample {
	public static void main(String[] args) {
		showCal(2020, 7); //몇월의 달력을 보고싶습니다.
	}

	public static void showCal(int year, int month) {
		int tMonth = month + 1;
		System.out.println("\t[" + year + "년" + tMonth + "월]");

		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month, 1); // 날짜 지정, 2020/05/01, 0부터 시작하기때문에 4=5월 0=1월
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + tMonth);
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("막날: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		int a = cal.get(Calendar.DAY_OF_WEEK); // a = 시작요일
//		int a = 2;
//		System.out.println("시작요일: " + day[a]);
		int b = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // b = 막날

		for (int i = 0; i < day.length; i++) {
			System.out.printf("%3s", day[i]);
		}
		System.out.println();
		int j = 1;
		switch (a) {
		case (1): // 일요일
			System.out.printf("%3s", j);
			for (int k = 2; k <= b; k++) { // 막날까지 출력
				System.out.printf("%3s", k);
				if (k % 7 == 0) {
					System.out.println();
				}
			}
			break;
		case (2): //월요일
			System.out.printf("%6d", j);
			for (int k = 2; k <= b; k++) { // 막날까지 출력
				System.out.printf("%3d", k);
				if (k == 6) {
					System.out.println();
				} else if (k % 7 == 6) {
					System.out.println();
				}
			}
			break;
		case (3): //화요일
			System.out.printf("%10d", j);
			for (int k = 2; k <= b; k++) { // 막날까지 출력
				System.out.printf("%3d", k);
				if (k == 5) {
					System.out.println();
				} else if (k % 7 == 5) {
					System.out.println();
				}
			}
			break;
		case (4): //수요일
			System.out.printf("%13d", j);
			for (int k = 2; k <= b; k++) { // 막날까지 출력
				System.out.printf("%3d", k);
				if (k == 4) {
					System.out.println();
				} else if (k % 7 == 4) {
					System.out.println();
				}
			}
			break;
		case (5): //목요일
			System.out.printf("%17d", j);
			for (int k = 2; k <= b; k++) { // 막날까지 출력
				System.out.printf("%3d", k);
				if (k == 3) {
					System.out.println();
				} else if (k % 7 == 3) {
					System.out.println();
				}
			}
			break; 
		case (6): //금요일
			System.out.printf("%20d", j);
			for (int k = 2; k <= b; k++) { // 막날까지 출력
				System.out.printf("%3d", k);
				if (k == 2) {
					System.out.println();
				} else if (k % 7 == 2) {
					System.out.println();
				}
			}
			break;
		case (7): //토요일
			System.out.printf("%23d", j);
			System.out.println();
			for (int k = 2; k <= b; k++) { // 막날까지 출력
				System.out.printf("%3d", k);
				if (k == 1) {
					System.out.println();
				} else if (k % 7 == 1) {
					System.out.println();
				}
			}
			break;
		}
	}
}
