package com.yedam;

public class CarExample {
	public static void main(String[] args) {
		// ctrl + 마우스 두번째 눌러서 Car가 어디 Car를 쓰는지 이해하기!!!
		Car c1 = new Car(); // 인스턴스 생성
//		System.out.println(c1.getCompany());
//		System.out.println(c1.getMaxSpeed());

		Car c2 = new Car("현대", "Sonata", "white", 200); // 인스턴스 생성.
//		System.out.println(c2.getCompany());
//		System.out.println(c2.getMaxSpeed());

		Car c3 = new Car("삼성", "SM5");
		c3.setColor("yellow");
		c3.setMaxSpeed(210);

		Car c4 = new Car("삼성", "SM3");
		c4.setColor("black");
		c4.setMaxSpeed(180);

		Car[] cars = { c1, c2, c3, c4 };
		for (Car car : cars) {
			if (car != null) {
				if ("삼성".equals(car.getCompany())) { // equals라는 매소드
					System.out.println(car.getModel());
					System.out.println(car.getMaxSpeed());
				}
			}
		}
	}
}
