package com.kh.pattern.mvc.comtroller;

public class userModel {

	private String name;
	 int age;
	 
	 public userModel (String name,int age) {
			this.name=name;
			this.age=age;
	 }
	public void displayinfo(String name,int age) {
		System.out.println("�л� ����");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		
		/*
		 1.�л� ���� ǥ��
		 2.private �̸� ����  
		 3.getter setter �����
		  
		  
		 */
	}

}
