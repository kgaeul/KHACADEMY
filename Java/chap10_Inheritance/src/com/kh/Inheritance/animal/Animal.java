package com.kh.Inheritance.animal;

public class Animal {

	private String name;
	private int age;
	
	public Animal(String name,int age){//int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void information() {
		System.out.println("���� �̸� : "+name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
			System.out.println("�츮 "+name+" ���̸� �Խ��ϴ�.");
		}
	public void sleep() {
		System.out.println("�츮 "+name+" ���� ��ϴ�.");
	}

	public void age() {
		System.out.println("�츮 "+name+"�� "+age+"���Դϴ�.");
	}
}
