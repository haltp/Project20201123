package com.yedam;

public class Calculator { // 계산기의 도면
	private String color;
	static double pi = 3.14; // pi에 static 붙음

	public void setColor(String color) {
		this.color = color;
	}

	public static int plus(int a, int b) { // static이 붙으면 인스턴스(c1. 같은거) 만들지 않고 클래스명에 바로 붙여서 쓸 수 있다
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}
}
