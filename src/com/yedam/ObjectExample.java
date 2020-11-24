package com.yedam;

import java.util.Scanner;

public class ObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello"); //import java.lang. 밑에있는 패키지는 쓰지 않아도 된다
//		Scanner scn; //import java.util.Scanner; 써줘야한다
		
		Object o1 = new Object();
		boolean sameOrDiff = o1.equals(new Object());  //equals 메소드는 String 참조 변수가 갖고 있는 값을 비교한 것이고, == 연산자는 String 참조 변수가 갖고 있는 객체의 주솟값을 비교한 것 [출처] [JAVA/자바] equals 메소드|작성자 하늘달
		System.out.println(sameOrDiff);
		
		boolean sameOrDiff1 = o1.equals("Hello");
		System.out.println(sameOrDiff1);
		
		System.out.println(o1.toString()); //주소값 :java.lang.Object@7de26db8
		
		
		
	}
}
