package com.kh.example.practice4.model.vo;

public class Student {

	 int grade;
	 int classroom;
	 String name;
	 double height;
	 char gender;
	 
	 
	public Student(int grade, int classroom,String name,double height,char gender) {
		
		this.grade=1;
		this.classroom=2;
		this.name="�ƹ���";
		this.height=170;
		this.gender='��';
		
	}
	
	public void information() {
		System.out.println("�г� : "+grade+"�г�");
		System.out.println("�� : "+classroom+"��");
		System.out.println("�̸� : "+name);
		System.out.println("Ű : "+height+"cm");
		System.out.println("���� : "+gender+"��");
		
		
	}
}
