package com.yedam.string;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); //0자리부터 6제외자리까지
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //7자리부터 추출
		System.out.println(secondNum);
	}
}
