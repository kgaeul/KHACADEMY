package com.kh.Inheritance.animal;

public class Rabbit extends Animal{

	public Rabbit(String name,int age) {
		super(name, age);
		
	}
	public void speak () {
		System.out.println("���ѱ���!!");
	}
	
	@Override
	public void sleep() {
		System.out.println("�츮 "+getName()+" ���� ���ڰ� ���� ���˸��� �մϴ�.");
	}
}
