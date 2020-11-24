package com.yedam.interfaces;

public class Television implements RemoteControl{

	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");
	}

}
