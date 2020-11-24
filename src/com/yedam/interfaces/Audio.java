package com.yedam.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void trunOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("오디오를 끕니다.");
	}

}
