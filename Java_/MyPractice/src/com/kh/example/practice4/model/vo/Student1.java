package com.kh.example.practice4.model.vo;

public class Student1 {

	int grade=3;
	int classroom=1;
	String name="�谡��";
	double height=170.0;
	char gender='��';
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {
		System.out.println("�̸� : "+name);
		System.out.println("Ű : "+height+"cm");
		System.out.println("���� : "+gender+'��');
		System.out.println("�� : "+classroom+"��");
		System.out.println("�г� : "+grade+"�г�");
	}
}
