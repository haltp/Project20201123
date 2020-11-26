package com.ydm;

import java.util.Calendar;

public class dd {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH));
		System.out.println("날짜: " + cal.get(Calendar.DATE));
		
		
//		for (int i = 1; i < 31; i++) {
//			System.out.printf("%3d", i);
//			if (i % 7 == 0) {
//				System.out.println();
//			}
//		}
//
	}
}
