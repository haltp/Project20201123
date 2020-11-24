package com.yedam;

public class Student {
	private String school;
	private int number; // 15-1234
	private String name;
	private String major; // History

	public Student() {

	}

	public Student(String school, int number, String major) {//******
		this.school = school;
		this.number = number;
		this.major = major;
	}

	public Student(String school, int number, String name, String major) {
		this.school = school;
		this.number = number;
		this.name = name;
		this.major = major;
	}
	public void showStudentInfo() {
		System.out.println("학교: "+ school + " 학번: " + number + " 이름: " + name + " 전공: " + major);
	}
	

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
