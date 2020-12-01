package com.Morning1127;

import java.util.Scanner;

public class arrayorderby1127 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("첫번째 입력: ");
		int n1 = scn.nextInt();
		scn.nextLine();
		System.out.print("두번째 입력: ");
		int n2 = scn.nextInt();
		scn.nextLine();
		System.out.print("세번째 입력: ");
		int n3 = scn.nextInt();
		scn.nextLine();
		int[] scores = { n1, n2, n3 };
//		Arrays.sort(scores);
//		for (int i = 0; i < scores.length; i++) {
		if (n1 > n2) {
			if (n1 > n3) {
				if (n2 > n3) {
					System.out.print(n1 + n2 + n3);
				} else if (n2 < n3) {
					System.out.print(n1 + n3 + n2);
				}
			}
		} else if (n2 > n1) {
			if (n2 > n3) {
				if (n1 > n3) {
					System.out.print(n2 + n1 + n3);
				} else if (n3 < n1) {
					System.out.print(n2 + n3 + n1);
				}
			}
		} else if (n3 > n1) {
			if (n1 > n2) {
				System.out.print(n3 + n1 + n2);
			} else if (n2 > n1) {
				System.out.print(n3 + n2 + n1);
			}
		}
	}
}
