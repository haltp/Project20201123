package com.yedam.abstracts;

public class SmartPhone extends Phone{

	@Override //부모가 가진 ring을 재정의
	public void ring() {
		System.out.println("Smart폰 벨.....");
	}

	@Override //부모가 가진 turnoff를 재정의
	public void turnoff() {
		System.out.println("Smart폰 오프.....");
	}

}
