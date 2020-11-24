package com.yedam;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setSchool("경북대");
		s1.setNumber(2013049068);
		s1.setName("이나경");
		s1.setMajor("History");

		Student s2 = new Student("경북대", 2013047077, "IT"); //Student 클래스에 ******에 public Student(String school, int number, String major)지정했고 name은 지정하지 않았기 때문에 setName만 쓰면 된다
		s2.setName("홍길동");
		
		Student s3 = new Student("영남대", 2014058046, "황수정", "History");
		s3.showStudentInfo();
		System.out.println("-------------------------------------------------------------");
		
		Student[] students = { s1, s2, s3 };
		for (Student student : students) {
			if (student != null)
				if ("경북대".equals(student.getSchool())) {
					System.out.println("학교 : " + student.getSchool());
					System.out.println("학번 : " + student.getNumber());
					System.out.println("이름 : " + student.getName());
					System.out.println("전공 : " + student.getMajor());

				}
		}
	}
}
