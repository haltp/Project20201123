package com.ydm;

import java.util.Calendar;

public class Calender1126 {
	public static void main(String[] args) {
		showCal(2020, 12);

	}

	public static void showCal(int year, int month) {
		System.out.println("\t" + "         [" + year + "년" + month + "월" + "]");

		// 요일 정보
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%5s", days[i]);
		}

		System.out.println();
		int tMonth = month - 1;
		Calendar cal = Calendar.getInstance();
		cal.set(year, tMonth, 1);
		int lDate = cal.getActualMaximum(Calendar.DATE);
		int fDay = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i < fDay; i++) {
			System.out.printf("%5s", " ");
		}
		for (int i = 0; i < lDate; i++) {
			System.out.printf("%5s", (i + 1));
			if ((i + fDay) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
