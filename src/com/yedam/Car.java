package com.yedam; //com 패키지 밑에 yedam 패키지

public class Car { //com 패키지 밑에 yedam 패키지 밑에 Car라는 클래스 //보통 public과 private으로 나눈다
	//기능을 추가하고 싶으면 여기에 넣어야 한다
	//field
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//Constructor = 생성자
	public Car() { //디폴트 접근이 가능public,private안 적혀 있으니, 동일한 패키지 내에서만
		
	}
	public Car(String company) {
		this.company = company;
	}
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//Method
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
