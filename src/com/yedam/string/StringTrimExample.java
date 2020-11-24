package com.yedam.string;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123  ";
		String tel3 = "  1234  ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();  //trim은 앞뒤의 공백제거, 중간은 제거안됨
		System.out.println(tel);
	}
}
