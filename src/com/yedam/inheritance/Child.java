package com.yedam.inheritance;

public class Child extends Parent{  //extends Parent는 Parent을 상속받도록 하겠는 의미
	String field2;
	
	public Child() { 
		super();
	}
	
	
	public Child(String field1, String field2) {
		super(field1); //super 부모클래스 field1 호출하겠다는 의미
		this.field2 = field2; //그리고 field2 = field2
	}
	
	public void method2() {//method2()는 Child 클래스가 갖고있는 메소드
		super.method1(); //부모가 갖고있는 method1을 불러온 다음에 밑의 println하겠다
		System.out.println("자식");
	}
}
