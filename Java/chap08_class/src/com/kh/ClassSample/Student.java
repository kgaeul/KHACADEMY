package com.kh.ClassSample;

public class Student {

	String name;
	int age;
	String grade;
	
	//�����ڴ� �޼ҵ� �� �Ϻ�//
	public Student(String name,int age, String grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
		public void displayInfo() {
			System.out.println("�л� �̸� : "+name);
			System.out.println("���� : "+age);
			System.out.println("�г� : "+grade);
		
	}
}
