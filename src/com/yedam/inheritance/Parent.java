package com.yedam.inheritance;

public class Parent {
	String field1; //field1 이라는 필드선언
	
	public Parent() { 
		super();
	}
	public Parent(String field1) {
		this.field1 = field1;
	}
	public void method1() {
		System.out.println("부모");
	}
	//p>c>nc
}
