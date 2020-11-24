package com.yedam;

public class CalExample {
	public static void main(String[] args) {
//		new Calculator(); //계산기를 하나 만들었다
//		Calculator c1 = new Calculator(); //c1의 도면의 계산기를 하나 만든다
//		c1.setColor("white");
//		c1.plus(3,5);
		
		int result = Calculator.plus(3, 5); //Calculator클래스에 static이 붙은 plus라서 앞에 c1.이 붙지 않는다
											//plus는 매소드 3,5는 매개값
		System.out.println(result);         //3+5
		System.out.println(Calculator.pi);  //Calculator클래스에 pi에 static 붙어있어 앞에 c1.이 붙지 않는다
		
		
		result = Calculator.minus(10, 5);   //앞에 int 있어서 안 붙여도 됨
		System.out.println(result);         //10-5
		
		CalExample ce1 = new CalExample();  //뭔말인지 모르겠다
		result = ce1.sum(4, 5);
		
	}
	public static int sum(int a, int b) {
		return a + b;
	}
		
}
