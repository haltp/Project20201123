package com.ydm;

import com.yedam.Car;

public class CarExample {
	public static void main(String[] args) {
//		new Car();                        //Car를 썼을때 에러가 난다, 패키지가 달라서
//		com.yedam.Car c1 = new Car();     //public지정 그리고 이렇게 .쓰면 되지만 맨날 이렇게 쓰기 귀찮// ctrl+shift+o누르면 import생성됨
		Car c1 = new Car();               //import 생성되면 이렇게 써도 된다
		Car c2 = new Car("현대");
		Car c3 = new Car("삼성",  "SM5");  //public지정해놓으면 다른패키지라도 이렇게 다 접근이 가능하다(빨간줄오류없음)
				
	}
}
